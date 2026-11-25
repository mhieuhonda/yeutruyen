package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcvm extends zzcya {
    private final zzclb zzc;
    private final int zzd;
    private final Context zze;
    private final zzcva zzf;
    private final zzdnw zzg;
    private final zzdkk zzh;
    private final zzddm zzi;
    private final boolean zzj;
    private final zzcfp zzk;
    private final zzdzt zzl;
    private boolean zzm;

    zzcvm(zzcxz zzcxzVar, Context context, zzclb zzclbVar, int i, zzcva zzcvaVar, zzdnw zzdnwVar, zzdkk zzdkkVar, zzddm zzddmVar, zzcfp zzcfpVar, zzdzt zzdztVar) {
        super(zzcxzVar);
        this.zzm = false;
        this.zzc = zzclbVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcvaVar;
        this.zzg = zzdnwVar;
        this.zzh = zzdkkVar;
        this.zzi = zzddmVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgB)).booleanValue();
        this.zzk = zzcfpVar;
        this.zzl = zzdztVar;
    }

    public final void zza(zzbgk zzbgkVar) {
        zzclb zzclbVar = this.zzc;
        if (zzclbVar != null) {
            zzclbVar.zzay(zzbgkVar);
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
    public final void zzb(Activity activity, zzbgx zzbgxVar, boolean z) throws RemoteException {
        zzclb zzclbVar;
        zzfkn zzfknVarZzC;
        Context context = activity;
        if (activity == null) {
            context = this.zze;
        }
        boolean z2 = this.zzj;
        if (z2) {
            this.zzh.zza();
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdnw zzdnwVar = this.zzg;
        if (!com.google.android.gms.ads.internal.util.zzs.zzR(zzdnwVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpn)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzQ(context, this.zzb, this.zzl);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbs)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzJ(context)) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbt)).booleanValue()) {
                        new zzfya(context.getApplicationContext(), com.google.android.gms.ads.internal.zzt.zzs().zza()).zza(this.zza.zzb.zzb.zzb);
                        return;
                    }
                    return;
                }
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznC)).booleanValue() && (zzclbVar = this.zzc) != null && (zzfknVarZzC = zzclbVar.zzC()) != null && zzfknVarZzC.zzar && zzfknVarZzC.zzas != this.zzk.zzj()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The app open consent form has been shown.");
            this.zzi.zzc(zzfmi.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.zzm) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App open interstitial ad is already visible.");
            this.zzi.zzc(zzfmi.zzd(10, null, null));
        }
        if (this.zzm) {
            return;
        }
        try {
            zzdnwVar.zza(z, context, this.zzi);
            if (z2) {
                this.zzh.zzb();
            }
            this.zzm = true;
        } catch (zzdnv e) {
            this.zzi.zzd(e);
        }
    }

    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzd() {
        super.zzd();
        zzclb zzclbVar = this.zzc;
        if (zzclbVar != null) {
            zzclbVar.destroy();
        }
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}
