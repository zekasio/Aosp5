package com.tapjoy.internal;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompatExtras;
import com.google.android.gms.drive.DriveFile;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.Tapjoy;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class b7 extends k {
    public static b7 c;

    public class a implements l {
        public long a(Context context) {
            return 0L;
        }

        public void a(Context context, boolean z) {
            j7.a(context).a(z);
        }

        public String b(Context context) {
            return j7.a(context).b.getString("gcm.regId", "");
        }

        public void a(Context context, long j) {
            SharedPreferences.Editor editorEdit = j7.a(context).b.edit();
            editorEdit.putLong("gcm.onServerExpirationTime", j);
            editorEdit.apply();
        }
    }

    public b7(Context context) {
        super(context, new a());
    }

    public static synchronized b7 a(Context context) {
        if (c == null) {
            c = new b7(context);
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v49, types: [android.text.Spanned] */
    public boolean a(Context context, Map<String, String> map) {
        int iIntValue;
        Intent intent;
        Notification notificationBuild;
        Notification notification;
        String str = map.get("fiverocks");
        if (str == null) {
            return false;
        }
        if (c7.a(context).d()) {
            z6.d(context).g.a(str);
            return true;
        }
        String str2 = map.get(TJAdUnitConstants.String.TITLE);
        String strFromHtml = map.get(TJAdUnitConstants.String.MESSAGE);
        if (strFromHtml == 0) {
            return true;
        }
        String str3 = map.get("rich");
        String str4 = map.get("sound");
        String str5 = map.get("payload");
        String str6 = map.get("always");
        boolean z = "true".equals(str6) || Boolean.TRUE.equals(str6);
        String str7 = map.get("repeatable");
        boolean z2 = "true".equals(str7) || Boolean.TRUE.equals(str7);
        String str8 = map.get("placement");
        Object obj = map.get("nid");
        if (obj instanceof Number) {
            iIntValue = ((Number) obj).intValue();
        } else if (obj instanceof String) {
            try {
                iIntValue = Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                iIntValue = 0;
            }
        } else {
            iIntValue = 0;
        }
        String string = map.get("channel_id");
        if (!z && z6.d(context).e()) {
            return true;
        }
        if (str2 == null) {
            str2 = "";
        }
        boolean zA = a(str3);
        boolean zA2 = a(str4);
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent intent2 = new Intent("android.intent.action.MAIN");
        intent2.setPackage(packageName);
        intent2.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
        int i = DriveFile.MODE_READ_ONLY;
        if (listQueryIntentActivities == null || listQueryIntentActivities.size() <= 0) {
            intent = null;
        } else {
            intent = new Intent(intent2);
            intent.setFlags(DriveFile.MODE_READ_ONLY);
            intent.setClassName(listQueryIntentActivities.get(0).activityInfo.packageName, listQueryIntentActivities.get(0).activityInfo.name);
        }
        if (intent != null) {
            intent.setAction("com.tapjoy.PUSH_CLICK");
            intent.setPackage(context.getPackageName());
            intent.putExtra("com.tapjoy.PUSH_ID", str);
            if (str5 != null) {
                intent.putExtra(Tapjoy.INTENT_EXTRA_PUSH_PAYLOAD, str5);
            }
            if (str8 != null) {
                intent.putExtra("com.tapjoy.PUSH_PLACEMENT", str8);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 != 19) {
            i = i2 >= 23 ? 67108864 : 134217728;
        }
        PendingIntent activity = PendingIntent.getActivity(context.getApplicationContext(), iIntValue, intent, i);
        if (activity == null) {
            notification = null;
        } else {
            PackageManager packageManager2 = context.getPackageManager();
            try {
                ApplicationInfo applicationInfo = packageManager2.getApplicationInfo(context.getPackageName(), 128);
                int length = str2.length();
                CharSequence charSequenceFromHtml = str2;
                if (length == 0) {
                    charSequenceFromHtml = packageManager2.getApplicationLabel(applicationInfo);
                } else if (zA) {
                    charSequenceFromHtml = Html.fromHtml(str2);
                }
                if (zA) {
                    strFromHtml = Html.fromHtml(strFromHtml);
                }
                int iA = a(applicationInfo.metaData, "com.tapjoy.notification.icon", context);
                if (iA == 0) {
                    iA = applicationInfo.icon != 0 ? applicationInfo.icon : R.drawable.sym_def_app_icon;
                }
                int iA2 = a(applicationInfo.metaData, "com.tapjoy.notification.icon.large", context);
                Bitmap bitmapDecodeResource = iA2 != 0 ? BitmapFactory.decodeResource(context.getResources(), iA2) : null;
                String str9 = "tapjoy";
                if (string == null && applicationInfo.metaData != null) {
                    string = applicationInfo.metaData.getString("com.tapjoy.notification.default_channel_id", "tapjoy");
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (string == null || notificationManager.getNotificationChannel(string) == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel("tapjoy", "Tapjoy", 3));
                    } else {
                        str9 = string;
                    }
                } else {
                    str9 = null;
                }
                n9 n9Var = new n9(context, str9);
                Notification notification2 = n9Var.M;
                notification2.icon = iA;
                notification2.tickerText = n9.a(charSequenceFromHtml);
                n9Var.c = n9.a(charSequenceFromHtml);
                n9Var.d = n9.a((CharSequence) strFromHtml);
                n9Var.e = activity;
                n9Var.M.flags |= 16;
                n9Var.k = 0;
                m9 m9Var = new m9();
                m9Var.b = n9.a(charSequenceFromHtml);
                m9Var.e = n9.a((CharSequence) strFromHtml);
                n9 n9VarA = n9Var.a(m9Var);
                if (zA2) {
                    n9VarA.M.defaults = 1;
                }
                if (bitmapDecodeResource != null) {
                    n9VarA.h = bitmapDecodeResource;
                }
                p9 p9Var = new p9(n9VarA);
                o9 o9Var = p9Var.b.n;
                if (o9Var != null) {
                    m9 m9Var2 = (m9) o9Var;
                    Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(p9Var.f1887a).setBigContentTitle(m9Var2.b).bigText(m9Var2.e);
                    if (m9Var2.d) {
                        bigTextStyleBigText.setSummaryText(m9Var2.c);
                    }
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 26) {
                    notificationBuild = p9Var.f1887a.build();
                } else if (i3 >= 24) {
                    notificationBuild = p9Var.f1887a.build();
                    if (p9Var.g != 0) {
                        if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && p9Var.g == 2) {
                            p9Var.a(notificationBuild);
                        }
                        if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && p9Var.g == 1) {
                            p9Var.a(notificationBuild);
                        }
                    }
                } else if (i3 >= 21) {
                    p9Var.f1887a.setExtras(p9Var.f);
                    notificationBuild = p9Var.f1887a.build();
                    RemoteViews remoteViews = p9Var.c;
                    if (remoteViews != null) {
                        notificationBuild.contentView = remoteViews;
                    }
                    RemoteViews remoteViews2 = p9Var.d;
                    if (remoteViews2 != null) {
                        notificationBuild.bigContentView = remoteViews2;
                    }
                    RemoteViews remoteViews3 = p9Var.h;
                    if (remoteViews3 != null) {
                        notificationBuild.headsUpContentView = remoteViews3;
                    }
                    if (p9Var.g != 0) {
                        if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && p9Var.g == 2) {
                            p9Var.a(notificationBuild);
                        }
                        if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && p9Var.g == 1) {
                            p9Var.a(notificationBuild);
                        }
                    }
                } else if (i3 >= 20) {
                    p9Var.f1887a.setExtras(p9Var.f);
                    notificationBuild = p9Var.f1887a.build();
                    RemoteViews remoteViews4 = p9Var.c;
                    if (remoteViews4 != null) {
                        notificationBuild.contentView = remoteViews4;
                    }
                    RemoteViews remoteViews5 = p9Var.d;
                    if (remoteViews5 != null) {
                        notificationBuild.bigContentView = remoteViews5;
                    }
                    if (p9Var.g != 0) {
                        if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && p9Var.g == 2) {
                            p9Var.a(notificationBuild);
                        }
                        if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && p9Var.g == 1) {
                            p9Var.a(notificationBuild);
                        }
                    }
                } else {
                    SparseArray<Bundle> sparseArrayA = q9.a(p9Var.e);
                    if (sparseArrayA != null) {
                        p9Var.f.putSparseParcelableArray(NotificationCompatExtras.EXTRA_ACTION_EXTRAS, sparseArrayA);
                    }
                    p9Var.f1887a.setExtras(p9Var.f);
                    notificationBuild = p9Var.f1887a.build();
                    RemoteViews remoteViews6 = p9Var.c;
                    if (remoteViews6 != null) {
                        notificationBuild.contentView = remoteViews6;
                    }
                    RemoteViews remoteViews7 = p9Var.d;
                    if (remoteViews7 != null) {
                        notificationBuild.bigContentView = remoteViews7;
                    }
                }
                notification = notificationBuild;
                RemoteViews remoteViews8 = p9Var.b.E;
                if (remoteViews8 != null) {
                    notification.contentView = remoteViews8;
                }
                if (Build.VERSION.SDK_INT >= 21 && o9Var != null) {
                    p9Var.b.n.a();
                }
                if (o9Var != null) {
                    com.tapjoy.internal.a.a(notification);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                notification = null;
            }
        }
        if (!z6.d(context).a(context, str, z2)) {
            return true;
        }
        ((NotificationManager) context.getSystemService("notification")).notify(iIntValue, notification);
        return true;
    }

    public static boolean a(Object obj) {
        return Boolean.TRUE.equals(obj) || "true".equals(obj);
    }

    public static int a(Bundle bundle, String str, Context context) {
        if (bundle != null) {
            Object obj = bundle.get(str);
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                try {
                    if ("drawable".equals(context.getResources().getResourceTypeName(iIntValue))) {
                        return iIntValue;
                    }
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (obj != null) {
                Object[] objArr = {str};
                if (com.tapjoy.internal.a.b) {
                    com.tapjoy.internal.a.b("Tapjoy", "meta-data of %s invalid", objArr);
                }
            }
        }
        return 0;
    }
}
