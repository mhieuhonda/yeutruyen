.class public final Lio/flutter/plugins/imagepicker/GeneralOptions;
.super Ljava/lang/Object;
.source "Messages.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/imagepicker/GeneralOptions$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\t\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010J\u0014\u0010\u0011\u001a\u00020\u00032\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ.\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0019J\n\u0010\u001a\u001a\u00020\u001bH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/flutter/plugins/imagepicker/GeneralOptions;",
        "",
        "allowMultiple",
        "",
        "usePhotoPicker",
        "limit",
        "",
        "<init>",
        "(ZZLjava/lang/Long;)V",
        "getAllowMultiple",
        "()Z",
        "getUsePhotoPicker",
        "getLimit",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "toList",
        "",
        "equals",
        "other",
        "hashCode",
        "",
        "component1",
        "component2",
        "component3",
        "copy",
        "(ZZLjava/lang/Long;)Lio/flutter/plugins/imagepicker/GeneralOptions;",
        "toString",
        "",
        "Companion",
        "image_picker_android_release"
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
.field public static final Companion:Lio/flutter/plugins/imagepicker/GeneralOptions$Companion;


# instance fields
.field private final allowMultiple:Z

.field private final limit:Ljava/lang/Long;

.field private final usePhotoPicker:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/imagepicker/GeneralOptions$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/imagepicker/GeneralOptions$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/imagepicker/GeneralOptions;->Companion:Lio/flutter/plugins/imagepicker/GeneralOptions$Companion;

    return-void
.end method

.method public constructor <init>(ZZLjava/lang/Long;)V
    .locals 0

    .line 227
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 228
    iput-boolean p1, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->allowMultiple:Z

    .line 229
    iput-boolean p2, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->usePhotoPicker:Z

    .line 230
    iput-object p3, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->limit:Ljava/lang/Long;

    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 227
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/flutter/plugins/imagepicker/GeneralOptions;-><init>(ZZLjava/lang/Long;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/flutter/plugins/imagepicker/GeneralOptions;ZZLjava/lang/Long;ILjava/lang/Object;)Lio/flutter/plugins/imagepicker/GeneralOptions;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->allowMultiple:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->usePhotoPicker:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->limit:Ljava/lang/Long;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/flutter/plugins/imagepicker/GeneralOptions;->copy(ZZLjava/lang/Long;)Lio/flutter/plugins/imagepicker/GeneralOptions;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->allowMultiple:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->usePhotoPicker:Z

    return v0
.end method

.method public final component3()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->limit:Ljava/lang/Long;

    return-object v0
.end method

.method public final copy(ZZLjava/lang/Long;)Lio/flutter/plugins/imagepicker/GeneralOptions;
    .locals 1

    new-instance v0, Lio/flutter/plugins/imagepicker/GeneralOptions;

    invoke-direct {v0, p1, p2, p3}, Lio/flutter/plugins/imagepicker/GeneralOptions;-><init>(ZZLjava/lang/Long;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 250
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne p0, p1, :cond_1

    return v1

    .line 256
    :cond_1
    check-cast p1, Lio/flutter/plugins/imagepicker/GeneralOptions;

    .line 257
    sget-object v2, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-boolean v3, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->allowMultiple:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget-boolean v4, p1, Lio/flutter/plugins/imagepicker/GeneralOptions;->allowMultiple:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 258
    sget-object v2, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-boolean v3, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->usePhotoPicker:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget-boolean v4, p1, Lio/flutter/plugins/imagepicker/GeneralOptions;->usePhotoPicker:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 259
    sget-object v2, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->limit:Ljava/lang/Long;

    iget-object p1, p1, Lio/flutter/plugins/imagepicker/GeneralOptions;->limit:Ljava/lang/Long;

    invoke-virtual {v2, v3, p1}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    :goto_0
    return v0
.end method

.method public final getAllowMultiple()Z
    .locals 1

    .line 228
    iget-boolean v0, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->allowMultiple:Z

    return v0
.end method

.method public final getLimit()Ljava/lang/Long;
    .locals 1

    .line 230
    iget-object v0, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->limit:Ljava/lang/Long;

    return-object v0
.end method

.method public final getUsePhotoPicker()Z
    .locals 1

    .line 229
    iget-boolean v0, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->usePhotoPicker:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 263
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 264
    sget-object v1, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-boolean v2, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->allowMultiple:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 265
    sget-object v1, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-boolean v2, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->usePhotoPicker:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 266
    sget-object v1, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->INSTANCE:Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->limit:Ljava/lang/Long;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/imagepicker/MessagesPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toList()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 243
    iget-boolean v0, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->allowMultiple:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 244
    iget-boolean v1, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->usePhotoPicker:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 245
    iget-object v2, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->limit:Ljava/lang/Long;

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    .line 242
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->allowMultiple:Z

    iget-boolean v1, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->usePhotoPicker:Z

    iget-object v2, p0, Lio/flutter/plugins/imagepicker/GeneralOptions;->limit:Ljava/lang/Long;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "GeneralOptions(allowMultiple="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", usePhotoPicker="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", limit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
