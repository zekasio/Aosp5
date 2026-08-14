package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzahc implements zzzu {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzahb
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzahc.zza;
            return new zzzu[]{new zzahc()};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private final zzahd zzb = new zzahd(null);
    private final zzen zzc = new zzen(2786);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzzu
    public final int zza(zzzv zzzvVar, zzaau zzaauVar) throws IOException {
        int iZza = zzzvVar.zza(this.zzc.zzH(), 0, 2786);
        if (iZza == -1) {
            return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzE(iZza);
        if (!this.zzd) {
            this.zzb.zzd(0L, 4);
            this.zzd = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzb.zzb(zzzxVar, new zzaiz(Integer.MIN_VALUE, 0, 1));
        zzzxVar.zzC();
        zzzxVar.zzN(new zzaaw(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        this.zzd = false;
        this.zzb.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        if ((r4 - r3) >= 8192) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        r9.zzj();
        r4 = r4 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzd(com.google.android.gms.internal.ads.zzzv r9) throws java.io.IOException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzen r0 = new com.google.android.gms.internal.ads.zzen
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.zzH()
            r5 = r9
            com.google.android.gms.internal.ads.zzzk r5 = (com.google.android.gms.internal.ads.zzzk) r5
            r5.zzm(r4, r2, r1, r2)
            r0.zzF(r2)
            int r4 = r0.zzm()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r6) goto L62
            r9.zzj()
            r5.zzl(r3, r2)
            r4 = r3
        L26:
            r1 = 0
        L27:
            byte[] r6 = r0.zzH()
            r7 = 6
            r5.zzm(r6, r2, r7, r2)
            r0.zzF(r2)
            int r6 = r0.zzo()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r6 == r7) goto L4a
            r9.zzj()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r6 = 8192(0x2000, float:1.148E-41)
            if (r1 >= r6) goto L49
            r5.zzl(r4, r2)
            goto L26
        L49:
            return r2
        L4a:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L50
            return r6
        L50:
            byte[] r6 = r0.zzH()
            int r6 = com.google.android.gms.internal.ads.zzyv.zzb(r6)
            r7 = -1
            if (r6 != r7) goto L5c
            return r2
        L5c:
            int r6 = r6 + (-6)
            r5.zzl(r6, r2)
            goto L27
        L62:
            r4 = 3
            r0.zzG(r4)
            int r4 = r0.zzj()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.zzl(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahc.zzd(com.google.android.gms.internal.ads.zzzv):boolean");
    }
}
