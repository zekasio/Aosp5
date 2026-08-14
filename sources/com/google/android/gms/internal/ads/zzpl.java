package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpl extends zzra implements zzjq {
    private final Context zzb;
    private final zzob zzc;
    private final zzoi zzd;
    private int zze;
    private boolean zzf;
    private zzaf zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private zzkm zzl;

    public zzpl(Context context, zzqt zzqtVar, zzrc zzrcVar, boolean z, Handler handler, zzoc zzocVar, zzoi zzoiVar) {
        super(1, zzqtVar, zzrcVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zzoiVar;
        this.zzc = new zzob(handler, zzocVar);
        zzoiVar.zzn(new zzpk(this, null));
    }

    private final int zzax(zzqx zzqxVar, zzaf zzafVar) {
        if (!"OMX.google.raw.decoder".equals(zzqxVar.zza) || zzew.zza >= 24 || (zzew.zza == 23 && zzew.zzY(this.zzb))) {
            return zzafVar.zzn;
        }
        return -1;
    }

    private static List zzay(zzrc zzrcVar, zzaf zzafVar, boolean z, zzoi zzoiVar) throws zzrj {
        zzqx zzqxVarZzd;
        String str = zzafVar.zzm;
        if (str == null) {
            return zzfqk.zzo();
        }
        if (zzoiVar.zzw(zzafVar) && (zzqxVarZzd = zzrp.zzd()) != null) {
            return zzfqk.zzp(zzqxVarZzd);
        }
        List listZzf = zzrp.zzf(str, false, false);
        String strZze = zzrp.zze(zzafVar);
        if (strZze == null) {
            return zzfqk.zzm(listZzf);
        }
        List listZzf2 = zzrp.zzf(strZze, false, false);
        zzfqh zzfqhVarZzi = zzfqk.zzi();
        zzfqhVarZzi.zzh(listZzf);
        zzfqhVarZzi.zzh(listZzf2);
        return zzfqhVarZzi.zzi();
    }

    private final void zzaz() {
        long jZzb = this.zzd.zzb(zzM());
        if (jZzb != Long.MIN_VALUE) {
            if (!this.zzj) {
                jZzb = Math.max(this.zzh, jZzb);
            }
            this.zzh = jZzb;
            this.zzj = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkn, com.google.android.gms.internal.ads.zzko
    public final String zzK() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzkn
    public final boolean zzM() {
        return super.zzM() && this.zzd.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzkn
    public final boolean zzN() {
        return this.zzd.zzu() || super.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final float zzP(float f, zzaf zzafVar, zzaf[] zzafVarArr) {
        int iMax = -1;
        for (zzaf zzafVar2 : zzafVarArr) {
            int i = zzafVar2.zzA;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final int zzQ(zzrc zzrcVar, zzaf zzafVar) throws zzrj {
        boolean z;
        if (!zzbt.zzg(zzafVar.zzm)) {
            return 128;
        }
        int i = zzew.zza >= 21 ? 32 : 0;
        int i2 = zzafVar.zzF;
        boolean zZzaw = zzaw(zzafVar);
        if (zZzaw && this.zzd.zzw(zzafVar) && (i2 == 0 || zzrp.zzd() != null)) {
            return i | 140;
        }
        if (("audio/raw".equals(zzafVar.zzm) && !this.zzd.zzw(zzafVar)) || !this.zzd.zzw(zzew.zzF(2, zzafVar.zzz, zzafVar.zzA))) {
            return 129;
        }
        List listZzay = zzay(zzrcVar, zzafVar, false, this.zzd);
        if (listZzay.isEmpty()) {
            return 129;
        }
        if (!zZzaw) {
            return 130;
        }
        zzqx zzqxVar = (zzqx) listZzay.get(0);
        boolean zZze = zzqxVar.zze(zzafVar);
        if (zZze) {
            z = true;
        } else {
            for (int i3 = 1; i3 < listZzay.size(); i3++) {
                zzqx zzqxVar2 = (zzqx) listZzay.get(i3);
                if (zzqxVar2.zze(zzafVar)) {
                    zzqxVar = zzqxVar2;
                    z = false;
                    zZze = true;
                    break;
                }
            }
            z = true;
        }
        int i4 = true != zZze ? 3 : 4;
        int i5 = 8;
        if (zZze && zzqxVar.zzf(zzafVar)) {
            i5 = 16;
        }
        return i4 | i5 | i | (true != zzqxVar.zzg ? 0 : 64) | (true != z ? 0 : 128);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final zzhc zzR(zzqx zzqxVar, zzaf zzafVar, zzaf zzafVar2) {
        int i;
        int i2;
        zzhc zzhcVarZzb = zzqxVar.zzb(zzafVar, zzafVar2);
        int i3 = zzhcVarZzb.zze;
        if (zzax(zzqxVar, zzafVar2) > this.zze) {
            i3 |= 64;
        }
        String str = zzqxVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzhcVarZzb.zzd;
            i2 = 0;
        }
        return new zzhc(str, zzafVar, zzafVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final zzhc zzS(zzjo zzjoVar) throws zzhj {
        zzhc zzhcVarZzS = super.zzS(zzjoVar);
        this.zzc.zzg(zzjoVar.zza, zzhcVarZzS);
        return zzhcVarZzS;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final zzqs zzV(zzqx zzqxVar, zzaf zzafVar, MediaCrypto mediaCrypto, float f) {
        zzaf[] zzafVarArrZzJ = zzJ();
        int length = zzafVarArrZzJ.length;
        int iZzax = zzax(zzqxVar, zzafVar);
        if (length != 1) {
            for (zzaf zzafVar2 : zzafVarArrZzJ) {
                if (zzqxVar.zzb(zzafVar, zzafVar2).zzd != 0) {
                    iZzax = Math.max(iZzax, zzax(zzqxVar, zzafVar2));
                }
            }
        }
        this.zze = iZzax;
        this.zzf = zzew.zza < 24 && "OMX.SEC.aac.dec".equals(zzqxVar.zza) && "samsung".equals(zzew.zzc) && (zzew.zzb.startsWith("zeroflte") || zzew.zzb.startsWith("herolte") || zzew.zzb.startsWith("heroqlte"));
        String str = zzqxVar.zzc;
        int i = this.zze;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", zzafVar.zzz);
        mediaFormat.setInteger("sample-rate", zzafVar.zzA);
        zzeg.zzb(mediaFormat, zzafVar.zzo);
        zzeg.zza(mediaFormat, "max-input-size", i);
        if (zzew.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && (zzew.zza != 23 || (!"ZTE B2017G".equals(zzew.zzd) && !"AXON 7 mini".equals(zzew.zzd)))) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (zzew.zza <= 28 && "audio/ac4".equals(zzafVar.zzm)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (zzew.zza >= 24 && this.zzd.zza(zzew.zzF(4, zzafVar.zzz, zzafVar.zzA)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (zzew.zza >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.zzg = (!"audio/raw".equals(zzqxVar.zzb) || "audio/raw".equals(zzafVar.zzm)) ? null : zzafVar;
        return zzqs.zza(zzqxVar, mediaFormat, zzafVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final List zzW(zzrc zzrcVar, zzaf zzafVar, boolean z) throws zzrj {
        return zzrp.zzg(zzay(zzrcVar, zzafVar, false, this.zzd), zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final void zzX(Exception exc) {
        zzee.zzc("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final void zzY(String str, zzqs zzqsVar, long j, long j2) {
        this.zzc.zzc(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final void zzZ(String str) {
        this.zzc.zzd(str);
    }

    @Override // com.google.android.gms.internal.ads.zzjq
    public final long zza() {
        if (zzbc() == 2) {
            zzaz();
        }
        return this.zzh;
    }

    protected final void zzab() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final void zzac() {
        this.zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final void zzad(zzgr zzgrVar) {
        if (!this.zzi || zzgrVar.zzf()) {
            return;
        }
        if (Math.abs(zzgrVar.zzd - this.zzh) > 500000) {
            this.zzh = zzgrVar.zzd;
        }
        this.zzi = false;
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final boolean zzag(zzaf zzafVar) {
        return this.zzd.zzw(zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjq
    public final zzby zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzjq
    public final void zzg(zzby zzbyVar) {
        this.zzd.zzo(zzbyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzha, com.google.android.gms.internal.ads.zzkn
    public final zzjq zzi() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzha, com.google.android.gms.internal.ads.zzkj
    public final void zzp(int i, Object obj) throws zzhj {
        if (i == 2) {
            this.zzd.zzs(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.zzd.zzk((zzk) obj);
            return;
        }
        if (i == 6) {
            this.zzd.zzm((zzl) obj);
            return;
        }
        switch (i) {
            case 9:
                this.zzd.zzr(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.zzd.zzl(((Integer) obj).intValue());
                break;
            case 11:
                this.zzl = (zzkm) obj;
                break;
            case 12:
                if (zzew.zza >= 23) {
                    zzpi.zza(this.zzd, obj);
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzha
    protected final void zzs() {
        this.zzk = true;
        try {
            this.zzd.zze();
            try {
                super.zzs();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzs();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzha
    protected final void zzt(boolean z, boolean z2) throws zzhj {
        super.zzt(z, z2);
        this.zzc.zzf(this.zza);
        zzk();
        this.zzd.zzp(zzl());
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzha
    protected final void zzu(long j, boolean z) throws zzhj {
        super.zzu(j, z);
        this.zzd.zze();
        this.zzh = j;
        this.zzi = true;
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzra, com.google.android.gms.internal.ads.zzha
    protected final void zzv() {
        try {
            super.zzv();
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
        } catch (Throwable th) {
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzha
    protected final void zzw() {
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzha
    protected final void zzx() {
        zzaz();
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final void zzae() throws zzhj {
        try {
            this.zzd.zzi();
        } catch (zzoh e) {
            throw zzbe(e, e.zzc, e.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final boolean zzaf(long j, long j2, zzqu zzquVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzaf zzafVar) throws zzhj {
        byteBuffer.getClass();
        if (this.zzg != null && (i2 & 2) != 0) {
            zzquVar.getClass();
            zzquVar.zzn(i, false);
            return true;
        }
        if (z) {
            if (zzquVar != null) {
                zzquVar.zzn(i, false);
            }
            this.zza.zzf += i3;
            this.zzd.zzf();
            return true;
        }
        try {
            if (!this.zzd.zzt(byteBuffer, j3, i3)) {
                return false;
            }
            if (zzquVar != null) {
                zzquVar.zzn(i, false);
            }
            this.zza.zze += i3;
            return true;
        } catch (zzoe e) {
            throw zzbe(e, e.zzc, e.zzb, 5001);
        } catch (zzoh e2) {
            throw zzbe(e2, zzafVar, e2.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzra
    protected final void zzaa(zzaf zzafVar, MediaFormat mediaFormat) throws zzhj {
        int i;
        zzaf zzafVar2 = this.zzg;
        int[] iArr = null;
        if (zzafVar2 != null) {
            zzafVar = zzafVar2;
        } else if (zzaj() != null) {
            int iZzn = "audio/raw".equals(zzafVar.zzm) ? zzafVar.zzB : (zzew.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? zzew.zzn(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            zzad zzadVar = new zzad();
            zzadVar.zzS("audio/raw");
            zzadVar.zzN(iZzn);
            zzadVar.zzC(zzafVar.zzC);
            zzadVar.zzD(zzafVar.zzD);
            zzadVar.zzw(mediaFormat.getInteger("channel-count"));
            zzadVar.zzT(mediaFormat.getInteger("sample-rate"));
            zzaf zzafVarZzY = zzadVar.zzY();
            if (this.zzf && zzafVarZzY.zzz == 6 && (i = zzafVar.zzz) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < zzafVar.zzz; i2++) {
                    iArr[i2] = i2;
                }
            }
            zzafVar = zzafVarZzY;
        }
        try {
            this.zzd.zzd(zzafVar, 0, iArr);
        } catch (zzod e) {
            throw zzbe(e, e.zza, false, 5001);
        }
    }
}
