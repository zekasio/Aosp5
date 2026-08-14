package com.tapjoy.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class n implements r0<Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f1856a = new n();

    public class a implements p0<Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InputStream f1857a;

        public a(n nVar, InputStream inputStream) {
            this.f1857a = inputStream;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            InputStream inputStream = this.f1857a;
            return inputStream instanceof q0 ? BitmapFactory.decodeStream(inputStream) : BitmapFactory.decodeStream(new q0(inputStream));
        }
    }

    @Override // com.tapjoy.internal.r0
    public void a(OutputStream outputStream, Bitmap bitmap) {
        if (!bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream)) {
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tapjoy.internal.r0
    public Bitmap a(InputStream inputStream) {
        try {
            a aVar = new a(this, inputStream);
            int i = 1;
            while (true) {
                try {
                    return (Bitmap) aVar.call();
                } catch (OutOfMemoryError e) {
                    if (i < 10) {
                        System.gc();
                        i++;
                    } else {
                        throw e;
                    }
                }
            }
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }
}
