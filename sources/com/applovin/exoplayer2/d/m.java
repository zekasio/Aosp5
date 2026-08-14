package com.applovin.exoplayer2.d;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.applovin.exoplayer2.d.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface m {

    public interface b {
        void a(m mVar, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    public interface c {
        m acquireExoMediaDrm(UUID uuid);
    }

    a a(byte[] bArr, List<e.a> list, int i, HashMap<String, String> map) throws NotProvisionedException;

    void a(b bVar);

    void a(byte[] bArr);

    boolean a(byte[] bArr, String str);

    byte[] a() throws MediaDrmException;

    byte[] a(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    d b();

    void b(byte[] bArr) throws DeniedByServerException;

    void b(byte[] bArr, byte[] bArr2);

    Map<String, String> c(byte[] bArr);

    void c();

    int d();

    com.applovin.exoplayer2.c.b d(byte[] bArr) throws MediaCryptoException;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f254a;
        private final String b;
        private final int c;

        public a(byte[] bArr, String str, int i) {
            this.f254a = bArr;
            this.b = str;
            this.c = i;
        }

        public byte[] a() {
            return this.f254a;
        }

        public String b() {
            return this.b;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f255a;
        private final String b;

        public d(byte[] bArr, String str) {
            this.f255a = bArr;
            this.b = str;
        }

        public byte[] a() {
            return this.f255a;
        }

        public String b() {
            return this.b;
        }
    }
}
