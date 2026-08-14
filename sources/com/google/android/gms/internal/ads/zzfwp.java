package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfwp {
    private final zzgll zza;
    private final List zzb;
    private final zzggl zzc = zzggl.zza;

    private zzfwp(zzgll zzgllVar, List list) {
        this.zza = zzgllVar;
        this.zzb = list;
    }

    static final zzfwp zza(zzgll zzgllVar) throws GeneralSecurityException {
        if (zzgllVar == null || zzgllVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzfwp(zzgllVar, zzg(zzgllVar));
    }

    public static final zzfwp zzb(zzfwh zzfwhVar) throws GeneralSecurityException {
        zzgcx zzgcxVar = new zzgcx(zzgea.zza(zzfwhVar.zza()));
        zzfwm zzfwmVar = new zzfwm();
        zzfwk zzfwkVar = new zzfwk(zzgcxVar, null);
        zzfwkVar.zzd();
        zzfwkVar.zze();
        zzfwmVar.zza(zzfwkVar);
        return zzfwmVar.zzb();
    }

    private static zzgdz zze(zzglk zzglkVar) {
        try {
            return zzgdz.zza(zzglkVar.zzc().zzg(), zzglkVar.zzc().zzf(), zzglkVar.zzc().zzc(), zzglkVar.zzf(), zzglkVar.zzf() == zzgme.RAW ? null : Integer.valueOf(zzglkVar.zza()));
        } catch (GeneralSecurityException e) {
            throw new zzgej("Creating a protokey serialization failed", e);
        }
    }

    @Nullable
    private static Object zzf(zzglk zzglkVar, Class cls) throws GeneralSecurityException {
        try {
            return zzfxf.zzg(zzglkVar.zzc(), cls);
        } catch (GeneralSecurityException e) {
            if (e.getMessage().contains("No key manager found for key type ") || e.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e;
        }
    }

    private static List zzg(zzgll zzgllVar) {
        zzfvx zzfvxVarZza;
        int iZzk;
        zzfwg zzfwgVar;
        ArrayList arrayList = new ArrayList(zzgllVar.zza());
        for (zzglk zzglkVar : zzgllVar.zzi()) {
            int iZza = zzglkVar.zza();
            try {
                zzfvxVarZza = zzgdf.zzb().zza(zze(zzglkVar), zzfxg.zza());
                iZzk = zzglkVar.zzk() - 2;
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
            if (iZzk == 1) {
                zzfwgVar = zzfwg.zza;
            } else if (iZzk == 2) {
                zzfwgVar = zzfwg.zzb;
            } else {
                if (iZzk != 3) {
                    throw new GeneralSecurityException("Unknown key status");
                }
                zzfwgVar = zzfwg.zzc;
            }
            arrayList.add(new zzfwo(zzfvxVarZza, zzfwgVar, iZza, iZza == zzgllVar.zzc(), null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Nullable
    private static final Object zzh(zzfvx zzfvxVar, Class cls) throws GeneralSecurityException {
        try {
            return zzfxf.zzf(zzfvxVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public final String toString() {
        return zzfxh.zza(this.zza).toString();
    }

    final zzgll zzc() {
        return this.zza;
    }

    public final Object zzd(Class cls) throws GeneralSecurityException {
        Class clsZze = zzfxf.zze(cls);
        if (clsZze == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
        }
        zzfxh.zzb(this.zza);
        zzfww zzfwwVar = new zzfww(clsZze, null);
        zzfwwVar.zzc(this.zzc);
        for (int i = 0; i < this.zza.zza(); i++) {
            zzglk zzglkVarZze = this.zza.zze(i);
            if (zzglkVarZze.zzk() == 3) {
                Object objZzf = zzf(zzglkVarZze, clsZze);
                Object objZzh = this.zzb.get(i) != null ? zzh(((zzfwo) this.zzb.get(i)).zza(), clsZze) : null;
                if (zzglkVarZze.zza() == this.zza.zzc()) {
                    zzfwwVar.zzb(objZzh, objZzf, zzglkVarZze);
                } else {
                    zzfwwVar.zza(objZzh, objZzf, zzglkVarZze);
                }
            }
        }
        return zzfxf.zzk(zzfwwVar.zzd(), cls);
    }
}
