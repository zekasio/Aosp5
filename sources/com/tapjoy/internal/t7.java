package com.tapjoy.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public class t7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ URL f1914a;
    public final /* synthetic */ InputStream b;
    public final /* synthetic */ long c;
    public final /* synthetic */ u7 d;

    public t7(u7 u7Var, URL url, InputStream inputStream, long j) {
        this.d = u7Var;
        this.f1914a = url;
        this.b = inputStream;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            File fileCreateTempFile = File.createTempFile("tj_", null, this.d.b());
            if (fileCreateTempFile == null) {
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            a.a(this.b, (OutputStream) fileOutputStream);
            fileOutputStream.close();
            long j = this.c;
            if (j > 604800) {
                j = 604800;
            }
            long jA = (j * 1000) + p.a();
            synchronized (this.d) {
                String strB = this.d.b(this.f1914a);
                if (fileCreateTempFile.renameTo(this.d.a(strB))) {
                    this.d.b.edit().putLong(strB, jA).commit();
                }
            }
        } catch (FileNotFoundException | IOException unused) {
        }
    }
}
