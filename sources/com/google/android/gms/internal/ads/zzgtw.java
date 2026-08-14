package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public enum zzgtw {
    DOUBLE(zzgtx.DOUBLE, 1),
    FLOAT(zzgtx.FLOAT, 5),
    INT64(zzgtx.LONG, 0),
    UINT64(zzgtx.LONG, 0),
    INT32(zzgtx.INT, 0),
    FIXED64(zzgtx.LONG, 1),
    FIXED32(zzgtx.INT, 5),
    BOOL(zzgtx.BOOLEAN, 0),
    STRING(zzgtx.STRING, 2),
    GROUP(zzgtx.MESSAGE, 3),
    MESSAGE(zzgtx.MESSAGE, 2),
    BYTES(zzgtx.BYTE_STRING, 2),
    UINT32(zzgtx.INT, 0),
    ENUM(zzgtx.ENUM, 0),
    SFIXED32(zzgtx.INT, 5),
    SFIXED64(zzgtx.LONG, 1),
    SINT32(zzgtx.INT, 0),
    SINT64(zzgtx.LONG, 0);

    private final zzgtx zzt;

    zzgtw(zzgtx zzgtxVar, int i) {
        this.zzt = zzgtxVar;
    }

    public final zzgtx zza() {
        return this.zzt;
    }
}
