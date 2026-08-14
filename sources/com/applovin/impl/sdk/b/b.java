package com.applovin.impl.sdk.b;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1252a;
    private final Activity b;
    private AlertDialog c;
    private a d;

    public interface a {
        void a();

        void b();
    }

    public b(Activity activity, p pVar) {
        this.f1252a = pVar;
        this.b = activity;
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    public void a() {
        this.b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.c != null) {
                    b.this.c.dismiss();
                }
            }
        });
    }

    public void b() {
        this.b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.c = new AlertDialog.Builder(b.this.b).setTitle((CharSequence) b.this.f1252a.a(com.applovin.impl.sdk.c.b.bL)).setMessage((CharSequence) b.this.f1252a.a(com.applovin.impl.sdk.c.b.bM)).setCancelable(false).setPositiveButton((CharSequence) b.this.f1252a.a(com.applovin.impl.sdk.c.b.bO), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.2.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        b.this.d.a();
                    }
                }).setNegativeButton((CharSequence) b.this.f1252a.a(com.applovin.impl.sdk.c.b.bN), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.2.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        b.this.d.b();
                    }
                }).show();
            }
        });
    }

    public void a(final e eVar, final Runnable runnable) {
        this.b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.3
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(b.this.b);
                builder.setTitle(eVar.an());
                String strAo = eVar.ao();
                if (AppLovinSdkUtils.isValidString(strAo)) {
                    builder.setMessage(strAo);
                }
                builder.setPositiveButton(eVar.ap(), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.3.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                });
                builder.setCancelable(false);
                b.this.c = builder.show();
            }
        });
    }

    public boolean c() {
        AlertDialog alertDialog = this.c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }
}
