package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class T1 extends OQ implements View.OnClickListener {
    public static byte[] A0B;
    public static String[] A0C = {"idQnrwKrPQs0c3zYYHT6WTvW1aXoRMqQ", "Gekt1WHQiHnIJqxdwB9j8FzDtIJy1cfJ", "sF2V", "CdtBVDHmuEaNC9R8", "jtmNaJ8NDkAfiILRFeCM3WK", "aXO2Ks7stxeTyHMnCxwSATKtkmhK3bmt", "xmLEl9t0StR", ""};
    public static final int A0D;
    public int A00;
    public int A01;

    @Nullable
    public Bitmap A02;

    @Nullable
    public Paint A03;

    @Nullable
    public Rect A04;
    public C0947Xy A05;

    @Nullable
    public String A06;

    @Nullable
    public String A07;
    public boolean A08;
    public final ON A09;
    public final Map<String, String> A0A;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] ^ i3;
            if (A0C[2].length() != 4) {
                throw new RuntimeException();
            }
            A0C[3] = "DG";
            bArrCopyOfRange[i4] = (byte) (i5 ^ 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0B = new byte[]{6, 2, 77, Ascii.CR, 5, 19, 19, 5, Ascii.SO, 7, 5, Ascii.DC2};
    }

    static {
        A06();
        A0D = (int) (Lr.A00 * 24.0f);
    }

    public T1(C0947Xy c0947Xy, String str, C1K c1k, InterfaceC0575Jh interfaceC0575Jh, InterfaceC0657Mq interfaceC0657Mq, C0767Qw c0767Qw, MK mk) {
        this(c0947Xy, str, c1k, false, interfaceC0575Jh, interfaceC0657Mq, c0767Qw, mk);
    }

    public T1(C0947Xy c0947Xy, String str, C1K c1k, boolean z, InterfaceC0575Jh interfaceC0575Jh, InterfaceC0657Mq interfaceC0657Mq, C0767Qw c0767Qw, MK mk) {
        super(c0947Xy, c1k);
        this.A0A = new HashMap();
        this.A05 = c0947Xy;
        this.A08 = z;
        this.A09 = new ON(c0947Xy, str, c0767Qw, mk, interfaceC0575Jh, interfaceC0657Mq);
        setOnClickListener(this);
        MS.A0G(1001, this);
    }

    @Nullable
    public static Bitmap A03(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private void A05() {
        String str;
        if (this.A08 && (str = this.A07) != null) {
            this.A02 = A03(C0642Mb.A03(this.A05, str.contains(A04(0, 12, 51)) ? EnumC0641Ma.MESSENGER : EnumC0641Ma.WHATSAPP));
            this.A03 = new Paint();
            int i = A0D;
            setPadding(i, 0, i, 0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.A06) && !TextUtils.isEmpty(this.A07)) {
                this.A09.A08(this.A06, this.A07, this.A0A);
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.A02;
        if (bitmap != null) {
            this.A04 = new Rect(0, 0, bitmap.getWidth(), this.A02.getHeight());
            this.A01 = this.A02.getWidth();
            this.A00 = 12;
            int i = (this.A01 + this.A00) / 2;
            canvas.save();
            canvas.translate(i, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            int width = (int) ((((getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f)) - this.A01) - this.A00);
            int height = getHeight() / 2;
            int i2 = this.A01;
            int i3 = height - (i2 / 2);
            int top = width + i2;
            Rect destRect = new Rect(width, i3, top, i2 + i3);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    public void setCta(C1L c1l, String str, Map<String, String> map) {
        setCta(c1l, str, map, null);
    }

    public void setCta(C1L c1l, String str, Map<String, String> map, @Nullable OM om) {
        this.A06 = str;
        this.A07 = c1l.A05();
        Map<String, String> extraData = this.A0A;
        extraData.putAll(map);
        this.A09.A07(om);
        String strA04 = c1l.A04();
        if (TextUtils.isEmpty(strA04) || TextUtils.isEmpty(this.A07)) {
            setVisibility(8);
        } else {
            setText(strA04);
            A05();
        }
    }

    public void setIsInAppBrowser(boolean z) {
        this.A09.A09(z);
    }
}
