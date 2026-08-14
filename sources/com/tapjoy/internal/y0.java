package com.tapjoy.internal;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public class y0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1947a;

    public y0(String str) {
        this.f1947a = str;
    }

    @Override // com.tapjoy.internal.x0
    public void a(Writer writer) throws IOException {
        writer.write(this.f1947a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y0) {
            return this.f1947a.equals(((y0) obj).f1947a);
        }
        return false;
    }

    public int hashCode() {
        return this.f1947a.hashCode();
    }

    public String toString() {
        return this.f1947a;
    }
}
