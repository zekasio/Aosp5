package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import com.tapjoy.TapjoyAuctionFlags;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfjl {
    private static final Object zza = new Object();
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzfis zze;
    private boolean zzf;

    public zzfjl(Context context, int i, zzfis zzfisVar, boolean z) {
        this.zzf = false;
        this.zzb = context;
        this.zzd = Integer.toString(i - 1);
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzfisVar;
        this.zzf = z;
    }

    private final File zze(String str) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static String zzf(zzasr zzasrVar) {
        zzast zzastVarZze = zzasu.zze();
        zzastVarZze.zze(zzasrVar.zzd().zzk());
        zzastVarZze.zza(zzasrVar.zzd().zzj());
        zzastVarZze.zzb(zzasrVar.zzd().zza());
        zzastVarZze.zzd(zzasrVar.zzd().zzd());
        zzastVarZze.zzc(zzasrVar.zzd().zzc());
        return Hex.bytesToStringLowercase(((zzasu) zzastVarZze.zzal()).zzax());
    }

    private final String zzg() {
        return "FBAMTD".concat(String.valueOf(this.zzd));
    }

    private final String zzh() {
        return "LATMTD".concat(String.valueOf(this.zzd));
    }

    private final void zzi(int i, long j) {
        zzfis zzfisVar = this.zze;
        if (zzfisVar != null) {
            zzfisVar.zza(i, j);
        }
    }

    private final void zzj(int i, long j, String str) {
        zzfis zzfisVar = this.zze;
        if (zzfisVar != null) {
            zzfisVar.zzb(i, j, str);
        }
    }

    private final zzasu zzk(int i) {
        String string = i == 1 ? this.zzc.getString(zzh(), null) : this.zzc.getString(zzg(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            return zzasu.zzi(zzgpe.zzv(Hex.stringToBytes(string)), this.zzf ? zzgpy.zza() : zzgpy.zzb());
        } catch (zzgqy unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzasr zzasrVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            if (!zzfjf.zze(new File(zze(zzasrVar.zzd().zzk()), "pcbc"), zzasrVar.zze().zzE())) {
                zzi(4020, jCurrentTimeMillis);
                return false;
            }
            String strZzf = zzf(zzasrVar);
            SharedPreferences.Editor editorEdit = this.zzc.edit();
            editorEdit.putString(zzh(), strZzf);
            boolean zCommit = editorEdit.commit();
            if (zCommit) {
                zzi(5015, jCurrentTimeMillis);
            } else {
                zzi(4021, jCurrentTimeMillis);
            }
            return zCommit;
        }
    }

    public final boolean zzb(zzasr zzasrVar, zzfjk zzfjkVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzasu zzasuVarZzk = zzk(1);
            String strZzk = zzasrVar.zzd().zzk();
            if (zzasuVarZzk != null && zzasuVarZzk.zzk().equals(strZzk)) {
                zzi(4014, jCurrentTimeMillis);
                return false;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            File fileZze = zze(strZzk);
            if (fileZze.exists()) {
                boolean zIsDirectory = fileZze.isDirectory();
                String str = TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE;
                if (true != zIsDirectory) {
                    str = "0";
                }
                boolean zIsFile = fileZze.isFile();
                String str2 = TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE;
                if (true != zIsFile) {
                    str2 = "0";
                }
                zzj(4023, jCurrentTimeMillis2, "d:" + str + ",f:" + str2);
                zzi(4015, jCurrentTimeMillis2);
            } else if (!fileZze.mkdirs()) {
                boolean zCanWrite = fileZze.canWrite();
                String str3 = TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE;
                if (true != zCanWrite) {
                    str3 = "0";
                }
                zzj(4024, jCurrentTimeMillis2, "cw:".concat(str3));
                zzi(4015, jCurrentTimeMillis2);
                return false;
            }
            File fileZze2 = zze(strZzk);
            File file = new File(fileZze2, "pcam.jar");
            File file2 = new File(fileZze2, "pcbc");
            if (!zzfjf.zze(file, zzasrVar.zzf().zzE())) {
                zzi(4016, jCurrentTimeMillis);
                return false;
            }
            if (!zzfjf.zze(file2, zzasrVar.zze().zzE())) {
                zzi(4017, jCurrentTimeMillis);
                return false;
            }
            if (zzfjkVar != null && !zzfjkVar.zza(file)) {
                zzi(4018, jCurrentTimeMillis);
                zzfjf.zzd(fileZze2);
                return false;
            }
            String strZzf = zzf(zzasrVar);
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            String string = this.zzc.getString(zzh(), null);
            SharedPreferences.Editor editorEdit = this.zzc.edit();
            editorEdit.putString(zzh(), strZzf);
            if (string != null) {
                editorEdit.putString(zzg(), string);
            }
            if (!editorEdit.commit()) {
                zzi(4019, jCurrentTimeMillis3);
                return false;
            }
            HashSet hashSet = new HashSet();
            zzasu zzasuVarZzk2 = zzk(1);
            if (zzasuVarZzk2 != null) {
                hashSet.add(zzasuVarZzk2.zzk());
            }
            zzasu zzasuVarZzk3 = zzk(2);
            if (zzasuVarZzk3 != null) {
                hashSet.add(zzasuVarZzk3.zzk());
            }
            for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                if (!hashSet.contains(file3.getName())) {
                    zzfjf.zzd(file3);
                }
            }
            zzi(5014, jCurrentTimeMillis);
            return true;
        }
    }

    public final zzfjd zzc(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzasu zzasuVarZzk = zzk(1);
            if (zzasuVarZzk == null) {
                zzi(4022, jCurrentTimeMillis);
                return null;
            }
            File fileZze = zze(zzasuVarZzk.zzk());
            File file = new File(fileZze, "pcam.jar");
            if (!file.exists()) {
                file = new File(fileZze, "pcam");
            }
            File file2 = new File(fileZze, "pcbc");
            File file3 = new File(fileZze, "pcopt");
            zzi(5016, jCurrentTimeMillis);
            return new zzfjd(zzasuVarZzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzasu zzasuVarZzk = zzk(1);
            if (zzasuVarZzk == null) {
                zzi(4025, jCurrentTimeMillis);
                return false;
            }
            File fileZze = zze(zzasuVarZzk.zzk());
            if (!new File(fileZze, "pcam.jar").exists()) {
                zzi(4026, jCurrentTimeMillis);
                return false;
            }
            if (new File(fileZze, "pcbc").exists()) {
                zzi(5019, jCurrentTimeMillis);
                return true;
            }
            zzi(4027, jCurrentTimeMillis);
            return false;
        }
    }
}
