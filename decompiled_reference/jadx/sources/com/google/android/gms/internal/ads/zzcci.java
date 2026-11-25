package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcci extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcci> CREATOR = new zzccj();
    public final String zza;
    public final int zzb;

    public zzcci(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public static zzcci zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzcci(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcci)) {
            return false;
        }
        zzcci zzcciVar = (zzcci) obj;
        return Objects.equal(this.zza, zzcciVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzcciVar.zzb));
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
