package com.tapjoy;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class TJAppSetId {

    public class a implements OnSuccessListener<AppSetIdInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TJTaskHandler f1658a;

        public a(TJAppSetId tJAppSetId, TJTaskHandler tJTaskHandler) {
            this.f1658a = tJTaskHandler;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(AppSetIdInfo appSetIdInfo) {
            AppSetIdInfo appSetIdInfo2 = appSetIdInfo;
            int scope = appSetIdInfo2.getScope();
            String id = appSetIdInfo2.getId();
            TapjoyLog.d("TJAppSetId", String.format(Locale.ENGLISH, "Scope: %d. AppSetId: %s", Integer.valueOf(scope), id));
            this.f1658a.onComplete(id);
        }
    }

    public void fetch(Context context, TJTaskHandler<String> tJTaskHandler) {
        try {
            Class.forName("com.google.android.gms.appset.AppSet");
            AppSet.getClient(context.getApplicationContext()).getAppSetIdInfo().addOnSuccessListener(new a(this, tJTaskHandler));
        } catch (Exception e) {
            TapjoyLog.d("TJAppSetId", String.format(Locale.ENGLISH, "AppSetId class not found: %s", e.getMessage()));
            tJTaskHandler.onComplete("");
        }
    }
}
