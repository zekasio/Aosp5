package com.tapjoy.internal;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class d7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f1781a;

    public d7(File file) {
        this.f1781a = file;
    }

    public synchronized boolean a() {
        if (b() != null) {
            return false;
        }
        try {
            c();
            return b() != null;
        } catch (IOException unused) {
            return false;
        }
    }

    public final String b() {
        if (!this.f1781a.exists()) {
            return null;
        }
        try {
            String strA = s0.a(this.f1781a);
            if (strA.length() > 0) {
                return strA;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public final void c() throws IOException {
        try {
            File file = this.f1781a;
            String string = UUID.randomUUID().toString();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, b0.f1757a);
                outputStreamWriter.write(string);
                outputStreamWriter.flush();
            } finally {
                i6.a(fileOutputStream);
            }
        } catch (IOException e) {
            this.f1781a.delete();
            throw e;
        }
    }
}
