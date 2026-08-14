package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbdl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbdl> CREATOR = new zzbdm();
    public final int zza;
    public final boolean zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final com.google.android.gms.ads.internal.client.zzfl zzf;
    public final boolean zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;

    public zzbdl(int i, boolean z, int i2, boolean z2, int i3, com.google.android.gms.ads.internal.client.zzfl zzflVar, boolean z3, int i4, int i5, boolean z4) {
        this.zza = i;
        this.zzb = z;
        this.zzc = i2;
        this.zzd = z2;
        this.zze = i3;
        this.zzf = zzflVar;
        this.zzg = z3;
        this.zzh = i4;
        this.zzj = z4;
        this.zzi = i5;
    }

    public static NativeAdOptions zza(zzbdl zzbdlVar) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (zzbdlVar == null) {
            return builder.build();
        }
        int i = zzbdlVar.zza;
        if (i == 2) {
            builder.setAdChoicesPlacement(zzbdlVar.zze);
        } else {
            if (i != 3) {
                if (i == 4) {
                    builder.setRequestCustomMuteThisAd(zzbdlVar.zzg);
                    builder.setMediaAspectRatio(zzbdlVar.zzh);
                    builder.enableCustomClickGestureDirection(zzbdlVar.zzi, zzbdlVar.zzj);
                }
            }
            com.google.android.gms.ads.internal.client.zzfl zzflVar = zzbdlVar.zzf;
            if (zzflVar != null) {
                builder.setVideoOptions(new VideoOptions(zzflVar));
            }
            builder.setAdChoicesPlacement(zzbdlVar.zze);
        }
        builder.setReturnUrlsForImageAssets(zzbdlVar.zzb);
        builder.setRequestMultipleImages(zzbdlVar.zzd);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Deprecated
    public zzbdl(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new com.google.android.gms.ads.internal.client.zzfl(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false);
    }
}
