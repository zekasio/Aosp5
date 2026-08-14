package com.vungle.warren.utility;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class SafeObjectInputStream extends ObjectInputStream {
    private final List<Class<?>> allowed;

    SafeObjectInputStream(InputStream inputStream, List<Class<?>> list) throws IOException {
        super(inputStream);
        this.allowed = list;
    }

    @Override // java.io.ObjectInputStream
    protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
        Class<?> clsResolveClass = super.resolveClass(objectStreamClass);
        if (this.allowed == null || Number.class.isAssignableFrom(clsResolveClass) || String.class.equals(clsResolveClass) || Boolean.class.equals(clsResolveClass) || clsResolveClass.isArray() || this.allowed.contains(clsResolveClass)) {
            return clsResolveClass;
        }
        throw new IOException("Deserialization is not allowed for " + objectStreamClass.getName());
    }
}
