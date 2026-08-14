package com.tapjoy.internal;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class s8 extends z {
    public final v7 d;
    public final t8 e;
    public r f;

    public s8(Context context, v7 v7Var, t8 t8Var) {
        super(context);
        this.d = v7Var;
        this.e = t8Var;
        addView(t8Var, new ViewGroup.LayoutParams(-1, -1));
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    @Override // com.tapjoy.internal.z, com.tapjoy.internal.a0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            com.tapjoy.internal.r r0 = com.tapjoy.internal.r.a(r0)
            com.tapjoy.internal.v7 r1 = r6.d
            boolean r1 = r1.b()
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L71
            com.tapjoy.internal.v7 r1 = r6.d
            boolean r1 = r1.a()
            if (r1 == 0) goto L57
            boolean r1 = r0.c()
            if (r1 == 0) goto L24
            com.tapjoy.internal.r r0 = com.tapjoy.internal.r.PORTRAIT
            goto L53
        L24:
            boolean r0 = r0.b()
            if (r0 == 0) goto L2d
            com.tapjoy.internal.r r0 = com.tapjoy.internal.r.LANDSCAPE
            goto L53
        L2d:
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            if (r0 == r4) goto L46
            r1 = 2
            if (r0 == r1) goto L43
            com.tapjoy.internal.r r0 = com.tapjoy.internal.r.UNSPECIFIED
            goto L48
        L43:
            com.tapjoy.internal.r r0 = com.tapjoy.internal.r.LANDSCAPE
            goto L48
        L46:
            com.tapjoy.internal.r r0 = com.tapjoy.internal.r.PORTRAIT
        L48:
            boolean r0 = r0.c()
            if (r0 == 0) goto L51
            com.tapjoy.internal.r r0 = com.tapjoy.internal.r.PORTRAIT
            goto L53
        L51:
            com.tapjoy.internal.r r0 = com.tapjoy.internal.r.LANDSCAPE
        L53:
            r6.setRotationCount(r3)
            goto L8b
        L57:
            com.tapjoy.internal.r r1 = com.tapjoy.internal.r.PORTRAIT
            boolean r5 = r0.b()
            if (r5 == 0) goto L6d
            int r0 = r0.a()
            if (r0 != r2) goto L69
            r6.setRotationCount(r4)
            goto L8a
        L69:
            r6.setRotationCount(r2)
            goto L8a
        L6d:
            r6.setRotationCount(r3)
            goto L8a
        L71:
            com.tapjoy.internal.r r1 = com.tapjoy.internal.r.LANDSCAPE
            boolean r5 = r0.c()
            if (r5 == 0) goto L87
            int r0 = r0.a()
            if (r0 != r2) goto L83
            r6.setRotationCount(r4)
            goto L8a
        L83:
            r6.setRotationCount(r4)
            goto L8a
        L87:
            r6.setRotationCount(r3)
        L8a:
            r0 = r1
        L8b:
            com.tapjoy.internal.r r1 = r6.f
            if (r1 == r0) goto L9a
            r6.f = r0
            com.tapjoy.internal.t8 r1 = r6.e
            boolean r0 = r0.b()
            r1.setLandscape(r0)
        L9a:
            super.onMeasure(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.s8.onMeasure(int, int):void");
    }
}
