package com.tapjoy.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 {
    public static String a(File file) {
        Charset charset = b0.f1757a;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, charset);
            StringBuilder sb = new StringBuilder();
            CharBuffer charBufferAllocate = CharBuffer.allocate(2048);
            while (true) {
                int i = inputStreamReader.read(charBufferAllocate);
                if (i == -1) {
                    return sb.toString();
                }
                charBufferAllocate.flip();
                sb.append((CharSequence) charBufferAllocate, 0, i);
            }
        } finally {
            i6.a(fileInputStream);
        }
    }
}
