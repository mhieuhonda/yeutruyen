package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdfk extends zzdix implements com.google.android.gms.ads.internal.overlay.zzr {
    public zzdfk(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdT() {
        zzs(zzdfc.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdU(final int i) {
        zzs(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdfj
            @Override // com.google.android.gms.internal.ads.zzdiw
            public final /* synthetic */ void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzr) obj).zzdU(i);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzs(zzdez.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzs(zzdfa.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        zzs(zzdfb.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdv() {
        zzs(zzdfd.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdw() {
        zzs(zzdfe.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdx() {
        zzs(zzdff.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
        zzs(zzdfg.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
        zzs(zzdfh.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzh() {
        zzs(zzdfi.zza);
    }
}
