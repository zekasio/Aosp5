package com.applovin.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public final class u extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f680a;

    public u(int i) {
        super(a(i));
        this.f680a = i;
    }

    private static String a(int i) {
        if (i == 1) {
            return "Player release timed out.";
        }
        if (i == 2) {
            return "Setting foreground mode timed out.";
        }
        if (i == 3) {
            return "Detaching surface timed out.";
        }
        return "Undefined timeout.";
    }
}
