package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhek implements zzhel {
    private final List zza;
    private final Map zzb;

    @Nullable
    private final zzhek zzc;

    private zzhek(List list, Map map) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = map;
        if (zzhlc.zza.zza()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean zZzd = false;
            while (it.hasNext()) {
                zzhei zzheiVar = (zzhei) it.next();
                if (hashSet.contains(Integer.valueOf(zzheiVar.zzc()))) {
                    int iZzc = zzheiVar.zzc();
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzc).length() + 121);
                    sb.append("KeyID ");
                    sb.append(iZzc);
                    sb.append(" is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                    throw new GeneralSecurityException(sb.toString());
                }
                hashSet.add(Integer.valueOf(zzheiVar.zzc()));
                zZzd |= zzheiVar.zzd();
            }
            if (!zZzd) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }

    private zzhek(List list, Map map, zzhek zzhekVar) {
        this.zza = list;
        this.zzb = map;
        this.zzc = zzhekVar;
    }

    /* synthetic */ zzhek(List list, Map map, byte[] bArr) {
        this(list, map);
    }

    static final zzhek zza(zzhtk zzhtkVar) throws GeneralSecurityException {
        if (zzhtkVar == null || zzhtkVar.zzc() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzhek(zzj(zzhtkVar), new HashMap());
    }

    public static final zzhek zzg(zzheq zzheqVar) throws GeneralSecurityException {
        zzhef zzhefVar = new zzhef();
        zzhed zzhedVar = new zzhed(zzheqVar, null);
        zzhedVar.zzb();
        zzhedVar.zza();
        zzhefVar.zza(zzhedVar);
        return zzhefVar.zzb();
    }

    static /* synthetic */ zzhek zzi(final zzhek zzhekVar) {
        final zzhmp zzhmpVar = (zzhmp) zzhekVar.zzf(zzhmp.class);
        if (zzhmpVar == null) {
            return zzhekVar;
        }
        zzheg zzhegVar = new zzheg() { // from class: com.google.android.gms.internal.ads.zzhej
            @Override // com.google.android.gms.internal.ads.zzheg
            public final /* synthetic */ void zza(zzhei zzheiVar) {
                zzhmz.zza().zzb().zza(this.zza, zzhmpVar, "keyset_handle", "get_key");
            }
        };
        List<zzhei> list = zzhekVar.zza;
        ArrayList arrayList = new ArrayList(list.size());
        for (zzhei zzheiVar : list) {
            arrayList.add(new zzhei(zzheiVar.zzf(), zzheiVar.zzj(), zzheiVar.zzg(), zzheiVar.zzh(), zzheiVar.zzi(), zzhegVar, null));
        }
        return new zzhek(arrayList, zzhekVar.zzb, zzhekVar);
    }

    private static List zzj(zzhtk zzhtkVar) throws GeneralSecurityException {
        zzhdz zzhmmVar;
        boolean z;
        ArrayList arrayList = new ArrayList(zzhtkVar.zzc());
        for (zzhtj zzhtjVar : zzhtkVar.zzb()) {
            int iZzc = zzhtjVar.zzc();
            try {
                zzhnz zzhnzVarZzl = zzl(zzhtjVar);
                zzhne zzhneVarZza = zzhne.zza();
                zzhey zzheyVarZza = zzhey.zza();
                zzhmmVar = !zzhneVarZza.zzf(zzhnzVarZzl) ? new zzhmm(zzhnzVarZzl, zzheyVarZza) : zzhneVarZza.zzg(zzhnzVarZzl, zzheyVarZza);
                z = false;
            } catch (GeneralSecurityException e) {
                if (zzhlc.zza.zza()) {
                    throw e;
                }
                zzhmmVar = new zzhmm(zzl(zzhtjVar), zzhey.zza());
                z = true;
            }
            if (zzhlc.zza.zza() && !zzm(zzhtjVar.zzk())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z2 = false;
            int iZzk = zzhtjVar.zzk();
            if (iZzc == zzhtkVar.zza()) {
                z2 = true;
            }
            arrayList.add(new zzhei(zzhmmVar, iZzk, iZzc, z2, z, zzhei.zza, null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final zzhek zzk() {
        zzhek zzhekVar = this.zzc;
        return zzhekVar == null ? this : zzhekVar;
    }

    private static zzhnz zzl(zzhtj zzhtjVar) throws GeneralSecurityException {
        return zzhnz.zza(zzhtjVar.zzb().zza(), zzhtjVar.zzb().zzb(), zzhtjVar.zzb().zzc(), zzhtjVar.zzd(), zzhtjVar.zzd() == zzhtx.RAW ? null : Integer.valueOf(zzhtjVar.zzc()));
    }

    private static boolean zzm(int i) {
        int i2 = i - 2;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public final String toString() {
        zzhtk zzhtkVarZzb = zzb();
        int i = zzhfb.zza;
        zzhtl zzhtlVarZza = zzhto.zza();
        zzhtlVarZza.zza(zzhtkVarZzb.zza());
        for (zzhtj zzhtjVar : zzhtkVarZzb.zzb()) {
            zzhtm zzhtmVarZza = zzhtn.zza();
            zzhtmVarZza.zza(zzhtjVar.zzb().zza());
            zzhtmVarZza.zzd(zzhtjVar.zzk());
            zzhtmVarZza.zzc(zzhtjVar.zzd());
            zzhtmVarZza.zzb(zzhtjVar.zzc());
            zzhtlVarZza.zzb((zzhtn) zzhtmVarZza.zzbu());
        }
        return ((zzhto) zzhtlVarZza.zzbu()).toString();
    }

    final zzhtk zzb() {
        try {
            zzhth zzhthVarZzh = zzhtk.zzh();
            for (zzhei zzheiVar : this.zza) {
                zzhdz zzhdzVarZza = zzheiVar.zza();
                int iZzj = zzheiVar.zzj();
                int iZzc = zzheiVar.zzc();
                zzhnz zzhnzVar = (zzhnz) zzhne.zza().zzh(zzhdzVarZza, zzhnz.class, zzhey.zza());
                Integer numZzb = zzhdzVarZza.zzb();
                if (numZzb != null && numZzb.intValue() != iZzc) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                zzhti zzhtiVarZze = zzhtj.zze();
                zzhsz zzhszVarZzd = zzhtb.zzd();
                zzhszVarZzd.zza(zzhnzVar.zzg());
                zzhszVarZzd.zzb(zzhnzVar.zzb());
                zzhszVarZzd.zzc(zzhnzVar.zzc());
                zzhtiVarZze.zzb(zzhszVarZzd);
                zzhtiVarZze.zze(iZzj);
                zzhtiVarZze.zzc(iZzc);
                zzhtiVarZze.zzd(zzhnzVar.zzd());
                zzhthVarZzh.zzb((zzhtj) zzhtiVarZze.zzbu());
                if (zzheiVar.zzd()) {
                    zzhthVarZzh.zza(zzheiVar.zzc());
                }
            }
            return (zzhtk) zzhthVarZzh.zzbu();
        } catch (GeneralSecurityException e) {
            throw new zzhoj(e);
        }
    }

    public final zzhei zzc() {
        for (zzhei zzheiVar : this.zza) {
            if (zzheiVar != null && zzheiVar.zzd()) {
                if (zzheiVar.zzb() == zzheb.zza) {
                    return zzheiVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    @Override // com.google.android.gms.internal.ads.zzhel
    public final int zzd() {
        return this.zza.size();
    }

    public final zzhei zze(int i) {
        if (i < 0 || i >= zzd()) {
            int iZzd = zzd();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 34 + String.valueOf(iZzd).length());
            sb.append("Invalid index ");
            sb.append(i);
            sb.append(" for keyset of size ");
            sb.append(iZzd);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        List list = this.zza;
        zzhei zzheiVar = (zzhei) list.get(i);
        if (!zzm(zzheiVar.zzj())) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 42);
            sb2.append("Keyset-Entry at position ");
            sb2.append(i);
            sb2.append(" has wrong status");
            throw new IllegalStateException(sb2.toString());
        }
        if (!zzheiVar.zzi()) {
            return (zzhei) list.get(i);
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i).length() + 48);
        sb3.append("Keyset-Entry at position ");
        sb3.append(i);
        sb3.append(" didn't parse correctly");
        throw new IllegalStateException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhel
    @Nullable
    public final zzhds zzf(Class cls) {
        return (zzhds) this.zzb.get(cls);
    }

    public final Object zzh(zzhdw zzhdwVar, Class cls) throws GeneralSecurityException {
        zzhtk zzhtkVarZzb = zzk().zzb();
        int i = zzhfb.zza;
        int iZza = zzhtkVarZzb.zza();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzhtj zzhtjVar : zzhtkVarZzb.zzb()) {
            if (zzhtjVar.zzk() == 3) {
                if (!zzhtjVar.zza()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzhtjVar.zzc())));
                }
                if (zzhtjVar.zzd() == zzhtx.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzhtjVar.zzc())));
                }
                if (zzhtjVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzhtjVar.zzc())));
                }
                if (zzhtjVar.zzc() == iZza) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= zzhtjVar.zzb().zzc() == zzhta.ASYMMETRIC_PUBLIC;
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i3 = 0; i3 < zzd(); i3++) {
            List list = this.zza;
            if (((zzhei) list.get(i3)).zzi() || !zzm(((zzhei) list.get(i3)).zzj())) {
                String strZza = zzhtkVarZzb.zzd(i3).zzb().zza();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 44 + String.valueOf(strZza).length() + 32);
                sb.append("Key parsing of key with index ");
                sb.append(i3);
                sb.append(" and type_url ");
                sb.append(strZza);
                sb.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhdwVar.zza(zzk(), cls);
    }
}
