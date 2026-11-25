package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgas extends zzgag {
    private zzguj<Integer> zza;
    private zzguj<Integer> zzb;
    private zzgai zzc;
    private HttpURLConnection zzd;

    zzgas() {
        this(zzgar.zza, zzgaj.zza, null);
    }

    zzgas(zzguj<Integer> zzgujVar, zzguj<Integer> zzgujVar2, zzgai zzgaiVar) {
        this.zza = zzgujVar;
        this.zzb = zzgujVar2;
        this.zzc = zzgaiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzA() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzB() {
        return -1;
    }

    public static void zzi(HttpURLConnection httpURLConnection) {
        zzgah.zzb();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ URLConnection zzy(URL url) throws IOException {
        int i = zzgab.zzb;
        return url.openConnection();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzi(this.zzd);
    }

    public URLConnection zzf(final URL url, final int i) throws IOException {
        this.zza = new zzguj() { // from class: com.google.android.gms.internal.ads.zzgak
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzc = new zzgai() { // from class: com.google.android.gms.internal.ads.zzgal
            @Override // com.google.android.gms.internal.ads.zzgai
            public final /* synthetic */ URLConnection zza() {
                return zzgas.zzy(url);
            }
        };
        return zzj();
    }

    public HttpURLConnection zzg(final Network network, final URL url, final int i, final int i2) throws IOException {
        this.zza = new zzguj() { // from class: com.google.android.gms.internal.ads.zzgam
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzb = new zzguj() { // from class: com.google.android.gms.internal.ads.zzgan
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.zzc = new zzgai() { // from class: com.google.android.gms.internal.ads.zzgao
            @Override // com.google.android.gms.internal.ads.zzgai
            public final /* synthetic */ URLConnection zza() {
                return network.openConnection(url);
            }
        };
        return zzj();
    }

    public HttpURLConnection zzh(zzgai zzgaiVar, final int i, final int i2) throws IOException {
        this.zza = new zzguj() { // from class: com.google.android.gms.internal.ads.zzgap
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzb = new zzguj() { // from class: com.google.android.gms.internal.ads.zzgaq
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.zzc = zzgaiVar;
        return zzj();
    }

    public HttpURLConnection zzj() throws IOException {
        zzgah.zza(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzgai zzgaiVar = this.zzc;
        zzgaiVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzgaiVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }
}
