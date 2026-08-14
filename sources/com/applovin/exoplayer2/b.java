package com.applovin.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f53a;
    private final a b;
    private boolean c;

    /* JADX INFO: renamed from: com.applovin.exoplayer2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0010b {
        void a();
    }

    public b(Context context, Handler handler, InterfaceC0010b interfaceC0010b) {
        this.f53a = context.getApplicationContext();
        this.b = new a(handler, interfaceC0010b);
    }

    public void a(boolean z) {
        if (z && !this.c) {
            this.f53a.registerReceiver(this.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.c = true;
        } else {
            if (z || !this.c) {
                return;
            }
            this.f53a.unregisterReceiver(this.b);
            this.c = false;
        }
    }

    private final class a extends BroadcastReceiver implements Runnable {
        private final InterfaceC0010b b;
        private final Handler c;

        public a(Handler handler, InterfaceC0010b interfaceC0010b) {
            this.c = handler;
            this.b = interfaceC0010b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.c) {
                this.b.a();
            }
        }
    }
}
