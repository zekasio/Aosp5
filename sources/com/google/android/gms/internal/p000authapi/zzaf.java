package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaf extends zzd implements zzac {
    zzaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zzac
    public final void zzc(zzag zzagVar, SavePasswordRequest savePasswordRequest) throws RemoteException {
        Parcel parcelZzc = zzc();
        zzf.zzc(parcelZzc, zzagVar);
        zzf.zzc(parcelZzc, savePasswordRequest);
        zzc(2, parcelZzc);
    }
}
