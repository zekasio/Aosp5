package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QG implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C03057v A00;

    public QG(C03057v c03057v) {
        this.A00 = c03057v;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new KW(this, i));
    }
}
