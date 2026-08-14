package com.applovin.exoplayer2.c;

import com.google.android.gms.drive.DriveFile;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f96a;

    public void a() {
        this.f96a = 0;
    }

    public final boolean b() {
        return d(Integer.MIN_VALUE);
    }

    public final boolean c() {
        return d(4);
    }

    public final boolean d() {
        return d(1);
    }

    public final boolean e() {
        return d(DriveFile.MODE_READ_ONLY);
    }

    public final void a_(int i) {
        this.f96a = i;
    }

    public final void b(int i) {
        this.f96a = i | this.f96a;
    }

    public final void c(int i) {
        this.f96a = (i ^ (-1)) & this.f96a;
    }

    protected final boolean d(int i) {
        return (this.f96a & i) == i;
    }
}
