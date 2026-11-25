package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdvu extends zzcya {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdnw zze;
    private final zzdkk zzf;
    private final zzddm zzg;
    private final zzdet zzh;
    private final zzcyv zzi;
    private final zzccm zzj;
    private final zzfya zzk;
    private final zzfla zzl;
    private final zzdzt zzm;
    private boolean zzn;

    zzdvu(zzcxz zzcxzVar, Context context, zzclb zzclbVar, zzdnw zzdnwVar, zzdkk zzdkkVar, zzddm zzddmVar, zzdet zzdetVar, zzcyv zzcyvVar, zzfkn zzfknVar, zzfya zzfyaVar, zzfla zzflaVar, zzdzt zzdztVar) {
        super(zzcxzVar);
        this.zzn = false;
        this.zzc = context;
        this.zze = zzdnwVar;
        this.zzd = new WeakReference(zzclbVar);
        this.zzf = zzdkkVar;
        this.zzg = zzddmVar;
        this.zzh = zzdetVar;
        this.zzi = zzcyvVar;
        this.zzk = zzfyaVar;
        zzcci zzcciVar = zzfknVar.zzl;
        this.zzj = new zzcdg(zzcciVar != null ? zzcciVar.zza : "", zzcciVar != null ? zzcciVar.zzb : 1);
        this.zzl = zzflaVar;
        this.zzm = zzdztVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzclb zzclbVar = (zzclb) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhM)).booleanValue()) {
                if (!this.zzn && zzclbVar != null) {
                    zzhcp zzhcpVar = zzcfy.zzf;
                    Objects.requireNonNull(zzclbVar);
                    zzhcpVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvt
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzclbVar.destroy();
                        }
                    });
                }
            } else if (zzclbVar != null) {
                zzclbVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean zza(boolean z, Activity activity) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdnw zzdnwVar = this.zze;
        if (!com.google.android.gms.ads.internal.util.zzs.zzR(zzdnwVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpn)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzQ(this.zzc, this.zzb, this.zzm);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbs)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc)) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzg.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbt)).booleanValue()) {
                        this.zzk.zza(this.zza.zzb.zzb.zzb);
                    }
                    return false;
                }
            }
        }
        if (this.zzn) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The rewarded ad have been showed.");
            this.zzg.zzc(zzfmi.zzd(10, null, null));
            return false;
        }
        this.zzn = true;
        zzdkk zzdkkVar = this.zzf;
        zzdkkVar.zza();
        Context context = activity;
        if (activity == null) {
            context = this.zzc;
        }
        try {
            zzdnwVar.zza(z, context, this.zzg);
            zzdkkVar.zzb();
            return true;
        } catch (zzdnv e) {
            this.zzg.zzd(e);
            return false;
        }
    }

    public final boolean zzb() {
        return this.zzn;
    }

    public final zzccm zzc() {
        return this.zzj;
    }

    public final boolean zze() {
        return this.zzi.zzl();
    }

    public final boolean zzf() {
        zzclb zzclbVar = (zzclb) this.zzd.get();
        return (zzclbVar == null || zzclbVar.zzaB()) ? false : true;
    }

    public final Bundle zzg() {
        return this.zzh.zzb();
    }

    public final zzfla zzh() {
        return this.zzl;
    }
}
