package com.tapjoy.internal;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
public final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w8 f1779a;
    public int d;
    public z3 h;
    public long b = 0;
    public long c = Long.MAX_VALUE;
    public int e = 2;
    public int f = -1;
    public long g = -1;

    public d4(w8 w8Var) {
        this.f1779a = w8Var;
    }

    public void a(long j) throws IOException {
        if (this.e != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i = this.d - 1;
        this.d = i;
        if (i < 0 || this.g != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.b == this.c || i == 0) {
            this.c = j;
            return;
        }
        StringBuilder sbA = w1.a("Expected to end at ");
        sbA.append(this.c);
        sbA.append(" but was ");
        sbA.append(this.b);
        throw new IOException(sbA.toString());
    }

    public long b() throws IOException {
        if (this.e != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i = this.d + 1;
        this.d = i;
        if (i > 65) {
            throw new IOException("Wire recursion limit exceeded");
        }
        long j = this.g;
        this.g = -1L;
        this.e = 6;
        return j;
    }

    public final int c() throws ProtocolException {
        int i;
        this.b++;
        byte b = this.f1779a.readByte();
        if (b >= 0) {
            return b;
        }
        int i2 = b & 127;
        this.b++;
        byte b2 = this.f1779a.readByte();
        if (b2 >= 0) {
            i = b2 << 7;
        } else {
            i2 |= (b2 & 127) << 7;
            this.b++;
            byte b3 = this.f1779a.readByte();
            if (b3 >= 0) {
                i = b3 << Ascii.SO;
            } else {
                i2 |= (b3 & 127) << 14;
                this.b++;
                byte b4 = this.f1779a.readByte();
                if (b4 < 0) {
                    int i3 = i2 | ((b4 & 127) << 21);
                    this.b++;
                    byte b5 = this.f1779a.readByte();
                    int i4 = i3 | (b5 << Ascii.FS);
                    if (b5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        this.b++;
                        if (this.f1779a.readByte() >= 0) {
                            return i4;
                        }
                    }
                    throw new ProtocolException("Malformed VARINT");
                }
                i = b4 << Ascii.NAK;
            }
        }
        return i2 | i;
    }

    public int d() throws IOException {
        int i = this.e;
        if (i == 7) {
            this.e = 2;
            return this.f;
        }
        if (i != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.b < this.c && !this.f1779a.c()) {
            int iC = c();
            if (iC == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i2 = iC >> 3;
            this.f = i2;
            int i3 = iC & 7;
            if (i3 == 0) {
                this.h = z3.VARINT;
                this.e = 0;
                return this.f;
            }
            if (i3 == 1) {
                this.h = z3.FIXED64;
                this.e = 1;
                return this.f;
            }
            if (i3 == 2) {
                this.h = z3.LENGTH_DELIMITED;
                this.e = 2;
                int iC2 = c();
                if (iC2 < 0) {
                    throw new ProtocolException("Negative length: " + iC2);
                }
                if (this.g != -1) {
                    throw new IllegalStateException();
                }
                long j = this.c;
                this.g = j;
                long j2 = this.b + ((long) iC2);
                this.c = j2;
                if (j2 <= j) {
                    return this.f;
                }
                throw new EOFException();
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i3 == 5) {
                    this.h = z3.FIXED32;
                    this.e = 5;
                    return this.f;
                }
                throw new ProtocolException("Unexpected field encoding: " + i3);
            }
            b(i2);
        }
        return -1;
    }

    public int e() throws IOException {
        int i = this.e;
        if (i != 5 && i != 2) {
            StringBuilder sbA = w1.a("Expected FIXED32 or LENGTH_DELIMITED but was ");
            sbA.append(this.e);
            throw new ProtocolException(sbA.toString());
        }
        this.f1779a.d(4L);
        this.b += 4;
        int iA = this.f1779a.a();
        a(5);
        return iA;
    }

    public long f() throws IOException {
        int i = this.e;
        if (i != 1 && i != 2) {
            StringBuilder sbA = w1.a("Expected FIXED64 or LENGTH_DELIMITED but was ");
            sbA.append(this.e);
            throw new ProtocolException(sbA.toString());
        }
        this.f1779a.d(8L);
        this.b += 8;
        long jB = this.f1779a.b();
        a(1);
        return jB;
    }

    public int g() {
        int i = this.e;
        if (i == 0 || i == 2) {
            int iC = c();
            a(0);
            return iC;
        }
        StringBuilder sbA = w1.a("Expected VARINT or LENGTH_DELIMITED but was ");
        sbA.append(this.e);
        throw new ProtocolException(sbA.toString());
    }

    public long h() {
        int i = this.e;
        if (i != 0 && i != 2) {
            StringBuilder sbA = w1.a("Expected VARINT or LENGTH_DELIMITED but was ");
            sbA.append(this.e);
            throw new ProtocolException(sbA.toString());
        }
        long j = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            this.b++;
            byte b = this.f1779a.readByte();
            j |= ((long) (b & 127)) << i2;
            if ((b & ByteCompanionObject.MIN_VALUE) == 0) {
                a(0);
                return j;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final void a(int i) throws IOException {
        if (this.e == i) {
            this.e = 6;
            return;
        }
        long j = this.b;
        long j2 = this.c;
        if (j > j2) {
            StringBuilder sbA = w1.a("Expected to end at ");
            sbA.append(this.c);
            sbA.append(" but was ");
            sbA.append(this.b);
            throw new IOException(sbA.toString());
        }
        if (j == j2) {
            this.c = this.g;
            this.g = -1L;
            this.e = 6;
            return;
        }
        this.e = 7;
    }

    public final void b(int i) throws IOException {
        while (this.b < this.c && !this.f1779a.c()) {
            int iC = c();
            if (iC == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i2 = iC >> 3;
            int i3 = iC & 7;
            if (i3 == 0) {
                this.e = 0;
                h();
            } else if (i3 == 1) {
                this.e = 1;
                f();
            } else if (i3 == 2) {
                long jC = c();
                this.b += jC;
                this.f1779a.skip(jC);
            } else if (i3 == 3) {
                b(i2);
            } else if (i3 == 4) {
                if (i2 != i) {
                    throw new ProtocolException("Unexpected end group");
                }
                return;
            } else {
                if (i3 != 5) {
                    throw new ProtocolException("Unexpected field encoding: " + i3);
                }
                this.e = 5;
                e();
            }
        }
        throw new EOFException();
    }

    public final long a() {
        if (this.e == 2) {
            long j = this.c - this.b;
            this.f1779a.d(j);
            this.e = 6;
            this.b = this.c;
            this.c = this.g;
            this.g = -1L;
            return j;
        }
        StringBuilder sbA = w1.a("Expected LENGTH_DELIMITED but was ");
        sbA.append(this.e);
        throw new ProtocolException(sbA.toString());
    }
}
