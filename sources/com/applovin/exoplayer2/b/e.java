package com.applovin.exoplayer2.b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.l.ai;
import com.vungle.warren.utility.platform.Platform;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f63a = new e(new int[]{2}, 8);
    private static final e b = new e(new int[]{2, 5, 6}, 8);
    private static final int[] c = {5, 6, 18, 17, 14, 7, 8};
    private final int[] d;
    private final int e;

    public static e a(Context context) {
        return a(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    static e a(Context context, Intent intent) {
        if (c() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return b;
        }
        if (ai.f611a >= 29 && ai.c(context)) {
            return new e(a.a(), 8);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f63a;
        }
        return new e(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    public e(int[] iArr, int i) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.d = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.d = new int[0];
        }
        this.e = i;
    }

    public boolean a(int i) {
        return Arrays.binarySearch(this.d, i) >= 0;
    }

    public int a() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Arrays.equals(this.d, eVar.d) && this.e == eVar.e;
    }

    public int hashCode() {
        return this.e + (Arrays.hashCode(this.d) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.e + ", supportedEncodings=" + Arrays.toString(this.d) + "]";
    }

    private static boolean c() {
        return ai.f611a >= 17 && (Platform.MANUFACTURER_AMAZON.equals(ai.c) || "Xiaomi".equals(ai.c));
    }

    private static final class a {
        public static int[] a() {
            s.a aVarI = com.applovin.exoplayer2.common.a.s.i();
            for (int i : e.c) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                    aVarI.a(Integer.valueOf(i));
                }
            }
            aVarI.a(2);
            return com.applovin.exoplayer2.common.b.c.a(aVarI.a());
        }
    }
}
