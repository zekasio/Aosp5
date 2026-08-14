package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzag {
    private Application zza;

    private zzag() {
    }

    /* synthetic */ zzag(zzaf zzafVar) {
    }

    public final zzd zza() {
        zzck.zzb(this.zza, Application.class);
        return new zzaj(this.zza, null);
    }

    public final zzag zzb(Application application) {
        application.getClass();
        this.zza = application;
        return this;
    }
}
