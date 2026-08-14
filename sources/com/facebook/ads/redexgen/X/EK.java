package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.metadata.emsg.EventMessage;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EK implements Parcelable.Creator<EventMessage> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final EventMessage createFromParcel(Parcel parcel) {
        return new EventMessage(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final EventMessage[] newArray(int i) {
        return new EventMessage[i];
    }
}
