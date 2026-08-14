package com.tapjoy.internal;

import android.os.SystemClock;
import com.applovin.exoplayer2.common.base.Ascii;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes2.dex */
public class j6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1827a;
    public long b;
    public long c;

    public boolean a(String str, int i) throws Throwable {
        DatagramSocket datagramSocket = null;
        try {
            DatagramSocket datagramSocket2 = new DatagramSocket();
            try {
                datagramSocket2.setSoTimeout(i);
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, InetAddress.getByName(str), 123);
                bArr[0] = Ascii.ESC;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                a(bArr, 40, jCurrentTimeMillis);
                datagramSocket2.send(datagramPacket);
                datagramSocket2.receive(new DatagramPacket(bArr, 48));
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime2 - jElapsedRealtime;
                long j2 = jCurrentTimeMillis + j;
                long jB = b(bArr, 24);
                long jB2 = b(bArr, 32);
                long jB3 = b(bArr, 40);
                long j3 = j - (jB3 - jB2);
                this.f1827a = j2 + (((jB3 - j2) + (jB2 - jB)) / 2);
                this.b = jElapsedRealtime2;
                this.c = j3;
                datagramSocket2.close();
                return true;
            } catch (Exception unused) {
                datagramSocket = datagramSocket2;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                datagramSocket = datagramSocket2;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final long b(byte[] bArr, int i) {
        long jA = a(bArr, i);
        return ((a(bArr, i + 4) * 1000) / 4294967296L) + ((jA - 2208988800L) * 1000);
    }

    public final long a(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    public final void a(byte[] bArr, int i, long j) {
        long j2 = j / 1000;
        long j3 = j - (j2 * 1000);
        bArr[i] = (byte) (r2 >> 24);
        bArr[i + 1] = (byte) (r2 >> 16);
        bArr[i + 2] = (byte) (r2 >> 8);
        bArr[i + 3] = (byte) (j2 + 2208988800L);
        long j4 = (j3 * 4294967296L) / 1000;
        bArr[i + 4] = (byte) (j4 >> 24);
        bArr[i + 5] = (byte) (j4 >> 16);
        bArr[i + 6] = (byte) (j4 >> 8);
        bArr[i + 7] = (byte) (Math.random() * 255.0d);
    }
}
