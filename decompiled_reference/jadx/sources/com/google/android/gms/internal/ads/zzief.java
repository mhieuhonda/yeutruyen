package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public enum zzief {
    DOUBLE(0, 1, zzifj.DOUBLE),
    FLOAT(1, 1, zzifj.FLOAT),
    INT64(2, 1, zzifj.LONG),
    UINT64(3, 1, zzifj.LONG),
    INT32(4, 1, zzifj.INT),
    FIXED64(5, 1, zzifj.LONG),
    FIXED32(6, 1, zzifj.INT),
    BOOL(7, 1, zzifj.BOOLEAN),
    STRING(8, 1, zzifj.STRING),
    MESSAGE(9, 1, zzifj.MESSAGE),
    BYTES(10, 1, zzifj.BYTE_STRING),
    UINT32(11, 1, zzifj.INT),
    ENUM(12, 1, zzifj.ENUM),
    SFIXED32(13, 1, zzifj.INT),
    SFIXED64(14, 1, zzifj.LONG),
    SINT32(15, 1, zzifj.INT),
    SINT64(16, 1, zzifj.LONG),
    GROUP(17, 1, zzifj.MESSAGE),
    DOUBLE_LIST(18, 2, zzifj.DOUBLE),
    FLOAT_LIST(19, 2, zzifj.FLOAT),
    INT64_LIST(20, 2, zzifj.LONG),
    UINT64_LIST(21, 2, zzifj.LONG),
    INT32_LIST(22, 2, zzifj.INT),
    FIXED64_LIST(23, 2, zzifj.LONG),
    FIXED32_LIST(24, 2, zzifj.INT),
    BOOL_LIST(25, 2, zzifj.BOOLEAN),
    STRING_LIST(26, 2, zzifj.STRING),
    MESSAGE_LIST(27, 2, zzifj.MESSAGE),
    BYTES_LIST(28, 2, zzifj.BYTE_STRING),
    UINT32_LIST(29, 2, zzifj.INT),
    ENUM_LIST(30, 2, zzifj.ENUM),
    SFIXED32_LIST(31, 2, zzifj.INT),
    SFIXED64_LIST(32, 2, zzifj.LONG),
    SINT32_LIST(33, 2, zzifj.INT),
    SINT64_LIST(34, 2, zzifj.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzifj.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzifj.FLOAT),
    INT64_LIST_PACKED(37, 3, zzifj.LONG),
    UINT64_LIST_PACKED(38, 3, zzifj.LONG),
    INT32_LIST_PACKED(39, 3, zzifj.INT),
    FIXED64_LIST_PACKED(40, 3, zzifj.LONG),
    FIXED32_LIST_PACKED(41, 3, zzifj.INT),
    BOOL_LIST_PACKED(42, 3, zzifj.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzifj.INT),
    ENUM_LIST_PACKED(44, 3, zzifj.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzifj.INT),
    SFIXED64_LIST_PACKED(46, 3, zzifj.LONG),
    SINT32_LIST_PACKED(47, 3, zzifj.INT),
    SINT64_LIST_PACKED(48, 3, zzifj.LONG),
    GROUP_LIST(49, 2, zzifj.MESSAGE),
    MAP(50, 4, zzifj.VOID);

    private static final zzief[] zzaa;
    private final int zzZ;

    static {
        zzief[] zziefVarArrValues = values();
        zzaa = new zzief[zziefVarArrValues.length];
        for (zzief zziefVar : zziefVarArrValues) {
            zzaa[zziefVar.zzZ] = zziefVar;
        }
    }

    zzief(int i, int i2, zzifj zzifjVar) {
        this.zzZ = i;
        int i3 = i2 - 1;
        if (i3 == 1 || i3 == 3) {
            zzifjVar.zza();
        }
        if (i2 == 1) {
            zzifj zzifjVar2 = zzifj.VOID;
            zzifjVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzZ;
    }
}
