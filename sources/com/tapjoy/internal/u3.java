package com.tapjoy.internal;

import com.tapjoy.internal.k3;
import com.tapjoy.internal.r3;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class u3 extends q3 {
    public u3(r3.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    @Override // com.tapjoy.internal.r3, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        v2 v2Var = v2.c;
        if (v2Var != null) {
            for (q2 q2Var : Collections.unmodifiableCollection(v2Var.f1928a)) {
                if (this.c.contains(q2Var.h)) {
                    k3 k3Var = q2Var.e;
                    if (this.e >= k3Var.e) {
                        k3.a aVar = k3Var.d;
                        k3.a aVar2 = k3.a.AD_STATE_NOTVISIBLE;
                        if (aVar != aVar2) {
                            k3Var.d = aVar2;
                            a3.f1744a.b(k3Var.e(), str);
                        }
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public /* synthetic */ String doInBackground(Object[] objArr) {
        return this.d.toString();
    }
}
