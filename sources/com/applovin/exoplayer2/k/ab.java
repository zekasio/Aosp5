package com.applovin.exoplayer2.k;

import android.net.Uri;
import com.facebook.ads.AdError;
import com.google.android.gms.games.GamesStatusCodes;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class ab extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f572a;
    private final byte[] b;
    private final DatagramPacket c;
    private Uri d;
    private DatagramSocket e;
    private MulticastSocket f;
    private InetAddress g;
    private InetSocketAddress h;
    private boolean i;
    private int j;

    public static final class a extends j {
        public a(Throwable th, int i) {
            super(th, i);
        }
    }

    public ab() {
        this(2000);
    }

    public ab(int i) {
        this(i, GamesStatusCodes.STATUS_MILESTONE_CLAIMED_PREVIOUSLY);
    }

    public ab(int i, int i2) {
        super(true);
        this.f572a = i2;
        byte[] bArr = new byte[i];
        this.b = bArr;
        this.c = new DatagramPacket(bArr, 0, i);
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws a {
        Uri uri = lVar.f581a;
        this.d = uri;
        String host = uri.getHost();
        int port = this.d.getPort();
        b(lVar);
        try {
            this.g = InetAddress.getByName(host);
            this.h = new InetSocketAddress(this.g, port);
            if (this.g.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.h);
                this.f = multicastSocket;
                multicastSocket.joinGroup(this.g);
                this.e = this.f;
            } else {
                this.e = new DatagramSocket(this.h);
            }
            this.e.setSoTimeout(this.f572a);
            this.i = true;
            c(lVar);
            return -1L;
        } catch (IOException e) {
            throw new a(e, 2001);
        } catch (SecurityException e2) {
            throw new a(e2, AdError.INTERNAL_ERROR_2006);
        }
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        if (this.j == 0) {
            try {
                this.e.receive(this.c);
                int length = this.c.getLength();
                this.j = length;
                a(length);
            } catch (SocketTimeoutException e) {
                throw new a(e, 2002);
            } catch (IOException e2) {
                throw new a(e2, 2001);
            }
        }
        int length2 = this.c.getLength();
        int i3 = this.j;
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.b, length2 - i3, bArr, i, iMin);
        this.j -= iMin;
        return iMin;
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.d;
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() {
        this.d = null;
        MulticastSocket multicastSocket = this.f;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.g);
            } catch (IOException unused) {
            }
            this.f = null;
        }
        DatagramSocket datagramSocket = this.e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.e = null;
        }
        this.g = null;
        this.h = null;
        this.j = 0;
        if (this.i) {
            this.i = false;
            d();
        }
    }
}
