package com.facebook.ads.redexgen.X;

import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XD implements InterfaceC0365Ak, EJ, BT, JN, InterfaceC0480Fo, HY, CA {
    public static String[] A05 = {"oWxliEG", "84CCzfJSWHAMzlT", "dVPYU5AFfnLld9", "202VfNqPV04zLFr42xUQnFXcv", "6C2OHs0d6U2aNpx0mThNdUqCMJf7H", "j36hHuSQknS9Y2BeP2DWP06EygcBzL55", "WN9koNHhTr4SbLKtJDKTY2JTPC", "f2Eog"};
    public InterfaceC0370Ap A00;
    public final IN A03;
    public final CopyOnWriteArraySet<B6> A04 = new CopyOnWriteArraySet<>();
    public final B3 A02 = new B3();
    public final B0 A01 = new B0();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.X.HY
    public final void AAB(int i, long j, long j2) {
        A01();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public XD(@Nullable InterfaceC0370Ap interfaceC0370Ap, IN in) {
        this.A00 = interfaceC0370Ap;
        this.A03 = (IN) IK.A01(in);
    }

    private B5 A00() {
        return A05(this.A02.A03());
    }

    private B5 A01() {
        return A05(this.A02.A04());
    }

    private B5 A02() {
        return A05(this.A02.A05());
    }

    private B5 A03() {
        return A05(this.A02.A06());
    }

    private final B5 A04(int i, @Nullable FY fy) {
        long jA00;
        IK.A01(this.A00);
        long jA58 = this.A03.A58();
        B1 timeline = this.A00.A6H();
        if (i == this.A00.A6I()) {
            if (fy != null && fy.A01()) {
                if (this.A00.A6C() == fy.A00 && this.A00.A6D() == fy.A01) {
                    jA00 = this.A00.A6F();
                } else {
                    jA00 = 0;
                }
            } else {
                jA00 = this.A00.A6A();
            }
        } else if (i >= timeline.A01() || (fy != null && fy.A01())) {
            jA00 = 0;
        } else {
            jA00 = timeline.A0B(i, this.A01).A00();
        }
        return new B5(jA58, timeline, i, fy, jA00, this.A00.A6F(), this.A00.A5s() - this.A00.A6A());
    }

    private B5 A05(@Nullable B4 b4) {
        if (b4 == null) {
            int iA6I = ((InterfaceC0370Ap) IK.A01(this.A00)).A6I();
            return A04(iA6I, this.A02.A07(iA6I));
        }
        return A04(b4.A00, b4.A01);
    }

    public final void A06() {
        if (!this.A02.A0F()) {
            B5 b5A02 = A02();
            this.A02.A09();
            for (B6 b6 : this.A04) {
                String[] strArr = A05;
                if (strArr[1].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[1] = "PBkwxeOlbvYzAOz";
                strArr2[4] = "zMCnce58Qhbdr93RoMzV7EOLVlkYq";
                b6.onSeekStarted(b5A02);
            }
        }
    }

    public final void A07() {
        Iterator it = new ArrayList(this.A02.A05).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A05[0] = "gG2PlvUwOW39eC8R";
            if (zHasNext) {
                B4 b4 = (B4) it.next();
                ABV(b4.A00, b4.A01);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA4(String str, long j, long j2) {
        B5 eventTime = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(eventTime, 1, str, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA5(C0402Bw c0402Bw) {
        B5 b5A00 = A00();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(b5A00, 1, c0402Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA6(C0402Bw c0402Bw) {
        B5 b5A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(b5A02, 1, c0402Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA7(Format format) {
        B5 b5A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(b5A03, 1, format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA8(int i) {
        B5 b5A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onAudioSessionId(b5A03, i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA9(int i, long j, long j2) {
        B5 b5A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A05[2].length() == 13) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[1] = "uqo4gq1KBxiMktN";
            strArr[4] = "Ndm2ibG2UK8Su1apjnSt0jhcojAUZ";
            if (zHasNext) {
                it.next().onAudioUnderrun(b5A03, i, j, j2);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Fo
    public final void AAZ(int i, @Nullable FY fy, C0479Fn c0479Fn) {
        B5 b5A04 = A04(i, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDownstreamFormatChanged(b5A04, c0479Fn);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CA
    public final void AAa() {
        B5 b5A03 = A03();
        for (B6 listener : this.A04) {
            listener.onDrmKeysLoaded(b5A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CA
    public final void AAb() {
        B5 b5A03 = A03();
        for (B6 listener : this.A04) {
            listener.onDrmKeysRemoved(b5A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CA
    public final void AAc() {
        B5 b5A03 = A03();
        for (B6 listener : this.A04) {
            listener.onDrmKeysRestored(b5A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CA
    public final void AAd(Exception exc) {
        B5 b5A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDrmSessionManagerError(b5A03, exc);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void AAe(int i, long j) {
        B5 b5A00 = A00();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDroppedVideoFrames(b5A00, i, j);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Fo
    public final void ABE(int i, @Nullable FY fy, C0478Fm c0478Fm, C0479Fn c0479Fn) {
        A04(i, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Fo
    public final void ABG(int i, @Nullable FY fy, C0478Fm c0478Fm, C0479Fn c0479Fn) {
        A04(i, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Fo
    public final void ABJ(int i, @Nullable FY fy, C0478Fm c0478Fm, C0479Fn c0479Fn, IOException iOException, boolean z) {
        B5 b5A04 = A04(i, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onLoadError(b5A04, c0478Fm, c0479Fn, iOException, z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Fo
    public final void ABL(int i, @Nullable FY fy, C0478Fm c0478Fm, C0479Fn c0479Fn) {
        A04(i, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0365Ak
    public final void ABN(boolean z) {
        B5 b5A02 = A02();
        for (B6 b6 : this.A04) {
            if (A05[2].length() == 13) {
                throw new RuntimeException();
            }
            A05[5] = "61iKEbH7Elk598B8IvoVeyiFcghmzjBq";
            b6.onLoadingChanged(b5A02, z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Fo
    public final void ABU(int i, FY fy) {
        this.A02.A0B(i, fy);
        B5 b5A04 = A04(i, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMediaPeriodCreated(b5A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Fo
    public final void ABV(int i, FY fy) {
        this.A02.A0C(i, fy);
        B5 b5A04 = A04(i, fy);
        Iterator<B6> it = this.A04.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[1] = "xQuAJnMHmsnkUtn";
            strArr2[4] = "I7nuhInD03G6TyFgZN1tEp7XA66Po";
            if (zHasNext) {
                it.next().onMediaPeriodReleased(b5A04);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.EJ
    public final void ABY(Metadata metadata) {
        B5 b5A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onMetadata(b5A02, metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0365Ak
    public final void ABo(C0362Ah c0362Ah) {
        B5 b5A02 = A02();
        for (B6 b6 : this.A04) {
            if (A05[5].charAt(25) != 'g') {
                throw new RuntimeException();
            }
            A05[5] = "6kCd761y4Sm0JC2HIy7vlDu4Zge9adCZ";
            b6.onPlaybackParametersChanged(b5A02, c0362Ah);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0365Ak
    public final void ABq(AM am) {
        B5 b5A02 = A02();
        for (B6 b6 : this.A04) {
            String[] strArr = A05;
            if (strArr[7].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A05[3] = "4uLQlqFUz3TKu9PUP8Ua0";
            b6.onPlayerError(b5A02, am);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0365Ak
    public final void ABs(boolean z, int i) {
        B5 b5A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onPlayerStateChanged(b5A02, z, i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0365Ak
    public final void ABu(int i) {
        this.A02.A0A(i);
        B5 b5A02 = A02();
        for (B6 listener : this.A04) {
            listener.onPositionDiscontinuity(b5A02, i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0480Fo
    public final void AC3(int i, FY fy) {
        this.A02.A0D(i, fy);
        B5 b5A04 = A04(i, fy);
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onReadingStarted(b5A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void AC7(Surface surface) {
        B5 b5A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A05;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            A05[0] = "zEYrHw08cBp169ZitgaAlaUGutwvX";
            if (zHasNext) {
                it.next().onRenderedFirstFrame(b5A03, surface);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0365Ak
    public final void ACH() {
        if (this.A02.A0F()) {
            this.A02.A08();
            B5 b5A02 = A02();
            for (B6 listener : this.A04) {
                listener.onSeekProcessed(b5A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0365Ak
    public final void ACW(B1 b1, @Nullable Object obj, int i) {
        this.A02.A0E(b1);
        B5 b5A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onTimelineChanged(b5A02, i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0365Ak
    public final void ACY(TrackGroupArray trackGroupArray, HR hr) {
        B5 b5A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onTracksChanged(b5A02, trackGroupArray, hr);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACg(String str, long j, long j2) {
        B5 eventTime = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInitialized(eventTime, 2, str, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACh(C0402Bw c0402Bw) {
        B5 b5A00 = A00();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderDisabled(b5A00, 2, c0402Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACi(C0402Bw c0402Bw) {
        B5 b5A02 = A02();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderEnabled(b5A02, 2, c0402Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACl(Format format) {
        B5 b5A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onDecoderInputFormatChanged(b5A03, 2, format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACq(int i, int i2, int i3, float f) {
        B5 b5A03 = A03();
        Iterator<B6> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().onVideoSizeChanged(b5A03, i, i2, i3, f);
        }
    }
}
