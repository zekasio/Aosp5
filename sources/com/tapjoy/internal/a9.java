package com.tapjoy.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class a9 {
    static {
        Logger.getLogger(a9.class.getName());
    }

    public static g9 a(OutputStream outputStream) {
        i9 i9Var = new i9();
        if (outputStream != null) {
            return new y8(i9Var, outputStream);
        }
        throw new IllegalArgumentException("out == null");
    }

    public static h9 a(InputStream inputStream) {
        i9 i9Var = new i9();
        if (inputStream != null) {
            return new z8(i9Var, inputStream);
        }
        throw new IllegalArgumentException("in == null");
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
