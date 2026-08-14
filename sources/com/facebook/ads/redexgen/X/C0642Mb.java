package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0642Mb {
    public static Bitmap A00(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmap.getWidth(), 0.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap A01(EnumC0641Ma enumC0641Ma) {
        byte[] bArrDecode = Base64.decode(enumC0641Ma.A00(Lr.A00), 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static Bitmap A02(EnumC0641Ma enumC0641Ma) {
        byte[] bArrDecode = Base64.decode(enumC0641Ma.A00(Lr.A00), 0);
        return A00(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
    }

    public static Drawable A03(C0947Xy c0947Xy, EnumC0641Ma enumC0641Ma) {
        return new BitmapDrawable(c0947Xy.getResources(), A01(enumC0641Ma));
    }
}
