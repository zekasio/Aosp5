package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJConnectListener;
import com.tapjoy.internal.c6;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes2.dex */
public class q4 extends p4 {
    public final c6 i = new a();

    public class a extends c6 {
        public a() {
        }

        @Override // com.tapjoy.internal.c6
        public boolean a(Context context, String str, Hashtable<String, ?> hashtable, TJConnectListener tJConnectListener) {
            return q4.super.a(context, str, hashtable, tJConnectListener);
        }
    }

    @Override // com.tapjoy.internal.p4, com.tapjoy.internal.o4
    public boolean a(Context context, String str, Hashtable<String, ?> hashtable, TJConnectListener tJConnectListener) {
        c6 c6Var = this.i;
        c6Var.f1768a.lock();
        if (tJConnectListener != null) {
            try {
                c6Var.d.addLast((TJConnectListener) com.tapjoy.internal.a.a(tJConnectListener, (Class<TJConnectListener>) TJConnectListener.class));
            } finally {
                c6Var.f1768a.unlock();
            }
        }
        c6.a aVar = new c6.a(c6Var, context, str, hashtable);
        int iOrdinal = c6Var.c.ordinal();
        if (iOrdinal == 0) {
            c6Var.g = aVar;
            s5.b.addObserver(new a6(c6Var));
            if (!c6Var.a(aVar.f1769a, aVar.b, aVar.c, new b6(c6Var))) {
                c6Var.d.clear();
                c6Var.f1768a.unlock();
                return false;
            }
            c6.c cVar = c6.c.TRYING;
            c6.c cVar2 = c6.c.STOPPED;
            c6Var.a(cVar);
            return true;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            c6Var.h = aVar;
        } else if (iOrdinal == 3) {
            c6Var.h = aVar;
            c6Var.a();
        } else {
            if (iOrdinal != 4) {
                c6Var.a(c6.c.STOPPED);
                c6Var.f1768a.unlock();
                return false;
            }
            c6Var.a(true);
        }
        return true;
    }
}
