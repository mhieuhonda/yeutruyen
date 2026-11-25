package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzekz extends zzbza {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdzt zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzeko zze;
    private String zzf;
    private String zzg;

    public zzekz(Context context, zzeko zzekoVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzdzt zzdztVar) {
        this.zzb = context;
        this.zzc = zzdztVar;
        this.zzd = zzuVar;
        this.zze = zzekoVar;
    }

    public static void zzd(Context context, zzdzt zzdztVar, zzeko zzekoVar, String str, String str2) {
        zzk(context, zzdztVar, zzekoVar, str, str2, new HashMap());
    }

    public static void zzk(Context context, zzdzt zzdztVar, zzeko zzekoVar, String str, String str2, Map map) {
        String strZzg;
        String str3 = true != com.google.android.gms.ads.internal.zzt.zzh().zzt(context) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY;
        if (zzdztVar != null) {
            zzdzs zzdzsVarZza = zzdztVar.zza();
            zzdzsVarZza.zzc("gqi", str);
            zzdzsVarZza.zzc("action", str2);
            zzdzsVarZza.zzc("device_connectivity", str3);
            zzdzsVarZza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzdzsVarZza.zzc((String) entry.getKey(), (String) entry.getValue());
            }
            strZzg = zzdzsVarZza.zzg();
        } else {
            strZzg = "";
        }
        zzekoVar.zze(new zzekq(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), str, strZzg, 2));
    }

    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT >= 29 && str.equals("offline_notification_clicked")) {
            intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
            return zzgqq.zza(context, 0, intent, 201326592);
        }
        intent.setClassName(context, AdService.CLASS_NAME);
        ClipData clipData = zzgqq.zza;
        return zzgqq.zzb(context, 0, intent, 1140850688, 0);
    }

    private final void zzs(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            zzt();
            zzu(activity, zzmVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzw(this.zzf, "asnpdi", zzgww.zza());
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            AlertDialog.Builder builderZzN = com.google.android.gms.ads.internal.util.zzs.zzN(activity);
            builderZzN.setTitle(zzx(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzx(R.string.notifications_permission_confirm, HttpHeaders.ALLOW), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeku
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
                    this.zza.zzo(activity, zzmVar, dialogInterface, i);
                }
            }).setNegativeButton(zzx(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzekv
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
                    this.zza.zzp(zzmVar, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzekw
                @Override // android.content.DialogInterface.OnCancelListener
                public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                    this.zza.zzq(zzmVar, dialogInterface);
                }
            });
            builderZzN.create().show();
            zzw(this.zzf, "rtsdi", zzgww.zza());
        }
    }

    private final void zzt() {
        boolean zZzg;
        boolean zZze;
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.zzb;
            com.google.android.gms.ads.internal.util.zzbo zzboVarZzC = com.google.android.gms.ads.internal.util.zzs.zzC(context);
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
            String str = this.zzg;
            String str2 = this.zzf;
            zzekg zzekgVar = (zzekg) this.zza.get(str2);
            zZzg = zzboVarZzC.zzg(iObjectWrapperWrap, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, zzekgVar == null ? "" : zzekgVar.zzb()));
            if (zZzg) {
                zZze = true;
            } else {
                try {
                    zZze = zzboVarZzC.zze(ObjectWrapper.wrap(context), this.zzg, this.zzf);
                } catch (RemoteException e) {
                    e = e;
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to schedule offline notification poster.", e);
                    zZze = zZzg;
                }
            }
        } catch (RemoteException e2) {
            e = e2;
            zZzg = false;
        }
        if (zZze) {
            return;
        }
        this.zze.zzd(this.zzf);
        zzw(this.zzf, "offline_notification_worker_not_scheduled", zzgww.zza());
    }

    private final void zzu(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        AlertDialog alertDialogZzv = zzv(activity, zzmVar);
        alertDialogZzv.show();
        Timer timer = new Timer();
        timer.schedule(new zzekr(this, alertDialogZzv, timer, zzmVar), 3000L);
    }

    private final AlertDialog zzv(Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzs.zzN(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzekx
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = zzmVar;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        XmlResourceParser xmlResourceParserZzy = zzy(R.layout.offline_ads_dialog);
        if (xmlResourceParserZzy == null) {
            onCancelListener.setMessage(zzx(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            View viewInflate = activity.getLayoutInflater().inflate(xmlResourceParserZzy, (ViewGroup) null);
            onCancelListener.setView(viewInflate);
            String strZzz = zzz();
            if (!TextUtils.isEmpty(strZzz)) {
                TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(strZzz);
            }
            zzekg zzekgVar = (zzekg) this.zza.get(this.zzf);
            Drawable drawableZzc = zzekgVar != null ? zzekgVar.zzc() : null;
            if (drawableZzc != null) {
                ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawableZzc);
            }
            AlertDialog alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return alertDialogCreate;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzx(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private final void zzw(String str, String str2, Map map) {
        zzk(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    private static String zzx(int i, String str) {
        Resources resourcesZzg = com.google.android.gms.ads.internal.zzt.zzh().zzg();
        if (resourcesZzg == null) {
            return str;
        }
        try {
            return resourcesZzg.getString(i);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    private static XmlResourceParser zzy(int i) {
        Resources resourcesZzg = com.google.android.gms.ads.internal.zzt.zzh().zzg();
        if (resourcesZzg == null) {
            return null;
        }
        try {
            return resourcesZzg.getLayout(i);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final String zzz() {
        zzekg zzekgVar = (zzekg) this.zza.get(this.zzf);
        return zzekgVar == null ? "" : zzekgVar.zza();
    }

    public final void zzc(String str, zzdqb zzdqbVar) {
        String strZzQ = zzdqbVar.zzQ();
        String strZzB = zzdqbVar.zzB();
        String string = "";
        if (TextUtils.isEmpty(strZzQ)) {
            strZzQ = strZzB != null ? strZzB : "";
        }
        zzbml zzbmlVarZzD = zzdqbVar.zzD();
        if (zzbmlVarZzD != null) {
            try {
                string = zzbmlVarZzD.zzc().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbml zzbmlVarZzP = zzdqbVar.zzP();
        Drawable drawable = null;
        if (zzbmlVarZzP != null) {
            try {
                IObjectWrapper iObjectWrapperZzb = zzbmlVarZzP.zzb();
                if (iObjectWrapperZzb != null) {
                    drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzb);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzekd(strZzQ, string, drawable));
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                Context context = this.zzb;
                boolean zZzt = com.google.android.gms.ads.internal.zzt.zzh().zzt(context);
                HashMap map = new HashMap();
                char c = 2;
                if (stringExtra.equals("offline_notification_clicked")) {
                    map.put("offline_notification_action", "offline_notification_clicked");
                    c = true == zZzt ? (char) 1 : (char) 2;
                    map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    map.put("olaih", String.valueOf(stringExtra3.startsWith(ProxyConfig.MATCH_HTTP)));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        map.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        map.put("olaa", "olaf");
                    }
                } else {
                    map.put("offline_notification_action", "offline_notification_dismissed");
                }
                zzw(stringExtra2, "offline_notification_action", map);
                try {
                    SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                    if (c == 1) {
                        this.zze.zzb(writableDatabase, this.zzd, stringExtra2);
                    } else {
                        zzeko.zzi(writableDatabase, stringExtra2);
                    }
                } catch (SQLiteException e) {
                    String strConcat = "Failed to get writable offline buffering database: ".concat(e.toString());
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(strConcat);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzg() {
        final com.google.android.gms.ads.internal.util.client.zzu zzuVar = this.zzd;
        this.zze.zza(new zzfos() { // from class: com.google.android.gms.internal.ads.zzekm
            @Override // com.google.android.gms.internal.ads.zzfos
            public final /* synthetic */ Object zza(Object obj) throws Throwable {
                zzeko.zzf(zzuVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzh(IObjectWrapper iObjectWrapper) {
        zzelb zzelbVar = (zzelb) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity activityZza = zzelbVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzmVarZzb = zzelbVar.zzb();
        this.zzf = zzelbVar.zzc();
        this.zzg = zzelbVar.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjQ)).booleanValue()) {
            zzs(activityZza, zzmVarZzb);
            return;
        }
        zzw(this.zzf, "dialog_impression", zzgww.zza());
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builderZzN = com.google.android.gms.ads.internal.util.zzs.zzN(activityZza);
        builderZzN.setTitle(zzx(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzx(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzx(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeky
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
                this.zza.zzl(activityZza, zzmVarZzb, dialogInterface, i);
            }
        }).setNegativeButton(zzx(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeks
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
                this.zza.zzm(zzmVarZzb, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzekt
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                this.zza.zzn(zzmVarZzb, dialogInterface);
            }
        });
        builderZzN.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzi(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                zzelb zzelbVar = (zzelb) ObjectWrapper.unwrap(iObjectWrapper);
                Activity activityZza = zzelbVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzmVarZzb = zzelbVar.zzb();
                HashMap map = new HashMap();
                if (iArr[i] == 0) {
                    map.put("dialog_action", "confirm");
                    zzt();
                    zzu(activityZza, zzmVarZzb);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (zzmVarZzb != null) {
                        zzmVarZzb.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", map);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        String str2 = zzaVar.zza;
        String str3 = zzaVar.zzb;
        String str4 = zzaVar.zzc;
        String strZzz = zzz();
        com.google.android.gms.ads.internal.zzt.zzf().zze(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntentZzr = zzr(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentZzr2 = zzr(context, "offline_notification_dismissed", str3, str2);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "offline_notification_channel");
        if (TextUtils.isEmpty(strZzz)) {
            builder.setContentTitle(zzx(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            builder.setContentTitle(String.format(zzx(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), strZzz));
        }
        builder.setAutoCancel(true).setDeleteIntent(pendingIntentZzr2).setContentIntent(pendingIntentZzr).setSmallIcon(context.getApplicationInfo().icon).setPriority(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjR)).intValue());
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjT)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
                bitmapDecodeStream = null;
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                builder.setLargeIcon(bitmapDecodeStream).setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmapDecodeStream).bigLargeIcon((Bitmap) null));
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, builder.build());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            map.put("notification_not_shown_reason", e.getMessage());
            str = "offline_notification_failed";
        }
        zzw(str3, str, map);
    }

    final /* synthetic */ void zzl(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        zzw(this.zzf, "dialog_click", map);
        zzs(activity, zzmVar);
    }

    final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzn(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzo(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        zzw(this.zzf, "rtsdc", map);
        activity.startActivity(com.google.android.gms.ads.internal.zzt.zzf().zzg(activity));
        zzt();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzp(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzq(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }
}
