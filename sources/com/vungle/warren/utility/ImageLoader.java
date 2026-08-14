package com.vungle.warren.utility;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.vungle.warren.model.Advertisement;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class ImageLoader {
    private static final String TAG = "ImageLoader";
    private static final ImageLoader sInstance = new ImageLoader();
    private Executor ioExecutor;
    private final LruCache<String, Bitmap> lruCache;

    public interface ImageLoaderListener {
        void onImageLoaded(Bitmap bitmap);
    }

    private ImageLoader() {
        this.lruCache = new LruCache<String, Bitmap>(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8) { // from class: com.vungle.warren.utility.ImageLoader.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.util.LruCache
            public int sizeOf(String str, Bitmap bitmap) {
                return bitmap.getByteCount() / 1024;
            }
        };
    }

    ImageLoader(LruCache<String, Bitmap> lruCache) {
        this.lruCache = lruCache;
    }

    public static ImageLoader getInstance() {
        return sInstance;
    }

    public void init(Executor executor) {
        this.ioExecutor = executor;
    }

    public void displayImage(final String str, final ImageLoaderListener imageLoaderListener) {
        if (this.ioExecutor == null) {
            Log.w(TAG, "ImageLoader not initialized.");
        } else if (TextUtils.isEmpty(str)) {
            Log.w(TAG, "the uri is required.");
        } else {
            this.ioExecutor.execute(new Runnable() { // from class: com.vungle.warren.utility.ImageLoader.2
                @Override // java.lang.Runnable
                public void run() {
                    if (str.startsWith(Advertisement.FILE_SCHEME)) {
                        Bitmap bitmap = (Bitmap) ImageLoader.this.lruCache.get(str);
                        if (bitmap != null && !bitmap.isRecycled()) {
                            ImageLoaderListener imageLoaderListener2 = imageLoaderListener;
                            if (imageLoaderListener2 != null) {
                                imageLoaderListener2.onImageLoaded(bitmap);
                                return;
                            }
                            return;
                        }
                        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str.substring(7));
                        if (bitmapDecodeFile != null) {
                            ImageLoader.this.lruCache.put(str, bitmapDecodeFile);
                            ImageLoaderListener imageLoaderListener3 = imageLoaderListener;
                            if (imageLoaderListener3 != null) {
                                imageLoaderListener3.onImageLoaded(bitmapDecodeFile);
                                return;
                            }
                            return;
                        }
                        Log.w(ImageLoader.TAG, "decode bitmap failed.");
                    }
                }
            });
        }
    }
}
