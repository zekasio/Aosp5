package com.applovin.exoplayer2.k;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class j extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f579a;

    public static boolean a(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof j) && ((j) cause).f579a == 2008) {
                return true;
            }
        }
        return false;
    }

    public j(int i) {
        this.f579a = i;
    }

    public j(Throwable th, int i) {
        super(th);
        this.f579a = i;
    }

    public j(String str, int i) {
        super(str);
        this.f579a = i;
    }

    public j(String str, Throwable th, int i) {
        super(str, th);
        this.f579a = i;
    }
}
