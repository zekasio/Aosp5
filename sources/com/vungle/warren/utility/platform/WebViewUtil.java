package com.vungle.warren.utility.platform;

import android.content.Context;
import android.util.AndroidRuntimeException;
import android.webkit.WebSettings;
import androidx.core.util.Consumer;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.persistence.DatabaseHelper;
import com.vungle.warren.persistence.Repository;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewUtil {
    private final String TAG = "WebViewUtil";
    private final Context context;
    private final Repository repository;

    public WebViewUtil(Context context, Repository repository) {
        this.context = context;
        this.repository = repository;
    }

    public void getUserAgent(Consumer<String> consumer) {
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.context);
            consumer.accept(defaultUserAgent);
            addUserAgentInCookie(defaultUserAgent);
        } catch (Exception e) {
            if (e instanceof DatabaseHelper.DBException) {
                VungleLogger.error(this.TAG, "Ran into database issue");
            }
            if (e instanceof AndroidRuntimeException) {
                VungleLogger.error(this.TAG, "WebView could be missing here");
            }
            consumer.accept(null);
        }
    }

    private void addUserAgentInCookie(String str) throws DatabaseHelper.DBException {
        Cookie cookie = new Cookie("userAgent");
        cookie.putValue("userAgent", str);
        this.repository.save(cookie);
    }
}
