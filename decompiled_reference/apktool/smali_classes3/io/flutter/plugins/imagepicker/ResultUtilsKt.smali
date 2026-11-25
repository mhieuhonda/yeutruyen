.class public final Lio/flutter/plugins/imagepicker/ResultUtilsKt;
.super Ljava/lang/Object;
.source "ResultUtils.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0004\u001a3\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u001d\u0010\u0003\u001a\u0019\u0012\u000f\u0012\r\u0012\t\u0012\u0007H\u0002\u00a2\u0006\u0002\u0008\u00060\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0008\u001a8\u0010\t\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u001d\u0010\u0003\u001a\u0019\u0012\u000f\u0012\r\u0012\t\u0012\u0007H\u0002\u00a2\u0006\u0002\u0008\u00060\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\n\u001a\u0002H\u0002\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "completeWithError",
        "",
        "T",
        "callback",
        "Lkotlin/Function1;",
        "Lkotlin/Result;",
        "Lkotlin/jvm/JvmSuppressWildcards;",
        "failure",
        "",
        "completeWithValue",
        "value",
        "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V",
        "image_picker_android_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final completeWithError(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "TT;>;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "failure"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final completeWithValue(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/Result<",
            "TT;>;",
            "Lkotlin/Unit;",
            ">;TT;)V"
        }
    .end annotation

    const-string v0, "callback"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
