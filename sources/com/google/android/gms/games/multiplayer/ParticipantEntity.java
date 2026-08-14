package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class ParticipantEntity extends GamesDowngradeableSafeParcel {
    public static final Parcelable.Creator<ParticipantEntity> CREATOR = new zza();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    static final class zza extends com.google.android.gms.games.multiplayer.zza {
        zza() {
        }

        @Override // com.google.android.gms.games.multiplayer.zza
        /* JADX INFO: renamed from: zze */
        public final ParticipantEntity createFromParcel(Parcel parcel) {
            return (ParticipantEntity.zzb(ParticipantEntity.getUnparcelClientVersion()) || ParticipantEntity.canUnparcelSafely(ParticipantEntity.class.getCanonicalName())) ? super.createFromParcel(parcel) : new ParticipantEntity();
        }

        @Override // com.google.android.gms.games.multiplayer.zza, android.os.Parcelable.Creator
        public final /* synthetic */ ParticipantEntity createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    }

    ParticipantEntity() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (!shouldDowngrade()) {
            SafeParcelWriter.finishObjectHeader(parcel, SafeParcelWriter.beginObjectHeader(parcel));
            return;
        }
        parcel.writeString("unsupported");
        parcel.writeString("unsupported");
        parcel.writeString(null);
        parcel.writeString(null);
        parcel.writeInt(0);
        parcel.writeString("unsupported");
        parcel.writeInt(0);
        parcel.writeInt(0);
    }
}
