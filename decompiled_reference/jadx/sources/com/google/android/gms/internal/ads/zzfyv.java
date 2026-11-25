package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfyv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfyv> CREATOR = new zzfyw();
    public final int zza;
    private zzayt zzb = null;
    private byte[] zzc;

    zzfyv(int i, byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzayt zzaytVar = this.zzb;
        if (zzaytVar != null || this.zzc == null) {
            if (zzaytVar == null || this.zzc != null) {
                if (zzaytVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzaytVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        byte[] bArrZzaN = this.zzc;
        if (bArrZzaN == null) {
            bArrZzaN = this.zzb.zzaN();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArrZzaN, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final zzayt zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzayt.zzi(this.zzc, zzidz.zzb());
                this.zzc = null;
            } catch (zzifh | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.zzb;
    }
}
