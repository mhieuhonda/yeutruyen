package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdzd {
    public static final zzgwt zza;
    public static final zzgwt zzb;
    private final String zzc;
    private final zzdzc zzd;
    private final zzdzc zze;

    static {
        zzdzc zzdzcVar = zzdzc.PUBLIC_API_CALL;
        zzdzc zzdzcVar2 = zzdzc.PUBLIC_API_CALLBACK;
        zzdzd zzdzdVar = new zzdzd("tqgt", zzdzcVar, zzdzcVar2);
        zzdzc zzdzcVar3 = zzdzc.DYNAMITE_ENTER;
        zzdzd zzdzdVar2 = new zzdzd("l.dl", zzdzcVar, zzdzcVar3);
        zzdzc zzdzcVar4 = zzdzc.READ_FROM_DISK_START;
        zzdzd zzdzdVar3 = new zzdzd("l.rccde", zzdzcVar3, zzdzcVar4);
        zzdzd zzdzdVar4 = new zzdzd("l.rfd", zzdzcVar4, zzdzc.READ_FROM_DISK_END);
        zzdzc zzdzcVar5 = zzdzc.CLIENT_SIGNALS_START;
        zzdzd zzdzdVar5 = new zzdzd("l.rcc", zzdzcVar3, zzdzcVar5);
        zzdzc zzdzcVar6 = zzdzc.CLIENT_SIGNALS_END;
        zzdzd zzdzdVar6 = new zzdzd("l.cs", zzdzcVar5, zzdzcVar6);
        zzdzd zzdzdVar7 = new zzdzd("l.cts", zzdzcVar6, zzdzc.SERVICE_CONNECTED);
        zzdzc zzdzcVar7 = zzdzc.GMS_SIGNALS_START;
        zzdzc zzdzcVar8 = zzdzc.GMS_SIGNALS_END;
        zzdzd zzdzdVar8 = new zzdzd("l.gs", zzdzcVar7, zzdzcVar8);
        zzdzc zzdzcVar9 = zzdzc.GET_SIGNALS_SDKCORE_START;
        zzdzd zzdzdVar9 = new zzdzd("l.jse", zzdzcVar8, zzdzcVar9);
        zzdzc zzdzcVar10 = zzdzc.GET_SIGNALS_SDKCORE_END;
        zzdzd zzdzdVar10 = new zzdzd("l.gs-sdkcore", zzdzcVar9, zzdzcVar10);
        zzdzd zzdzdVar11 = new zzdzd("l.gs-pp", zzdzcVar10, zzdzcVar2);
        zzdzc zzdzcVar11 = zzdzc.RENDERING_START;
        zzdzd zzdzdVar12 = new zzdzd("l.render", zzdzcVar11, zzdzcVar2);
        zzdzc zzdzcVar12 = zzdzc.RENDERING_WEBVIEW_CREATION_START;
        zzdzd zzdzdVar13 = new zzdzd("l.render.pre", zzdzcVar11, zzdzcVar12);
        zzdzc zzdzcVar13 = zzdzc.RENDERING_WEBVIEW_CREATION_END;
        zzdzd zzdzdVar14 = new zzdzd("l.render.wvc", zzdzcVar12, zzdzcVar13);
        zzdzd zzdzdVar15 = new zzdzd("l.render.acc", zzdzcVar13, zzdzc.RENDERING_AD_COMPONENT_CREATION_END);
        zzdzd zzdzdVar16 = new zzdzd("l.render.cfg-wv", zzdzc.RENDERING_CONFIGURE_WEBVIEW_START, zzdzc.RENDERING_CONFIGURE_WEBVIEW_END);
        zzdzc zzdzcVar14 = zzdzc.RENDERING_WEBVIEW_LOAD_HTML_START;
        zzdzc zzdzcVar15 = zzdzc.RENDERING_WEBVIEW_LOAD_HTML_END;
        zza = zzgwt.zzo(zzdzdVar, zzdzdVar2, zzdzdVar3, zzdzdVar4, zzdzdVar5, zzdzdVar6, zzdzdVar7, zzdzdVar8, zzdzdVar9, zzdzdVar10, zzdzdVar11, zzdzdVar12, zzdzdVar13, zzdzdVar14, zzdzdVar15, zzdzdVar16, new zzdzd("l.render.wvlh", zzdzcVar14, zzdzcVar15), new zzdzd("l.render.post", zzdzcVar15, zzdzcVar2), new zzdzd("l.sodv", zzdzc.SIGNAL_ON_DISK_VALIDATION_START, zzdzc.SIGNAL_ON_DISK_VALIDATION_END), new zzdzd("l.sodck", zzdzc.SIGNAL_ON_DISK_CACHE_KEY_START, zzdzc.SIGNAL_ON_DISK_CACHE_KEY_END), new zzdzd("l.sodrar", zzdzc.SIGNAL_ON_DISK_READ_AND_REMOVE_START, zzdzc.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new zzdzd("l.soddc", zzdzc.SIGNAL_ON_DISK_DECODE_START, zzdzc.SIGNAL_ON_DISK_DECODE_END));
        zzdzc zzdzcVar16 = zzdzc.PUBLIC_API_CALL;
        zzdzc zzdzcVar17 = zzdzc.PUBLIC_API_CALLBACK;
        zzdzd zzdzdVar17 = new zzdzd("l.al", zzdzcVar16, zzdzcVar17);
        zzdzc zzdzcVar18 = zzdzc.DYNAMITE_ENTER;
        zzdzd zzdzdVar18 = new zzdzd("l.al2", zzdzcVar18, zzdzcVar17);
        zzdzd zzdzdVar19 = new zzdzd("l.dl", zzdzcVar16, zzdzcVar18);
        zzdzc zzdzcVar19 = zzdzc.CLIENT_SIGNALS_START;
        zzdzd zzdzdVar20 = new zzdzd("l.rcc", zzdzcVar18, zzdzcVar19);
        zzdzc zzdzcVar20 = zzdzc.CLIENT_SIGNALS_END;
        zzdzd zzdzdVar21 = new zzdzd("l.cs", zzdzcVar19, zzdzcVar20);
        zzdzd zzdzdVar22 = new zzdzd("l.cts", zzdzcVar20, zzdzc.SERVICE_CONNECTED);
        zzdzc zzdzcVar21 = zzdzc.GMS_SIGNALS_START;
        zzdzc zzdzcVar22 = zzdzc.GMS_SIGNALS_END;
        zzdzd zzdzdVar23 = new zzdzd("l.gs", zzdzcVar21, zzdzcVar22);
        zzdzc zzdzcVar23 = zzdzc.GET_AD_DICTIONARY_SDKCORE_START;
        zzdzd zzdzdVar24 = new zzdzd("l.jse", zzdzcVar22, zzdzcVar23);
        zzdzc zzdzcVar24 = zzdzc.GET_AD_DICTIONARY_SDKCORE_END;
        zzdzd zzdzdVar25 = new zzdzd("l.gad-js", zzdzcVar23, zzdzcVar24);
        zzdzc zzdzcVar25 = zzdzc.HTTP_RESPONSE_READY;
        zzdzd zzdzdVar26 = new zzdzd("l.http", zzdzcVar24, zzdzcVar25);
        zzdzc zzdzcVar26 = zzdzc.SCAR_PRELOADER_READY;
        zzdzd zzdzdVar27 = new zzdzd("l.slas.pre", zzdzcVar16, zzdzcVar26);
        zzdzc zzdzcVar27 = zzdzc.SCAR_PRELOADER_PROCESSING_DONE;
        zzdzd zzdzdVar28 = new zzdzd("l.slas.prel.p", zzdzcVar26, zzdzcVar27);
        zzdzc zzdzcVar28 = zzdzc.NORMALIZATION_AD_RESPONSE_START;
        zzdzd zzdzdVar29 = new zzdzd("l.jse-nml", zzdzcVar25, zzdzcVar28);
        zzdzd zzdzdVar30 = new zzdzd("l.jse-nml", zzdzcVar27, zzdzcVar28);
        zzdzc zzdzcVar29 = zzdzc.NORMALIZATION_AD_RESPONSE_END;
        zzdzd zzdzdVar31 = new zzdzd("l.nml-js", zzdzcVar28, zzdzcVar29);
        zzdzc zzdzcVar30 = zzdzc.BINDER_CALL_START;
        zzdzd zzdzdVar32 = new zzdzd("l.nml-gmsg", zzdzcVar29, zzdzcVar30);
        zzdzc zzdzcVar31 = zzdzc.SERVER_RESPONSE_PARSE_START;
        zzdzd zzdzdVar33 = new zzdzd("l.nml-gmsg.s2s", zzdzcVar29, zzdzcVar31);
        zzdzd zzdzdVar34 = new zzdzd("l.binder", zzdzcVar30, zzdzcVar31);
        zzdzc zzdzcVar32 = zzdzc.RENDERING_START;
        zzdzd zzdzdVar35 = new zzdzd("l.sr", zzdzcVar31, zzdzcVar32);
        zzdzd zzdzdVar36 = new zzdzd("l.render", zzdzcVar32, zzdzcVar17);
        zzdzd zzdzdVar37 = new zzdzd("l.t2", zzdzc.RENDERING_ADSTRING_TYPE2_FETCH_START, zzdzc.RENDERING_ADSTRING_TYPE2_FETCH_END);
        zzdzc zzdzcVar33 = zzdzc.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START;
        zzdzc zzdzcVar34 = zzdzc.RENDERING_NATIVE_ADS_PREPROCESS_START;
        zzdzd zzdzdVar38 = new zzdzd("l.render.na.js", zzdzcVar33, zzdzcVar34);
        zzdzd zzdzdVar39 = new zzdzd("l.render.na.prep", zzdzcVar34, zzdzc.RENDERING_NATIVE_ADS_PREPROCESS_END);
        zzdzd zzdzdVar40 = new zzdzd("l.render.na.lna", zzdzc.RENDERING_NATIVE_ASSETS_LOADING_START, zzdzc.RENDERING_NATIVE_ASSETS_LOADING_END);
        zzdzc zzdzcVar35 = zzdzc.RENDERING_WEBVIEW_CREATION_START;
        zzdzc zzdzcVar36 = zzdzc.RENDERING_WEBVIEW_CREATION_END;
        zzdzd zzdzdVar41 = new zzdzd("l.render.wvc", zzdzcVar35, zzdzcVar36);
        zzdzd zzdzdVar42 = new zzdzd("l.render.acc", zzdzcVar36, zzdzc.RENDERING_AD_COMPONENT_CREATION_END);
        zzdzc zzdzcVar37 = zzdzc.RENDERING_CONFIGURE_WEBVIEW_START;
        zzdzc zzdzcVar38 = zzdzc.RENDERING_CONFIGURE_WEBVIEW_END;
        zzdzd zzdzdVar43 = new zzdzd("l.render.cfg-wv", zzdzcVar37, zzdzcVar38);
        zzdzd zzdzdVar44 = new zzdzd("l.render.pre", zzdzcVar32, zzdzcVar35);
        zzdzc zzdzcVar39 = zzdzc.RENDERING_WEBVIEW_LOAD_HTML_END;
        zzdzd zzdzdVar45 = new zzdzd("l.render.post", zzdzcVar39, zzdzcVar17);
        zzdzd zzdzdVar46 = new zzdzd("l.render.na.post", zzdzcVar38, zzdzcVar17);
        zzdzd zzdzdVar47 = new zzdzd("l.render.wvlh", zzdzc.RENDERING_WEBVIEW_LOAD_HTML_START, zzdzcVar39);
        zzdzd zzdzdVar48 = new zzdzd("l.na.b", zzdzc.NATIVE_ASSETS_LOADING_BASIC_START, zzdzc.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdzd zzdzdVar49 = new zzdzd("l.na.im", zzdzc.NATIVE_ASSETS_LOADING_IMAGE_START, zzdzc.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzdzd zzdzdVar50 = new zzdzd("l.na.imc", zzdzc.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START, zzdzc.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        zzdzd zzdzdVar51 = new zzdzd("l.na.l", zzdzc.NATIVE_ASSETS_LOADING_LOGO_START, zzdzc.NATIVE_ASSETS_LOADING_LOGO_END);
        zzdzd zzdzdVar52 = new zzdzd("l.na.ic", zzdzc.NATIVE_ASSETS_LOADING_ICON_START, zzdzc.NATIVE_ASSETS_LOADING_ICON_END);
        zzdzd zzdzdVar53 = new zzdzd("l.na.a", zzdzc.NATIVE_ASSETS_LOADING_ATTRIBUTION_START, zzdzc.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        zzdzc zzdzcVar40 = zzdzc.NATIVE_ASSETS_LOADING_VIDEO_START;
        zzdzc zzdzcVar41 = zzdzc.NATIVE_ASSETS_LOADING_VIDEO_END;
        zzb = zzgwt.zzo(zzdzdVar17, zzdzdVar18, zzdzdVar19, zzdzdVar20, zzdzdVar21, zzdzdVar22, zzdzdVar23, zzdzdVar24, zzdzdVar25, zzdzdVar26, zzdzdVar27, zzdzdVar28, zzdzdVar29, zzdzdVar30, zzdzdVar31, zzdzdVar32, zzdzdVar33, zzdzdVar34, zzdzdVar35, zzdzdVar36, zzdzdVar37, zzdzdVar38, zzdzdVar39, zzdzdVar40, zzdzdVar41, zzdzdVar42, zzdzdVar43, zzdzdVar44, zzdzdVar45, zzdzdVar46, zzdzdVar47, zzdzdVar48, zzdzdVar49, zzdzdVar50, zzdzdVar51, zzdzdVar52, zzdzdVar53, new zzdzd("l.na.v", zzdzcVar40, zzdzcVar41), new zzdzd("l.na.vc", zzdzc.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START, zzdzcVar41), new zzdzd("l.na.m", zzdzc.NATIVE_ASSETS_LOADING_MEDIA_START, zzdzc.NATIVE_ASSETS_LOADING_MEDIA_END), new zzdzd("l.na.c", zzdzc.NATIVE_ASSETS_LOADING_CUSTOM_START, zzdzc.NATIVE_ASSETS_LOADING_CUSTOM_END), new zzdzd("l.na.o", zzdzc.NATIVE_ASSETS_LOADING_OMID_START, zzdzc.NATIVE_ASSETS_LOADING_OMID_END));
    }

    public zzdzd(String str, zzdzc zzdzcVar, zzdzc zzdzcVar2) {
        this.zzc = str;
        this.zzd = zzdzcVar;
        this.zze = zzdzcVar2;
    }

    public final String zza() {
        return this.zzc;
    }

    public final zzdzc zzb() {
        return this.zzd;
    }

    public final zzdzc zzc() {
        return this.zze;
    }
}
