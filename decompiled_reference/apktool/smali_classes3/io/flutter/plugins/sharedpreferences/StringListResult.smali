.class public final Lio/flutter/plugins/sharedpreferences/StringListResult;
.super Ljava/lang/Object;
.source "MessagesAsync.g.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/sharedpreferences/StringListResult$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008\u0086\u0008\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u0014\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\n\u0010\u0016\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/flutter/plugins/sharedpreferences/StringListResult;",
        "",
        "jsonEncodedValue",
        "",
        "type",
        "Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;",
        "<init>",
        "(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;)V",
        "getJsonEncodedValue",
        "()Ljava/lang/String;",
        "getType",
        "()Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;",
        "toList",
        "",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "component1",
        "component2",
        "copy",
        "toString",
        "Companion",
        "shared_preferences_android_release"
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
.field public static final Companion:Lio/flutter/plugins/sharedpreferences/StringListResult$Companion;


# instance fields
.field private final jsonEncodedValue:Ljava/lang/String;

.field private final type:Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/flutter/plugins/sharedpreferences/StringListResult$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/flutter/plugins/sharedpreferences/StringListResult$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lio/flutter/plugins/sharedpreferences/StringListResult;->Companion:Lio/flutter/plugins/sharedpreferences/StringListResult$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 247
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 249
    iput-object p1, p0, Lio/flutter/plugins/sharedpreferences/StringListResult;->jsonEncodedValue:Ljava/lang/String;

    .line 251
    iput-object p2, p0, Lio/flutter/plugins/sharedpreferences/StringListResult;->type:Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    .line 247
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/sharedpreferences/StringListResult;-><init>(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/flutter/plugins/sharedpreferences/StringListResult;Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;ILjava/lang/Object;)Lio/flutter/plugins/sharedpreferences/StringListResult;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lio/flutter/plugins/sharedpreferences/StringListResult;->jsonEncodedValue:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/flutter/plugins/sharedpreferences/StringListResult;->type:Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/sharedpreferences/StringListResult;->copy(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;)Lio/flutter/plugins/sharedpreferences/StringListResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/sharedpreferences/StringListResult;->jsonEncodedValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/sharedpreferences/StringListResult;->type:Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;)Lio/flutter/plugins/sharedpreferences/StringListResult;
    .locals 1

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/flutter/plugins/sharedpreferences/StringListResult;

    invoke-direct {v0, p1, p2}, Lio/flutter/plugins/sharedpreferences/StringListResult;-><init>(Ljava/lang/String;Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 269
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

    .line 275
    :cond_1
    check-cast p1, Lio/flutter/plugins/sharedpreferences/StringListResult;

    .line 276
    sget-object v2, Lio/flutter/plugins/sharedpreferences/MessagesAsyncPigeonUtils;->INSTANCE:Lio/flutter/plugins/sharedpreferences/MessagesAsyncPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/sharedpreferences/StringListResult;->jsonEncodedValue:Ljava/lang/String;

    iget-object v4, p1, Lio/flutter/plugins/sharedpreferences/StringListResult;->jsonEncodedValue:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lio/flutter/plugins/sharedpreferences/MessagesAsyncPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 277
    sget-object v2, Lio/flutter/plugins/sharedpreferences/MessagesAsyncPigeonUtils;->INSTANCE:Lio/flutter/plugins/sharedpreferences/MessagesAsyncPigeonUtils;

    iget-object v3, p0, Lio/flutter/plugins/sharedpreferences/StringListResult;->type:Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;

    iget-object p1, p1, Lio/flutter/plugins/sharedpreferences/StringListResult;->type:Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;

    invoke-virtual {v2, v3, p1}, Lio/flutter/plugins/sharedpreferences/MessagesAsyncPigeonUtils;->deepEquals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    :goto_0
    return v0
.end method

.method public final getJsonEncodedValue()Ljava/lang/String;
    .locals 1

    .line 249
    iget-object v0, p0, Lio/flutter/plugins/sharedpreferences/StringListResult;->jsonEncodedValue:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;
    .locals 1

    .line 251
    iget-object v0, p0, Lio/flutter/plugins/sharedpreferences/StringListResult;->type:Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 281
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 282
    sget-object v1, Lio/flutter/plugins/sharedpreferences/MessagesAsyncPigeonUtils;->INSTANCE:Lio/flutter/plugins/sharedpreferences/MessagesAsyncPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/sharedpreferences/StringListResult;->jsonEncodedValue:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/sharedpreferences/MessagesAsyncPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 283
    sget-object v1, Lio/flutter/plugins/sharedpreferences/MessagesAsyncPigeonUtils;->INSTANCE:Lio/flutter/plugins/sharedpreferences/MessagesAsyncPigeonUtils;

    iget-object v2, p0, Lio/flutter/plugins/sharedpreferences/StringListResult;->type:Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/sharedpreferences/MessagesAsyncPigeonUtils;->deepHash(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 263
    iget-object v0, p0, Lio/flutter/plugins/sharedpreferences/StringListResult;->jsonEncodedValue:Ljava/lang/String;

    .line 264
    iget-object v1, p0, Lio/flutter/plugins/sharedpreferences/StringListResult;->type:Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    .line 262
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/sharedpreferences/StringListResult;->jsonEncodedValue:Ljava/lang/String;

    iget-object v1, p0, Lio/flutter/plugins/sharedpreferences/StringListResult;->type:Lio/flutter/plugins/sharedpreferences/StringListLookupResultType;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "StringListResult(jsonEncodedValue="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", type="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
