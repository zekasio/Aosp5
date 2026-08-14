package com.vungle.warren;

import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.AnalyticUrl;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.utility.CookieUtil;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class PrivacyManager {
    private static final AtomicReference<Boolean> coppaStatus = new AtomicReference<>();
    private static final AtomicReference<Boolean> disableAdId = new AtomicReference<>();
    private static PrivacyManager sInstance;
    private ExecutorService backgroundExecutor;
    private Repository repository;

    public enum COPPA {
        COPPA_ENABLED(true),
        COPPA_DISABLED(false),
        COPPA_NOTSET(null);

        private Boolean value;

        COPPA(Boolean bool) {
            this.value = bool;
        }

        public boolean getValue() {
            Boolean bool = this.value;
            if (bool == null) {
                return true;
            }
            return bool.booleanValue();
        }
    }

    private PrivacyManager() {
    }

    protected static synchronized PrivacyManager getInstance() {
        if (sInstance == null) {
            sInstance = new PrivacyManager();
        }
        return sInstance;
    }

    protected synchronized void init(ExecutorService executorService, Repository repository) {
        this.repository = repository;
        this.backgroundExecutor = executorService;
        Boolean bool = CookieUtil.getBoolean(repository, Cookie.COPPA_COOKIE, Cookie.COPPA_STATUS_KEY);
        AtomicReference<Boolean> atomicReference = coppaStatus;
        if (atomicReference.get() != null) {
            updateCoppaStatus(atomicReference.get());
        } else if (bool != null) {
            atomicReference.set(bool);
        }
    }

    protected void updateCoppaStatus(final Boolean bool) {
        ExecutorService executorService;
        if (bool != null) {
            coppaStatus.set(bool);
            if (this.repository == null || (executorService = this.backgroundExecutor) == null) {
                return;
            }
            executorService.execute(new Runnable() { // from class: com.vungle.warren.PrivacyManager.1
                @Override // java.lang.Runnable
                public void run() {
                    CookieUtil.update(PrivacyManager.this.repository, Cookie.COPPA_COOKIE, Cookie.COPPA_STATUS_KEY, bool);
                }
            });
        }
    }

    protected COPPA getCoppaStatus() {
        AtomicReference<Boolean> atomicReference = coppaStatus;
        if (atomicReference == null || atomicReference.get() == null) {
            return COPPA.COPPA_NOTSET;
        }
        if (atomicReference.get().booleanValue()) {
            return COPPA.COPPA_ENABLED;
        }
        if (!atomicReference.get().booleanValue()) {
            return COPPA.COPPA_DISABLED;
        }
        return COPPA.COPPA_NOTSET;
    }

    protected void updateDisableAdId(boolean z) {
        disableAdId.set(Boolean.valueOf(z));
        Repository repository = this.repository;
        if (repository == null) {
            return;
        }
        Boolean bool = CookieUtil.getBoolean(repository, Cookie.COPPA_COOKIE, Cookie.COPPA_DISABLE_AD_ID);
        if ((bool == null || !bool.booleanValue()) && z) {
            deleteItemsWithAdIds();
        }
        CookieUtil.update(this.repository, Cookie.COPPA_COOKIE, Cookie.COPPA_DISABLE_AD_ID, Boolean.valueOf(z));
    }

    protected boolean shouldSendAdIds() {
        AtomicReference<Boolean> atomicReference = disableAdId;
        if (atomicReference == null || atomicReference.get() == null) {
            return false;
        }
        return !atomicReference.get().booleanValue();
    }

    protected void clean() {
        disableAdId.set(null);
        coppaStatus.set(null);
    }

    private void deleteItemsWithAdIds() {
        this.repository.deleteAll(Advertisement.class);
        this.repository.deleteAll(AnalyticUrl.class);
    }
}
