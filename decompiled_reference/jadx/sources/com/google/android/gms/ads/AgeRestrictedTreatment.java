package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public enum AgeRestrictedTreatment {
    UNSPECIFIED(0),
    CHILD(1),
    TEEN(2);

    private final int zza;

    AgeRestrictedTreatment(int i) {
        this.zza = i;
    }

    public int getValue() {
        return this.zza;
    }
}
