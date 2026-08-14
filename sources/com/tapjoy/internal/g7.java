package com.tapjoy.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1806a;
    public r6 b;
    public String c;

    public static void a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception unused) {
        }
    }

    public abstract void a(a7 a7Var);

    public abstract boolean a();

    public abstract void b();
}
