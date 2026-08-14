package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f1822a;
    public final j b;
    public final j c;

    public i7(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("fiverocks", 0);
        this.f1822a = sharedPreferences;
        this.b = new j(sharedPreferences, "noMoreToday.date", null);
        this.c = new j(sharedPreferences, "noMoreToday.actionIds", null);
        a();
    }

    public final void a() {
        String strB = this.b.b();
        if (strB == null || new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date()).equals(strB)) {
            return;
        }
        this.b.a(null);
        this.c.a(null);
    }
}
