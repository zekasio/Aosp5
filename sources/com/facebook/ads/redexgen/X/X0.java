package com.facebook.ads.redexgen.X;

import com.facebook.ads.redexgen.X.X1;
import com.facebook.ads.redexgen.X.X2;
import java.lang.Exception;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class X0<I extends X2, O extends X1, E extends Exception> implements InterfaceC0401Bv<I, O, E> {
    public int A00;
    public int A01;
    public int A02;
    public I A03;
    public E A04;
    public boolean A05;
    public boolean A06;
    public final Thread A08;
    public final I[] A0B;
    public final O[] A0C;
    public final Object A07 = new Object();
    public final ArrayDeque<I> A09 = new ArrayDeque<>();
    public final ArrayDeque<O> A0A = new ArrayDeque<>();

    public abstract I A0T();

    public abstract O A0V();

    public abstract E A0W(I i, O o, boolean z);

    public abstract E A0X(Throwable th);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    public X0(I[] iArr, O[] oArr) {
        this.A0B = iArr;
        this.A00 = iArr.length;
        for (int i = 0; i < this.A00; i++) {
            ((I[]) this.A0B)[i] = A0T();
        }
        this.A0C = oArr;
        this.A01 = oArr.length;
        for (int i2 = 0; i2 < this.A01; i2++) {
            ((O[]) this.A0C)[i2] = A0V();
        }
        this.A08 = new C0404By(this);
        this.A08.start();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    private void A0K() {
        if (A0Q()) {
            this.A07.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Exception */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    private void A0L() throws Exception {
        E e = this.A04;
        if (e == null) {
        } else {
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    public void A0M() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (A0R());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    private void A0N(I i) {
        i.A07();
        I[] iArr = this.A0B;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        iArr[i2] = i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    private void A0O(O o) {
        o.A07();
        O[] oArr = this.A0C;
        int i = this.A01;
        this.A01 = i + 1;
        oArr[i] = o;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    private boolean A0Q() {
        return !this.A09.isEmpty() && this.A01 > 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    private boolean A0R() throws InterruptedException {
        synchronized (this.A07) {
            while (!this.A06 && !A0Q()) {
                this.A07.wait();
            }
            if (this.A06) {
                return false;
            }
            I iRemoveFirst = this.A09.removeFirst();
            O[] oArr = this.A0C;
            int i = this.A01 - 1;
            this.A01 = i;
            O o = oArr[i];
            boolean z = this.A05;
            this.A05 = false;
            if (iRemoveFirst.A04()) {
                o.A00(4);
            } else {
                if (iRemoveFirst.A03()) {
                    o.A00(Integer.MIN_VALUE);
                }
                try {
                    this.A04 = (E) A0W(iRemoveFirst, o, z);
                } catch (OutOfMemoryError e) {
                    this.A04 = (E) A0X(e);
                } catch (RuntimeException e2) {
                    this.A04 = (E) A0X(e2);
                }
                if (this.A04 != null) {
                    synchronized (this.A07) {
                    }
                    return false;
                }
            }
            synchronized (this.A07) {
                if (this.A05) {
                    A0O(o);
                } else if (o.A03()) {
                    this.A02++;
                    A0O(o);
                } else {
                    o.A00 = this.A02;
                    this.A02 = 0;
                    this.A0A.addLast(o);
                }
                A0N(iRemoveFirst);
            }
            return true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0401Bv
    /* JADX INFO: renamed from: A0S, reason: merged with bridge method [inline-methods] */
    public final I A4k() throws Exception {
        I i;
        I i2;
        synchronized (this.A07) {
            A0L();
            IK.A04(this.A03 == null);
            if (this.A00 == 0) {
                i = null;
            } else {
                I[] iArr = this.A0B;
                int i3 = this.A00 - 1;
                this.A00 = i3;
                i = iArr[i3];
            }
            this.A03 = i;
            i2 = this.A03;
        }
        return i2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0401Bv
    /* JADX INFO: renamed from: A0U, reason: merged with bridge method [inline-methods] */
    public final O A4l() throws Exception {
        synchronized (this.A07) {
            A0L();
            if (this.A0A.isEmpty()) {
                return null;
            }
            return this.A0A.removeFirst();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    public final void A0Y(int i) {
        IK.A04(this.A00 == this.A0B.length);
        for (I inputBuffer : this.A0B) {
            inputBuffer.A09(i);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0401Bv
    /* JADX INFO: renamed from: A0Z, reason: merged with bridge method [inline-methods] */
    public final void ADW(I i) throws Exception {
        synchronized (this.A07) {
            A0L();
            I inputBuffer = this.A03;
            IK.A03(i == inputBuffer);
            this.A09.addLast(i);
            A0K();
            this.A03 = null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    public void A0a(O o) {
        synchronized (this.A07) {
            A0O(o);
            A0K();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0401Bv
    public final void ADm() {
        synchronized (this.A07) {
            this.A06 = true;
            this.A07.notify();
        }
        try {
            this.A08.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.X0 != com.facebook.ads.internal.exoplayer2.decoder.SimpleDecoder<I extends com.facebook.ads.redexgen.X.X2, O extends com.facebook.ads.redexgen.X.X1, E extends java.lang.Exception> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0401Bv
    public final void flush() {
        synchronized (this.A07) {
            this.A05 = true;
            this.A02 = 0;
            if (this.A03 != null) {
                A0N(this.A03);
                this.A03 = null;
            }
            while (!this.A09.isEmpty()) {
                A0N(this.A09.removeFirst());
            }
            while (!this.A0A.isEmpty()) {
                A0O(this.A0A.removeFirst());
            }
        }
    }
}
