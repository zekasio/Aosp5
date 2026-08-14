package com.tapjoy.internal;

import android.text.TextUtils;
import com.tapjoy.internal.k3;
import com.tapjoy.internal.r3;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class v3 extends q3 {
    public v3(r3.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    @Override // com.tapjoy.internal.r3, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        v2 v2Var;
        if (!TextUtils.isEmpty(str) && (v2Var = v2.c) != null) {
            for (q2 q2Var : Collections.unmodifiableCollection(v2Var.f1928a)) {
                if (this.c.contains(q2Var.h)) {
                    k3 k3Var = q2Var.e;
                    if (this.e >= k3Var.e) {
                        k3Var.d = k3.a.AD_STATE_VISIBLE;
                        a3.f1744a.b(k3Var.e(), str);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public /* synthetic */ String doInBackground(Object[] objArr) {
        if (h3.b(this.d, ((w3) this.b).f1935a)) {
            return null;
        }
        ((w3) this.b).a(this.d);
        return this.d.toString();
    }
}
