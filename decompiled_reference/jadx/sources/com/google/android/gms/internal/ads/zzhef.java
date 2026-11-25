package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhef {
    private final List zza = new ArrayList();
    private final Map zzb = new HashMap();
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzhed) it.next()).zzd(false);
        }
    }

    public final zzhef zza(zzhed zzhedVar) {
        if (zzhedVar.zzh() != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzhedVar.zzc()) {
            zzc();
        }
        zzhedVar.zzi(this);
        this.zza.add(zzhedVar);
        return this;
    }

    public final zzhek zzb() throws GeneralSecurityException {
        int i;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        List<zzhed> list = this.zza;
        ArrayList arrayList = new ArrayList(list.size());
        int i2 = 0;
        while (i2 < list.size() - 1) {
            int i3 = i2 + 1;
            if (((zzhed) list.get(i2)).zzg() == zzhee.zza && ((zzhed) list.get(i3)).zzg() != zzhee.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i2 = i3;
        }
        HashSet hashSet = new HashSet();
        byte[] bArr = null;
        Integer num = null;
        for (zzhed zzhedVar : list) {
            zzhedVar.zze();
            if (zzhedVar.zzg() == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i4 = 3;
            if (zzhedVar.zzg() == zzhee.zza) {
                int i5 = 0;
                while (true) {
                    if (i5 != 0 && !hashSet.contains(Integer.valueOf(i5))) {
                        break;
                    }
                    int i6 = zzhok.zza;
                    i5 = 0;
                    while (i5 == 0) {
                        byte[] bArrZza = zzhoc.zza(4);
                        i5 = (bArrZza[3] & 255) | ((bArrZza[0] & 255) << 24) | ((bArrZza[1] & 255) << 16) | ((bArrZza[2] & 255) << 8);
                    }
                }
                i = i5;
            } else {
                zzhedVar.zzg();
                i = 0;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                int i7 = i;
                StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 31);
                sb.append("Id ");
                sb.append(i7);
                sb.append(" is used twice in the keyset");
                throw new GeneralSecurityException(sb.toString());
            }
            hashSet.add(numValueOf);
            zzhdz zzhdzVarZzc = zzhmv.zza().zzc(zzhedVar.zzf(), true != zzhedVar.zzf().zza() ? null : numValueOf);
            zzheb zzhebVarZze = zzhedVar.zze();
            zzheb zzhebVar = zzheb.zza;
            if (!zzhebVar.equals(zzhebVarZze)) {
                if (zzheb.zzb.equals(zzhebVarZze)) {
                    i4 = 4;
                } else {
                    if (!zzheb.zzc.equals(zzhebVarZze)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i4 = 5;
                }
            }
            zzhei zzheiVar = new zzhei(zzhdzVarZzc, i4, i, zzhedVar.zzc(), false, zzhei.zza, null);
            if (zzhedVar.zzc()) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzhedVar.zze() != zzhebVar) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzheiVar);
        }
        if (num != null) {
            return zzhek.zzi(new zzhek(arrayList, this.zzb, bArr));
        }
        throw new GeneralSecurityException("No primary was set");
    }
}
