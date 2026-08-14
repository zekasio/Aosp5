package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import cz.msebera.android.httpclient.HttpHost;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzean extends zzbqu {
    private final Context zza;
    private final zzdpi zzb;
    private final zzbzf zzc;
    private final zzeaf zzd;
    private final zzfdk zze;

    public zzean(Context context, zzeaf zzeafVar, zzbzf zzbzfVar, zzdpi zzdpiVar, zzfdk zzfdkVar) {
        this.zza = context;
        this.zzb = zzdpiVar;
        this.zzc = zzbzfVar;
        this.zzd = zzeafVar;
        this.zze = zzfdkVar;
    }

    public static void zzc(Context context, zzdpi zzdpiVar, zzfdk zzfdkVar, zzeaf zzeafVar, String str, String str2) {
        zzd(context, zzdpiVar, zzfdkVar, zzeafVar, str, str2, new HashMap());
    }

    public static void zzd(Context context, zzdpi zzdpiVar, zzfdk zzfdkVar, zzeaf zzeafVar, String str, String str2, Map map) {
        String strZzf;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhS)).booleanValue()) {
            zzfdj zzfdjVarZzb = zzfdj.zzb(str2);
            zzfdjVarZzb.zza("gqi", str);
            zzfdjVarZzb.zza("device_connectivity", true == com.google.android.gms.ads.internal.zzt.zzo().zzx(context) ? CustomTabsCallback.ONLINE_EXTRAS_KEY : "offline");
            zzfdjVarZzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzfdjVarZzb.zza((String) entry.getKey(), (String) entry.getValue());
            }
            strZzf = zzfdkVar.zza(zzfdjVarZzb);
        } else {
            zzdph zzdphVarZza = zzdpiVar.zza();
            zzdphVarZza.zzb("gqi", str);
            zzdphVarZza.zzb("action", str2);
            zzdphVarZza.zzb("device_connectivity", true == com.google.android.gms.ads.internal.zzt.zzo().zzx(context) ? CustomTabsCallback.ONLINE_EXTRAS_KEY : "offline");
            zzdphVarZza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry2 : map.entrySet()) {
                zzdphVarZza.zzb((String) entry2.getKey(), (String) entry2.getValue());
            }
            strZzf = zzdphVarZza.zzf();
        }
        zzeafVar.zzd(new zzeah(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), str, strZzf, 2));
    }

    public static void zzh(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzl zzlVar, final com.google.android.gms.ads.internal.util.zzbr zzbrVar, final zzeaf zzeafVar, final zzdpi zzdpiVar, final zzfdk zzfdkVar, final String str, final String str2) {
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder builderZzG = com.google.android.gms.ads.internal.util.zzs.zzG(activity);
        final Resources resourcesZzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        builderZzG.setTitle(resourcesZzd == null ? "Open ad when you're back online." : resourcesZzd.getString(R.string.offline_opt_in_title)).setMessage(resourcesZzd == null ? "We'll send you a notification with a link to the advertiser site." : resourcesZzd.getString(R.string.offline_opt_in_message)).setPositiveButton(resourcesZzd == null ? "OK" : resourcesZzd.getString(R.string.offline_opt_in_confirm), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeaj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final com.google.android.gms.ads.internal.overlay.zzl zzlVar2;
                zzdpi zzdpiVar2 = zzdpiVar;
                Activity activity2 = activity;
                zzfdk zzfdkVar2 = zzfdkVar;
                zzeaf zzeafVar2 = zzeafVar;
                String str3 = str;
                com.google.android.gms.ads.internal.util.zzbr zzbrVar2 = zzbrVar;
                String str4 = str2;
                Resources resources = resourcesZzd;
                com.google.android.gms.ads.internal.overlay.zzl zzlVar3 = zzlVar;
                if (zzdpiVar2 != null) {
                    HashMap map = new HashMap();
                    map.put("dialog_action", "confirm");
                    zzlVar2 = zzlVar3;
                    zzean.zzd(activity2, zzdpiVar2, zzfdkVar2, zzeafVar2, str3, "dialog_click", map);
                } else {
                    zzlVar2 = zzlVar3;
                }
                try {
                } catch (RemoteException e) {
                    zzbza.zzh("Failed to schedule offline notification poster.", e);
                }
                if (!zzbrVar2.zzf(ObjectWrapper.wrap(activity2), str4, str3)) {
                    zzeafVar2.zzc(str3);
                    if (zzdpiVar2 != null) {
                        zzean.zzc(activity2, zzdpiVar2, zzfdkVar2, zzeafVar2, str3, "offline_notification_worker_not_scheduled");
                    }
                }
                com.google.android.gms.ads.internal.zzt.zzp();
                AlertDialog.Builder builderZzG2 = com.google.android.gms.ads.internal.util.zzs.zzG(activity2);
                builderZzG2.setMessage(resources == null ? "You'll get a notification with the link when you're back online" : resources.getString(R.string.offline_opt_in_confirmation)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeai
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface2) {
                        com.google.android.gms.ads.internal.overlay.zzl zzlVar4 = zzlVar2;
                        if (zzlVar4 != null) {
                            zzlVar4.zzb();
                        }
                    }
                });
                AlertDialog alertDialogCreate = builderZzG2.create();
                alertDialogCreate.show();
                Timer timer = new Timer();
                timer.schedule(new zzeam(alertDialogCreate, timer, zzlVar2), 3000L);
            }
        }).setNegativeButton(resourcesZzd == null ? "No thanks" : resourcesZzd.getString(R.string.offline_opt_in_decline), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeak
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                zzeaf zzeafVar2 = zzeafVar;
                String str3 = str;
                zzdpi zzdpiVar2 = zzdpiVar;
                Activity activity2 = activity;
                zzfdk zzfdkVar2 = zzfdkVar;
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = zzlVar;
                zzeafVar2.zzc(str3);
                if (zzdpiVar2 != null) {
                    HashMap map = new HashMap();
                    map.put("dialog_action", "dismiss");
                    zzean.zzd(activity2, zzdpiVar2, zzfdkVar2, zzeafVar2, str3, "dialog_click", map);
                }
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeal
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzeaf zzeafVar2 = zzeafVar;
                String str3 = str;
                zzdpi zzdpiVar2 = zzdpiVar;
                Activity activity2 = activity;
                zzfdk zzfdkVar2 = zzfdkVar;
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = zzlVar;
                zzeafVar2.zzc(str3);
                if (zzdpiVar2 != null) {
                    HashMap map = new HashMap();
                    map.put("dialog_action", "dismiss");
                    zzean.zzd(activity2, zzdpiVar2, zzfdkVar2, zzeafVar2, str3, "dialog_click", map);
                }
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        });
        builderZzG.create().show();
    }

    private final void zzi(String str, String str2, Map map) {
        zzd(this.zza, this.zzb, this.zze, this.zzd, str, str2, map);
    }

    private static final PendingIntent zzj(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context, AdService.CLASS_NAME);
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        return zzfla.zza(context, 0, intent, zzfla.zza | 1073741824, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zZzx = com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza);
            HashMap map = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c = true == zZzx ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith(HttpHost.DEFAULT_SCHEME_NAME)));
                try {
                    Context context = this.zza;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(DriveFile.MODE_READ_ONLY);
                    context.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzi(stringExtra2, "offline_notification_action", map);
            try {
                SQLiteDatabase writableDatabase = this.zzd.getWritableDatabase();
                if (c == 1) {
                    this.zzd.zzg(writableDatabase, this.zzc, stringExtra2);
                } else {
                    zzeaf.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                zzbza.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzf() {
        zzeaf zzeafVar = this.zzd;
        final zzbzf zzbzfVar = this.zzc;
        zzeafVar.zze(new zzfcd() { // from class: com.google.android.gms.internal.ads.zzeab
            @Override // com.google.android.gms.internal.ads.zzfcd
            public final Object zza(Object obj) throws Exception {
                zzeaf.zzb(zzbzfVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbqv
    public final void zzg(IObjectWrapper iObjectWrapper, String str, String str2) {
        String str3;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.ads.internal.zzt.zzq().zzg(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntentZzj = zzj(context, "offline_notification_clicked", str2, str);
        PendingIntent pendingIntentZzj2 = zzj(context, "offline_notification_dismissed", str2, str);
        Resources resourcesZzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(context, "offline_notification_channel").setContentTitle(resourcesZzd == null ? "View the ad you saved when you were offline" : resourcesZzd.getString(R.string.offline_notification_title)).setContentText(resourcesZzd == null ? "Tap to open ad" : resourcesZzd.getString(R.string.offline_notification_text)).setAutoCancel(true).setDeleteIntent(pendingIntentZzj2).setContentIntent(pendingIntentZzj).setSmallIcon(context.getApplicationInfo().icon);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str2, 54321, smallIcon.build());
            str3 = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            map.put("notification_not_shown_reason", e.getMessage());
            str3 = "offline_notification_failed";
        }
        zzi(str2, str3, map);
    }
}
