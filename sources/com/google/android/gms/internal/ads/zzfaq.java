package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzfaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfaq> CREATOR = new zzfar();

    @Nullable
    public final Context zza;
    public final zzfan zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfan[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfaq(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        zzfan[] zzfanVarArrValues = zzfan.values();
        this.zzh = zzfanVarArrValues;
        int[] iArrZza = zzfao.zza();
        this.zzl = iArrZza;
        int[] iArrZza2 = zzfap.zza();
        this.zzm = iArrZza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = zzfanVarArrValues[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = iArrZza[i5];
        this.zzk = i6;
        int i7 = iArrZza2[i6];
    }

    @Nullable
    public static zzfaq zza(zzfan zzfanVar, Context context) {
        if (zzfanVar == zzfan.Rewarded) {
            return new zzfaq(context, zzfanVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfV)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgb)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgd)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgf), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfX), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfZ));
        }
        if (zzfanVar == zzfan.Interstitial) {
            return new zzfaq(context, zzfanVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfW)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgc)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzge)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgg), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfY), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzga));
        }
        if (zzfanVar != zzfan.AppOpen) {
            return null;
        }
        return new zzfaq(context, zzfanVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgj)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgl)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgm)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgh), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgi), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgk));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzi);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzfaq(@Nullable Context context, zzfan zzfanVar, int i, int i2, int i3, String str, String str2, String str3) {
        int i4;
        this.zzh = zzfan.values();
        this.zzl = zzfao.zza();
        this.zzm = zzfap.zza();
        this.zza = context;
        this.zzi = zzfanVar.ordinal();
        this.zzb = zzfanVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else {
            i4 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i4;
        this.zzj = i4 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
