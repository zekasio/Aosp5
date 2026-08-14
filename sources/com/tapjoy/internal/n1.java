package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n1<Result> {
    public static ExecutorService b;
    public static q1 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Future<?> f1859a;

    public abstract Result a(z0 z0Var);

    public Result a(URI uri, InputStream inputStream) throws IOException {
        z0 z0VarA = z0.a(inputStream);
        if (z0VarA.f1955a == null) {
            z0VarA.f1955a = new HashMap<>();
        }
        z0VarA.f1955a.put("BASE_URI", uri);
        a1 a1Var = (a1) z0VarA;
        try {
            a1Var.k();
            Result resultA = null;
            String strW = null;
            int iR = 0;
            while (a1Var.o()) {
                String strT = a1Var.t();
                if ("status".equals(strT)) {
                    iR = a1Var.r();
                } else if (TJAdUnitConstants.String.MESSAGE.equals(strT)) {
                    strW = a1Var.w();
                } else if (TJAdUnitConstants.String.DATA.equals(strT)) {
                    resultA = a(z0VarA);
                } else {
                    a1Var.B();
                }
            }
            a1Var.n();
            if (iR == 200) {
                return resultA;
            }
            throw new o1(iR, strW);
        } finally {
            a1Var.close();
        }
    }

    public synchronized /* bridge */ /* synthetic */ void a(s1 s1Var, ExecutorService executorService) {
        b(s1Var, executorService);
    }

    public Map b() {
        return new LinkedHashMap();
    }

    public abstract String c();

    public boolean d() {
        Future<?> future = this.f1859a;
        return future == null || future.isDone();
    }

    private synchronized void b(s1<Result> s1Var, ExecutorService executorService) {
        if (!d()) {
            throw new IllegalStateException("Call has not completed");
        }
        this.f1859a = executorService.submit(new p1(this, s1Var));
    }

    public Object a() {
        return ((r1) c).a(this);
    }
}
