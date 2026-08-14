package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new zzj();
    private final String zzau;
    private final SignInPassword zzbe;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static final class Builder {
        private String zzau;
        private SignInPassword zzbe;

        public final Builder setSignInPassword(SignInPassword signInPassword) {
            this.zzbe = signInPassword;
            return this;
        }

        public final Builder zzg(String str) {
            this.zzau = str;
            return this;
        }

        public final SavePasswordRequest build() {
            return new SavePasswordRequest(this.zzbe, this.zzau);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder zzc(SavePasswordRequest savePasswordRequest) {
        Preconditions.checkNotNull(savePasswordRequest);
        Builder signInPassword = builder().setSignInPassword(savePasswordRequest.getSignInPassword());
        String str = savePasswordRequest.zzau;
        if (str != null) {
            signInPassword.zzg(str);
        }
        return signInPassword;
    }

    SavePasswordRequest(SignInPassword signInPassword, String str) {
        this.zzbe = (SignInPassword) Preconditions.checkNotNull(signInPassword);
        this.zzau = str;
    }

    public SignInPassword getSignInPassword() {
        return this.zzbe;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzbe, this.zzau);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return Objects.equal(this.zzbe, savePasswordRequest.zzbe) && Objects.equal(this.zzau, savePasswordRequest.zzau);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getSignInPassword(), i, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzau, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
