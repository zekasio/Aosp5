package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.zzl;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzao extends GoogleApi<zzl> implements SignInClient {
    private static final Api<zzl> API;
    private static final Api.ClientKey<zzaw> CLIENT_KEY;
    private static final Api.AbstractClientBuilder<zzaw, zzl> zzbn;

    public zzao(Context context, zzl zzlVar) {
        super(context, API, zzl.zzc.zzc(zzlVar).zzh(zzba.zzw()).zzk(), GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public zzao(Activity activity, zzl zzlVar) {
        super(activity, API, zzl.zzc.zzc(zzlVar).zzh(zzba.zzw()).zzk(), GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final Task<BeginSignInResult> beginSignIn(BeginSignInRequest beginSignInRequest) {
        final BeginSignInRequest beginSignInRequestBuild = BeginSignInRequest.zzc(beginSignInRequest).zzd(getApiOptions().zzh()).build();
        return doRead(TaskApiCall.builder().setFeatures(zzay.zzdc).run(new RemoteCall(this, beginSignInRequestBuild) { // from class: com.google.android.gms.internal.auth-api.zzar
            private final zzao zzbr;
            private final BeginSignInRequest zzbs;

            {
                this.zzbr = this;
                this.zzbs = beginSignInRequestBuild;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzao zzaoVar = this.zzbr;
                BeginSignInRequest beginSignInRequest2 = this.zzbs;
                ((zzai) ((zzaw) obj).getService()).zzc(new zzav(zzaoVar, (TaskCompletionSource) obj2), (BeginSignInRequest) Preconditions.checkNotNull(beginSignInRequest2));
            }
        }).setAutoResolveMissingFeatures(false).build());
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Iterator<GoogleApiClient> it = GoogleApiClient.getAllClients().iterator();
        while (it.hasNext()) {
            it.next().maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
        return doRead(TaskApiCall.builder().setFeatures(zzay.zzdd).run(new RemoteCall(this) { // from class: com.google.android.gms.internal.auth-api.zzaq
            private final zzao zzbr;

            {
                this.zzbr = this;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzao zzaoVar = this.zzbr;
                ((zzai) ((zzaw) obj).getService()).zzc(new zzau(zzaoVar, (TaskCompletionSource) obj2), zzaoVar.getApiOptions().zzh());
            }
        }).setAutoResolveMissingFeatures(false).build());
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final SignInCredential getSignInCredentialFromIntent(Intent intent) throws ApiException {
        if (intent == null) {
            throw new ApiException(Status.RESULT_INTERNAL_ERROR);
        }
        Status status = (Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new ApiException(Status.RESULT_CANCELED);
        }
        if (!status.isSuccess()) {
            throw new ApiException(status);
        }
        SignInCredential signInCredential = (SignInCredential) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "sign_in_credential", SignInCredential.CREATOR);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new ApiException(Status.RESULT_INTERNAL_ERROR);
    }

    @Override // com.google.android.gms.auth.api.identity.SignInClient
    public final Task<PendingIntent> getSignInIntent(GetSignInIntentRequest getSignInIntentRequest) {
        final GetSignInIntentRequest getSignInIntentRequestBuild = GetSignInIntentRequest.zzc(getSignInIntentRequest).zzf(getApiOptions().zzh()).build();
        return doRead(TaskApiCall.builder().setFeatures(zzay.zzdh).run(new RemoteCall(this, getSignInIntentRequestBuild) { // from class: com.google.android.gms.internal.auth-api.zzat
            private final zzao zzbr;
            private final GetSignInIntentRequest zzbt;

            {
                this.zzbr = this;
                this.zzbt = getSignInIntentRequestBuild;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                zzao zzaoVar = this.zzbr;
                GetSignInIntentRequest getSignInIntentRequest2 = this.zzbt;
                ((zzai) ((zzaw) obj).getService()).zzc(new zzax(zzaoVar, (TaskCompletionSource) obj2), (GetSignInIntentRequest) Preconditions.checkNotNull(getSignInIntentRequest2));
            }
        }).build());
    }

    static {
        Api.ClientKey<zzaw> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        zzas zzasVar = new zzas();
        zzbn = zzasVar;
        API = new Api<>("Auth.Api.Identity.SignIn.API", zzasVar, clientKey);
    }
}
