package com.tapjoy.internal;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r3 extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f1896a;
    public final b b;

    public interface a {
    }

    public interface b {
    }

    public r3(b bVar) {
        this.b = bVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f1896a;
        if (aVar != null) {
            s3 s3Var = (s3) aVar;
            s3Var.d = null;
            s3Var.a();
        }
    }
}
