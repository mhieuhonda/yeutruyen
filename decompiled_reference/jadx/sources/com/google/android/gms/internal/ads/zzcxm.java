package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcxm extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcxm(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcxm zza(Context context, View view, zzfkn zzfknVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcxm zzcxmVar = new zzcxm(context);
        List list = zzfknVar.zzu;
        if (!list.isEmpty() && (resources = zzcxmVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfko zzfkoVar = (zzfko) list.get(0);
            zzcxmVar.setLayoutParams(new FrameLayout.LayoutParams((int) (zzfkoVar.zza * displayMetrics.density), (int) (zzfkoVar.zzb * displayMetrics.density)));
        }
        zzcxmVar.zzb = view;
        zzcxmVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcgl.zzb(zzcxmVar, zzcxmVar);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcgl.zza(zzcxmVar, zzcxmVar);
        JSONObject jSONObject = zzfknVar.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcxmVar.zza);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcxmVar.zzb(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcxmVar.zzb(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcxmVar.addView(relativeLayout);
        return zzcxmVar;
    }

    private final void zzb(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iZzc = zzc(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iZzc, 0, iZzc);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzc(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    private final int zzc(double d) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzE(this.zza, (int) d);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }
}
