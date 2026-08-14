package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.tapjoy.TapjoyConstants;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeka implements zzepn {
    private final zzfuu zza;
    private final zzdnd zzb;
    private final zzdrk zzc;
    private final zzekd zzd;

    public zzeka(zzfuu zzfuuVar, zzdnd zzdndVar, zzdrk zzdrkVar, zzekd zzekdVar) {
        this.zza = zzfuuVar;
        this.zzb = zzdndVar;
        this.zzc = zzdrkVar;
        this.zzd = zzekdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        if (zzfoj.zzd((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbk)) || this.zzd.zzb() || !this.zzc.zzt()) {
            return zzfuj.zzh(new zzekc(new Bundle(), null));
        }
        this.zzd.zza(true);
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzejz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ zzekc zzc() throws Exception {
        List<String> listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbk)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                zzezs zzezsVarZzc = this.zzb.zzc(str, new JSONObject());
                zzezsVarZzc.zzC();
                Bundle bundle2 = new Bundle();
                try {
                    zzbpq zzbpqVarZzf = zzezsVarZzc.zzf();
                    if (zzbpqVarZzf != null) {
                        bundle2.putString("sdk_version", zzbpqVarZzf.toString());
                    }
                } catch (zzezc unused) {
                }
                try {
                    zzbpq zzbpqVarZze = zzezsVarZzc.zze();
                    if (zzbpqVarZze != null) {
                        bundle2.putString(TapjoyConstants.TJC_ADAPTER_VERSION, zzbpqVarZze.toString());
                    }
                } catch (zzezc unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzezc unused3) {
            }
        }
        return new zzekc(bundle, null);
    }
}
