package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(14)
public final class I5 extends TextureView implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener, InterfaceC0762Qr {
    public static byte[] A0N;
    public static String[] A0O = {"w6W1Pn4pGSy1veXw7fNic4Q20vJelJ2", "acNB2lhq8cVPZLtYghlcj8euurSBcqdx", "I2BPPFoGG3lXsTKKPy2FKKasdsM", "uMMu8699SI696vicAGdUyhB1Kjcnsg5D", "S7aPtd9QGtmzyQ9VrNW20IwmaDF5p1Ml", "zS648UlhjTBJXulz7NmFsyAIwaw2iCpI", "ZyXsHo9oibpczWLkt42IpHWLTZevRgPI", "euMEykkwaXnS"};
    public static final String A0P;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;

    @Nullable
    public MediaPlayer A06;
    public Uri A07;
    public Surface A08;
    public View A09;

    @Nullable
    public MediaController A0A;
    public Q6 A0B;
    public EnumC0764Qt A0C;
    public EnumC0764Qt A0D;

    @Nullable
    public InterfaceC0765Qu A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final long A0K;
    public final MediaController.MediaPlayerControl A0L;
    public final C0947Xy A0M;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0N, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0N = new byte[]{89, 87, 91, 89, Ascii.RS, 3, Ascii.SI, 9, Ascii.SUB, 89, 91, 65, 91, 89, 57, 102, 105, 75, 68, 68, 69, 94, 10, 90, 88, 79, 90, 75, 88, 79, 10, 71, 79, 78, 67, 75, 10, 90, 70, 75, 83, 79, 88, 10, 93, 67, 94, 66, 10, 121, 95, 88, 76, 75, 73, 79, 126, 79, 82, 94, 95, 88, 79, Ascii.DLE, 10, 45, 1, Ascii.ESC, 2, 10, 0, 73, Ascii.SUB, 78, Ascii.FS, Ascii.VT, Ascii.SUB, Ascii.FS, 7, Ascii.VT, Ascii.CAN, Ascii.VT, 78, Ascii.CAN, 7, 10, Ascii.VT, 1, 78, 7, 0, 8, 1, Ascii.FS, 3, Ascii.SI, Ascii.SUB, 7, 1, 0, 93, 122, 114, 119, 126, 127, 59, 111, 116, 59, 116, 107, 126, 117, 59, 122, 104, 104, 126, 111, 104, 59, Ascii.SI, 39, 39, 47, 36, 45, 104, 41, 36, 63, 41, 49, 59, 104, 60, 32, 58, 39, 63, 104, 41, 38, 104, 45, 48, 43, 45, 56, 60, 33, 39, 38, 104, 63, 33, 60, 32, 104, 59, 45, 60, 10, 41, 43, 35, 47, 58, 39, 61, 38, 44, Ascii.FF, 58, 41, 63, 41, 42, 36, 45, 104, 39, 38, 104, 6, 39, 61, 47, 41, 60, 104, 41, 42, 39, 62, 45, 102, 104, 59, 39, 104, 63, 45, 104, 59, 33, 36, 45, 38, 60, 36, 49, 104, 33, 47, 38, 39, 58, 45, 104, 33, 60, 102, 50, Ascii.SUB, Ascii.SUB, Ascii.DC2, Ascii.EM, Ascii.DLE, 85, Ascii.DC4, Ascii.EM, 2, Ascii.DC4, Ascii.FF, 6, 85, 1, Ascii.GS, 7, Ascii.SUB, 2, 85, Ascii.DC4, Ascii.ESC, 85, Ascii.DLE, Ascii.CR, Ascii.SYN, Ascii.DLE, 5, 1, Ascii.FS, Ascii.SUB, Ascii.ESC, 85, 2, Ascii.FS, 1, Ascii.GS, 85, 6, Ascii.DLE, 1, 51, Ascii.SUB, 7, Ascii.DLE, Ascii.DC2, 7, Ascii.SUB, 0, Ascii.ESC, 17, 85, Ascii.SUB, Ascii.ESC, 85, 59, Ascii.SUB, 0, Ascii.DC2, Ascii.DC4, 1, 85, Ascii.DC4, Ascii.ETB, Ascii.SUB, 3, Ascii.DLE, 91, 85, 6, Ascii.SUB, 85, 2, Ascii.DLE, 85, 6, Ascii.FS, Ascii.EM, Ascii.DLE, Ascii.ESC, 1, Ascii.EM, Ascii.FF, 85, Ascii.FS, Ascii.DC2, Ascii.ESC, Ascii.SUB, 7, Ascii.DLE, 85, Ascii.FS, 1, 91, 2, 57, 54, 53, 59, 50, 119, 35, 56, 119, 52, 59, 56, 36, 50, Ascii.NAK, 42, 39, 38, 44, 99, 48, 55, 34, 55, 38, 99, 32, 43, 34, 45, 36, 38, 39, 99, 55, 44, 99, 2, Ascii.DLE, Ascii.DLE, 6, Ascii.ETB, 112, 108, 97, 121, 101, 114, 88, 1, 84, 75, 66, 87, 1, 3, Ascii.EM, 3, 1};
    }

    static {
        A04();
        A0P = I5.class.getSimpleName();
    }

    public I5(C0947Xy c0947Xy) {
        super(c0947Xy);
        this.A0C = EnumC0764Qt.A04;
        this.A0D = EnumC0764Qt.A04;
        this.A0I = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0J = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = Q6.A03;
        this.A0L = new C0759Qo(this);
        this.A0M = c0947Xy;
    }

    public I5(C0947Xy c0947Xy, AttributeSet attributeSet) {
        super(c0947Xy, attributeSet);
        this.A0C = EnumC0764Qt.A04;
        this.A0D = EnumC0764Qt.A04;
        this.A0I = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0J = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = Q6.A03;
        this.A0L = new C0759Qo(this);
        this.A0M = c0947Xy;
    }

    public I5(C0947Xy c0947Xy, AttributeSet attributeSet, int i) {
        super(c0947Xy, attributeSet, i);
        this.A0C = EnumC0764Qt.A04;
        this.A0D = EnumC0764Qt.A04;
        this.A0I = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0J = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = Q6.A03;
        this.A0L = new C0759Qo(this);
        this.A0M = c0947Xy;
    }

    private boolean A05() {
        return (this.A0C == EnumC0764Qt.A08 || this.A0C == EnumC0764Qt.A07) ? false : true;
    }

    private boolean A06() {
        return this.A0C == EnumC0764Qt.A07 || this.A0C == EnumC0764Qt.A0A || this.A0C == EnumC0764Qt.A05 || this.A0C == EnumC0764Qt.A06;
    }

    private boolean A07() {
        return (this.A0C == EnumC0764Qt.A08 || this.A0C == EnumC0764Qt.A07) ? false : true;
    }

    private boolean A08() {
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer == null) {
            return false;
        }
        try {
            mediaPlayer.reset();
            return true;
        } catch (IllegalStateException e) {
            this.A0M.A06().A8y(A03(361, 6, 114), C03298z.A2G, new AnonymousClass90(e));
            return false;
        }
    }

    private boolean A09(@Nullable Surface surface) {
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer == null) {
            return false;
        }
        try {
            mediaPlayer.setSurface(surface);
            if (A0O[1].charAt(7) != 'q') {
                throw new RuntimeException();
            }
            A0O[5] = "NiAMWdvt78S0m1zvL3gvle9zEu4JiNqO";
            return true;
        } catch (IllegalStateException e) {
            this.A0M.A06().A8y(A03(361, 6, 114), C03298z.A2H, new AnonymousClass90(e));
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public final void A7u() {
        if (!this.A0F) {
            AD5(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    @SuppressLint({"NewApi"})
    public final boolean A85() {
        if (this.A06 == null || Build.VERSION.SDK_INT < 16) {
            return false;
        }
        try {
            for (MediaPlayer.TrackInfo trackInfo : this.A06.getTrackInfo()) {
                int trackType = trackInfo.getTrackType();
                String[] strArr = A0O;
                if (strArr[3].charAt(29) != strArr[6].charAt(29)) {
                    throw new RuntimeException();
                }
                A0O[5] = "iSqF26gJBktCMb0RObgKl91oEThpz7Z0";
                if (trackType == 2) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            Log.e(A0P, A03(65, 35, 28), e);
            return true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public final boolean A86() {
        return this.A0J;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public final boolean A8b() {
        return this.A0I;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public final void AD5(boolean z, int i) {
        this.A0M.A0D().A2r(i);
        this.A0D = EnumC0764Qt.A05;
        if (this.A06 != null) {
            if (!A05()) {
                return;
            }
            this.A0I = z;
            this.A06.pause();
            if (this.A0C != EnumC0764Qt.A06) {
                setVideoState(EnumC0764Qt.A05);
                return;
            }
            return;
        }
        setVideoState(EnumC0764Qt.A04);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public final void AEr(int i) {
        this.A0M.A0D().A9d(i);
        setVideoState(EnumC0764Qt.A09);
        AF3(5);
        this.A03 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AEw(com.facebook.ads.redexgen.X.Q6 r6, int r7) throws java.lang.Throwable {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.Xy r0 = r5.A0M
            com.facebook.ads.redexgen.X.0R r0 = r0.A0D()
            r0.A32(r7)
            r3 = 0
            r5.A0I = r3
            com.facebook.ads.redexgen.X.Qt r0 = com.facebook.ads.redexgen.X.EnumC0764Qt.A0A
            r5.A0D = r0
            r5.A0B = r6
            com.facebook.ads.redexgen.X.Qt r1 = r5.A0C
            com.facebook.ads.redexgen.X.Qt r0 = com.facebook.ads.redexgen.X.EnumC0764Qt.A0A
            if (r1 == r0) goto L43
            com.facebook.ads.redexgen.X.Qt r1 = r5.A0C
            com.facebook.ads.redexgen.X.Qt r0 = com.facebook.ads.redexgen.X.EnumC0764Qt.A07
            if (r1 == r0) goto L43
            com.facebook.ads.redexgen.X.Qt r4 = r5.A0C
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.I5.A0O
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 4
            if (r1 == r0) goto L96
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.I5.A0O
            java.lang.String r1 = "NTKGPTGyq7PSuZ6pDxSrkOD3BAS3oRMw"
            r0 = 4
            r2[r0] = r1
            com.facebook.ads.redexgen.X.Qt r0 = com.facebook.ads.redexgen.X.EnumC0764Qt.A04
            if (r4 == r0) goto L43
            com.facebook.ads.redexgen.X.Qt r1 = r5.A0C
            com.facebook.ads.redexgen.X.Qt r0 = com.facebook.ads.redexgen.X.EnumC0764Qt.A05
            if (r1 == r0) goto L43
            com.facebook.ads.redexgen.X.Qt r1 = r5.A0C
            com.facebook.ads.redexgen.X.Qt r0 = com.facebook.ads.redexgen.X.EnumC0764Qt.A06
            if (r1 != r0) goto L4c
        L43:
            android.media.MediaPlayer r1 = r5.A06
            if (r1 != 0) goto L7a
            android.net.Uri r0 = r5.A07
            r5.setup(r0)
        L4c:
            boolean r0 = r5.isAvailable()
            if (r0 == 0) goto L6e
            android.graphics.SurfaceTexture r4 = r5.getSurfaceTexture()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.I5.A0O
            r0 = 1
            r1 = r1[r0]
            r0 = 7
            char r1 = r1.charAt(r0)
            r0 = 113(0x71, float:1.58E-43)
            if (r1 == r0) goto L6f
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.I5.A0O
            java.lang.String r1 = "Wn6W9Nu3dNfA4pP49CdphRQGwehyl3Rd"
            r0 = 4
            r2[r0] = r1
            r5.onSurfaceTextureAvailable(r4, r3, r3)
        L6e:
            return
        L6f:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.I5.A0O
            java.lang.String r1 = "pXleF17jKjib"
            r0 = 7
            r2[r0] = r1
            r5.onSurfaceTextureAvailable(r4, r3, r3)
            goto L6e
        L7a:
            int r0 = r5.A03
            if (r0 <= 0) goto L81
            r1.seekTo(r0)
        L81:
            android.media.MediaPlayer r0 = r5.A06
            r0.start()
            com.facebook.ads.redexgen.X.Qt r1 = r5.A0C
            com.facebook.ads.redexgen.X.Qt r0 = com.facebook.ads.redexgen.X.EnumC0764Qt.A07
            if (r1 != r0) goto L90
            boolean r0 = r5.A0J
            if (r0 == 0) goto L4c
        L90:
            com.facebook.ads.redexgen.X.Qt r0 = com.facebook.ads.redexgen.X.EnumC0764Qt.A0A
            r5.setVideoState(r0)
            goto L4c
        L96:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.I5.AEw(com.facebook.ads.redexgen.X.Q6, int):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public final void AF3(int i) {
        this.A0M.A0D().A34(i);
        this.A0D = EnumC0764Qt.A04;
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer != null) {
            int currentPosition = mediaPlayer.getCurrentPosition();
            if (currentPosition > 0) {
                this.A03 = currentPosition;
            }
            this.A06.stop();
            if (A0O[4].charAt(14) == '3') {
                throw new RuntimeException();
            }
            A0O[5] = "KulxFUFqA4xnUTvaQLfyg7cstmOjzycv";
            A08();
            this.A06.release();
            this.A06 = null;
            MediaController mediaController = this.A0A;
            if (mediaController != null) {
                mediaController.hide();
                this.A0A.setEnabled(false);
            }
        }
        setVideoState(EnumC0764Qt.A04);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public final void destroy() {
        if (this.A06 != null) {
            A09(null);
            this.A06.setOnBufferingUpdateListener(null);
            this.A06.setOnCompletionListener(null);
            this.A06.setOnErrorListener(null);
            this.A06.setOnInfoListener(null);
            this.A06.setOnPreparedListener(null);
            this.A06.setOnVideoSizeChangedListener(null);
            this.A06.setOnSeekCompleteListener(null);
            A08();
            this.A06 = null;
            setVideoState(EnumC0764Qt.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public int getCurrentPosition() {
        if (this.A06 == null || !A06()) {
            return 0;
        }
        return this.A06.getCurrentPosition();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public int getDuration() {
        if (this.A06 == null) {
            return 0;
        }
        boolean zA06 = A06();
        String[] strArr = A0O;
        if (strArr[3].charAt(29) != strArr[6].charAt(29)) {
            throw new RuntimeException();
        }
        A0O[1] = "tqb6wmVqQGZxPylUtz2fkCIx7Bf2WilJ";
        if (!zA06) {
            return 0;
        }
        return this.A06.getDuration();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public long getInitialBufferTime() {
        return this.A0K;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public Q6 getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public EnumC0764Qt getState() {
        return this.A0C;
    }

    public EnumC0764Qt getTargetState() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public int getVideoHeight() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public int getVideoWidth() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            setVideoState(EnumC0764Qt.A03);
            this.A0M.A0D().A2v(5);
            AF3(8);
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2 = this.A06;
        if (mediaPlayer2 != null) {
            mediaPlayer2.pause();
        }
        setVideoState(EnumC0764Qt.A06);
        seekTo(0);
        this.A03 = 0;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) throws Throwable {
        this.A0M.A0D().A9c(A03(367, 11, 81) + i + A03(0, 14, 9) + i2 + A03(14, 2, 105));
        if (this.A01 > 0 && getState() == EnumC0764Qt.A0A) {
            this.A01--;
            AF3(6);
            AEw(this.A0B, 10);
        } else {
            setVideoState(EnumC0764Qt.A03);
            this.A0M.A0D().A2v(1);
            AF3(7);
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 3) {
            this.A0J = true;
            if (this.A0D == EnumC0764Qt.A0A) {
                setVideoState(EnumC0764Qt.A0A);
            }
            return true;
        }
        if (i != 701) {
            if (i == 702 && A07()) {
                setVideoState(EnumC0764Qt.A0A);
            }
        } else {
            EnumC0764Qt enumC0764Qt = EnumC0764Qt.A02;
            if (A0O[4].charAt(14) != '3') {
                String[] strArr = A0O;
                strArr[3] = "iL0L5EQxu2M5tvy2sZDjl5tOkB9wsg4Q";
                strArr[6] = "qEr4cYtmjtQdjlZthk5xBRgssZbq5gW6";
                setVideoState(enumC0764Qt);
            } else {
                setVideoState(enumC0764Qt);
            }
        }
        String[] strArr2 = A0O;
        if (strArr2[3].charAt(29) != strArr2[6].charAt(29)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A0O;
        strArr3[3] = "BctcOQJYgBcKf8RdBMRoW9O8jkER1gO3";
        strArr3[6] = "NFF5b4NOHp1wMQpQtAU8ibXMpYWuxgZg";
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws Throwable {
        setVideoState(EnumC0764Qt.A07);
        if (this.A0H && !this.A0G) {
            Activity activityA0C = this.A0M.A0C();
            if (activityA0C != null) {
                this.A0A = new MediaController(activityA0C);
                MediaController mediaController = this.A0A;
                View view = this.A09;
                if (view == null) {
                    view = this;
                }
                mediaController.setAnchorView(view);
                MediaController mediaController2 = this.A0A;
                MediaController.MediaPlayerControl mediaPlayerControl = this.A0L;
                if (A0O[1].charAt(7) != 'q') {
                    throw new RuntimeException();
                }
                String[] strArr = A0O;
                strArr[3] = "fPjFRSSzuUrY85KdwEQXHAUI7gq3zgJX";
                strArr[6] = "QlnNj2Zi0n3XZkktRetea07zoE6PUgNL";
                mediaController2.setMediaPlayer(mediaPlayerControl);
                this.A0A.setEnabled(true);
            } else {
                this.A0A = null;
            }
        }
        setRequestedVolume(this.A00);
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        int i = this.A03;
        if (i > 0) {
            if (i >= this.A06.getDuration()) {
                this.A03 = 0;
            }
            this.A06.seekTo(this.A03);
            this.A03 = 0;
        }
        EnumC0764Qt enumC0764Qt = this.A0D;
        EnumC0764Qt enumC0764Qt2 = EnumC0764Qt.A0A;
        String[] strArr2 = A0O;
        if (strArr2[2].length() == strArr2[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A0O;
        strArr3[3] = "i4HMjCzdRtS7Zf5jyUfqsJgJBFC3Hgk3";
        strArr3[6] = "nPyigXhxANl12gOwrMulZJ84NGYQcgH1";
        if (enumC0764Qt == enumC0764Qt2) {
            AEw(this.A0B, 8);
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        InterfaceC0765Qu interfaceC0765Qu = this.A0E;
        if (interfaceC0765Qu == null) {
            return;
        }
        interfaceC0765Qu.ACG(this.A02, this.A03);
        this.A03 = 0;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.A08 == null) {
            this.A08 = new Surface(surfaceTexture);
        }
        if (!A09(this.A08)) {
            setVideoState(EnumC0764Qt.A03);
            this.A0M.A0D().A2v(4);
            destroy();
        } else if (this.A0C == EnumC0764Qt.A05 && !this.A0I) {
            AEw(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        A09(null);
        Surface surface = this.A08;
        if (surface != null) {
            surface.release();
            this.A08 = null;
        }
        if (this.A0C != EnumC0764Qt.A05) {
            AD5(false, 5);
        }
        if (A0O[1].charAt(7) != 'q') {
            throw new RuntimeException();
        }
        A0O[5] = "wJEag4Up5dB02EoPbWjrYUJlPYnnpJPt";
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (JR.A1J(this.A0M) && this.A06 != null) {
            boolean zA06 = A06();
            if (A0O[1].charAt(7) != 'q') {
                throw new RuntimeException();
            }
            A0O[5] = "zsAx7U2aKSd2GPuux6v5Um4uWviEPJCj";
            if (!zA06) {
                return;
            }
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long jCurrentTimeMillis = System.currentTimeMillis();
            float volume = getVolume();
            InterfaceC0765Qu interfaceC0765Qu = this.A0E;
            if (interfaceC0765Qu != null) {
                interfaceC0765Qu.AAq(currentPosition, currentPosition2, jCurrentTimeMillis, volume);
            }
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        if (this.A05 != 0 && this.A04 != 0) {
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) throws Throwable {
        super.onWindowFocusChanged(z);
        if (this.A06 == null) {
            return;
        }
        MediaController mediaController = this.A0A;
        if (mediaController != null && mediaController.isShowing()) {
            return;
        }
        if (!z) {
            if (this.A0C != EnumC0764Qt.A05) {
                A7u();
            }
        } else {
            if (this.A0C != EnumC0764Qt.A05 || this.A0I) {
                return;
            }
            AEw(this.A0B, 9);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public final void seekTo(int i) {
        if (this.A06 != null && A06()) {
            if (i < getDuration() && i > 0) {
                this.A02 = getCurrentPosition();
                this.A03 = i;
                this.A06.seekTo(i);
                return;
            }
            return;
        }
        this.A03 = i;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0P, A03(122, 102, 58));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0F = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public void setControlsAnchorView(View view) {
        this.A09 = view;
        view.setOnTouchListener(new ViewOnTouchListenerC0761Qq(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0P, A03(224, 94, 7));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public void setFullScreen(boolean z) {
        this.A0H = z;
        if (this.A0H && !this.A0G) {
            setOnTouchListener(new ViewOnTouchListenerC0760Qp(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public void setRequestedVolume(float f) {
        this.A00 = f;
        if (this.A06 != null && this.A0C != EnumC0764Qt.A08 && this.A0C != EnumC0764Qt.A04) {
            this.A06.setVolume(f, f);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public void setVideoMPD(@Nullable String str) {
    }

    private void setVideoState(EnumC0764Qt enumC0764Qt) {
        if (enumC0764Qt != this.A0C) {
            if (this.A0M.A03().A8P()) {
                String str = A03(333, 23, 49) + enumC0764Qt;
            }
            this.A0C = enumC0764Qt;
            InterfaceC0765Qu interfaceC0765Qu = this.A0E;
            if (interfaceC0765Qu != null) {
                interfaceC0765Qu.ACs(enumC0764Qt);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    public void setVideoStateChangeListener(@Nullable InterfaceC0765Qu interfaceC0765Qu) {
        this.A0E = interfaceC0765Qu;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Qr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setup(android.net.Uri r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.I5.setup(android.net.Uri):void");
    }
}
