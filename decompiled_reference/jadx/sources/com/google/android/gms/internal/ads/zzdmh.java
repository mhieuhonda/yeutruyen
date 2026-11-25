package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdmh extends zzcya {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdkk zze;
    private final zzdnw zzf;
    private final zzcyv zzg;
    private final zzfya zzh;
    private final zzddm zzi;
    private final zzcfp zzj;
    private final zzdzt zzk;
    private boolean zzl;

    zzdmh(zzcxz zzcxzVar, Context context, @Nullable zzclb zzclbVar, zzdkk zzdkkVar, zzdnw zzdnwVar, zzcyv zzcyvVar, zzfya zzfyaVar, zzddm zzddmVar, zzcfp zzcfpVar, zzdzt zzdztVar) {
        super(zzcxzVar);
        this.zzl = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzclbVar);
        this.zze = zzdkkVar;
        this.zzf = zzdnwVar;
        this.zzg = zzcyvVar;
        this.zzh = zzfyaVar;
        this.zzi = zzddmVar;
        this.zzj = zzcfpVar;
        this.zzk = zzdztVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzclb zzclbVar = (zzclb) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhM)).booleanValue()) {
                if (!this.zzl && zzclbVar != null) {
                    zzhcp zzhcpVar = zzcfy.zzf;
                    Objects.requireNonNull(zzclbVar);
                    zzhcpVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmg
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

    /* JADX WARN: Code duplicated, block: B:14:0x007d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0098 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:24:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00df  */
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
    public final boolean zza(boolean z, @Nullable Activity activity) {
        Context context;
        zzfkn zzfknVarZzC;
        zzdkk zzdkkVar = this.zze;
        zzdkkVar.zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdnw zzdnwVar = this.zzf;
        if (com.google.android.gms.ads.internal.util.zzs.zzR(zzdnwVar.zzb())) {
            zzclb zzclbVar = (zzclb) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznC)).booleanValue()) {
                if (this.zzl) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                    this.zzi.zzc(zzfmi.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzl) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    zzdnwVar.zza(z, context, this.zzi);
                    zzdkkVar.zzb();
                    this.zzl = true;
                    return true;
                }
            } else {
                if (this.zzl) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                    this.zzi.zzc(zzfmi.zzd(10, null, null));
                }
                context = activity;
                if (!this.zzl) {
                    if (activity == null) {
                        context = this.zzc;
                    }
                    zzdnwVar.zza(z, context, this.zzi);
                    zzdkkVar.zzb();
                    this.zzl = true;
                    return true;
                }
            }
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpn)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzQ(this.zzc, this.zzb, this.zzk);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbs)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc)) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbt)).booleanValue()) {
                        this.zzh.zza(this.zza.zzb.zzb.zzb);
                    }
                } else {
                    zzclb zzclbVar2 = (zzclb) this.zzd.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznC)).booleanValue() || zzclbVar2 == null || (zzfknVarZzC = zzclbVar2.zzC()) == null || !zzfknVarZzC.zzar || zzfknVarZzC.zzas == this.zzj.zzj()) {
                        if (this.zzl) {
                            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                            this.zzi.zzc(zzfmi.zzd(10, null, null));
                        }
                        context = activity;
                        if (!this.zzl) {
                            if (activity == null) {
                                context = this.zzc;
                            }
                            try {
                                zzdnwVar.zza(z, context, this.zzi);
                                zzdkkVar.zzb();
                                this.zzl = true;
                                return true;
                            } catch (zzdnv e) {
                                this.zzi.zzd(e);
                            }
                        }
                    } else {
                        int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial consent form has been shown.");
                        this.zzi.zzc(zzfmi.zzd(12, "The consent form has already been shown.", null));
                    }
                }
            } else {
                zzclb zzclbVar3 = (zzclb) this.zzd.get();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznC)).booleanValue()) {
                    if (this.zzl) {
                        int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                        this.zzi.zzc(zzfmi.zzd(10, null, null));
                    }
                    context = activity;
                    if (!this.zzl) {
                        if (activity == null) {
                            context = this.zzc;
                        }
                        zzdnwVar.zza(z, context, this.zzi);
                        zzdkkVar.zzb();
                        this.zzl = true;
                        return true;
                    }
                } else {
                    if (this.zzl) {
                        int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                        this.zzi.zzc(zzfmi.zzd(10, null, null));
                    }
                    context = activity;
                    if (!this.zzl) {
                        if (activity == null) {
                            context = this.zzc;
                        }
                        zzdnwVar.zza(z, context, this.zzi);
                        zzdkkVar.zzb();
                        this.zzl = true;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean zzb() {
        return this.zzg.zzl();
    }
}
