package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public enum zzihq {
    DOUBLE(zzihr.DOUBLE, 1),
    FLOAT(zzihr.FLOAT, 5),
    INT64(zzihr.LONG, 0),
    UINT64(zzihr.LONG, 0),
    INT32(zzihr.INT, 0),
    FIXED64(zzihr.LONG, 1),
    FIXED32(zzihr.INT, 5),
    BOOL(zzihr.BOOLEAN, 0),
    STRING(zzihr.STRING, 2),
    GROUP(zzihr.MESSAGE, 3),
    MESSAGE(zzihr.MESSAGE, 2),
    BYTES(zzihr.BYTE_STRING, 2),
    UINT32(zzihr.INT, 0),
    ENUM(zzihr.ENUM, 0),
    SFIXED32(zzihr.INT, 5),
    SFIXED64(zzihr.LONG, 1),
    SINT32(zzihr.INT, 0),
    SINT64(zzihr.LONG, 0);

    private final zzihr zzs;
    private final int zzt;

    zzihq(zzihr zzihrVar, int i) {
        this.zzs = zzihrVar;
        this.zzt = i;
    }

    public final zzihr zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
