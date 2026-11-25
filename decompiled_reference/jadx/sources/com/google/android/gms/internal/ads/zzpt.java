package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import androidx.core.view.PointerIconCompat;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpt implements zzno {
    private final zzdp zza;
    private final zzbd zzb;
    private final zzbe zzc;
    private final zzps zzd;
    private final SparseArray zze;
    private zzeg zzf;
    private zzbb zzg;
    private zzea zzh;
    private boolean zzi;

    private final zznp zzae() {
        return zzad(this.zzd.zzb());
    }

    private final zznp zzaf() {
        return zzad(this.zzd.zzc());
    }

    private final zznp zzag(int i, zzxl zzxlVar) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        if (zzxlVar != null) {
            return this.zzd.zze(zzxlVar) != null ? zzad(zzxlVar) : zzaa(zzbf.zza, i, zzxlVar);
        }
        zzbf zzbfVarZzq = zzbbVar.zzq();
        if (i >= zzbfVarZzq.zza()) {
            zzbfVarZzq = zzbf.zza;
        }
        return zzaa(zzbfVarZzq, i, null);
    }

    private final zznp zzah(zzau zzauVar) {
        zzxl zzxlVar;
        return (!(zzauVar instanceof zzjm) || (zzxlVar = ((zzjm) zzauVar).zzh) == null) ? zzZ() : zzad(zzxlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzA() {
        if (this.zzi) {
            return;
        }
        final zznp zznpVarZzZ = zzZ();
        this.zzi = true;
        zzY(zznpVarZzZ, -1, new zzeb(zznpVarZzZ) { // from class: com.google.android.gms.internal.ads.zzod
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzB(final int i, final int i2, final boolean z) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, 1033, new zzeb(zznpVarZzaf, i, i2, z) { // from class: com.google.android.gms.internal.ads.zzoo
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzC(final zzjd zzjdVar) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, PointerIconCompat.TYPE_CROSSHAIR, new zzeb(zznpVarZzaf, zzjdVar) { // from class: com.google.android.gms.internal.ads.zzoz
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzD(final String str, final long j, final long j2) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, PointerIconCompat.TYPE_TEXT, new zzeb(zznpVarZzaf, str, j2, j) { // from class: com.google.android.gms.internal.ads.zzpj
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzE(final zzv zzvVar, final zzje zzjeVar) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, PointerIconCompat.TYPE_VERTICAL_TEXT, new zzeb() { // from class: com.google.android.gms.internal.ads.zzpm
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznr) obj).zzk(zznpVarZzaf, zzvVar, zzjeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzF(final long j) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, PointerIconCompat.TYPE_ALIAS, new zzeb(zznpVarZzaf, j) { // from class: com.google.android.gms.internal.ads.zzpn
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzG(final int i, final long j, final long j2) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, PointerIconCompat.TYPE_COPY, new zzeb(zznpVarZzaf, i, j, j2) { // from class: com.google.android.gms.internal.ads.zzpo
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzH(final String str) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, PointerIconCompat.TYPE_NO_DROP, new zzeb(zznpVarZzaf, str) { // from class: com.google.android.gms.internal.ads.zzpp
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzI(final zzjd zzjdVar) {
        final zznp zznpVarZzae = zzae();
        zzY(zznpVarZzae, PointerIconCompat.TYPE_ALL_SCROLL, new zzeb(zznpVarZzae, zzjdVar) { // from class: com.google.android.gms.internal.ads.zzpq
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzJ(final Exception exc) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, new zzeb(zznpVarZzaf, exc) { // from class: com.google.android.gms.internal.ads.zznt
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzK(final Exception exc) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, 1029, new zzeb(zznpVarZzaf, exc) { // from class: com.google.android.gms.internal.ads.zznu
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzL(final zzsa zzsaVar) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, 1031, new zzeb(zznpVarZzaf, zzsaVar) { // from class: com.google.android.gms.internal.ads.zznv
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzM(final zzsa zzsaVar) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, 1032, new zzeb(zznpVarZzaf, zzsaVar) { // from class: com.google.android.gms.internal.ads.zznw
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzN(final zzjd zzjdVar) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, new zzeb(zznpVarZzaf, zzjdVar) { // from class: com.google.android.gms.internal.ads.zzny
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzO(final String str, final long j, final long j2) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, new zzeb(zznpVarZzaf, str, j2, j) { // from class: com.google.android.gms.internal.ads.zznz
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzP(final zzv zzvVar, final zzje zzjeVar) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, new zzeb() { // from class: com.google.android.gms.internal.ads.zzoa
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznr) obj).zzl(zznpVarZzaf, zzvVar, zzjeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzQ(final int i, final long j) {
        final zznp zznpVarZzae = zzae();
        zzY(zznpVarZzae, PointerIconCompat.TYPE_ZOOM_IN, new zzeb() { // from class: com.google.android.gms.internal.ads.zzob
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznr) obj).zzm(zznpVarZzae, i, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzR(final String str) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, PointerIconCompat.TYPE_ZOOM_OUT, new zzeb(zznpVarZzaf, str) { // from class: com.google.android.gms.internal.ads.zzoc
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzS(final zzjd zzjdVar) {
        final zznp zznpVarZzae = zzae();
        zzY(zznpVarZzae, PointerIconCompat.TYPE_GRAB, new zzeb() { // from class: com.google.android.gms.internal.ads.zzoe
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznr) obj).zzdh(zznpVarZzae, zzjdVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzT(final Object obj, final long j) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, 26, new zzeb() { // from class: com.google.android.gms.internal.ads.zzof
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj2) {
                ((zznr) obj2).zzo(zznpVarZzaf, obj, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzU(final long j, final int i) {
        final zznp zznpVarZzae = zzae();
        zzY(zznpVarZzae, PointerIconCompat.TYPE_GRABBING, new zzeb(zznpVarZzae, j, i) { // from class: com.google.android.gms.internal.ads.zzog
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzV(final Exception exc) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, 1030, new zzeb(zznpVarZzaf, exc) { // from class: com.google.android.gms.internal.ads.zzoh
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzW(final int i) {
        final zznp zznpVarZzZ = zzZ();
        zzY(zznpVarZzZ, 1034, new zzeb(zznpVarZzZ, i) { // from class: com.google.android.gms.internal.ads.zzoi
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzabq
    public final void zzX(final int i, final long j, final long j2) {
        final zznp zznpVarZzad = zzad(this.zzd.zzd());
        zzY(zznpVarZzad, PointerIconCompat.TYPE_CELL, new zzeb() { // from class: com.google.android.gms.internal.ads.zzpk
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznr) obj).zzdg(zznpVarZzad, i, j, j2);
            }
        });
    }

    protected final void zzY(zznp zznpVar, int i, zzeb zzebVar) {
        this.zze.put(i, zznpVar);
        zzeg zzegVar = this.zzf;
        zzegVar.zze(i, zzebVar);
        zzegVar.zzf();
    }

    protected final zznp zzZ() {
        return zzad(this.zzd.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zza(zzbb zzbbVar, zzay zzayVar) {
    }

    @RequiresNonNull({"player"})
    protected final zznp zzaa(zzbf zzbfVar, int i, zzxl zzxlVar) {
        zzxl zzxlVar2 = true == zzbfVar.zzg() ? null : zzxlVar;
        long jZzb = this.zza.zzb();
        boolean z = zzbfVar.equals(this.zzg.zzq()) && i == this.zzg.zzs();
        long jZzs = 0;
        if (zzxlVar2 == null || !zzxlVar2.zzb()) {
            if (z) {
                jZzs = this.zzg.zzA();
            } else if (!zzbfVar.zzg()) {
                long j = zzbfVar.zzb(i, this.zzc, 0L).zzl;
                jZzs = zzfm.zzs(0L);
            }
        } else if (z && this.zzg.zzy() == zzxlVar2.zzb && this.zzg.zzz() == zzxlVar2.zzc) {
            jZzs = this.zzg.zzu();
        }
        return new zznp(jZzb, zzbfVar, i, zzxlVar2, jZzs, this.zzg.zzq(), this.zzg.zzs(), this.zzd.zza(), this.zzg.zzu(), this.zzg.zzw());
    }

    final /* synthetic */ void zzab(zzbb zzbbVar, zznr zznrVar, zzs zzsVar) {
        zznrVar.zzdi(zzbbVar, new zznq(zzsVar, this.zze));
    }

    final /* synthetic */ void zzac() {
        final zznp zznpVarZzZ = zzZ();
        zzY(zznpVarZzZ, 1028, new zzeb(zznpVarZzZ) { // from class: com.google.android.gms.internal.ads.zzpl
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        this.zzf.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzai(int i, zzxl zzxlVar, final zzxc zzxcVar, final zzxh zzxhVar, final int i2) {
        final zznp zznpVarZzag = zzag(i, zzxlVar);
        zzY(zznpVarZzag, 1000, new zzeb(zznpVarZzag, zzxcVar, zzxhVar, i2) { // from class: com.google.android.gms.internal.ads.zzok
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzaj(int i, zzxl zzxlVar, final zzxc zzxcVar, final zzxh zzxhVar) {
        final zznp zznpVarZzag = zzag(i, zzxlVar);
        zzY(zznpVarZzag, 1001, new zzeb(zznpVarZzag, zzxcVar, zzxhVar) { // from class: com.google.android.gms.internal.ads.zzol
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzak(int i, zzxl zzxlVar, final zzxc zzxcVar, final zzxh zzxhVar) {
        final zznp zznpVarZzag = zzag(i, zzxlVar);
        zzY(zznpVarZzag, 1002, new zzeb(zznpVarZzag, zzxcVar, zzxhVar) { // from class: com.google.android.gms.internal.ads.zzom
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzal(int i, zzxl zzxlVar, final zzxc zzxcVar, final zzxh zzxhVar, final IOException iOException, final boolean z) {
        final zznp zznpVarZzag = zzag(i, zzxlVar);
        zzY(zznpVarZzag, PointerIconCompat.TYPE_HELP, new zzeb() { // from class: com.google.android.gms.internal.ads.zzon
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznr) obj).zzh(zznpVarZzag, zzxcVar, zzxhVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzxw
    public final void zzam(int i, zzxl zzxlVar, final zzxh zzxhVar) {
        final zznp zznpVarZzag = zzag(i, zzxlVar);
        zzY(zznpVarZzag, 1004, new zzeb() { // from class: com.google.android.gms.internal.ads.zzop
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznr) obj).zzdf(zznpVarZzag, zzxhVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzc(final zzak zzakVar, final int i) {
        final zznp zznpVarZzZ = zzZ();
        zzY(zznpVarZzZ, 1, new zzeb(zznpVarZzZ, zzakVar, i) { // from class: com.google.android.gms.internal.ads.zzor
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzd(final zzbn zzbnVar) {
        final zznp zznpVarZzZ = zzZ();
        zzY(zznpVarZzZ, 2, new zzeb(zznpVarZzZ, zzbnVar) { // from class: com.google.android.gms.internal.ads.zzos
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zze(final zzan zzanVar) {
        final zznp zznpVarZzZ = zzZ();
        zzY(zznpVarZzZ, 14, new zzeb(zznpVarZzZ, zzanVar) { // from class: com.google.android.gms.internal.ads.zzpf
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzf(final boolean z) {
        final zznp zznpVarZzZ = zzZ();
        zzY(zznpVarZzZ, 3, new zzeb(zznpVarZzZ, z) { // from class: com.google.android.gms.internal.ads.zzot
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzg(final zzax zzaxVar) {
        final zznp zznpVarZzZ = zzZ();
        zzY(zznpVarZzZ, 13, new zzeb(zznpVarZzZ, zzaxVar) { // from class: com.google.android.gms.internal.ads.zzou
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzh(final boolean z, final int i) {
        final zznp zznpVarZzZ = zzZ();
        zzY(zznpVarZzZ, -1, new zzeb(zznpVarZzZ, z, i) { // from class: com.google.android.gms.internal.ads.zzov
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzi(final int i) {
        final zznp zznpVarZzZ = zzZ();
        zzY(zznpVarZzZ, 4, new zzeb() { // from class: com.google.android.gms.internal.ads.zzow
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznr) obj).zze(zznpVarZzZ, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzj(final boolean z, final int i) {
        final zznp zznpVarZzZ = zzZ();
        zzY(zznpVarZzZ, 5, new zzeb(zznpVarZzZ, z, i) { // from class: com.google.android.gms.internal.ads.zzox
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzk(final int i) {
        final zznp zznpVarZzZ = zzZ();
        zzY(zznpVarZzZ, 6, new zzeb(zznpVarZzZ, i) { // from class: com.google.android.gms.internal.ads.zzoy
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzl(final boolean z) {
        final zznp zznpVarZzZ = zzZ();
        zzY(zznpVarZzZ, 7, new zzeb(zznpVarZzZ, z) { // from class: com.google.android.gms.internal.ads.zzpa
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzm(final zzau zzauVar) {
        final zznp zznpVarZzah = zzah(zzauVar);
        zzY(zznpVarZzah, 10, new zzeb() { // from class: com.google.android.gms.internal.ads.zzpb
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznr) obj).zzg(zznpVarZzah, zzauVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzn(final zzau zzauVar) {
        final zznp zznpVarZzah = zzah(zzauVar);
        zzY(zznpVarZzah, 10, new zzeb(zznpVarZzah, zzauVar) { // from class: com.google.android.gms.internal.ads.zzpc
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzp(final zzav zzavVar) {
        final zznp zznpVarZzZ = zzZ();
        zzY(zznpVarZzZ, 12, new zzeb(zznpVarZzZ, zzavVar) { // from class: com.google.android.gms.internal.ads.zzpe
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzq(final int i) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, 21, new zzeb(zznpVarZzaf, i) { // from class: com.google.android.gms.internal.ads.zzph
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzr(final float f) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, 22, new zzeb(zznpVarZzaf, f) { // from class: com.google.android.gms.internal.ads.zznx
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzs(final boolean z) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, 23, new zzeb(zznpVarZzaf, z) { // from class: com.google.android.gms.internal.ads.zzpg
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzt(final zzbv zzbvVar) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, 25, new zzeb() { // from class: com.google.android.gms.internal.ads.zzpi
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                zznp zznpVar = zznpVarZzaf;
                zzbv zzbvVar2 = zzbvVar;
                ((zznr) obj).zzp(zznpVar, zzbvVar2);
                int i = zzbvVar2.zzb;
                int i2 = zzbvVar2.zzc;
                float f = zzbvVar2.zzd;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzu(final int i, final int i2) {
        final zznp zznpVarZzaf = zzaf();
        zzY(zznpVarZzaf, 24, new zzeb(zznpVarZzaf, i, i2) { // from class: com.google.android.gms.internal.ads.zzoj
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzv(zznr zznrVar) {
        this.zzf.zzc(zznrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzw(zznr zznrVar) {
        this.zzf.zzd(zznrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzx(final zzbb zzbbVar, Looper looper) {
        boolean z = true;
        if (this.zzg != null && !this.zzd.zzi().isEmpty()) {
            z = false;
        }
        zzgtr.zzi(z);
        zzbbVar.getClass();
        this.zzg = zzbbVar;
        zzdp zzdpVar = this.zza;
        this.zzh = zzdpVar.zzd(looper, null);
        this.zzf = this.zzf.zza(looper, zzdpVar, new zzec() { // from class: com.google.android.gms.internal.ads.zzpr
            @Override // com.google.android.gms.internal.ads.zzec
            public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                this.zza.zzab(zzbbVar, (zznr) obj, zzsVar);
            }
        });
    }

    private final zznp zzad(zzxl zzxlVar) {
        this.zzg.getClass();
        zzbf zzbfVarZze = zzxlVar == null ? null : this.zzd.zze(zzxlVar);
        if (zzxlVar != null && zzbfVarZze != null) {
            return zzaa(zzbfVarZze, zzbfVarZze.zzo(zzxlVar.zza, this.zzb).zzc, zzxlVar);
        }
        int iZzs = this.zzg.zzs();
        zzbf zzbfVarZzq = this.zzg.zzq();
        if (iZzs >= zzbfVarZzq.zza()) {
            zzbfVarZzq = zzbf.zza;
        }
        return zzaa(zzbfVarZzq, iZzs, null);
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzy() {
        zzea zzeaVar = this.zzh;
        zzeaVar.getClass();
        zzeaVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzns
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzac();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzz(List list, zzxl zzxlVar) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        this.zzd.zzh(list, zzxlVar, zzbbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzb(zzbf zzbfVar, final int i) {
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        this.zzd.zzg(zzbbVar);
        final zznp zznpVarZzZ = zzZ();
        zzY(zznpVarZzZ, 0, new zzeb(zznpVarZzZ, i) { // from class: com.google.android.gms.internal.ads.zzoq
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaz
    public final void zzo(final zzba zzbaVar, final zzba zzbaVar2, final int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zzps zzpsVar = this.zzd;
        zzbb zzbbVar = this.zzg;
        zzbbVar.getClass();
        zzpsVar.zzf(zzbbVar);
        final zznp zznpVarZzZ = zzZ();
        zzY(zznpVarZzZ, 11, new zzeb() { // from class: com.google.android.gms.internal.ads.zzpd
            @Override // com.google.android.gms.internal.ads.zzeb
            public final /* synthetic */ void zza(Object obj) {
                ((zznr) obj).zzde(zznpVarZzZ, zzbaVar, zzbaVar2, i);
            }
        });
    }

    public zzpt(zzdp zzdpVar) {
        zzdpVar.getClass();
        this.zza = zzdpVar;
        this.zzf = new zzeg(zzfm.zzf().getThread());
        zzbd zzbdVar = new zzbd();
        this.zzb = zzbdVar;
        this.zzc = new zzbe();
        this.zzd = new zzps(zzbdVar);
        this.zze = new SparseArray();
    }
}
