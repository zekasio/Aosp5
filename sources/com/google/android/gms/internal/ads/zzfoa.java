package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfoa extends zzfof {
    final /* synthetic */ zzfob zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfoa(zzfob zzfobVar, zzfoh zzfohVar, CharSequence charSequence) {
        super(zzfohVar, charSequence);
        this.zza = zzfobVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfof
    final int zzd(int i) {
        zzfng zzfngVar = this.zza.zza;
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzfnu.zzb(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            if (zzfngVar.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
