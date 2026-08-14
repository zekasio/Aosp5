package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzvq extends zzcu {
    public static final zzvq zzD;

    @Deprecated
    public static final zzvq zzE;
    public static final zzn zzF;
    private static final String zzT;
    private static final String zzU;
    private static final String zzV;
    private static final String zzW;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    private static final String zzad;
    private static final String zzae;
    private static final String zzaf;
    private static final String zzag;
    private static final String zzah;
    private static final String zzai;
    private static final String zzaj;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    private final SparseArray zzak;
    private final SparseBooleanArray zzal;

    static {
        zzvq zzvqVar = new zzvq(new zzvo());
        zzD = zzvqVar;
        zzE = zzvqVar;
        zzT = zzew.zzP(1000);
        zzU = zzew.zzP(1001);
        zzV = zzew.zzP(1002);
        zzW = zzew.zzP(1003);
        zzX = zzew.zzP(1004);
        zzY = zzew.zzP(1005);
        zzZ = zzew.zzP(1006);
        zzaa = zzew.zzP(1007);
        zzab = zzew.zzP(1008);
        zzac = zzew.zzP(1009);
        zzad = zzew.zzP(1010);
        zzae = zzew.zzP(1011);
        zzaf = zzew.zzP(1012);
        zzag = zzew.zzP(1013);
        zzah = zzew.zzP(1014);
        zzai = zzew.zzP(1015);
        zzaj = zzew.zzP(1016);
        zzF = new zzn() { // from class: com.google.android.gms.internal.ads.zzvm
        };
    }

    private zzvq(zzvo zzvoVar) {
        super(zzvoVar);
        this.zzG = zzvoVar.zza;
        this.zzH = false;
        this.zzI = zzvoVar.zzb;
        this.zzJ = false;
        this.zzK = zzvoVar.zzc;
        this.zzL = false;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzP = zzvoVar.zzd;
        this.zzQ = zzvoVar.zze;
        this.zzR = false;
        this.zzS = zzvoVar.zzf;
        this.zzak = zzvoVar.zzg;
        this.zzal = zzvoVar.zzh;
    }

    public static zzvq zzd(Context context) {
        return new zzvq(new zzvo(context));
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzvq zzvqVar = (zzvq) obj;
            if (super.equals(zzvqVar) && this.zzG == zzvqVar.zzG && this.zzI == zzvqVar.zzI && this.zzK == zzvqVar.zzK && this.zzP == zzvqVar.zzP && this.zzQ == zzvqVar.zzQ && this.zzS == zzvqVar.zzS) {
                SparseBooleanArray sparseBooleanArray = this.zzal;
                SparseBooleanArray sparseBooleanArray2 = zzvqVar.zzal;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.zzak;
                            SparseArray sparseArray2 = zzvqVar.zzak;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzur zzurVar = (zzur) entry.getKey();
                                                if (!map2.containsKey(zzurVar) || !zzew.zzU(entry.getValue(), map2.get(zzurVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final int hashCode() {
        return ((((((((((((super.hashCode() + 31) * 31) + (this.zzG ? 1 : 0)) * 961) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 28629151) + (this.zzP ? 1 : 0)) * 31) + (this.zzQ ? 1 : 0)) * 961) + (this.zzS ? 1 : 0);
    }

    public final zzvo zzc() {
        return new zzvo(this, null);
    }

    @Deprecated
    public final zzvs zze(int i, zzur zzurVar) {
        Map map = (Map) this.zzak.get(i);
        if (map != null) {
            return (zzvs) map.get(zzurVar);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.zzal.get(i);
    }

    @Deprecated
    public final boolean zzg(int i, zzur zzurVar) {
        Map map = (Map) this.zzak.get(i);
        return map != null && map.containsKey(zzurVar);
    }
}
