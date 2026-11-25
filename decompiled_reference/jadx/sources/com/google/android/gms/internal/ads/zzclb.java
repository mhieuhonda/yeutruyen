package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public interface zzclb extends com.google.android.gms.ads.internal.client.zza, zzdlg, zzcks, zzbst, zzcmi, zzcmn, zzbtf, zzbex, zzcmr, com.google.android.gms.ads.internal.zzn, zzcmu, zzcmv, zzchu, zzcmw {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzchu
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzchu
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcks
    zzfkn zzC();

    WebView zzD();

    @Override // com.google.android.gms.internal.ads.zzcmw
    View zzE();

    List zzF();

    void zzG();

    void zzH(int i);

    void zzI();

    void zzJ();

    Context zzK();

    com.google.android.gms.ads.internal.overlay.zzm zzL();

    com.google.android.gms.ads.internal.overlay.zzm zzM();

    @Override // com.google.android.gms.internal.ads.zzcmt
    zzcnl zzN();

    String zzO();

    zzcmz zzP();

    WebViewClient zzQ();

    boolean zzR();

    @Override // com.google.android.gms.internal.ads.zzcmu
    zzbaw zzS();

    zzflk zzT();

    zzelv zzU();

    zzelt zzV();

    boolean zzW();

    boolean zzX();

    void zzY();

    boolean zzZ();

    boolean zzaA(boolean z, int i);

    boolean zzaB();

    @Override // com.google.android.gms.internal.ads.zzcmi
    zzfkq zzaC();

    void zzaD(zzfkn zzfknVar, zzfkq zzfkqVar);

    void zzaE(boolean z, int i);

    ListenableFuture zzaF();

    void zzaG(boolean z);

    boolean zzaa();

    void zzab(String str, zzbpx zzbpxVar);

    void zzac(String str, zzbpx zzbpxVar);

    void zzad(String str, Predicate predicate);

    void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzaf(zzcnl zzcnlVar);

    void zzag(boolean z);

    void zzah();

    void zzai(Context context);

    void zzaj(boolean z);

    void zzak(zzelv zzelvVar);

    void zzal(zzelt zzeltVar);

    void zzam(int i);

    void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzao(boolean z);

    void zzap();

    void zzaq(zzbly zzblyVar);

    zzbly zzar();

    void zzas(boolean z);

    void zzat();

    void zzau(String str, String str2, String str3);

    void zzav();

    void zzaw(boolean z);

    void zzax(zzblv zzblvVar);

    void zzay(zzbgk zzbgkVar);

    zzbgk zzaz();

    @Override // com.google.android.gms.internal.ads.zzchu
    zzcmh zzh();

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzchu
    Activity zzj();

    @Override // com.google.android.gms.internal.ads.zzchu
    com.google.android.gms.ads.internal.zza zzk();

    @Override // com.google.android.gms.internal.ads.zzchu
    zzbjk zzq();

    @Override // com.google.android.gms.internal.ads.zzcmv, com.google.android.gms.internal.ads.zzchu
    VersionInfoParcel zzs();

    @Override // com.google.android.gms.internal.ads.zzchu
    void zzt(String str, zzcjh zzcjhVar);

    @Override // com.google.android.gms.internal.ads.zzchu
    void zzw(zzcmh zzcmhVar);
}
