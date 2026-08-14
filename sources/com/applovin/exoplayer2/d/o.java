package com.applovin.exoplayer2.d;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.d.m;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import com.vungle.warren.utility.platform.Platform;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class o implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m.c f257a = new m.c() { // from class: com.applovin.exoplayer2.d.o$$ExternalSyntheticLambda1
        @Override // com.applovin.exoplayer2.d.m.c
        public final m acquireExoMediaDrm(UUID uuid) {
            return o.c(uuid);
        }
    };
    private final UUID b;
    private final MediaDrm c;
    private int d;

    @Override // com.applovin.exoplayer2.d.m
    public int d() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m c(UUID uuid) {
        try {
            return a(uuid);
        } catch (t unused) {
            com.applovin.exoplayer2.l.q.d("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new k();
        }
    }

    public static o a(UUID uuid) throws t {
        try {
            return new o(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new t(1, e);
        } catch (Exception e2) {
            throw new t(2, e2);
        }
    }

    private o(UUID uuid) throws UnsupportedSchemeException {
        com.applovin.exoplayer2.l.a.b(uuid);
        com.applovin.exoplayer2.l.a.a(!com.applovin.exoplayer2.h.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.b = uuid;
        MediaDrm mediaDrm = new MediaDrm(b(uuid));
        this.c = mediaDrm;
        this.d = 1;
        if (com.applovin.exoplayer2.h.d.equals(uuid) && e()) {
            a(mediaDrm);
        }
    }

    @Override // com.applovin.exoplayer2.d.m
    public void a(final m.b bVar) {
        this.c.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: com.applovin.exoplayer2.d.o$$ExternalSyntheticLambda2
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                this.f$0.a(bVar, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(m.b bVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        bVar.a(this, bArr, i, i2, bArr2);
    }

    @Override // com.applovin.exoplayer2.d.m
    public byte[] a() throws MediaDrmException {
        return this.c.openSession();
    }

    @Override // com.applovin.exoplayer2.d.m
    public void a(byte[] bArr) {
        this.c.closeSession(bArr);
    }

    @Override // com.applovin.exoplayer2.d.m
    public m.a a(byte[] bArr, List<e.a> list, int i, HashMap<String, String> map) throws NotProvisionedException {
        e.a aVarA;
        byte[] bArrA;
        String strA;
        if (list != null) {
            aVarA = a(this.b, list);
            bArrA = a(this.b, (byte[]) com.applovin.exoplayer2.l.a.b(aVarA.d));
            strA = a(this.b, aVarA.c);
        } else {
            aVarA = null;
            bArrA = null;
            strA = null;
        }
        MediaDrm.KeyRequest keyRequest = this.c.getKeyRequest(bArr, bArrA, strA, i, map);
        byte[] bArrB = b(this.b, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && aVarA != null && !TextUtils.isEmpty(aVarA.b)) {
            defaultUrl = aVarA.b;
        }
        return new m.a(bArrB, defaultUrl, ai.f611a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // com.applovin.exoplayer2.d.m
    public byte[] a(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (com.applovin.exoplayer2.h.c.equals(this.b)) {
            bArr2 = com.applovin.exoplayer2.d.a.b(bArr2);
        }
        return this.c.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.applovin.exoplayer2.d.m
    public m.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.c.getProvisionRequest();
        return new m.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.applovin.exoplayer2.d.m
    public void b(byte[] bArr) throws DeniedByServerException {
        this.c.provideProvisionResponse(bArr);
    }

    @Override // com.applovin.exoplayer2.d.m
    public Map<String, String> c(byte[] bArr) {
        return this.c.queryKeyStatus(bArr);
    }

    @Override // com.applovin.exoplayer2.d.m
    public boolean a(byte[] bArr, String str) {
        if (ai.f611a >= 31) {
            return a.a(this.c, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.b, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.applovin.exoplayer2.d.m
    public synchronized void c() {
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.c.release();
        }
    }

    @Override // com.applovin.exoplayer2.d.m
    public void b(byte[] bArr, byte[] bArr2) {
        this.c.restoreKeys(bArr, bArr2);
    }

    public String a(String str) {
        return this.c.getPropertyString(str);
    }

    @Override // com.applovin.exoplayer2.d.m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public n d(byte[] bArr) throws MediaCryptoException {
        return new n(b(this.b), bArr, ai.f611a < 21 && com.applovin.exoplayer2.h.d.equals(this.b) && "L3".equals(a("securityLevel")));
    }

    private static e.a a(UUID uuid, List<e.a> list) {
        if (!com.applovin.exoplayer2.h.d.equals(uuid)) {
            return list.get(0);
        }
        if (ai.f611a >= 28 && list.size() > 1) {
            e.a aVar = list.get(0);
            int length = 0;
            for (int i = 0; i < list.size(); i++) {
                e.a aVar2 = list.get(i);
                byte[] bArr = (byte[]) com.applovin.exoplayer2.l.a.b(aVar2.d);
                if (ai.a((Object) aVar2.c, (Object) aVar.c) && ai.a((Object) aVar2.b, (Object) aVar.b) && com.applovin.exoplayer2.e.g.h.a(bArr)) {
                    length += bArr.length;
                }
            }
            byte[] bArr2 = new byte[length];
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                byte[] bArr3 = (byte[]) com.applovin.exoplayer2.l.a.b(list.get(i3).d);
                int length2 = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i2, length2);
                i2 += length2;
            }
            return aVar.a(bArr2);
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            e.a aVar3 = list.get(i4);
            int iC = com.applovin.exoplayer2.e.g.h.c((byte[]) com.applovin.exoplayer2.l.a.b(aVar3.d));
            if (ai.f611a < 23 && iC == 0) {
                return aVar3;
            }
            if (ai.f611a >= 23 && iC == 1) {
                return aVar3;
            }
        }
        return list.get(0);
    }

    private static UUID b(UUID uuid) {
        return (ai.f611a >= 27 || !com.applovin.exoplayer2.h.c.equals(uuid)) ? uuid : com.applovin.exoplayer2.h.b;
    }

    private static byte[] a(UUID uuid, byte[] bArr) {
        byte[] bArrA;
        if (com.applovin.exoplayer2.h.e.equals(uuid)) {
            byte[] bArrA2 = com.applovin.exoplayer2.e.g.h.a(bArr, uuid);
            if (bArrA2 != null) {
                bArr = bArrA2;
            }
            bArr = com.applovin.exoplayer2.e.g.h.a(com.applovin.exoplayer2.h.e, f(bArr));
        }
        return (((ai.f611a >= 23 || !com.applovin.exoplayer2.h.d.equals(uuid)) && !(com.applovin.exoplayer2.h.e.equals(uuid) && Platform.MANUFACTURER_AMAZON.equals(ai.c) && ("AFTB".equals(ai.d) || "AFTS".equals(ai.d) || "AFTM".equals(ai.d) || "AFTT".equals(ai.d)))) || (bArrA = com.applovin.exoplayer2.e.g.h.a(bArr, uuid)) == null) ? bArr : bArrA;
    }

    private static String a(UUID uuid, String str) {
        return (ai.f611a < 26 && com.applovin.exoplayer2.h.c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static byte[] b(UUID uuid, byte[] bArr) {
        return com.applovin.exoplayer2.h.c.equals(uuid) ? com.applovin.exoplayer2.d.a.a(bArr) : bArr;
    }

    private static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static boolean e() {
        return "ASUS_Z00AD".equals(ai.d);
    }

    private static byte[] f(byte[] bArr) {
        y yVar = new y(bArr);
        int iR = yVar.r();
        short sL = yVar.l();
        short sL2 = yVar.l();
        if (sL != 1 || sL2 != 1) {
            com.applovin.exoplayer2.l.q.b("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        String strA = yVar.a(yVar.l(), Charsets.UTF_16LE);
        if (strA.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strA.indexOf("</DATA>");
        if (iIndexOf == -1) {
            com.applovin.exoplayer2.l.q.c("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strA.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strA.substring(iIndexOf);
        int i = iR + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putShort(sL);
        byteBufferAllocate.putShort(sL2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(Charsets.UTF_16LE));
        return byteBufferAllocate.array();
    }

    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }
    }
}
