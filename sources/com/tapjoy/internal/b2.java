package com.tapjoy.internal;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b2 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1758a;
    public final AudioManager b;
    public final y1 c;
    public final a2 d;
    public float e;

    public b2(Handler handler, Context context, y1 y1Var, a2 a2Var) {
        super(handler);
        this.f1758a = context;
        this.b = (AudioManager) context.getSystemService("audio");
        this.c = y1Var;
        this.d = a2Var;
    }

    public final float a() {
        return this.c.a(this.b.getStreamVolume(3), this.b.getStreamMaxVolume(3));
    }

    public final void b() {
        a2 a2Var = this.d;
        float f = this.e;
        b3 b3Var = (b3) a2Var;
        b3Var.f1759a = f;
        if (b3Var.e == null) {
            b3Var.e = v2.c;
        }
        Iterator it = Collections.unmodifiableCollection(b3Var.e.b).iterator();
        while (it.hasNext()) {
            ((q2) it.next()).e.a(f);
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float fA = this.c.a(this.b.getStreamVolume(3), this.b.getStreamMaxVolume(3));
        if (fA != this.e) {
            this.e = fA;
            b();
        }
    }
}
