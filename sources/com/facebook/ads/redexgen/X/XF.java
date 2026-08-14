package com.facebook.ads.redexgen.X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XF implements JN, BT, InterfaceC0493Gb, EJ, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static String[] A01 = {"tENgV7sVRmCggStQb7ahqyncu3McMlqx", "EBCLDe86SI67l2WgLGk", "Xc2z6PWfFp", "ZjGJvfPpi7mMWyj8ThC73X2hXIQsvVeY", "O", "wm4K2NOZzdg8zteNHm", "uxR1U8t68FFaIgGW", "ZP1sAESULwb937k6ya35I8qp57tsUFN9"};
    public final /* synthetic */ C0436Ds A00;

    public XF(C0436Ds c0436Ds) {
        this.A00 = c0436Ds;
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA4(String str, long j, long j2) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((BT) it.next()).AA4(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA5(C0402Bw c0402Bw) {
        Iterator it = this.A00.A0I.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A01;
            if (strArr[0].charAt(30) == strArr[7].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "r";
            strArr2[1] = "Pw7sEp82k0vieihjeRw";
            if (!zHasNext) {
                C0436Ds c0436Ds = this.A00;
                String[] strArr3 = A01;
                if (strArr3[0].charAt(30) == strArr3[7].charAt(30)) {
                    throw new RuntimeException();
                }
                A01[5] = "AJXnTxM8Cjr";
                c0436Ds.A06 = null;
                this.A00.A09 = null;
                this.A00.A01 = 0;
                return;
            }
            BT bt = (BT) it.next();
            if (A01[3].charAt(20) != '3') {
                throw new RuntimeException();
            }
            A01[5] = "rZ";
            bt.AA5(c0402Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA6(C0402Bw c0402Bw) {
        this.A00.A09 = c0402Bw;
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((BT) it.next()).AA6(c0402Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA7(Format format) {
        this.A00.A06 = format;
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((BT) it.next()).AA7(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA8(int i) {
        this.A00.A01 = i;
        for (BT bt : this.A00.A0I) {
            if (A01[2].length() == 11) {
                throw new RuntimeException();
            }
            A01[2] = "0C";
            bt.AA8(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BT
    public final void AA9(int i, long j, long j2) {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((BT) it.next()).AA9(i, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0493Gb
    public final void AAS(List<GX> list) {
        this.A00.A0C = list;
        Iterator it = this.A00.A0K.iterator();
        while (it.hasNext()) {
            ((InterfaceC0493Gb) it.next()).AAS(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void AAe(int i, long j) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((JN) it.next()).AAe(i, j);
        }
    }

    @Override // com.facebook.ads.redexgen.X.EJ
    public final void ABY(Metadata metadata) {
        Iterator it = this.A00.A0J.iterator();
        while (it.hasNext()) {
            ((EJ) it.next()).ABY(metadata);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void AC7(Surface surface) {
        if (this.A00.A03 == surface) {
            Iterator it = this.A00.A0M.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        Iterator it2 = this.A00.A0L.iterator();
        while (it2.hasNext()) {
            ((JN) it2.next()).AC7(surface);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACg(String str, long j, long j2) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((JN) it.next()).ACg(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACh(C0402Bw c0402Bw) {
        Iterator it = this.A00.A0L.iterator();
        while (it.hasNext()) {
            ((JN) it.next()).ACh(c0402Bw);
        }
        this.A00.A07 = null;
        this.A00.A0A = null;
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACi(C0402Bw c0402Bw) {
        this.A00.A0A = c0402Bw;
        for (JN jn : this.A00.A0L) {
            if (A01[3].charAt(20) != '3') {
                throw new RuntimeException();
            }
            A01[5] = "6iGRC7";
            jn.ACi(c0402Bw);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACl(Format format) {
        this.A00.A07 = format;
        for (JN jn : this.A00.A0L) {
            String[] strArr = A01;
            if (strArr[0].charAt(30) == strArr[7].charAt(30)) {
                throw new RuntimeException();
            }
            A01[5] = "M1lNqMtLlEQhDRLPZV8vitTN6y5pnm";
            jn.ACl(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.JN
    public final void ACq(int i, int i2, int i3, float f) {
        Iterator it = this.A00.A0M.iterator();
        while (it.hasNext()) {
            ((JE) it.next()).ACq(i, i2, i3, f);
        }
        Iterator it2 = this.A00.A0L.iterator();
        while (it2.hasNext()) {
            ((JN) it2.next()).ACq(i, i2, i3, f);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00.A0G(new Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.A00.A0G(null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00.A0G(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.A00.A0G(null, false);
    }
}
