package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzidq implements zzigm {
    private final zzidp zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzidq(zzidp zzidpVar) {
        zzidpVar.getClass();
        this.zza = zzidpVar;
        zzidpVar.zzd = this;
    }

    private final void zzQ(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw new zzifg("Protocol message tag had invalid wire type.");
        }
    }

    private final void zzR(Object obj, zzigr zzigrVar, zzidz zzidzVar) throws IOException {
        zzidp zzidpVar = this.zza;
        int iZzo = zzidpVar.zzo();
        zzidpVar.zzJ();
        int iZzB = zzidpVar.zzB(iZzo);
        zzidpVar.zza++;
        zzigrVar.zzg(obj, this, zzidzVar);
        zzidpVar.zzb(0);
        zzidpVar.zza--;
        zzidpVar.zzC(iZzB);
    }

    private final Object zzS(zzigr zzigrVar, zzidz zzidzVar) throws IOException {
        Object objZza = zzigrVar.zza();
        zzR(objZza, zzigrVar, zzidzVar);
        zzigrVar.zzk(objZza);
        return objZza;
    }

    private final void zzT(Object obj, zzigr zzigrVar, zzidz zzidzVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzigrVar.zzg(obj, this, zzidzVar);
            if (this.zzb != this.zzc) {
                throw new zzifh("Failed to parse the message.");
            }
            this.zzc = i;
        } catch (Throwable th) {
            this.zzc = i;
            throw th;
        }
    }

    private final Object zzU(zzihq zzihqVar, Class cls, zzidz zzidzVar) throws IOException {
        zzihq zzihqVar2 = zzihq.DOUBLE;
        switch (zzihqVar) {
            case DOUBLE:
                return Double.valueOf(zze());
            case FLOAT:
                return Float.valueOf(zzf());
            case INT64:
                return Long.valueOf(zzh());
            case UINT64:
                return Long.valueOf(zzg());
            case INT32:
                return Integer.valueOf(zzi());
            case FIXED64:
                return Long.valueOf(zzj());
            case FIXED32:
                return Integer.valueOf(zzk());
            case BOOL:
                return Boolean.valueOf(zzl());
            case STRING:
                return zzn();
            case GROUP:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case MESSAGE:
                zzQ(2);
                return zzS(zzigj.zza().zzb(cls), zzidzVar);
            case BYTES:
                return zzq();
            case UINT32:
                return Integer.valueOf(zzr());
            case ENUM:
                return Integer.valueOf(zzs());
            case SFIXED32:
                return Integer.valueOf(zzt());
            case SFIXED64:
                return Long.valueOf(zzu());
            case SINT32:
                return Integer.valueOf(zzv());
            case SINT64:
                return Long.valueOf(zzw());
        }
    }

    private final void zzV(int i) throws IOException {
        if (this.zza.zzE() != i) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void zzW(int i) throws IOException {
        if ((i & 3) != 0) {
            throw new zzifh("Failed to parse the message.");
        }
    }

    private static final void zzX(int i) throws IOException {
        if ((i & 7) != 0) {
            throw new zzifh("Failed to parse the message.");
        }
    }

    public static zzidq zza(zzidp zzidpVar) {
        Object obj = zzidpVar.zzd;
        return obj != null ? (zzidq) obj : new zzidq(zzidpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzA(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzE = zzidpVar.zzE() + zzidpVar.zzo();
                do {
                    zzifnVar.zzd(zzidpVar.zzg());
                } while (zzidpVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzifnVar.zzd(zzidpVar2.zzg());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzE2 = zzidpVar3.zzE() + zzidpVar3.zzo();
                do {
                    list.add(Long.valueOf(zzidpVar3.zzg()));
                } while (zzidpVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Long.valueOf(zzidpVar4.zzg()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzB(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzieq) {
            zzieq zzieqVar = (zzieq) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzE = zzidpVar.zzE() + zzidpVar.zzo();
                do {
                    zzieqVar.zzi(zzidpVar.zzh());
                } while (zzidpVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzieqVar.zzi(zzidpVar2.zzh());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzE2 = zzidpVar3.zzE() + zzidpVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzidpVar3.zzh()));
                } while (zzidpVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Integer.valueOf(zzidpVar4.zzh()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzC(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzo = zzidpVar.zzo();
                zzX(iZzo);
                int iZzE = zzidpVar.zzE() + iZzo;
                do {
                    zzifnVar.zzd(zzidpVar.zzi());
                } while (zzidpVar.zzE() < iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzifnVar.zzd(zzidpVar2.zzi());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzo2 = zzidpVar3.zzo();
                zzX(iZzo2);
                int iZzE2 = zzidpVar3.zzE() + iZzo2;
                do {
                    list.add(Long.valueOf(zzidpVar3.zzi()));
                } while (zzidpVar3.zzE() < iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Long.valueOf(zzidpVar4.zzi()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzD(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzieq) {
            zzieq zzieqVar = (zzieq) list;
            int i = this.zzb & 7;
            if (i == 2) {
                zzidp zzidpVar = this.zza;
                int iZzo = zzidpVar.zzo();
                zzW(iZzo);
                int iZzE = zzidpVar.zzE() + iZzo;
                do {
                    zzieqVar.zzi(zzidpVar.zzj());
                } while (zzidpVar.zzE() < iZzE);
                return;
            }
            if (i != 5) {
                throw new zzifg("Protocol message tag had invalid wire type.");
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzieqVar.zzi(zzidpVar2.zzj());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                zzidp zzidpVar3 = this.zza;
                int iZzo2 = zzidpVar3.zzo();
                zzW(iZzo2);
                int iZzE2 = zzidpVar3.zzE() + iZzo2;
                do {
                    list.add(Integer.valueOf(zzidpVar3.zzj()));
                } while (zzidpVar3.zzE() < iZzE2);
                return;
            }
            if (i2 != 5) {
                throw new zzifg("Protocol message tag had invalid wire type.");
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Integer.valueOf(zzidpVar4.zzj()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzE(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzidb) {
            zzidb zzidbVar = (zzidb) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzE = zzidpVar.zzE() + zzidpVar.zzo();
                do {
                    zzidbVar.zzg(zzidpVar.zzk());
                } while (zzidpVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzidbVar.zzg(zzidpVar2.zzk());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzE2 = zzidpVar3.zzE() + zzidpVar3.zzo();
                do {
                    list.add(Boolean.valueOf(zzidpVar3.zzk()));
                } while (zzidpVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Boolean.valueOf(zzidpVar4.zzk()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    public final void zzF(List list, boolean z) throws IOException {
        int iZza;
        int iZza2;
        if ((this.zzb & 7) != 2) {
            throw new zzifg("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zzifk) && !z) {
            zzifk zzifkVar = (zzifk) list;
            do {
                zzq();
                zzifkVar.zzb();
                zzidp zzidpVar = this.zza;
                if (zzidpVar.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            do {
                list.add(z ? zzn() : zzm());
                zzidp zzidpVar2 = this.zza;
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar2.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzG(List list, zzigr zzigrVar, zzidz zzidzVar) throws IOException {
        int iZza;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw new zzifg("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzS(zzigrVar, zzidzVar));
            zzidp zzidpVar = this.zza;
            if (zzidpVar.zzD() || this.zzd != 0) {
                return;
            } else {
                iZza = zzidpVar.zza();
            }
        } while (iZza == i);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    @Deprecated
    public final void zzH(List list, zzigr zzigrVar, zzidz zzidzVar) throws IOException {
        int iZza;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw new zzifg("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZza = zzigrVar.zza();
            zzT(objZza, zzigrVar, zzidzVar);
            zzigrVar.zzk(objZza);
            list.add(objZza);
            zzidp zzidpVar = this.zza;
            if (zzidpVar.zzD() || this.zzd != 0) {
                return;
            } else {
                iZza = zzidpVar.zza();
            }
        } while (iZza == i);
        this.zzd = iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzJ(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzieq) {
            zzieq zzieqVar = (zzieq) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzE = zzidpVar.zzE() + zzidpVar.zzo();
                do {
                    zzieqVar.zzi(zzidpVar.zzo());
                } while (zzidpVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzieqVar.zzi(zzidpVar2.zzo());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzE2 = zzidpVar3.zzE() + zzidpVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzidpVar3.zzo()));
                } while (zzidpVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Integer.valueOf(zzidpVar4.zzo()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzK(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzieq) {
            zzieq zzieqVar = (zzieq) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzE = zzidpVar.zzE() + zzidpVar.zzo();
                do {
                    zzieqVar.zzi(zzidpVar.zzp());
                } while (zzidpVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzieqVar.zzi(zzidpVar2.zzp());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzE2 = zzidpVar3.zzE() + zzidpVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzidpVar3.zzp()));
                } while (zzidpVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Integer.valueOf(zzidpVar4.zzp()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzL(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzieq) {
            zzieq zzieqVar = (zzieq) list;
            int i = this.zzb & 7;
            if (i == 2) {
                zzidp zzidpVar = this.zza;
                int iZzo = zzidpVar.zzo();
                zzW(iZzo);
                int iZzE = zzidpVar.zzE() + iZzo;
                do {
                    zzieqVar.zzi(zzidpVar.zzq());
                } while (zzidpVar.zzE() < iZzE);
                return;
            }
            if (i != 5) {
                throw new zzifg("Protocol message tag had invalid wire type.");
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzieqVar.zzi(zzidpVar2.zzq());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                zzidp zzidpVar3 = this.zza;
                int iZzo2 = zzidpVar3.zzo();
                zzW(iZzo2);
                int iZzE2 = zzidpVar3.zzE() + iZzo2;
                do {
                    list.add(Integer.valueOf(zzidpVar3.zzq()));
                } while (zzidpVar3.zzE() < iZzE2);
                return;
            }
            if (i2 != 5) {
                throw new zzifg("Protocol message tag had invalid wire type.");
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Integer.valueOf(zzidpVar4.zzq()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzM(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzo = zzidpVar.zzo();
                zzX(iZzo);
                int iZzE = zzidpVar.zzE() + iZzo;
                do {
                    zzifnVar.zzd(zzidpVar.zzr());
                } while (zzidpVar.zzE() < iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzifnVar.zzd(zzidpVar2.zzr());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzo2 = zzidpVar3.zzo();
                zzX(iZzo2);
                int iZzE2 = zzidpVar3.zzE() + iZzo2;
                do {
                    list.add(Long.valueOf(zzidpVar3.zzr()));
                } while (zzidpVar3.zzE() < iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Long.valueOf(zzidpVar4.zzr()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzN(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzieq) {
            zzieq zzieqVar = (zzieq) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzE = zzidpVar.zzE() + zzidpVar.zzo();
                do {
                    zzieqVar.zzi(zzidpVar.zzs());
                } while (zzidpVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzieqVar.zzi(zzidpVar2.zzs());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzE2 = zzidpVar3.zzE() + zzidpVar3.zzo();
                do {
                    list.add(Integer.valueOf(zzidpVar3.zzs()));
                } while (zzidpVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Integer.valueOf(zzidpVar4.zzs()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzO(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzE = zzidpVar.zzE() + zzidpVar.zzo();
                do {
                    zzifnVar.zzd(zzidpVar.zzt());
                } while (zzidpVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzifnVar.zzd(zzidpVar2.zzt());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzE2 = zzidpVar3.zzE() + zzidpVar3.zzo();
                do {
                    list.add(Long.valueOf(zzidpVar3.zzt()));
                } while (zzidpVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Long.valueOf(zzidpVar4.zzt()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzP(Map map, zzifr zzifrVar, zzidz zzidzVar) throws IOException {
        zzQ(2);
        zzidp zzidpVar = this.zza;
        int iZzB = zzidpVar.zzB(zzidpVar.zzo());
        Object obj = zzifrVar.zzd;
        Object objZzU = zzifrVar.zzb;
        Object objZzU2 = obj;
        while (true) {
            try {
                int iZzb = zzb();
                if (iZzb == Integer.MAX_VALUE || zzidpVar.zzD()) {
                    break;
                }
                if (iZzb == 1) {
                    objZzU = zzU(zzifrVar.zza, null, null);
                } else if (iZzb != 2) {
                    try {
                        if (!zzd()) {
                            throw new zzifh("Unable to parse map entry.");
                        }
                    } catch (zzifg e) {
                        if (!zzd()) {
                            throw new zzifh("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    objZzU2 = zzU(zzifrVar.zzc, obj.getClass(), zzidzVar);
                }
            } catch (Throwable th) {
                this.zza.zzC(iZzB);
                throw th;
            }
        }
        map.put(objZzU, objZzU2);
        this.zza.zzC(iZzB);
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final int zzb() throws IOException {
        int iZza = this.zzd;
        if (iZza != 0) {
            this.zzb = iZza;
            this.zzd = 0;
        } else {
            iZza = this.zza.zza();
            this.zzb = iZza;
        }
        if (iZza == 0 || iZza == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return iZza >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final int zzc() {
        return this.zzb;
    }

    public final boolean zzd() throws IOException {
        int i;
        zzidp zzidpVar = this.zza;
        if (zzidpVar.zzD() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return zzidpVar.zzc(i);
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final double zze() throws IOException {
        zzQ(1);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final float zzf() throws IOException {
        zzQ(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final long zzg() throws IOException {
        zzQ(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final long zzh() throws IOException {
        zzQ(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final int zzi() throws IOException {
        zzQ(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final long zzj() throws IOException {
        zzQ(1);
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final int zzk() throws IOException {
        zzQ(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final boolean zzl() throws IOException {
        zzQ(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final String zzm() throws IOException {
        zzQ(2);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final String zzn() throws IOException {
        zzQ(2);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzo(Object obj, zzigr zzigrVar, zzidz zzidzVar) throws IOException {
        zzQ(2);
        zzR(obj, zzigrVar, zzidzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzp(Object obj, zzigr zzigrVar, zzidz zzidzVar) throws IOException {
        zzQ(3);
        zzT(obj, zzigrVar, zzidzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final zzidl zzq() throws IOException {
        zzQ(2);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final int zzr() throws IOException {
        zzQ(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final int zzs() throws IOException {
        zzQ(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final int zzt() throws IOException {
        zzQ(5);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final long zzu() throws IOException {
        zzQ(1);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final int zzv() throws IOException {
        zzQ(0);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final long zzw() throws IOException {
        zzQ(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzx(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzidw) {
            zzidw zzidwVar = (zzidw) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzo = zzidpVar.zzo();
                zzX(iZzo);
                int iZzE = zzidpVar.zzE() + iZzo;
                do {
                    zzidwVar.zzg(zzidpVar.zzd());
                } while (zzidpVar.zzE() < iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzidwVar.zzg(zzidpVar2.zzd());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzo2 = zzidpVar3.zzo();
                zzX(iZzo2);
                int iZzE2 = zzidpVar3.zzE() + iZzo2;
                do {
                    list.add(Double.valueOf(zzidpVar3.zzd()));
                } while (zzidpVar3.zzE() < iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Double.valueOf(zzidpVar4.zzd()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzy(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzieg) {
            zzieg zziegVar = (zzieg) list;
            int i = this.zzb & 7;
            if (i == 2) {
                zzidp zzidpVar = this.zza;
                int iZzo = zzidpVar.zzo();
                zzW(iZzo);
                int iZzE = zzidpVar.zzE() + iZzo;
                do {
                    zziegVar.zzg(zzidpVar.zze());
                } while (zzidpVar.zzE() < iZzE);
                return;
            }
            if (i != 5) {
                throw new zzifg("Protocol message tag had invalid wire type.");
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zziegVar.zzg(zzidpVar2.zze());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                zzidp zzidpVar3 = this.zza;
                int iZzo2 = zzidpVar3.zzo();
                zzW(iZzo2);
                int iZzE2 = zzidpVar3.zzE() + iZzo2;
                do {
                    list.add(Float.valueOf(zzidpVar3.zze()));
                } while (zzidpVar3.zzE() < iZzE2);
                return;
            }
            if (i2 != 5) {
                throw new zzifg("Protocol message tag had invalid wire type.");
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Float.valueOf(zzidpVar4.zze()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzz(List list) throws IOException {
        int iZza;
        int iZza2;
        if (list instanceof zzifn) {
            zzifn zzifnVar = (zzifn) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar = this.zza;
                int iZzE = zzidpVar.zzE() + zzidpVar.zzo();
                do {
                    zzifnVar.zzd(zzidpVar.zzf());
                } while (zzidpVar.zzE() < iZzE);
                zzV(iZzE);
                return;
            }
            do {
                zzidp zzidpVar2 = this.zza;
                zzifnVar.zzd(zzidpVar2.zzf());
                if (zzidpVar2.zzD()) {
                    return;
                } else {
                    iZza2 = zzidpVar2.zza();
                }
            } while (iZza2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzifg("Protocol message tag had invalid wire type.");
                }
                zzidp zzidpVar3 = this.zza;
                int iZzE2 = zzidpVar3.zzE() + zzidpVar3.zzo();
                do {
                    list.add(Long.valueOf(zzidpVar3.zzf()));
                } while (zzidpVar3.zzE() < iZzE2);
                zzV(iZzE2);
                return;
            }
            do {
                zzidp zzidpVar4 = this.zza;
                list.add(Long.valueOf(zzidpVar4.zzf()));
                if (zzidpVar4.zzD()) {
                    return;
                } else {
                    iZza = zzidpVar4.zza();
                }
            } while (iZza == this.zzb);
            iZza2 = iZza;
        }
        this.zzd = iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzigm
    public final void zzI(List list) throws IOException {
        int iZza;
        if ((this.zzb & 7) != 2) {
            throw new zzifg("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzq());
            zzidp zzidpVar = this.zza;
            if (zzidpVar.zzD()) {
                return;
            } else {
                iZza = zzidpVar.zza();
            }
        } while (iZza == this.zzb);
        this.zzd = iZza;
    }
}
