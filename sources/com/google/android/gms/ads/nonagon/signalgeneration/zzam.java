package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbtn;
import com.google.android.gms.internal.ads.zzdue;
import com.google.android.gms.internal.ads.zzftq;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfut;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzam implements zzftq {
    private final Executor zza;
    private final zzdue zzb;

    public zzam(Executor executor, zzdue zzdueVar) {
        this.zza = executor;
        this.zzb = zzdueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftq
    public final /* bridge */ /* synthetic */ zzfut zza(Object obj) throws Exception {
        final zzbtn zzbtnVar = (zzbtn) obj;
        return zzfuj.zzm(this.zzb.zzb(zzbtnVar), new zzftq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzal
            @Override // com.google.android.gms.internal.ads.zzftq
            public final zzfut zza(Object obj2) {
                zzbtn zzbtnVar2 = zzbtnVar;
                zzao zzaoVar = new zzao(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    zzaoVar.zzb = zzay.zzb().zzi(zzbtnVar2.zza).toString();
                } catch (JSONException unused) {
                    zzaoVar.zzb = JsonUtils.EMPTY_JSON;
                }
                return zzfuj.zzh(zzaoVar);
            }
        }, this.zza);
    }
}
