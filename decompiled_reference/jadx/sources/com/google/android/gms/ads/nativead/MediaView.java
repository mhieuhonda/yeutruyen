package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzblx;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbnc;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class MediaView extends FrameLayout {
    private MediaContent zza;
    private boolean zzb;
    private zzblx zzc;
    private ImageView.ScaleType zzd;
    private boolean zze;
    private zzblz zzf;

    public MediaView(Context context) {
        super(context);
    }

    public MediaContent getMediaContent() {
        return this.zza;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.zze = true;
        this.zzd = scaleType;
        zzblz zzblzVar = this.zzf;
        if (zzblzVar != null) {
            zzblzVar.zza(scaleType);
        }
    }

    public void setMediaContent(MediaContent mediaContent) {
        boolean zZzt;
        this.zzb = true;
        this.zza = mediaContent;
        zzblx zzblxVar = this.zzc;
        if (zzblxVar != null) {
            zzblxVar.zza(mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            zzbnc zzbncVarZzb = mediaContent.zzb();
            if (zzbncVarZzb != null) {
                if (!mediaContent.hasVideoContent()) {
                    if (mediaContent.zza()) {
                        zZzt = zzbncVarZzb.zzt(ObjectWrapper.wrap(this));
                    }
                    removeAllViews();
                }
                zZzt = zzbncVarZzb.zzn(ObjectWrapper.wrap(this));
                if (zZzt) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e) {
            removeAllViews();
            zzo.zzg("", e);
        }
    }

    protected final synchronized void zza(zzblx zzblxVar) {
        this.zzc = zzblxVar;
        if (this.zzb) {
            zzblxVar.zza(this.zza);
        }
    }

    protected final synchronized void zzb(zzblz zzblzVar) {
        this.zzf = zzblzVar;
        if (this.zze) {
            zzblzVar.zza(this.zzd);
        }
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
