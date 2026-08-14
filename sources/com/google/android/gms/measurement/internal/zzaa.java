package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaa extends zzkh {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzaa(zzkt zzktVar) {
        super(zzktVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i, int i2) {
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i));
        if (zzuVar == null) {
            return false;
        }
        return zzuVar.zze.get(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:410:0x0a39, code lost:
    
        r0 = r63.zzt.zzay().zzk();
        r6 = com.google.android.gms.measurement.internal.zzeh.zzn(r63.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0a4d, code lost:
    
        if (r8.zzj() == false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0a4f, code lost:
    
        r7 = java.lang.Integer.valueOf(r8.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0a58, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0a59, code lost:
    
        r0.zzc("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r7));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c1 A[PHI: r0 r5
      0x02c1: PHI (r0v67 java.util.Map) = (r0v42 java.util.Map), (r0v69 java.util.Map), (r0v36 java.util.Map) binds: [B:126:0x02ee, B:115:0x02c9, B:112:0x02bf] A[DONT_GENERATE, DONT_INLINE]
      0x02c1: PHI (r5v15 android.database.Cursor) = (r5v9 android.database.Cursor), (r5v16 android.database.Cursor), (r5v16 android.database.Cursor) binds: [B:126:0x02ee, B:115:0x02c9, B:112:0x02bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x077c A[PHI: r0 r5 r23 r26 r27
      0x077c: PHI (r0v98 java.util.Map) = (r0v100 java.util.Map), (r0v106 java.util.Map) binds: [B:307:0x07ac, B:291:0x077a] A[DONT_GENERATE, DONT_INLINE]
      0x077c: PHI (r5v30 android.database.Cursor) = (r5v31 android.database.Cursor), (r5v32 android.database.Cursor) binds: [B:307:0x07ac, B:291:0x077a] A[DONT_GENERATE, DONT_INLINE]
      0x077c: PHI (r23v4 com.google.android.gms.measurement.internal.zzas) = (r23v5 com.google.android.gms.measurement.internal.zzas), (r23v9 com.google.android.gms.measurement.internal.zzas) binds: [B:307:0x07ac, B:291:0x077a] A[DONT_GENERATE, DONT_INLINE]
      0x077c: PHI (r26v7 java.lang.String) = (r26v8 java.lang.String), (r26v11 java.lang.String) binds: [B:307:0x07ac, B:291:0x077a] A[DONT_GENERATE, DONT_INLINE]
      0x077c: PHI (r27v8 java.lang.String) = (r27v9 java.lang.String), (r27v11 java.lang.String) binds: [B:307:0x07ac, B:291:0x077a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0923 A[PHI: r0 r13 r64
      0x0923: PHI (r0v147 java.util.Map) = (r0v149 java.util.Map), (r0v154 java.util.Map) binds: [B:375:0x0949, B:364:0x0921] A[DONT_GENERATE, DONT_INLINE]
      0x0923: PHI (r13v37 android.database.Cursor) = (r13v38 android.database.Cursor), (r13v39 android.database.Cursor) binds: [B:375:0x0949, B:364:0x0921] A[DONT_GENERATE, DONT_INLINE]
      0x0923: PHI (r64v8 java.util.Iterator) = (r64v9 java.util.Iterator), (r64v12 java.util.Iterator) binds: [B:375:0x0949, B:364:0x0921] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ae A[Catch: SQLiteException -> 0x0222, all -> 0x0b1e, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x0222, blocks: (B:61:0x01a8, B:63:0x01ae, B:67:0x01be, B:68:0x01c3, B:69:0x01cd, B:70:0x01dd, B:72:0x01ec), top: B:449:0x01a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01be A[Catch: SQLiteException -> 0x0222, all -> 0x0b1e, TRY_ENTER, TryCatch #5 {SQLiteException -> 0x0222, blocks: (B:61:0x01a8, B:63:0x01ae, B:67:0x01be, B:68:0x01c3, B:69:0x01cd, B:70:0x01dd, B:72:0x01ec), top: B:449:0x01a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024b  */
    /* JADX WARN: Type inference failed for: r0v210, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r4v25, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v49, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v53, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.List zza(java.lang.String r64, java.util.List r65, java.util.List r66, java.lang.Long r67, java.lang.Long r68) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaa.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    protected final boolean zzb() {
        return false;
    }
}
