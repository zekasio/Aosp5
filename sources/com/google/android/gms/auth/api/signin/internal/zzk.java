package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzk extends zzc {
    private final /* synthetic */ zzh zzcn;

    zzk(zzh zzhVar) {
        this.zzcn = zzhVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzc, com.google.android.gms.auth.api.signin.internal.zzr
    public final void zzc(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException {
        if (googleSignInAccount != null) {
            zzq.zzd(this.zzcn.val$context).zzc(this.zzcn.zzcm, googleSignInAccount);
        }
        this.zzcn.setResult(new GoogleSignInResult(googleSignInAccount, status));
    }
}
