package com.applovin.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioManager f94a;
    private final a b;
    private b c;
    private com.applovin.exoplayer2.b.d d;
    private int f;
    private AudioFocusRequest h;
    private boolean i;
    private float g = 1.0f;
    private int e = 0;

    public interface b {
        void a(float f);

        void a(int i);
    }

    public c(Context context, Handler handler, b bVar) {
        this.f94a = (AudioManager) com.applovin.exoplayer2.l.a.b((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.c = bVar;
        this.b = new a(handler);
    }

    public float a() {
        return this.g;
    }

    public void a(com.applovin.exoplayer2.b.d dVar) {
        if (com.applovin.exoplayer2.l.ai.a(this.d, dVar)) {
            return;
        }
        this.d = dVar;
        int iB = b(dVar);
        this.f = iB;
        boolean z = true;
        if (iB != 1 && iB != 0) {
            z = false;
        }
        com.applovin.exoplayer2.l.a.a(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int a(boolean z, int i) {
        if (a(i)) {
            d();
            return z ? 1 : -1;
        }
        if (z) {
            return c();
        }
        return -1;
    }

    public void b() {
        this.c = null;
        d();
    }

    private boolean a(int i) {
        return i == 1 || this.f != 1;
    }

    private int c() {
        if (this.e == 1) {
            return 1;
        }
        if ((com.applovin.exoplayer2.l.ai.f611a >= 26 ? f() : e()) == 1) {
            b(1);
            return 1;
        }
        b(0);
        return -1;
    }

    private void d() {
        if (this.e == 0) {
            return;
        }
        if (com.applovin.exoplayer2.l.ai.f611a >= 26) {
            h();
        } else {
            g();
        }
        b(0);
    }

    private int e() {
        return this.f94a.requestAudioFocus(this.b, com.applovin.exoplayer2.l.ai.g(((com.applovin.exoplayer2.b.d) com.applovin.exoplayer2.l.a.b(this.d)).d), this.f);
    }

    private int f() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest == null || this.i) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.f);
            } else {
                builder = new AudioFocusRequest.Builder(this.h);
            }
            this.h = builder.setAudioAttributes(((com.applovin.exoplayer2.b.d) com.applovin.exoplayer2.l.a.b(this.d)).a()).setWillPauseWhenDucked(i()).setOnAudioFocusChangeListener(this.b).build();
            this.i = false;
        }
        return this.f94a.requestAudioFocus(this.h);
    }

    private void g() {
        this.f94a.abandonAudioFocus(this.b);
    }

    private void h() {
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest != null) {
            this.f94a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private boolean i() {
        com.applovin.exoplayer2.b.d dVar = this.d;
        return dVar != null && dVar.b == 1;
    }

    private static int b(com.applovin.exoplayer2.b.d dVar) {
        if (dVar == null) {
            return 0;
        }
        switch (dVar.d) {
            case 0:
                com.applovin.exoplayer2.l.q.c("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (dVar.b == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                com.applovin.exoplayer2.l.q.c("AudioFocusManager", "Unidentified audio usage: " + dVar.d);
                return 0;
            case 16:
                return com.applovin.exoplayer2.l.ai.f611a >= 19 ? 4 : 2;
        }
    }

    private void b(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        b bVar = this.c;
        if (bVar != null) {
            bVar.a(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        if (i == -3 || i == -2) {
            if (i == -2 || i()) {
                d(0);
                b(2);
                return;
            } else {
                b(3);
                return;
            }
        }
        if (i == -1) {
            d(-1);
            d();
        } else if (i == 1) {
            b(1);
            d(1);
        } else {
            com.applovin.exoplayer2.l.q.c("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    private void d(int i) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class a implements AudioManager.OnAudioFocusChangeListener {
        private final Handler b;

        public a(Handler handler) {
            this.b = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i) {
            c.this.c(i);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            this.b.post(new Runnable() { // from class: com.applovin.exoplayer2.c$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(i);
                }
            });
        }
    }
}
