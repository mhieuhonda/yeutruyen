package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgws extends zzgwt {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzgwt zzc;

    zzgws(zzgwt zzgwtVar, int i, int i2) {
        Objects.requireNonNull(zzgwtVar);
        this.zzc = zzgwtVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzgtr.zzm(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgwt, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgwt
    /* JADX INFO: renamed from: zzh */
    public final zzgwt subList(int i, int i2) {
        zzgtr.zzo(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
