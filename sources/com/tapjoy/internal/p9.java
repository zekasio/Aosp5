package com.tapjoy.internal;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationCompatExtras;
import androidx.core.app.NotificationManagerCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class p9 implements k9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Notification.Builder f1887a;
    public final n9 b;
    public RemoteViews c;
    public RemoteViews d;
    public final List<Bundle> e = new ArrayList();
    public final Bundle f = new Bundle();
    public int g;
    public RemoteViews h;

    public p9(n9 n9Var) {
        ArrayList<String> arrayList;
        this.b = n9Var;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1887a = new Notification.Builder(n9Var.f1867a, n9Var.H);
        } else {
            this.f1887a = new Notification.Builder(n9Var.f1867a);
        }
        Notification notification = n9Var.M;
        this.f1887a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, n9Var.g).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(n9Var.c).setContentText(n9Var.d).setContentInfo(n9Var.i).setContentIntent(n9Var.e).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(n9Var.f, (notification.flags & 128) != 0).setLargeIcon(n9Var.h).setNumber(n9Var.j).setProgress(n9Var.q, n9Var.r, n9Var.s);
        if (Build.VERSION.SDK_INT < 21) {
            this.f1887a.setSound(notification.sound, notification.audioStreamType);
        }
        this.f1887a.setSubText(n9Var.o).setUsesChronometer(n9Var.m).setPriority(n9Var.k);
        for (l9 l9Var : n9Var.b) {
            if (Build.VERSION.SDK_INT >= 20) {
                Notification.Action.Builder builder = new Notification.Action.Builder(l9Var.b(), l9Var.c(), l9Var.a());
                r9[] r9VarArr = l9Var.b;
                if (r9VarArr != null) {
                    int length = r9VarArr.length;
                    RemoteInput[] remoteInputArr = new RemoteInput[length];
                    if (r9VarArr.length > 0) {
                        r9 r9Var = r9VarArr[0];
                        throw null;
                    }
                    for (int i = 0; i < length; i++) {
                        builder.addRemoteInput(remoteInputArr[i]);
                    }
                }
                Bundle bundle = l9Var.f1845a;
                Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
                bundle2.putBoolean("android.support.allowGeneratedReplies", l9Var.d);
                if (Build.VERSION.SDK_INT >= 24) {
                    builder.setAllowGeneratedReplies(l9Var.d);
                }
                builder.addExtras(bundle2);
                this.f1887a.addAction(builder.build());
            } else {
                this.e.add(q9.a(this.f1887a, l9Var));
            }
        }
        Bundle bundle3 = n9Var.A;
        if (bundle3 != null) {
            this.f.putAll(bundle3);
        }
        if (Build.VERSION.SDK_INT < 20) {
            if (n9Var.w) {
                this.f.putBoolean(NotificationCompatExtras.EXTRA_LOCAL_ONLY, true);
            }
            String str = n9Var.t;
            if (str != null) {
                this.f.putString(NotificationCompatExtras.EXTRA_GROUP_KEY, str);
                if (n9Var.u) {
                    this.f.putBoolean(NotificationCompatExtras.EXTRA_GROUP_SUMMARY, true);
                } else {
                    this.f.putBoolean(NotificationManagerCompat.EXTRA_USE_SIDE_CHANNEL, true);
                }
            }
            String str2 = n9Var.v;
            if (str2 != null) {
                this.f.putString(NotificationCompatExtras.EXTRA_SORT_KEY, str2);
            }
        }
        this.c = n9Var.E;
        this.d = n9Var.F;
        this.f1887a.setShowWhen(n9Var.l);
        if (Build.VERSION.SDK_INT < 21 && (arrayList = n9Var.N) != null && !arrayList.isEmpty()) {
            Bundle bundle4 = this.f;
            ArrayList<String> arrayList2 = n9Var.N;
            bundle4.putStringArray(NotificationCompat.EXTRA_PEOPLE, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f1887a.setLocalOnly(n9Var.w).setGroup(n9Var.t).setGroupSummary(n9Var.u).setSortKey(n9Var.v);
            this.g = n9Var.L;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f1887a.setCategory(n9Var.z).setColor(n9Var.B).setVisibility(n9Var.C).setPublicVersion(n9Var.D).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it = n9Var.N.iterator();
            while (it.hasNext()) {
                this.f1887a.addPerson(it.next());
            }
            this.h = n9Var.G;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1887a.setExtras(n9Var.A).setRemoteInputHistory(n9Var.p);
            RemoteViews remoteViews = n9Var.E;
            if (remoteViews != null) {
                this.f1887a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = n9Var.F;
            if (remoteViews2 != null) {
                this.f1887a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = n9Var.G;
            if (remoteViews3 != null) {
                this.f1887a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1887a.setBadgeIconType(n9Var.I).setShortcutId(n9Var.J).setTimeoutAfter(n9Var.K).setGroupAlertBehavior(n9Var.L);
            if (n9Var.y) {
                this.f1887a.setColorized(n9Var.x);
            }
            if (TextUtils.isEmpty(n9Var.H)) {
                return;
            }
            this.f1887a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
    }

    public final void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
