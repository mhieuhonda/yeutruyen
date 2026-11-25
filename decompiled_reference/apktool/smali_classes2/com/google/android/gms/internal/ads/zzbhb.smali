.class final Lcom/google/android/gms/internal/ads/zzbhb;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@25.3.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbfr;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzbhe;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzbhe;)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbhb;->zza:Lcom/google/android/gms/internal/ads/zzbhe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbhb;->zza:Lcom/google/android/gms/internal/ads/zzbhe;

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbhe;->zzf()V

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbhe;->zzg()V

    return-void
.end method
