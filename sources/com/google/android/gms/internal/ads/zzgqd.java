package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgqd {
    private static final zzgqd zzb = new zzgqd(true);
    final zzgtc zza = new zzgss(16);
    private boolean zzc;
    private boolean zzd;

    private zzgqd() {
    }

    public static zzgqd zza() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void zzd(com.google.android.gms.internal.ads.zzgqc r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.ads.zzgtw r0 = r4.zzb()
            com.google.android.gms.internal.ads.zzgqw.zze(r5)
            com.google.android.gms.internal.ads.zzgtw r1 = com.google.android.gms.internal.ads.zzgtw.DOUBLE
            com.google.android.gms.internal.ads.zzgtx r1 = com.google.android.gms.internal.ads.zzgtx.INT
            com.google.android.gms.internal.ads.zzgtx r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L41;
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L29;
                case 7: goto L20;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L46
        L17:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgrw
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgrb
            if (r0 == 0) goto L46
            goto L45
        L20:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgqo
            if (r0 == 0) goto L46
            goto L45
        L29:
            boolean r0 = r5 instanceof com.google.android.gms.internal.ads.zzgpe
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L46
            goto L45
        L32:
            boolean r0 = r5 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r5 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r5 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r5 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r5 instanceof java.lang.Integer
        L43:
            if (r0 == 0) goto L46
        L45:
            return
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.ads.zzgtw r4 = r4.zzb()
            com.google.android.gms.internal.ads.zzgtx r4 = r4.zza()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r4
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgqd.zzd(com.google.android.gms.internal.ads.zzgqc, java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgqd zzgqdVar = new zzgqd();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            zzgqdVar.zzc((zzgqc) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzgqdVar.zzc((zzgqc) entry.getKey(), entry.getValue());
        }
        zzgqdVar.zzd = this.zzd;
        return zzgqdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgqd) {
            return this.zza.equals(((zzgqd) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzc) {
            return;
        }
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            if (entryZzg.getValue() instanceof zzgqm) {
                ((zzgqm) entryZzg.getValue()).zzaR();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzc(zzgqc zzgqcVar, Object obj) {
        if (!zzgqcVar.zzc()) {
            zzd(zzgqcVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzd(zzgqcVar, arrayList.get(i));
            }
            obj = arrayList;
        }
        if (obj instanceof zzgrb) {
            this.zzd = true;
        }
        this.zza.put(zzgqcVar, obj);
    }

    private zzgqd(boolean z) {
        zzb();
        zzb();
    }
}
