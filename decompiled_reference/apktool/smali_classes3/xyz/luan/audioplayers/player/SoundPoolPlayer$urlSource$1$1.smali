.class final Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SoundPoolPlayer.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxyz/luan/audioplayers/player/SoundPoolPlayer;->setUrlSource(Lxyz/luan/audioplayers/source/UrlSource;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "xyz.luan.audioplayers.player.SoundPoolPlayer$urlSource$1$1"
    f = "SoundPoolPlayer.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    nl = {}
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $soundPoolPlayer:Lxyz/luan/audioplayers/player/SoundPoolPlayer;

.field final synthetic $start:J

.field final synthetic $value:Lxyz/luan/audioplayers/source/UrlSource;

.field label:I

.field final synthetic this$0:Lxyz/luan/audioplayers/player/SoundPoolPlayer;


# direct methods
.method constructor <init>(Lxyz/luan/audioplayers/source/UrlSource;Lxyz/luan/audioplayers/player/SoundPoolPlayer;Lxyz/luan/audioplayers/player/SoundPoolPlayer;JLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxyz/luan/audioplayers/source/UrlSource;",
            "Lxyz/luan/audioplayers/player/SoundPoolPlayer;",
            "Lxyz/luan/audioplayers/player/SoundPoolPlayer;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;->$value:Lxyz/luan/audioplayers/source/UrlSource;

    iput-object p2, p0, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;->this$0:Lxyz/luan/audioplayers/player/SoundPoolPlayer;

    iput-object p3, p0, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;->$soundPoolPlayer:Lxyz/luan/audioplayers/player/SoundPoolPlayer;

    iput-wide p4, p0, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;->$start:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;

    iget-object v1, p0, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;->$value:Lxyz/luan/audioplayers/source/UrlSource;

    iget-object v2, p0, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;->this$0:Lxyz/luan/audioplayers/player/SoundPoolPlayer;

    iget-object v3, p0, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;->$soundPoolPlayer:Lxyz/luan/audioplayers/player/SoundPoolPlayer;

    iget-wide v4, p0, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;->$start:J

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;-><init>(Lxyz/luan/audioplayers/source/UrlSource;Lxyz/luan/audioplayers/player/SoundPoolPlayer;Lxyz/luan/audioplayers/player/SoundPoolPlayer;JLkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 119
    iget v0, p0, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 120
    iget-object p1, p0, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;->$value:Lxyz/luan/audioplayers/source/UrlSource;

    invoke-virtual {p1}, Lxyz/luan/audioplayers/source/UrlSource;->getAudioPathForSoundPool()Ljava/lang/String;

    move-result-object v2

    .line 122
    iget-object p1, p0, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;->this$0:Lxyz/luan/audioplayers/player/SoundPoolPlayer;

    invoke-static {p1}, Lxyz/luan/audioplayers/player/SoundPoolPlayer;->access$getMainScope$p(Lxyz/luan/audioplayers/player/SoundPoolPlayer;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object p1

    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1$1;

    iget-object v1, p0, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;->this$0:Lxyz/luan/audioplayers/player/SoundPoolPlayer;

    iget-object v3, p0, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;->$soundPoolPlayer:Lxyz/luan/audioplayers/player/SoundPoolPlayer;

    iget-object v4, p0, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;->$value:Lxyz/luan/audioplayers/source/UrlSource;

    iget-wide v5, p0, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1;->$start:J

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v7}, Lxyz/luan/audioplayers/player/SoundPoolPlayer$urlSource$1$1$1;-><init>(Lxyz/luan/audioplayers/player/SoundPoolPlayer;Ljava/lang/String;Lxyz/luan/audioplayers/player/SoundPoolPlayer;Lxyz/luan/audioplayers/source/UrlSource;JLkotlin/coroutines/Continuation;)V

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function2;

    const/4 v7, 0x2

    move-object v4, v8

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 133
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 119
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
