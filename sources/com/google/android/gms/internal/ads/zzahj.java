package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzahj implements zzahn {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzem zzc = new zzem(new byte[7], 7);
    private final zzen zzd = new zzen(Arrays.copyOf(zza, 10));
    private final String zze;
    private String zzf;
    private zzabb zzg;
    private zzabb zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzabb zzu;
    private long zzv;

    public zzahj(boolean z, String str) {
        zzh();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzb = z;
        this.zze = str;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzm = false;
        zzh();
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 256;
    }

    private final void zzi() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private final void zzj(zzabb zzabbVar, long j, int i, int i2) {
        this.zzi = 4;
        this.zzj = i;
        this.zzu = zzabbVar;
        this.zzv = j;
        this.zzs = i2;
    }

    private final boolean zzk(zzen zzenVar, byte[] bArr, int i) {
        int iMin = Math.min(zzenVar.zza(), i - this.zzj);
        zzenVar.zzB(bArr, this.zzj, iMin);
        int i2 = this.zzj + iMin;
        this.zzj = i2;
        return i2 == i;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & UByte.MAX_VALUE) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzen zzenVar, byte[] bArr, int i) {
        if (zzenVar.zza() < i) {
            return false;
        }
        zzenVar.zzB(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0262, code lost:
    
        if (r17.zzm != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0264, code lost:
    
        r17.zzi = 1;
        r17.zzj = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x026a, code lost:
    
        zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x026d, code lost:
    
        r18.zzF(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0250, code lost:
    
        r17.zzp = (r14 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0259, code lost:
    
        if (1 == ((r14 & 1) ^ 1)) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x025b, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x025d, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x025e, code lost:
    
        r17.zzl = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0250 A[EDGE_INSN: B:145:0x0250->B:95:0x0250 BREAK  A[LOOP:1: B:49:0x019e->B:123:0x02b9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0206  */
    @Override // com.google.android.gms.internal.ads.zzahn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r18) throws com.google.android.gms.internal.ads.zzbu {
        /*
            Method dump skipped, instruction units count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahj.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzb(zzzx zzzxVar, zzaiz zzaizVar) {
        zzaizVar.zzc();
        this.zzf = zzaizVar.zzb();
        zzabb zzabbVarZzv = zzzxVar.zzv(zzaizVar.zza(), 1);
        this.zzg = zzabbVarZzv;
        this.zzu = zzabbVarZzv;
        if (!this.zzb) {
            this.zzh = new zzzt();
            return;
        }
        zzaizVar.zzc();
        zzabb zzabbVarZzv2 = zzzxVar.zzv(zzaizVar.zza(), 5);
        this.zzh = zzabbVarZzv2;
        zzad zzadVar = new zzad();
        zzadVar.zzH(zzaizVar.zzb());
        zzadVar.zzS("application/id3");
        zzabbVarZzv2.zzk(zzadVar.zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzt = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zze() {
        this.zzt = -9223372036854775807L;
        zzg();
    }
}
