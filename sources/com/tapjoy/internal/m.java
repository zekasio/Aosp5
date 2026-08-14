package com.tapjoy.internal;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import java.net.ContentHandler;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class m extends ContentHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f1846a = new m();

    public Bitmap a(InputStream inputStream) throws IOException {
        try {
            return n.f1856a.a(inputStream);
        } finally {
            inputStream.close();
        }
    }

    @Override // java.net.ContentHandler
    public Object getContent(URLConnection uRLConnection) throws IOException {
        InputStream inputStream = uRLConnection.getInputStream();
        try {
            return n.f1856a.a(inputStream);
        } finally {
            inputStream.close();
        }
    }
}
