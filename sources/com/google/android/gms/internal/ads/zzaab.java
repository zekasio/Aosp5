package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzaab {
    public static final zzaab zzb = new zzaab() { // from class: com.google.android.gms.internal.ads.zzzz
        @Override // com.google.android.gms.internal.ads.zzaab
        public final zzzu[] zza() {
            int i = zzaaa.zza;
            return new zzzu[0];
        }

        @Override // com.google.android.gms.internal.ads.zzaab
        public final /* synthetic */ zzzu[] zzb(Uri uri, Map map) {
            return zzaaa.zza(this, uri, map);
        }
    };

    zzzu[] zza();

    zzzu[] zzb(Uri uri, Map map);
}
