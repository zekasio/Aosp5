package com.applovin.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class ay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f50a;
    private final Handler b;
    private final a c;
    private final AudioManager d;
    private b e;
    private int f;
    private int g;
    private boolean h;

    public interface a {
        void a(int i, boolean z);

        void f(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(ay ayVar) {
        ayVar.d();
    }

    public ay(Context context, Handler handler, a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f50a = applicationContext;
        this.b = handler;
        this.c = aVar;
        AudioManager audioManager = (AudioManager) com.applovin.exoplayer2.l.a.a((AudioManager) applicationContext.getSystemService("audio"));
        this.d = audioManager;
        this.f = 3;
        this.g = a(audioManager, 3);
        this.h = b(audioManager, this.f);
        b bVar = new b();
        try {
            applicationContext.registerReceiver(bVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.e = bVar;
        } catch (RuntimeException e) {
            com.applovin.exoplayer2.l.q.b("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    public void a(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        d();
        this.c.f(i);
    }

    public int a() {
        if (com.applovin.exoplayer2.l.ai.f611a >= 28) {
            return this.d.getStreamMinVolume(this.f);
        }
        return 0;
    }

    public int b() {
        return this.d.getStreamMaxVolume(this.f);
    }

    public void c() {
        b bVar = this.e;
        if (bVar != null) {
            try {
                this.f50a.unregisterReceiver(bVar);
            } catch (RuntimeException e) {
                com.applovin.exoplayer2.l.q.b("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int iA = a(this.d, this.f);
        boolean zB = b(this.d, this.f);
        if (this.g == iA && this.h == zB) {
            return;
        }
        this.g = iA;
        this.h = zB;
        this.c.a(iA, zB);
    }

    private static int a(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            com.applovin.exoplayer2.l.q.b("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    private static boolean b(AudioManager audioManager, int i) {
        if (com.applovin.exoplayer2.l.ai.f611a >= 23) {
            return audioManager.isStreamMute(i);
        }
        return a(audioManager, i) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = ay.this.b;
            final ay ayVar = ay.this;
            handler.post(new Runnable() { // from class: com.applovin.exoplayer2.ay$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ay.b(ayVar);
                }
            });
        }
    }
}
