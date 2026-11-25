package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzchr extends zzgba {
    private final SensorManager zza;
    private final Object zzb;
    private final Display zzc;
    private final float[] zzd;
    private final float[] zze;
    private float[] zzf;
    private Handler zzg;
    private zzchq zzh;

    zzchr(Context context) {
        super("OrientationMonitor", "ads");
        this.zza = (SensorManager) context.getSystemService("sensor");
        this.zzc = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.zzd = new float[9];
        this.zze = new float[9];
        this.zzb = new Object();
    }

    final void zza() {
        if (this.zzg != null) {
            return;
        }
        SensorManager sensorManager = this.zza;
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        if (defaultSensor == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        zzgax zzgaxVar = new zzgax(handlerThread.getLooper());
        this.zzg = zzgaxVar;
        if (sensorManager.registerListener(this, defaultSensor, 0, zzgaxVar)) {
            return;
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("SensorManager.registerListener failed.");
        zzb();
    }

    final void zzb() {
        if (this.zzg == null) {
            return;
        }
        this.zza.unregisterListener(this);
        this.zzg.post(new zzchp(this));
        this.zzg = null;
    }

    final void zzc(zzchq zzchqVar) {
        this.zzh = zzchqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    public final void zzd(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzf == null) {
                this.zzf = new float[9];
            }
        }
        float[] fArr2 = this.zzd;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.zzc.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(fArr2, 2, 129, this.zze);
        } else if (rotation != 2) {
            float[] fArr3 = this.zze;
            if (rotation != 3) {
                System.arraycopy(fArr2, 0, fArr3, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(fArr2, 130, 1, fArr3);
            }
        } else {
            SensorManager.remapCoordinateSystem(fArr2, 129, 130, this.zze);
        }
        float[] fArr4 = this.zze;
        float f = fArr4[1];
        fArr4[1] = fArr4[3];
        fArr4[3] = f;
        float f2 = fArr4[2];
        fArr4[2] = fArr4[6];
        fArr4[6] = f2;
        float f3 = fArr4[5];
        fArr4[5] = fArr4[7];
        fArr4[7] = f3;
        synchronized (this.zzb) {
            System.arraycopy(fArr4, 0, this.zzf, 0, 9);
        }
        zzchq zzchqVar = this.zzh;
        if (zzchqVar != null) {
            zzchqVar.zza();
        }
    }

    final boolean zze(float[] fArr) {
        synchronized (this.zzb) {
            float[] fArr2 = this.zzf;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }
}
