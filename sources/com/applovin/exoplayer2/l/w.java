package com.applovin.exoplayer2.l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static w f632a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList<WeakReference<b>> c = new CopyOnWriteArrayList<>();
    private final Object d = new Object();
    private int e = 0;

    public interface b {
        void onNetworkTypeChanged(int i);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static volatile boolean f633a;
    }

    public static synchronized w a(Context context) {
        if (f632a == null) {
            f632a = new w(context);
        }
        return f632a;
    }

    private w(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new c(), intentFilter);
    }

    public void a(final b bVar) {
        b();
        this.c.add(new WeakReference<>(bVar));
        this.b.post(new Runnable() { // from class: com.applovin.exoplayer2.l.w$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(b bVar) {
        bVar.onNetworkTypeChanged(a());
    }

    public int a() {
        int i;
        synchronized (this.d) {
            i = this.e;
        }
        return i;
    }

    private void b() {
        for (WeakReference<b> weakReference : this.c) {
            if (weakReference.get() == null) {
                this.c.remove(weakReference);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        synchronized (this.d) {
            if (this.e == i) {
                return;
            }
            this.e = i;
            for (WeakReference<b> weakReference : this.c) {
                b bVar = weakReference.get();
                if (bVar != null) {
                    bVar.onNetworkTypeChanged(i);
                } else {
                    this.c.remove(weakReference);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return a(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    private static int a(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return ai.f611a >= 29 ? 9 : 0;
        }
    }

    private final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iC = w.c(context);
            if (ai.f611a >= 29 && !a.f633a && iC == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) com.applovin.exoplayer2.l.a.b((TelephonyManager) context.getSystemService("phone"));
                    d dVar = new d();
                    if (ai.f611a < 31) {
                        telephonyManager.listen(dVar, 1);
                    } else {
                        telephonyManager.listen(dVar, 1048576);
                    }
                    telephonyManager.listen(dVar, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            w.this.a(iC);
        }
    }

    private class d extends PhoneStateListener {
        private d() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
            String string = serviceState == null ? "" : serviceState.toString();
            w.this.a(string.contains("nrState=CONNECTED") || string.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }

        @Override // android.telephony.PhoneStateListener
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            w.this.a(overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }
    }
}
