package com.tapjoy.internal;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class n9 {
    public Bundle A;
    public Notification D;
    public RemoteViews E;
    public RemoteViews F;
    public RemoteViews G;
    public String H;
    public String J;
    public long K;
    public Notification M;

    @Deprecated
    public ArrayList<String> N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1867a;
    public CharSequence c;
    public CharSequence d;
    public PendingIntent e;
    public PendingIntent f;
    public RemoteViews g;
    public Bitmap h;
    public CharSequence i;
    public int j;
    public int k;
    public boolean m;
    public o9 n;
    public CharSequence o;
    public CharSequence[] p;
    public int q;
    public int r;
    public boolean s;
    public String t;
    public boolean u;
    public String v;
    public boolean x;
    public boolean y;
    public String z;
    public ArrayList<l9> b = new ArrayList<>();
    public boolean l = true;
    public boolean w = false;
    public int B = 0;
    public int C = 0;
    public int I = 0;
    public int L = 0;

    public n9(Context context, String str) {
        Notification notification = new Notification();
        this.M = notification;
        this.f1867a = context;
        this.H = str;
        notification.when = System.currentTimeMillis();
        this.M.audioStreamType = -1;
        this.k = 0;
        this.N = new ArrayList<>();
    }

    public n9 a(o9 o9Var) {
        if (this.n != o9Var) {
            this.n = o9Var;
            if (o9Var != null && o9Var.f1876a != this) {
                o9Var.f1876a = this;
                n9 n9Var = o9Var.f1876a;
                if (n9Var != null) {
                    n9Var.a(o9Var);
                }
            }
        }
        return this;
    }

    public static CharSequence a(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }
}
