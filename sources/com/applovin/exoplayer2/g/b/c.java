package com.applovin.exoplayer2.g.b;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f418a;
    private final DataOutputStream b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f418a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public byte[] a(a aVar) {
        this.f418a.reset();
        try {
            a(this.b, aVar.f417a);
            a(this.b, aVar.b != null ? aVar.b : "");
            this.b.writeLong(aVar.c);
            this.b.writeLong(aVar.d);
            this.b.write(aVar.e);
            this.b.flush();
            return this.f418a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void a(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}
