package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzich extends AbstractMap implements Serializable {
    private static final Comparator zze = new zzica();
    zzicg zza;
    int zzb;
    int zzc;
    final zzicg zzd;
    private final Comparator zzf;
    private final boolean zzg;
    private zzicc zzh;
    private zzice zzi;

    public zzich() {
        this(zze, true);
    }

    private final void zzf(zzicg zzicgVar, zzicg zzicgVar2) {
        zzicg zzicgVar3 = zzicgVar.zza;
        zzicgVar.zza = null;
        if (zzicgVar2 != null) {
            zzicgVar2.zza = zzicgVar3;
        }
        if (zzicgVar3 == null) {
            this.zza = zzicgVar2;
        } else if (zzicgVar3.zzb == zzicgVar) {
            zzicgVar3.zzb = zzicgVar2;
        } else {
            zzicgVar3.zzc = zzicgVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0080 A[SYNTHETIC] */
    private final void zzg(zzicg zzicgVar, boolean z) {
        while (zzicgVar != null) {
            zzicg zzicgVar2 = zzicgVar.zzb;
            zzicg zzicgVar3 = zzicgVar.zzc;
            boolean z2 = false;
            int i = zzicgVar2 != null ? zzicgVar2.zzi : 0;
            int i2 = zzicgVar3 != null ? zzicgVar3.zzi : 0;
            int i3 = i - i2;
            boolean z3 = true;
            if (i3 == -2) {
                zzicg zzicgVar4 = zzicgVar3.zzb;
                zzicg zzicgVar5 = zzicgVar3.zzc;
                int i4 = (zzicgVar4 != null ? zzicgVar4.zzi : 0) - (zzicgVar5 != null ? zzicgVar5.zzi : 0);
                if (i4 != -1) {
                    if (i4 == 0) {
                        if (!z) {
                        }
                        if (z3) {
                            return;
                        }
                    } else {
                        z3 = z;
                    }
                    zzi(zzicgVar3);
                    zzh(zzicgVar);
                    if (z3) {
                        return;
                    }
                } else {
                    z2 = z;
                }
                zzh(zzicgVar);
                z3 = z2;
                if (z3) {
                    return;
                }
            } else if (i3 == 2) {
                zzicg zzicgVar6 = zzicgVar2.zzb;
                zzicg zzicgVar7 = zzicgVar2.zzc;
                int i5 = (zzicgVar6 != null ? zzicgVar6.zzi : 0) - (zzicgVar7 != null ? zzicgVar7.zzi : 0);
                if (i5 != 1) {
                    if (i5 == 0) {
                        if (!z) {
                        }
                        if (z3) {
                            return;
                        }
                    } else {
                        z3 = z;
                    }
                    zzh(zzicgVar2);
                    zzi(zzicgVar);
                    if (z3) {
                        return;
                    }
                } else {
                    z2 = z;
                }
                zzi(zzicgVar);
                z3 = z2;
                if (z3) {
                    return;
                }
            } else if (i3 == 0) {
                zzicgVar.zzi = i + 1;
                if (z) {
                    return;
                }
            } else {
                zzicgVar.zzi = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            zzicgVar = zzicgVar.zza;
        }
    }

    private final void zzh(zzicg zzicgVar) {
        zzicg zzicgVar2 = zzicgVar.zzb;
        zzicg zzicgVar3 = zzicgVar.zzc;
        zzicg zzicgVar4 = zzicgVar3.zzb;
        zzicg zzicgVar5 = zzicgVar3.zzc;
        zzicgVar.zzc = zzicgVar4;
        if (zzicgVar4 != null) {
            zzicgVar4.zza = zzicgVar;
        }
        zzf(zzicgVar, zzicgVar3);
        zzicgVar3.zzb = zzicgVar;
        zzicgVar.zza = zzicgVar3;
        int iMax = Math.max(zzicgVar2 != null ? zzicgVar2.zzi : 0, zzicgVar4 != null ? zzicgVar4.zzi : 0) + 1;
        zzicgVar.zzi = iMax;
        zzicgVar3.zzi = Math.max(iMax, zzicgVar5 != null ? zzicgVar5.zzi : 0) + 1;
    }

    private final void zzi(zzicg zzicgVar) {
        zzicg zzicgVar2 = zzicgVar.zzb;
        zzicg zzicgVar3 = zzicgVar.zzc;
        zzicg zzicgVar4 = zzicgVar2.zzb;
        zzicg zzicgVar5 = zzicgVar2.zzc;
        zzicgVar.zzb = zzicgVar5;
        if (zzicgVar5 != null) {
            zzicgVar5.zza = zzicgVar;
        }
        zzf(zzicgVar, zzicgVar2);
        zzicgVar2.zzc = zzicgVar;
        zzicgVar.zza = zzicgVar2;
        int iMax = Math.max(zzicgVar3 != null ? zzicgVar3.zzi : 0, zzicgVar5 != null ? zzicgVar5.zzi : 0) + 1;
        zzicgVar.zzi = iMax;
        zzicgVar2.zzi = Math.max(iMax, zzicgVar4 != null ? zzicgVar4.zzi : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zza = null;
        this.zzb = 0;
        this.zzc++;
        zzicg zzicgVar = this.zzd;
        zzicgVar.zze = zzicgVar;
        zzicgVar.zzd = zzicgVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzb(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzicc zziccVar = this.zzh;
        if (zziccVar != null) {
            return zziccVar;
        }
        zzicc zziccVar2 = new zzicc(this);
        this.zzh = zziccVar2;
        return zziccVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzicg zzicgVarZzb = zzb(obj);
        if (zzicgVarZzb != null) {
            return zzicgVarZzb.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzice zziceVar = this.zzi;
        if (zziceVar != null) {
            return zziceVar;
        }
        zzice zziceVar2 = new zzice(this);
        this.zzi = zziceVar2;
        return zziceVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        zzicg zzicgVarZza = zza(obj, true);
        Object obj3 = zzicgVarZza.zzh;
        zzicgVarZza.zzh = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzicg zzicgVarZze = zze(obj);
        if (zzicgVarZze != null) {
            return zzicgVarZze.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb;
    }

    final zzicg zza(Object obj, boolean z) {
        int iCompareTo;
        zzicg zzicgVar;
        Comparator comparator = this.zzf;
        zzicg zzicgVar2 = this.zza;
        if (zzicgVar2 != null) {
            Comparable comparable = comparator == zze ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(zzicgVar2.zzf) : comparator.compare(obj, zzicgVar2.zzf);
                if (iCompareTo == 0) {
                    return zzicgVar2;
                }
                zzicg zzicgVar3 = iCompareTo < 0 ? zzicgVar2.zzb : zzicgVar2.zzc;
                if (zzicgVar3 == null) {
                    break;
                }
                zzicgVar2 = zzicgVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i = iCompareTo;
        if (!z) {
            return null;
        }
        zzicg zzicgVar4 = this.zzd;
        if (zzicgVar2 != null) {
            zzicg zzicgVar5 = zzicgVar2;
            zzicgVar = new zzicg(this.zzg, zzicgVar5, obj, zzicgVar4, zzicgVar4.zze);
            if (i < 0) {
                zzicgVar5.zzb = zzicgVar;
            } else {
                zzicgVar5.zzc = zzicgVar;
            }
            zzg(zzicgVar5, true);
        } else {
            if (comparator == zze && !(obj instanceof Comparable)) {
                String name = obj.getClass().getName();
                String.valueOf(name);
                throw new ClassCastException(String.valueOf(name).concat(" is not Comparable"));
            }
            zzicgVar = new zzicg(this.zzg, null, obj, zzicgVar4, zzicgVar4.zze);
            this.zza = zzicgVar;
        }
        this.zzb++;
        this.zzc++;
        return zzicgVar;
    }

    final zzicg zzb(Object obj) {
        if (obj != null) {
            try {
                return zza(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    final zzicg zzc(Map.Entry entry) {
        zzicg zzicgVarZzb = zzb(entry.getKey());
        if (zzicgVarZzb == null || !Objects.equals(zzicgVarZzb.zzh, entry.getValue())) {
            return null;
        }
        return zzicgVarZzb;
    }

    final void zzd(zzicg zzicgVar, boolean z) {
        zzicg zzicgVar2;
        zzicg zzicgVar3;
        int i;
        if (z) {
            zzicg zzicgVar4 = zzicgVar.zze;
            zzicgVar4.zzd = zzicgVar.zzd;
            zzicgVar.zzd.zze = zzicgVar4;
        }
        zzicg zzicgVar5 = zzicgVar.zzb;
        zzicg zzicgVar6 = zzicgVar.zzc;
        zzicg zzicgVar7 = zzicgVar.zza;
        int i2 = 0;
        if (zzicgVar5 == null || zzicgVar6 == null) {
            if (zzicgVar5 != null) {
                zzf(zzicgVar, zzicgVar5);
                zzicgVar.zzb = null;
            } else if (zzicgVar6 != null) {
                zzf(zzicgVar, zzicgVar6);
                zzicgVar.zzc = null;
            } else {
                zzf(zzicgVar, null);
            }
            zzg(zzicgVar7, false);
            this.zzb--;
            this.zzc++;
            return;
        }
        if (zzicgVar5.zzi > zzicgVar6.zzi) {
            do {
                zzicgVar3 = zzicgVar5;
                zzicgVar5 = zzicgVar5.zzc;
            } while (zzicgVar5 != null);
        } else {
            do {
                zzicgVar2 = zzicgVar6;
                zzicgVar6 = zzicgVar6.zzb;
            } while (zzicgVar6 != null);
            zzicgVar3 = zzicgVar2;
        }
        zzd(zzicgVar3, false);
        zzicg zzicgVar8 = zzicgVar.zzb;
        if (zzicgVar8 != null) {
            i = zzicgVar8.zzi;
            zzicgVar3.zzb = zzicgVar8;
            zzicgVar8.zza = zzicgVar3;
            zzicgVar.zzb = null;
        } else {
            i = 0;
        }
        zzicg zzicgVar9 = zzicgVar.zzc;
        if (zzicgVar9 != null) {
            i2 = zzicgVar9.zzi;
            zzicgVar3.zzc = zzicgVar9;
            zzicgVar9.zza = zzicgVar3;
            zzicgVar.zzc = null;
        }
        zzicgVar3.zzi = Math.max(i, i2) + 1;
        zzf(zzicgVar, zzicgVar3);
    }

    final zzicg zze(Object obj) {
        zzicg zzicgVarZzb = zzb(obj);
        if (zzicgVarZzb != null) {
            zzd(zzicgVarZzb, true);
        }
        return zzicgVarZzb;
    }

    public zzich(Comparator comparator, boolean z) {
        this.zzb = 0;
        this.zzc = 0;
        this.zzf = comparator;
        this.zzg = z;
        this.zzd = new zzicg(z);
    }

    public zzich(boolean z) {
        this(zze, false);
    }
}
