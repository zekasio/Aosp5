package com.applovin.exoplayer2;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.exoplayer2.g;

/* JADX INFO: loaded from: classes.dex */
public class ak extends Exception implements g {
    public static final g.a<ak> k = new g.a() { // from class: com.applovin.exoplayer2.ak$$ExternalSyntheticLambda0
        @Override // com.applovin.exoplayer2.g.a
        public final g fromBundle(Bundle bundle) {
            return new ak(bundle);
        }
    };
    public final int i;
    public final long j;

    protected ak(Bundle bundle) {
        this(bundle.getString(a(2)), a(bundle), bundle.getInt(a(0), 1000), bundle.getLong(a(1), SystemClock.elapsedRealtime()));
    }

    protected ak(String str, Throwable th, int i, long j) {
        super(str, th);
        this.i = i;
        this.j = j;
    }

    protected static String a(int i) {
        return Integer.toString(i, 36);
    }

    private static Throwable a(Class<?> cls, String str) throws Exception {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    private static RemoteException a(String str) {
        return new RemoteException(str);
    }

    private static Throwable a(Bundle bundle) {
        String string = bundle.getString(a(3));
        String string2 = bundle.getString(a(4));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, ak.class.getClassLoader());
            Throwable thA = Throwable.class.isAssignableFrom(cls) ? a(cls, string2) : null;
            if (thA != null) {
                return thA;
            }
        } catch (Throwable unused) {
        }
        return a(string2);
    }
}
