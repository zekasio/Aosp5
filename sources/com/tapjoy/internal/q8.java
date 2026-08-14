package com.tapjoy.internal;

import android.view.View;
import android.widget.RelativeLayout;
import com.tapjoy.internal.u6;

/* JADX INFO: loaded from: classes2.dex */
public class q8 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h8 f1891a;
    public final /* synthetic */ RelativeLayout b;
    public final /* synthetic */ h8 c;
    public final /* synthetic */ a8 d;
    public final /* synthetic */ r8 e;

    public q8(r8 r8Var, h8 h8Var, RelativeLayout relativeLayout, h8 h8Var2, a8 a8Var) {
        this.e = r8Var;
        this.f1891a = h8Var;
        this.b = relativeLayout;
        this.c = h8Var2;
        this.d = a8Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        h8 h8Var = this.f1891a;
        if (h8Var != null) {
            h8Var.d();
            this.b.removeView(this.f1891a);
        }
        h8 h8Var2 = this.c;
        if (h8Var2 != null) {
            h8Var2.d();
            this.b.removeView(this.c);
        }
        ((u6.a) this.e.b).a(this.d);
    }
}
