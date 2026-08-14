package com.facebook.ads.redexgen.X;

import com.facebook.ads.MediaViewListener;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1103be implements InterfaceC0665My {
    public final /* synthetic */ MediaViewListener A00;
    public final /* synthetic */ C1102bd A01;

    public C1103be(C1102bd c1102bd, MediaViewListener mediaViewListener) {
        this.A01 = c1102bd;
        this.A00 = mediaViewListener;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0665My
    public final void AAL() {
        this.A00.onComplete(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0665My
    public final void AAg() {
        this.A00.onEnterFullscreen(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0665My
    public final void AAm() {
        this.A00.onExitFullscreen(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0665My
    public final void AAs() {
        this.A00.onFullscreenBackground(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0665My
    public final void AAu() {
        this.A00.onFullscreenForeground(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0665My
    public final void ABl() {
        this.A00.onPlay(this.A01.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0665My
    public final void ACt() {
        this.A00.onVolumeChange(this.A01.A03, this.A01.A05.getVolume());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0665My
    public final void onPause() {
        this.A00.onPause(this.A01.A03);
    }
}
