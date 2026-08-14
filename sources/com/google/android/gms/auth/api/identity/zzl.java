package com.google.android.gms.auth.api.identity;

import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.tapjoy.TapjoyConstants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzl implements Api.ApiOptions.Optional {
    private final String zzau;

    public static zzc zzj() {
        return new zzc();
    }

    public zzl(String str) {
        this.zzau = str;
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static class zzc {
        private String zzau;

        public static zzc zzc(zzl zzlVar) {
            zzc zzcVar = new zzc();
            String strZzh = zzlVar.zzh();
            if (strZzh != null) {
                zzcVar.zzh(strZzh);
            }
            return zzcVar;
        }

        private zzc() {
        }

        public final zzc zzh(String str) {
            this.zzau = Preconditions.checkNotEmpty(str);
            return this;
        }

        public final zzl zzk() {
            return new zzl(this.zzau);
        }
    }

    public final String zzh() {
        return this.zzau;
    }

    public final boolean equals(Object obj) {
        return obj instanceof zzl;
    }

    public final int hashCode() {
        return Objects.hashCode(zzl.class);
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(TapjoyConstants.TJC_SESSION_ID, this.zzau);
        return bundle;
    }
}
