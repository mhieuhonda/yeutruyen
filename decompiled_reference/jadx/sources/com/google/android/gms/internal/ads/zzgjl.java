package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgjl extends zzgji {
    private final Map zza;
    private final zzgie zzb;
    private final DisplayMetrics zzc;

    zzgjl(zzaxt zzaxtVar, zzgie zzgieVar, Map map, DisplayMetrics displayMetrics, zzgqo zzgqoVar) {
        super("O/IhSczWkqH+q2aziu5mnePClwI2VInt8+rK2r5DAzxhVznO7DMyVuowa8d0HFxQ", "c/euB7bpmuTDKGTS9kQ/O7Lr64QuDKreUuxk5moaYNc=", zzaxtVar, zzgieVar, zzgqoVar.zza(123));
        this.zzb = zzgieVar;
        this.zza = map;
        this.zzc = displayMetrics;
    }

    private static long zzb(double d, DisplayMetrics displayMetrics) {
        return Math.round(d / ((double) displayMetrics.density));
    }

    private static boolean zzc(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    protected final void zza(Method method, zzaxt zzaxtVar) throws IllegalAccessException, InvocationTargetException {
        Map map = this.zza;
        MotionEvent motionEvent = (MotionEvent) map.get("nv");
        DisplayMetrics displayMetrics = this.zzc;
        Object[] objArr = (Object[]) method.invoke("", motionEvent, displayMetrics);
        objArr.getClass();
        Object[] objArr2 = objArr;
        zzayp zzaypVarZza = zzayq.zza();
        Object obj = objArr2[0];
        if (obj != null && objArr2[1] != null) {
            zzaypVarZza.zza(((Long) obj).longValue());
            zzaypVarZza.zzb(((Long) objArr2[1]).longValue());
        }
        Object obj2 = objArr2[2];
        if (obj2 != null) {
            zzaypVarZza.zzh(((Long) obj2).longValue());
        }
        Object obj3 = objArr2[3];
        if (obj3 != null) {
            zzaypVarZza.zzf(((Long) obj3).longValue());
        }
        Object obj4 = objArr2[4];
        if (obj4 != null) {
            zzaypVarZza.zzc(((Long) obj4).longValue());
        }
        Object obj5 = objArr2[5];
        if (obj5 != null) {
            zzaypVarZza.zzs(((Long) obj5).longValue() != 0 ? 2 : 1);
        }
        Object obj6 = objArr2[6];
        if (obj6 != null) {
            zzaypVarZza.zzj(((Long) obj6).longValue());
        }
        Object obj7 = objArr2[7];
        if (obj7 != null) {
            zzaypVarZza.zzi(((Long) obj7).longValue());
        }
        Object obj8 = objArr2[8];
        if (obj8 != null) {
            zzaypVarZza.zzt(((Long) obj8).longValue() != 0 ? 2 : 1);
        }
        synchronized (zzaxtVar) {
            Method methodZzc = this.zzb.zzc("8cUAbwpt6SKUQHhtSwuMmdGkTrID2QvHq2LA27x2GE3ivBr88edu7HCA+XurISAj", "khOZexiJY4Vla3osCKZbCsXRCvuYnTPcWDFUfUGsZNQ=");
            if (methodZzc == null) {
                throw null;
            }
            Method method2 = methodZzc;
            Object[] objArr3 = (Object[]) methodZzc.invoke("", (MotionEvent) map.get("nv"), displayMetrics);
            if (objArr3 == null) {
                throw null;
            }
            Object[] objArr4 = objArr3;
            Object obj9 = objArr4[0];
            if (obj9 != null) {
                zzaxtVar.zzh(((Long) obj9).longValue());
            }
            Object obj10 = objArr4[1];
            if (obj10 != null) {
                zzaxtVar.zzi(((Long) obj10).longValue());
            }
            Object obj11 = objArr4[2];
            if (obj11 != null) {
                zzaxtVar.zzj(((Long) obj11).longValue());
            }
            Object obj12 = objArr4[3];
            if (obj12 != null) {
                zzaxtVar.zzv(((Long) obj12).longValue());
            }
            Object obj13 = objArr4[4];
            if (obj13 != null) {
                zzaxtVar.zzw(((Long) obj13).longValue());
            }
            zzggy zzggyVar = (zzggy) map.get("oe");
            if (zzggyVar != null) {
                long j = zzggyVar.zza;
                if (j > 0) {
                    zzaxtVar.zzz(j);
                }
                long j2 = zzggyVar.zzb;
                if (j2 > 0) {
                    zzaxtVar.zzy(j2);
                }
                long j3 = zzggyVar.zzc;
                if (j3 > 0) {
                    zzaxtVar.zzx(j3);
                }
                long j4 = zzggyVar.zzd;
                if (j4 > 0) {
                    zzaxtVar.zzA(j4);
                }
            }
            zzggy zzggyVar2 = (zzggy) map.get("oe");
            if (zzggyVar2 != null && zzggyVar2.zza != 0 && zzc(displayMetrics)) {
                double d = zzggyVar2.zze;
                if (displayMetrics == null) {
                    throw null;
                }
                zzaypVarZza.zzl(zzb(d, displayMetrics));
                zzaypVarZza.zzm(zzb(zzggyVar2.zzh - zzggyVar2.zzf, displayMetrics));
                zzaypVarZza.zzn(zzb(zzggyVar2.zzi - zzggyVar2.zzg, displayMetrics));
                zzaypVarZza.zzq(zzb(zzggyVar2.zzf, displayMetrics));
                zzaypVarZza.zzr(zzb(zzggyVar2.zzg, displayMetrics));
                MotionEvent motionEvent2 = (MotionEvent) map.get("nv");
                if (motionEvent2 != null) {
                    long jZzb = zzb(((zzggyVar2.zzf - zzggyVar2.zzh) + motionEvent2.getRawX()) - motionEvent2.getX(), displayMetrics);
                    if (jZzb != 0) {
                        zzaypVarZza.zzo(jZzb);
                    }
                    long jZzb2 = zzb(((zzggyVar2.zzg - zzggyVar2.zzi) + motionEvent2.getRawY()) - motionEvent2.getY(), displayMetrics);
                    if (jZzb2 != 0) {
                        zzaypVarZza.zzp(jZzb2);
                    }
                }
            }
            zzaxtVar.zzJ(zzaypVarZza);
            zzggz[] zzggzVarArr = (zzggz[]) map.get("ro");
            if (zzggzVarArr != null && zzc(displayMetrics)) {
                for (int i = 0; i <= zzggzVarArr.length - 2; i++) {
                    zzggz zzggzVar = zzggzVarArr[i];
                    zzayp zzaypVarZza2 = zzayq.zza();
                    double d2 = zzggzVar.zza;
                    if (displayMetrics == null) {
                        throw null;
                    }
                    zzaypVarZza2.zza(zzb(d2, displayMetrics));
                    zzaypVarZza2.zzb(zzb(zzggzVar.zzb, displayMetrics));
                    zzaxtVar.zzK((zzayq) zzaypVarZza2.zzbu());
                }
            }
        }
    }
}
