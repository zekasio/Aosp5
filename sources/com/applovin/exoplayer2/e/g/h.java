package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static byte[] a(UUID uuid, byte[] bArr) {
        return a(uuid, null, bArr);
    }

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean a(byte[] bArr) {
        return d(bArr) != null;
    }

    public static UUID b(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f309a;
    }

    public static int c(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.b;
    }

    public static byte[] a(byte[] bArr, UUID uuid) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        if (!uuid.equals(aVarD.f309a)) {
            q.c("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarD.f309a + ".");
            return null;
        }
        return aVarD.c;
    }

    private static a d(byte[] bArr) {
        y yVar = new y(bArr);
        if (yVar.b() < 32) {
            return null;
        }
        yVar.d(0);
        if (yVar.q() != yVar.a() + 4 || yVar.q() != 1886614376) {
            return null;
        }
        int iA = com.applovin.exoplayer2.e.g.a.a(yVar.q());
        if (iA > 1) {
            q.c("PsshAtomUtil", "Unsupported pssh version: " + iA);
            return null;
        }
        UUID uuid = new UUID(yVar.s(), yVar.s());
        if (iA == 1) {
            yVar.e(yVar.w() * 16);
        }
        int iW = yVar.w();
        if (iW != yVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iW];
        yVar.a(bArr2, 0, iW);
        return new a(uuid, iA, bArr2);
    }

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final UUID f309a;
        private final int b;
        private final byte[] c;

        public a(UUID uuid, int i, byte[] bArr) {
            this.f309a = uuid;
            this.b = i;
            this.c = bArr;
        }
    }
}
