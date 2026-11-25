package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import com.tekartik.sqflite.Constant;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfve implements WebViewCompat.WebMessageListener {
    final /* synthetic */ zzfvg zza;

    zzfve(zzfvg zzfvgVar) {
        Objects.requireNonNull(zzfvgVar);
        this.zza = zzfvgVar;
    }

    @Override // androidx.webkit.WebViewCompat.WebMessageListener
    public final void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) {
        try {
            JSONObject jSONObject = new JSONObject(webMessageCompat.getData());
            String string = jSONObject.getString(Constant.PARAM_METHOD);
            String string2 = jSONObject.getJSONObject(Constant.PARAM_ERROR_DATA).getString("adSessionId");
            if (string.equals("startSession")) {
                this.zza.zzf(string2);
            } else if (string.equals("finishSession")) {
                this.zza.zzg(string2);
            } else {
                String.valueOf(string);
                zzfur.zza.booleanValue();
            }
        } catch (JSONException e) {
            zzfwp.zza("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }
}
