package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MZ {
    @TargetApi(18)
    public static Bitmap A00(C0947Xy c0947Xy, Bitmap bitmap, int i) throws RSRuntimeException {
        RenderScript renderScriptCreate = null;
        Allocation allocationCreateFromBitmap = null;
        Allocation allocationCreateTyped = null;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = null;
        try {
            renderScriptCreate = RenderScript.create(c0947Xy);
            renderScriptCreate.setMessageHandler(new RenderScript.RSMessageHandler());
            allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
            scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.setRadius(i);
            scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
            allocationCreateTyped.copyTo(bitmap);
            renderScriptCreate.destroy();
            allocationCreateFromBitmap.destroy();
            allocationCreateTyped.destroy();
            scriptIntrinsicBlurCreate.destroy();
            return bitmap;
        } catch (Throwable th) {
            if (renderScriptCreate != null) {
                renderScriptCreate.destroy();
            }
            if (allocationCreateFromBitmap != null) {
                allocationCreateFromBitmap.destroy();
            }
            if (allocationCreateTyped != null) {
                allocationCreateTyped.destroy();
            }
            if (scriptIntrinsicBlurCreate != null) {
                scriptIntrinsicBlurCreate.destroy();
            }
            throw th;
        }
    }

    @Nullable
    public static Bitmap A01(C0947Xy c0947Xy, Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth() / i2;
        int height = bitmap.getHeight() / i2;
        if (width == 0 || height == 0 || Build.VERSION.SDK_INT < 18) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(1.0f / i2, 1.0f / i2);
        Paint paint = new Paint();
        paint.setFlags(3);
        paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            Bitmap bitmapA00 = A00(c0947Xy, bitmapCreateBitmap, i);
            if (i2 != 1) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA00, bitmap.getWidth(), bitmap.getHeight(), true);
                bitmapA00.recycle();
                return bitmapCreateScaledBitmap;
            }
            return bitmapA00;
        } catch (RSRuntimeException unused) {
            return new C0831Tj().A02(bitmapCreateBitmap, i);
        }
    }
}
