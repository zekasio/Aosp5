package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;

/* JADX INFO: loaded from: classes2.dex */
public enum r2 {
    CLICK(TJAdUnitConstants.String.CLICK),
    INVITATION_ACCEPTED("invitationAccept");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1895a;

    r2(String str) {
        this.f1895a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1895a;
    }
}
