package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzafx implements zzzu {
    public static final zzaab zza = new zzaab() { // from class: com.google.android.gms.internal.ads.zzaft
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            zzaab zzaabVar = zzafx.zza;
            return new zzzu[]{new zzafx(0, null)};
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzaf zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zzzx zzD;
    private zzabb[] zzE;
    private zzabb[] zzF;
    private boolean zzG;
    private final List zzd;
    private final SparseArray zze;
    private final zzen zzf;
    private final zzen zzg;
    private final zzen zzh;
    private final byte[] zzi;
    private final zzen zzj;
    private final zzacs zzk;
    private final zzen zzl;
    private final ArrayDeque zzm;
    private final ArrayDeque zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    private zzen zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private zzafw zzy;
    private int zzz;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zzS("application/x-emsg");
        zzc = zzadVar.zzY();
    }

    public zzafx() {
        this(0, null);
    }

    private static int zze(int i) throws zzbu {
        if (i >= 0) {
            return i;
        }
        throw zzbu.zza("Unexpected negative value: " + i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzx zzf(java.util.List r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L8:
            if (r3 >= r0) goto Lb6
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.zzafi r5 = (com.google.android.gms.internal.ads.zzafi) r5
            int r6 = r5.zzd
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto Lb2
            if (r4 != 0) goto L1e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1e:
            com.google.android.gms.internal.ads.zzen r5 = r5.zza
            byte[] r5 = r5.zzH()
            com.google.android.gms.internal.ads.zzen r6 = new com.google.android.gms.internal.ads.zzen
            r6.<init>(r5)
            int r8 = r6.zzd()
            r9 = 32
            if (r8 >= r9) goto L33
        L31:
            r6 = r2
            goto L96
        L33:
            r6.zzF(r1)
            int r8 = r6.zze()
            int r9 = r6.zza()
            int r9 = r9 + 4
            if (r8 == r9) goto L43
            goto L31
        L43:
            int r8 = r6.zze()
            if (r8 == r7) goto L4a
            goto L31
        L4a:
            int r7 = r6.zze()
            int r7 = com.google.android.gms.internal.ads.zzafj.zze(r7)
            r8 = 1
            if (r7 <= r8) goto L69
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Unsupported pssh version: "
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            com.google.android.gms.internal.ads.zzee.zze(r7, r6)
            goto L31
        L69:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.zzr()
            long r12 = r6.zzr()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L81
            int r8 = r6.zzn()
            int r8 = r8 * 16
            r6.zzG(r8)
        L81:
            int r8 = r6.zzn()
            int r10 = r6.zza()
            if (r8 == r10) goto L8c
            goto L31
        L8c:
            byte[] r10 = new byte[r8]
            r6.zzB(r10, r1, r8)
            com.google.android.gms.internal.ads.zzagd r6 = new com.google.android.gms.internal.ads.zzagd
            r6.<init>(r9, r7, r10)
        L96:
            if (r6 != 0) goto L9a
            r6 = r2
            goto L9e
        L9a:
            java.util.UUID r6 = com.google.android.gms.internal.ads.zzagd.zza(r6)
        L9e:
            if (r6 != 0) goto La8
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            com.google.android.gms.internal.ads.zzee.zze(r5, r6)
            goto Lb2
        La8:
            com.google.android.gms.internal.ads.zzw r7 = new com.google.android.gms.internal.ads.zzw
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r2, r8, r5)
            r4.add(r7)
        Lb2:
            int r3 = r3 + 1
            goto L8
        Lb6:
            if (r4 != 0) goto Lb9
            return r2
        Lb9:
            com.google.android.gms.internal.ads.zzx r14 = new com.google.android.gms.internal.ads.zzx
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafx.zzf(java.util.List):com.google.android.gms.internal.ads.zzx");
    }

    private final void zzg() {
        this.zzo = 0;
        this.zzr = 0;
    }

    private static void zzh(zzen zzenVar, int i, zzagi zzagiVar) throws zzbu {
        zzenVar.zzF(i + 8);
        int iZze = zzenVar.zze();
        if ((iZze & 1) != 0) {
            throw zzbu.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iZze & 2) != 0;
        int iZzn = zzenVar.zzn();
        if (iZzn == 0) {
            Arrays.fill(zzagiVar.zzl, 0, zzagiVar.zze, false);
            return;
        }
        int i2 = zzagiVar.zze;
        if (iZzn != i2) {
            throw zzbu.zza("Senc sample count " + iZzn + " is different from fragment sample count" + i2, null);
        }
        Arrays.fill(zzagiVar.zzl, 0, iZzn, z);
        zzagiVar.zza(zzenVar.zza());
        zzen zzenVar2 = zzagiVar.zzn;
        zzenVar.zzB(zzenVar2.zzH(), 0, zzenVar2.zzd());
        zzagiVar.zzn.zzF(0);
        zzagiVar.zzo = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x061d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzi(long r45) throws com.google.android.gms.internal.ads.zzbu {
        /*
            Method dump skipped, instruction units count: 1774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafx.zzi(long):void");
    }

    private static final zzafs zzj(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzafs) sparseArray.valueAt(0);
        }
        zzafs zzafsVar = (zzafs) sparseArray.get(i);
        zzafsVar.getClass();
        return zzafsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0246, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0248, code lost:
    
        r5.zzs(r10, r20, r33.zzz, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025b, code lost:
    
        if (r33.zzn.isEmpty() != false) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x025d, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzafv) r33.zzn.removeFirst();
        r33.zzu -= r1.zzc;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0270, code lost:
    
        if (r1.zzb == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0272, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0273, code lost:
    
        r5 = r33.zzE;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0277, code lost:
    
        if (r8 >= r6) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0279, code lost:
    
        r5[r8].zzs(r3, 1, r1.zzc, r33.zzu, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0294, code lost:
    
        if (r2.zzk() != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0296, code lost:
    
        r33.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0298, code lost:
    
        r33.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
    
        if (r33.zzo != 3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        r3 = r2.zzb();
        r33.zzz = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        if (r2.zzf >= r2.zzi) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        ((com.google.android.gms.internal.ads.zzzk) r1).zzo(r3, false);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
    
        if (r1 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b6, code lost:
    
        r3 = r2.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
    
        if (r1 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00be, code lost:
    
        r3.zzG(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
    
        if (r2.zzb.zzb(r2.zzf) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
    
        r3.zzG(r3.zzo() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if (r2.zzk() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
    
        r33.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
    
        r33.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00de, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e7, code lost:
    
        if (r2.zzd.zza.zzg != 1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e9, code lost:
    
        r33.zzz = r3 - 8;
        ((com.google.android.gms.internal.ads.zzzk) r1).zzo(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0103, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzm) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0105, code lost:
    
        r33.zzA = r2.zzc(r33.zzz, 7);
        com.google.android.gms.internal.ads.zzyy.zzb(r33.zzz, r33.zzj);
        r2.zza.zzq(r33.zzj, 7);
        r3 = r33.zzA + 7;
        r33.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0122, code lost:
    
        r3 = r2.zzc(r33.zzz, 0);
        r33.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012a, code lost:
    
        r33.zzz += r3;
        r33.zzo = 4;
        r33.zzB = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0134, code lost:
    
        r3 = r2.zzd.zza;
        r5 = r2.zza;
        r10 = r2.zze();
        r6 = r3.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0140, code lost:
    
        if (r6 != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0142, code lost:
    
        r3 = r33.zzA;
        r4 = r33.zzz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0146, code lost:
    
        if (r3 >= r4) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0148, code lost:
    
        r33.zzA += r5.zze(r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0153, code lost:
    
        r13 = r33.zzg.zzH();
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r14 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0169, code lost:
    
        if (r33.zzA >= r33.zzz) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016b, code lost:
    
        r12 = r33.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016f, code lost:
    
        if (r12 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0171, code lost:
    
        ((com.google.android.gms.internal.ads.zzzk) r1).zzn(r13, r6, r14, r9);
        r33.zzg.zzF(r9);
        r12 = r33.zzg.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0182, code lost:
    
        if (r12 <= 0) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0184, code lost:
    
        r33.zzB = r12 - 1;
        r33.zzf.zzF(r9);
        r5.zzq(r33.zzf, 4);
        r5.zzq(r33.zzg, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019b, code lost:
    
        if (r33.zzF.length <= 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019d, code lost:
    
        r12 = r3.zzf.zzm;
        r17 = r13[4];
        r9 = com.google.android.gms.internal.ads.zzaar.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ab, code lost:
    
        if ("video/avc".equals(r12) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01af, code lost:
    
        if ((r17 & com.applovin.exoplayer2.common.base.Ascii.US) == r4) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b2, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b8, code lost:
    
        if ("video/hevc".equals(r12) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bf, code lost:
    
        if (((r17 & 126) >> r8) != 39) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c2, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c3, code lost:
    
        r33.zzC = r9;
        r33.zzA += 5;
        r33.zzz += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d7, code lost:
    
        throw com.google.android.gms.internal.ads.zzbu.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01da, code lost:
    
        if (r33.zzC == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        r33.zzh.zzC(r12);
        ((com.google.android.gms.internal.ads.zzzk) r1).zzn(r33.zzh.zzH(), 0, r33.zzB, false);
        r5.zzq(r33.zzh, r33.zzB);
        r4 = r33.zzB;
        r8 = r33.zzh;
        r8 = com.google.android.gms.internal.ads.zzaar.zzb(r8.zzH(), r8.zzd());
        r33.zzh.zzF("video/hevc".equals(r3.zzf.zzm) ? 1 : 0);
        r33.zzh.zzE(r8);
        com.google.android.gms.internal.ads.zzzh.zza(r10, r33.zzh, r33.zzF);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0221, code lost:
    
        r4 = r5.zze(r1, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0227, code lost:
    
        r33.zzA += r4;
        r33.zzB -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0233, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0237, code lost:
    
        r20 = r2.zza();
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x023f, code lost:
    
        if (r1 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0241, code lost:
    
        r23 = r1.zzc;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(com.google.android.gms.internal.ads.zzzv r34, com.google.android.gms.internal.ads.zzaau r35) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafx.zza(com.google.android.gms.internal.ads.zzzv, com.google.android.gms.internal.ads.zzaau):int");
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzb(zzzx zzzxVar) {
        this.zzD = zzzxVar;
        zzg();
        zzabb[] zzabbVarArr = new zzabb[2];
        this.zzE = zzabbVarArr;
        int i = 0;
        zzabb[] zzabbVarArr2 = (zzabb[]) zzew.zzaf(zzabbVarArr, 0);
        this.zzE = zzabbVarArr2;
        for (zzabb zzabbVar : zzabbVarArr2) {
            zzabbVar.zzk(zzc);
        }
        this.zzF = new zzabb[this.zzd.size()];
        int i2 = 100;
        while (i < this.zzF.length) {
            int i3 = i2 + 1;
            zzabb zzabbVarZzv = this.zzD.zzv(i2, 3);
            zzabbVarZzv.zzk((zzaf) this.zzd.get(i));
            this.zzF[i] = zzabbVarZzv;
            i++;
            i2 = i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final void zzc(long j, long j2) {
        int size = this.zze.size();
        for (int i = 0; i < size; i++) {
            ((zzafw) this.zze.valueAt(i)).zzi();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j2;
        this.zzm.clear();
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzd(zzzv zzzvVar) throws IOException {
        return zzagf.zza(zzzvVar);
    }

    public zzafx(int i, zzeu zzeuVar) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzacs();
        this.zzl = new zzen(16);
        this.zzf = new zzen(zzaar.zza);
        this.zzg = new zzen(5);
        this.zzh = new zzen();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzen(bArr);
        this.zzm = new ArrayDeque();
        this.zzn = new ArrayDeque();
        this.zze = new SparseArray();
        this.zzw = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzD = zzzx.zza;
        this.zzE = new zzabb[0];
        this.zzF = new zzabb[0];
    }
}
