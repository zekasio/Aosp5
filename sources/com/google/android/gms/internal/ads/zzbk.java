package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbk {
    private CharSequence zza;
    private CharSequence zzb;
    private CharSequence zzc;
    private CharSequence zzd;
    private CharSequence zze;
    private byte[] zzf;
    private Integer zzg;
    private Integer zzh;
    private Integer zzi;
    private Integer zzj;
    private Boolean zzk;
    private Integer zzl;
    private Integer zzm;
    private Integer zzn;
    private Integer zzo;
    private Integer zzp;
    private Integer zzq;
    private CharSequence zzr;
    private CharSequence zzs;
    private CharSequence zzt;
    private CharSequence zzu;
    private CharSequence zzv;
    private Integer zzw;

    public zzbk() {
    }

    /* synthetic */ zzbk(zzbm zzbmVar, zzbj zzbjVar) {
        this.zza = zzbmVar.zzc;
        this.zzb = zzbmVar.zzd;
        this.zzc = zzbmVar.zze;
        this.zzd = zzbmVar.zzf;
        this.zze = zzbmVar.zzg;
        this.zzf = zzbmVar.zzh;
        this.zzg = zzbmVar.zzi;
        this.zzh = zzbmVar.zzj;
        this.zzi = zzbmVar.zzk;
        this.zzj = zzbmVar.zzl;
        this.zzk = zzbmVar.zzm;
        this.zzl = zzbmVar.zzo;
        this.zzm = zzbmVar.zzp;
        this.zzn = zzbmVar.zzq;
        this.zzo = zzbmVar.zzr;
        this.zzp = zzbmVar.zzs;
        this.zzq = zzbmVar.zzt;
        this.zzr = zzbmVar.zzu;
        this.zzs = zzbmVar.zzv;
        this.zzt = zzbmVar.zzw;
        this.zzu = zzbmVar.zzx;
        this.zzv = zzbmVar.zzy;
        this.zzw = zzbmVar.zzz;
    }

    public final zzbk zza(byte[] bArr, int i) {
        if (this.zzf == null || zzew.zzU(Integer.valueOf(i), 3) || !zzew.zzU(this.zzg, 3)) {
            this.zzf = (byte[]) bArr.clone();
            this.zzg = Integer.valueOf(i);
        }
        return this;
    }

    public final zzbk zzb(zzbm zzbmVar) {
        if (zzbmVar == null) {
            return this;
        }
        CharSequence charSequence = zzbmVar.zzc;
        if (charSequence != null) {
            this.zza = charSequence;
        }
        CharSequence charSequence2 = zzbmVar.zzd;
        if (charSequence2 != null) {
            this.zzb = charSequence2;
        }
        CharSequence charSequence3 = zzbmVar.zze;
        if (charSequence3 != null) {
            this.zzc = charSequence3;
        }
        CharSequence charSequence4 = zzbmVar.zzf;
        if (charSequence4 != null) {
            this.zzd = charSequence4;
        }
        CharSequence charSequence5 = zzbmVar.zzg;
        if (charSequence5 != null) {
            this.zze = charSequence5;
        }
        byte[] bArr = zzbmVar.zzh;
        if (bArr != null) {
            Integer num = zzbmVar.zzi;
            this.zzf = (byte[]) bArr.clone();
            this.zzg = num;
        }
        Integer num2 = zzbmVar.zzj;
        if (num2 != null) {
            this.zzh = num2;
        }
        Integer num3 = zzbmVar.zzk;
        if (num3 != null) {
            this.zzi = num3;
        }
        Integer num4 = zzbmVar.zzl;
        if (num4 != null) {
            this.zzj = num4;
        }
        Boolean bool = zzbmVar.zzm;
        if (bool != null) {
            this.zzk = bool;
        }
        Integer num5 = zzbmVar.zzn;
        if (num5 != null) {
            this.zzl = num5;
        }
        Integer num6 = zzbmVar.zzo;
        if (num6 != null) {
            this.zzl = num6;
        }
        Integer num7 = zzbmVar.zzp;
        if (num7 != null) {
            this.zzm = num7;
        }
        Integer num8 = zzbmVar.zzq;
        if (num8 != null) {
            this.zzn = num8;
        }
        Integer num9 = zzbmVar.zzr;
        if (num9 != null) {
            this.zzo = num9;
        }
        Integer num10 = zzbmVar.zzs;
        if (num10 != null) {
            this.zzp = num10;
        }
        Integer num11 = zzbmVar.zzt;
        if (num11 != null) {
            this.zzq = num11;
        }
        CharSequence charSequence6 = zzbmVar.zzu;
        if (charSequence6 != null) {
            this.zzr = charSequence6;
        }
        CharSequence charSequence7 = zzbmVar.zzv;
        if (charSequence7 != null) {
            this.zzs = charSequence7;
        }
        CharSequence charSequence8 = zzbmVar.zzw;
        if (charSequence8 != null) {
            this.zzt = charSequence8;
        }
        CharSequence charSequence9 = zzbmVar.zzx;
        if (charSequence9 != null) {
            this.zzu = charSequence9;
        }
        CharSequence charSequence10 = zzbmVar.zzy;
        if (charSequence10 != null) {
            this.zzv = charSequence10;
        }
        Integer num12 = zzbmVar.zzz;
        if (num12 != null) {
            this.zzw = num12;
        }
        return this;
    }

    public final zzbk zzc(CharSequence charSequence) {
        this.zzd = charSequence;
        return this;
    }

    public final zzbk zzd(CharSequence charSequence) {
        this.zzc = charSequence;
        return this;
    }

    public final zzbk zze(CharSequence charSequence) {
        this.zzb = charSequence;
        return this;
    }

    public final zzbk zzf(CharSequence charSequence) {
        this.zzs = charSequence;
        return this;
    }

    public final zzbk zzg(CharSequence charSequence) {
        this.zzt = charSequence;
        return this;
    }

    public final zzbk zzh(CharSequence charSequence) {
        this.zze = charSequence;
        return this;
    }

    public final zzbk zzi(CharSequence charSequence) {
        this.zzu = charSequence;
        return this;
    }

    public final zzbk zzj(Integer num) {
        this.zzn = num;
        return this;
    }

    public final zzbk zzk(Integer num) {
        this.zzm = num;
        return this;
    }

    public final zzbk zzl(Integer num) {
        this.zzl = num;
        return this;
    }

    public final zzbk zzm(Integer num) {
        this.zzq = num;
        return this;
    }

    public final zzbk zzn(Integer num) {
        this.zzp = num;
        return this;
    }

    public final zzbk zzo(Integer num) {
        this.zzo = num;
        return this;
    }

    public final zzbk zzp(CharSequence charSequence) {
        this.zzv = charSequence;
        return this;
    }

    public final zzbk zzq(CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzbk zzr(Integer num) {
        this.zzi = num;
        return this;
    }

    public final zzbk zzs(Integer num) {
        this.zzh = num;
        return this;
    }

    public final zzbk zzt(CharSequence charSequence) {
        this.zzr = charSequence;
        return this;
    }

    public final zzbm zzu() {
        return new zzbm(this);
    }
}
