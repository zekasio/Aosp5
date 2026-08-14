package com.tapjoy.internal;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f1821a = Logger.getLogger(i6.class.getName());

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                try {
                    f1821a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e);
                } catch (IOException e2) {
                    f1821a.log(Level.SEVERE, "IOException should not have been thrown.", (Throwable) e2);
                }
            }
        }
    }
}
