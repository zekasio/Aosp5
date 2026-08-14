package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes2.dex */
final class zzln {
    private static final zzll zztz = zzeb();
    private static final zzll zzua = new zzlm();

    static zzll zzdz() {
        return zztz;
    }

    static zzll zzea() {
        return zzua;
    }

    private static zzll zzeb() {
        try {
            return (zzll) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
