.class public final Lio/flutter/plugins/inapppurchase/ResultCompat;
.super Ljava/lang/Object;
.source "ResultUtils.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/inapppurchase/ResultCompat$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0018\u0000 \u0012*\u0004\u0008\u0000\u0010\u00012\u00020\u0002:\u0001\u0012B\u0015\u0012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\r\u0010\u000f\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0010J\u0008\u0010\u0011\u001a\u0004\u0018\u00010\nR\u0016\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\u0008\u001a\u0004\u0018\u00018\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\r\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/flutter/plugins/inapppurchase/ResultCompat;",
        "T",
        "",
        "result",
        "Lkotlin/Result;",
        "<init>",
        "(Ljava/lang/Object;)V",
        "Ljava/lang/Object;",
        "value",
        "exception",
        "",
        "isSuccess",
        "",
        "()Z",
        "isFailure",
        "getOrNull",
        "()Ljava/lang/Object;",
        "exceptionOrNull",
        "Companion",
        "in_app_purchase_android_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lio/flutter/plugins/inapppurchase/ResultCompat$Companion;


# instance fields
.field private final exception:Ljava/lang/Throwable;

.field private final isFailure:Z

.field private final isSuccess:Z

.field private final result:Ljava/lang/Object;

.field private final value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/inapppurchase/ResultCompat$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/inapppurchase/ResultCompat$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/inapppurchase/ResultCompat;->Companion:Lio/flutter/plugins/inapppurchase/ResultCompat$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lio/flutter/plugins/inapppurchase/ResultCompat;->result:Ljava/lang/Object;

    .line 13
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    iput-object v0, p0, Lio/flutter/plugins/inapppurchase/ResultCompat;->value:Ljava/lang/Object;

    .line 14
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugins/inapppurchase/ResultCompat;->exception:Ljava/lang/Throwable;

    .line 15
    invoke-static {p1}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lio/flutter/plugins/inapppurchase/ResultCompat;->isSuccess:Z

    .line 16
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lio/flutter/plugins/inapppurchase/ResultCompat;->isFailure:Z

    return-void
.end method

.method public static final asCompatCallback(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/flutter/plugins/inapppurchase/ResultCompat<",
            "TT;>;",
            "Lkotlin/Unit;",
            ">;)",
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/Result<",
            "+TT;>;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lio/flutter/plugins/inapppurchase/ResultCompat;->Companion:Lio/flutter/plugins/inapppurchase/ResultCompat$Companion;

    invoke-virtual {v0, p0}, Lio/flutter/plugins/inapppurchase/ResultCompat$Companion;->asCompatCallback(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    return-object p0
.end method

.method public static final success(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lio/flutter/plugins/inapppurchase/ResultCompat;->Companion:Lio/flutter/plugins/inapppurchase/ResultCompat$Companion;

    invoke-virtual {v0, p0, p1}, Lio/flutter/plugins/inapppurchase/ResultCompat$Companion;->success(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final exceptionOrNull()Ljava/lang/Throwable;
    .locals 1

    .line 36
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/ResultCompat;->exception:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final getOrNull()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lio/flutter/plugins/inapppurchase/ResultCompat;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public final isFailure()Z
    .locals 1

    .line 16
    iget-boolean v0, p0, Lio/flutter/plugins/inapppurchase/ResultCompat;->isFailure:Z

    return v0
.end method

.method public final isSuccess()Z
    .locals 1

    .line 15
    iget-boolean v0, p0, Lio/flutter/plugins/inapppurchase/ResultCompat;->isSuccess:Z

    return v0
.end method
