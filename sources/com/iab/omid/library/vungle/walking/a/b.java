package com.iab.omid.library.vungle.walking.a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f1618a;
    protected final InterfaceC0096b d;

    public interface a {
        void a(b bVar);
    }

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.walking.a.b$b, reason: collision with other inner class name */
    public interface InterfaceC0096b {
        void a(JSONObject jSONObject);

        JSONObject b();
    }

    public b(InterfaceC0096b interfaceC0096b) {
        this.d = interfaceC0096b;
    }

    public void a(a aVar) {
        this.f1618a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f1618a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
