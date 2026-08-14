package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffx extends ContentObserver {
    private final Context zza;
    private final AudioManager zzb;
    private final zzffv zzc;
    private float zzd;
    private final zzfgf zze;

    public zzffx(Handler handler, Context context, zzffv zzffvVar, zzfgf zzfgfVar, byte[] bArr) {
        super(handler);
        this.zza = context;
        this.zzb = (AudioManager) context.getSystemService("audio");
        this.zzc = zzffvVar;
        this.zze = zzfgfVar;
    }

    private final float zzc() {
        int streamVolume = this.zzb.getStreamVolume(3);
        int streamMaxVolume = this.zzb.getStreamMaxVolume(3);
        float f = 0.0f;
        if (streamMaxVolume > 0 && streamVolume > 0) {
            float f2 = streamVolume / streamMaxVolume;
            f = 1.0f;
            if (f2 <= 1.0f) {
                return f2;
            }
        }
        return f;
    }

    private final void zzd() {
        this.zze.zzd(this.zzd);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float fZzc = zzc();
        if (fZzc != this.zzd) {
            this.zzd = fZzc;
            zzd();
        }
    }

    public final void zza() {
        this.zzd = zzc();
        zzd();
        this.zza.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void zzb() {
        this.zza.getContentResolver().unregisterContentObserver(this);
    }
}
