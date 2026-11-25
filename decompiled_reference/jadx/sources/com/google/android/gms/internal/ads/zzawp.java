package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzawp implements Comparator {
    private final boolean zza;

    public zzawp(boolean z) {
        this.zza = z;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparator comparatorZza;
        Object objZzn;
        Object objZzn2;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = i7 + ((((i2 & (~i)) | i3) + ((i & i4) | i5)) - i6);
        int i10 = i8 % 496612959;
        zzawt zzawtVar = (zzawt) obj;
        zzawt zzawtVar2 = (zzawt) obj2;
        int i11 = zzawtVar.zza;
        if (i11 != zzawtVar2.zza) {
            throw new IllegalArgumentException();
        }
        int i12 = i10 ^ i9;
        try {
            if (i11 == 0) {
                throw null;
            }
            switch (i11 + i12) {
                case 0:
                    return 0;
                case 1:
                    if (this.zza) {
                        return zzawtVar.zzl() != zzawtVar2.zzl() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 2:
                    return Long.compare(zzawtVar.zzm(), zzawtVar2.zzm());
                case 3:
                    comparatorZza = zzavx.zzc;
                    objZzn = zzawtVar.zzn();
                    objZzn2 = zzawtVar2.zzn();
                    break;
                case 4:
                    objZzn = zzawtVar.zzo();
                    objZzn2 = zzawtVar2.zzo();
                    comparatorZza = zzgwd.zza(this);
                    break;
                case 5:
                    if (this.zza) {
                        return zzawtVar.zzp() != zzawtVar2.zzp() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 6:
                    return Double.compare(zzawtVar.zzq(), zzawtVar2.zzq());
                default:
                    return 0;
            }
            return comparatorZza.compare(objZzn, objZzn2);
        } catch (zzawq e) {
            throw new AssertionError(zzavv.zza("CEiv6BFfPnitUE+D"), e);
        }
    }
}
