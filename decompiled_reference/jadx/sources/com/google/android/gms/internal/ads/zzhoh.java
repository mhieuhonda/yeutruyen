package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhoh {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    /* synthetic */ zzhoh(zzhoe zzhoeVar, byte[] bArr) {
        this.zza = new HashMap(zzhoeVar.zze());
        this.zzb = new HashMap(zzhoeVar.zzf());
        this.zzc = new HashMap(zzhoeVar.zzg());
        this.zzd = new HashMap(zzhoeVar.zzh());
    }

    public final boolean zza(zzhod zzhodVar) {
        return this.zzb.containsKey(new zzhof(zzhodVar.getClass(), zzhodVar.zzf(), null));
    }

    public final zzhdz zzb(zzhod zzhodVar, @Nullable zzhey zzheyVar) throws GeneralSecurityException {
        zzhof zzhofVar = new zzhof(zzhodVar.getClass(), zzhodVar.zzf(), null);
        Map map = this.zzb;
        if (map.containsKey(zzhofVar)) {
            return ((zzhme) map.get(zzhofVar)).zza(zzhodVar, zzheyVar);
        }
        String string = zzhofVar.toString();
        StringBuilder sb = new StringBuilder(string.length() + 47);
        sb.append("No Key Parser for requested key type ");
        sb.append(string);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final zzhod zzc(zzhdz zzhdzVar, Class cls, @Nullable zzhey zzheyVar) throws GeneralSecurityException {
        zzhog zzhogVar = new zzhog(zzhdzVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzhogVar)) {
            return ((zzhmh) map.get(zzhogVar)).zza(zzhdzVar, zzheyVar);
        }
        String string = zzhogVar.toString();
        StringBuilder sb = new StringBuilder(string.length() + 32);
        sb.append("No Key serializer for ");
        sb.append(string);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final boolean zzd(zzhod zzhodVar) {
        return this.zzd.containsKey(new zzhof(zzhodVar.getClass(), zzhodVar.zzf(), null));
    }

    public final zzheq zze(zzhod zzhodVar) throws GeneralSecurityException {
        zzhof zzhofVar = new zzhof(zzhodVar.getClass(), zzhodVar.zzf(), null);
        Map map = this.zzd;
        if (map.containsKey(zzhofVar)) {
            return ((zzhni) map.get(zzhofVar)).zza(zzhodVar);
        }
        String string = zzhofVar.toString();
        StringBuilder sb = new StringBuilder(string.length() + 54);
        sb.append("No Parameters Parser for requested key type ");
        sb.append(string);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    public final zzhod zzf(zzheq zzheqVar, Class cls) throws GeneralSecurityException {
        zzhog zzhogVar = new zzhog(zzheqVar.getClass(), cls, null);
        Map map = this.zzc;
        if (map.containsKey(zzhogVar)) {
            return ((zzhnl) map.get(zzhogVar)).zza(zzheqVar);
        }
        String string = zzhogVar.toString();
        StringBuilder sb = new StringBuilder(string.length() + 39);
        sb.append("No Key Format serializer for ");
        sb.append(string);
        sb.append(" available");
        throw new GeneralSecurityException(sb.toString());
    }

    final /* synthetic */ Map zzg() {
        return this.zza;
    }

    final /* synthetic */ Map zzh() {
        return this.zzb;
    }

    final /* synthetic */ Map zzi() {
        return this.zzc;
    }

    final /* synthetic */ Map zzj() {
        return this.zzd;
    }
}
