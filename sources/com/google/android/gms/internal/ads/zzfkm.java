package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfkm extends zzfka {
    private zzfok<Integer> zza;
    private zzfok<Integer> zzb;
    private zzfkl zzc;
    private HttpURLConnection zzd;

    zzfkm() {
        this(new zzfok() { // from class: com.google.android.gms.internal.ads.zzfkj
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                return zzfkm.zzf();
            }
        }, new zzfok() { // from class: com.google.android.gms.internal.ads.zzfkk
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                return zzfkm.zzg();
            }
        }, null);
    }

    zzfkm(zzfok<Integer> zzfokVar, zzfok<Integer> zzfokVar2, zzfkl zzfklVar) {
        this.zza = zzfokVar;
        this.zzb = zzfokVar2;
        this.zzc = zzfklVar;
    }

    static /* synthetic */ Integer zzf() {
        return -1;
    }

    static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfkb.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfkb.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfkl zzfklVar = this.zzc;
        zzfklVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfklVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfkl zzfklVar, final int i, final int i2) throws IOException {
        this.zza = new zzfok() { // from class: com.google.android.gms.internal.ads.zzfkc
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzb = new zzfok() { // from class: com.google.android.gms.internal.ads.zzfkd
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.zzc = zzfklVar;
        return zzm();
    }

    public HttpURLConnection zzo(final Network network, final URL url, final int i, final int i2) throws IOException {
        this.zza = new zzfok() { // from class: com.google.android.gms.internal.ads.zzfke
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzb = new zzfok() { // from class: com.google.android.gms.internal.ads.zzfkf
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.zzc = new zzfkl() { // from class: com.google.android.gms.internal.ads.zzfkg
            @Override // com.google.android.gms.internal.ads.zzfkl
            public final URLConnection zza() {
                return network.openConnection(url);
            }
        };
        return zzm();
    }

    public URLConnection zzr(final URL url, final int i) throws IOException {
        this.zza = new zzfok() { // from class: com.google.android.gms.internal.ads.zzfkh
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzc = new zzfkl() { // from class: com.google.android.gms.internal.ads.zzfki
            @Override // com.google.android.gms.internal.ads.zzfkl
            public final URLConnection zza() {
                return url.openConnection();
            }
        };
        return zzm();
    }
}
