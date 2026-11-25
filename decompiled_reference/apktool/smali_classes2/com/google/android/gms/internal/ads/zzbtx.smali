.class final Lcom/google/android/gms/internal/ads/zzbtx;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@25.3.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzcgf;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzbtv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzbua;Lcom/google/android/gms/internal/ads/zzbtv;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbtx;->zza:Lcom/google/android/gms/internal/ads/zzbtv;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 3

    .line 1
    const-string v0, "Rejecting reference for JS Engine."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zziL:Lcom/google/android/gms/internal/ads/zzbio;

    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbiv;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    move-result-object v0

    .line 2
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbtx;->zza:Lcom/google/android/gms/internal/ads/zzbtv;

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Unable to create JS engine reference."

    .line 4
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const-string v2, "SdkJavascriptFactory.createNewReference.FailureCallback"

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzcgk;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void

    .line 5
    :cond_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcgk;->zzg()V

    return-void
.end method
