package com.applovin.impl.sdk.a;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.ScriptInjector;
import com.iab.omid.library.applovin.adsession.Partner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f1203a;
    private final Context b = p.y();
    private String c;

    public f(p pVar) {
        this.f1203a = pVar;
    }

    public void a() {
        if (((Boolean) this.f1203a.a(com.applovin.impl.sdk.c.b.aD)).booleanValue()) {
            this.f1203a.L();
            if (y.a()) {
                this.f1203a.L().b("OpenMeasurementService", "Initializing Open Measurement SDK v" + c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.f.1
                @Override // java.lang.Runnable
                public void run() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Omid.activate(f.this.b);
                    f.this.f1203a.L();
                    if (y.a()) {
                        y yVarL = f.this.f1203a.L();
                        StringBuilder sb = new StringBuilder("Init ");
                        sb.append(f.this.b() ? "succeeded" : "failed");
                        sb.append(" and took ");
                        sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
                        sb.append("ms");
                        yVarL.b("OpenMeasurementService", sb.toString());
                    }
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(f.this.b.getResources().openRawResource(R.raw.omsdk_v_1_0)));
                        try {
                            try {
                                StringBuilder sb2 = new StringBuilder();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        f.this.c = sb2.toString();
                                        bufferedReader.close();
                                        return;
                                    }
                                    sb2.append(line);
                                }
                            } catch (Throwable th) {
                                try {
                                    Log.e("OpenMeasurementService", "Failed to load JavaScript Open Measurement SDK", th);
                                    bufferedReader.close();
                                } catch (Throwable th2) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e) {
                                        Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e);
                                    }
                                    throw th2;
                                }
                            }
                        } catch (IOException e2) {
                            Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e2);
                        }
                    } catch (Throwable th3) {
                        f.this.f1203a.L();
                        if (y.a()) {
                            f.this.f1203a.L().b("OpenMeasurementService", "Failed to retrieve resource omskd_v_1_0.js", th3);
                        }
                    }
                }
            });
        }
    }

    public boolean b() {
        return Omid.isActive();
    }

    public String c() {
        return Omid.getVersion();
    }

    public Partner d() {
        return Partner.createPartner((String) this.f1203a.a(com.applovin.impl.sdk.c.b.aE), AppLovinSdk.VERSION);
    }

    public String e() {
        return this.c;
    }

    public String a(String str) {
        try {
            return ScriptInjector.injectScriptContentIntoHtml(this.c, str);
        } catch (Throwable th) {
            this.f1203a.L();
            if (y.a()) {
                this.f1203a.L().b("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th);
            }
            return str;
        }
    }
}
