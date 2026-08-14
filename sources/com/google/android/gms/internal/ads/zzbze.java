package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbze {
    public static Context zza(Context context) throws zzbzd {
        return zzc(context).getModuleContext();
    }

    public static Object zzb(Context context, String str, zzbzc zzbzcVar) throws zzbzd {
        try {
            return zzbzcVar.zza(zzc(context).instantiate(str));
        } catch (Exception e) {
            throw new zzbzd(e);
        }
    }

    private static DynamiteModule zzc(Context context) throws zzbzd {
        try {
            return DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new zzbzd(e);
        }
    }
}
