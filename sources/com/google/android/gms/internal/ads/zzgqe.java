package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public enum zzgqe {
    DOUBLE(0, 1, zzgra.DOUBLE),
    FLOAT(1, 1, zzgra.FLOAT),
    INT64(2, 1, zzgra.LONG),
    UINT64(3, 1, zzgra.LONG),
    INT32(4, 1, zzgra.INT),
    FIXED64(5, 1, zzgra.LONG),
    FIXED32(6, 1, zzgra.INT),
    BOOL(7, 1, zzgra.BOOLEAN),
    STRING(8, 1, zzgra.STRING),
    MESSAGE(9, 1, zzgra.MESSAGE),
    BYTES(10, 1, zzgra.BYTE_STRING),
    UINT32(11, 1, zzgra.INT),
    ENUM(12, 1, zzgra.ENUM),
    SFIXED32(13, 1, zzgra.INT),
    SFIXED64(14, 1, zzgra.LONG),
    SINT32(15, 1, zzgra.INT),
    SINT64(16, 1, zzgra.LONG),
    GROUP(17, 1, zzgra.MESSAGE),
    DOUBLE_LIST(18, 2, zzgra.DOUBLE),
    FLOAT_LIST(19, 2, zzgra.FLOAT),
    INT64_LIST(20, 2, zzgra.LONG),
    UINT64_LIST(21, 2, zzgra.LONG),
    INT32_LIST(22, 2, zzgra.INT),
    FIXED64_LIST(23, 2, zzgra.LONG),
    FIXED32_LIST(24, 2, zzgra.INT),
    BOOL_LIST(25, 2, zzgra.BOOLEAN),
    STRING_LIST(26, 2, zzgra.STRING),
    MESSAGE_LIST(27, 2, zzgra.MESSAGE),
    BYTES_LIST(28, 2, zzgra.BYTE_STRING),
    UINT32_LIST(29, 2, zzgra.INT),
    ENUM_LIST(30, 2, zzgra.ENUM),
    SFIXED32_LIST(31, 2, zzgra.INT),
    SFIXED64_LIST(32, 2, zzgra.LONG),
    SINT32_LIST(33, 2, zzgra.INT),
    SINT64_LIST(34, 2, zzgra.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzgra.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzgra.FLOAT),
    INT64_LIST_PACKED(37, 3, zzgra.LONG),
    UINT64_LIST_PACKED(38, 3, zzgra.LONG),
    INT32_LIST_PACKED(39, 3, zzgra.INT),
    FIXED64_LIST_PACKED(40, 3, zzgra.LONG),
    FIXED32_LIST_PACKED(41, 3, zzgra.INT),
    BOOL_LIST_PACKED(42, 3, zzgra.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzgra.INT),
    ENUM_LIST_PACKED(44, 3, zzgra.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzgra.INT),
    SFIXED64_LIST_PACKED(46, 3, zzgra.LONG),
    SINT32_LIST_PACKED(47, 3, zzgra.INT),
    SINT64_LIST_PACKED(48, 3, zzgra.LONG),
    GROUP_LIST(49, 2, zzgra.MESSAGE),
    MAP(50, 4, zzgra.VOID);

    private static final zzgqe[] zzZ;
    private final zzgra zzab;
    private final int zzac;
    private final Class zzad;

    static {
        zzgqe[] zzgqeVarArrValues = values();
        zzZ = new zzgqe[zzgqeVarArrValues.length];
        for (zzgqe zzgqeVar : zzgqeVarArrValues) {
            zzZ[zzgqeVar.zzac] = zzgqeVar;
        }
    }

    zzgqe(int i, int i2, zzgra zzgraVar) {
        this.zzac = i;
        this.zzab = zzgraVar;
        zzgra zzgraVar2 = zzgra.VOID;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            this.zzad = zzgraVar.zza();
        } else {
            this.zzad = null;
        }
        if (i2 == 1) {
            zzgraVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzac;
    }
}
