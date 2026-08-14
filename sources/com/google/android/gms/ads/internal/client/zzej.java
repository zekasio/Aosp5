package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbjt;
import com.google.android.gms.internal.ads.zzbju;
import com.google.android.gms.internal.ads.zzbmy;
import com.google.android.gms.internal.ads.zzbza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzej {
    private static zzej zza;
    private zzco zzg;
    private final Object zzb = new Object();
    private boolean zzd = false;
    private boolean zze = false;
    private final Object zzf = new Object();

    @Nullable
    private OnAdInspectorClosedListener zzh = null;
    private RequestConfiguration zzi = new RequestConfiguration.Builder().build();
    private final ArrayList zzc = new ArrayList();

    private zzej() {
    }

    private final void zzA(RequestConfiguration requestConfiguration) {
        try {
            this.zzg.zzu(new zzff(requestConfiguration));
        } catch (RemoteException e) {
            zzbza.zzh("Unable to set request configuration parcel.", e);
        }
    }

    public static zzej zzf() {
        zzej zzejVar;
        synchronized (zzej.class) {
            if (zza == null) {
                zza = new zzej();
            }
            zzejVar = zza;
        }
        return zzejVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializationStatus zzx(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbjl zzbjlVar = (zzbjl) it.next();
            map.put(zzbjlVar.zza, new zzbjt(zzbjlVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbjlVar.zzd, zzbjlVar.zzc));
        }
        return new zzbju(map);
    }

    private final void zzy(Context context, @Nullable String str) {
        try {
            zzbmy.zza().zzb(context, null);
            this.zzg.zzk();
            this.zzg.zzl(null, ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            zzbza.zzk("MobileAdsSettingManager initialization failed", e);
        }
    }

    private final void zzz(Context context) {
        if (this.zzg == null) {
            this.zzg = (zzco) new zzaq(zzay.zza(), context).zzd(context, false);
        }
    }

    public final RequestConfiguration zzc() {
        return this.zzi;
    }

    public final InitializationStatus zze() {
        InitializationStatus initializationStatusZzx;
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                initializationStatusZzx = zzx(this.zzg.zzg());
            } catch (RemoteException unused) {
                zzbza.zzg("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeb
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final Map getAdapterStatusMap() {
                        zzej zzejVar = this.zza;
                        HashMap map = new HashMap();
                        map.put("com.google.android.gms.ads.MobileAds", new zzee(zzejVar));
                        return map;
                    }
                };
            }
        }
        return initializationStatusZzx;
    }

    public final void zzk(Context context) {
        synchronized (this.zzf) {
            zzz(context);
            try {
                this.zzg.zzi();
            } catch (RemoteException unused) {
                zzbza.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzl(boolean z) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to enable/disable Same App Key.");
            try {
                this.zzg.zzj(z);
            } catch (RemoteException e) {
                zzbza.zzh("Unable to " + (z ? "enable" : "disable") + " Same App Key.", e);
                if (e.getMessage() != null && e.getMessage().toLowerCase(Locale.ROOT).contains("paid")) {
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077 A[Catch: all -> 0x005e, TryCatch #2 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0066, B:36:0x0077, B:38:0x0089, B:45:0x00cc, B:39:0x0099, B:41:0x00a7, B:43:0x00b9, B:44:0x00c4, B:28:0x0058, B:33:0x0061), top: B:54:0x0030, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099 A[Catch: all -> 0x005e, TryCatch #2 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0066, B:36:0x0077, B:38:0x0089, B:45:0x00cc, B:39:0x0099, B:41:0x00a7, B:43:0x00b9, B:44:0x00c4, B:28:0x0058, B:33:0x0061), top: B:54:0x0030, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4 A[Catch: all -> 0x005e, TryCatch #2 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0066, B:36:0x0077, B:38:0x0089, B:45:0x00cc, B:39:0x0099, B:41:0x00a7, B:43:0x00b9, B:44:0x00c4, B:28:0x0058, B:33:0x0061), top: B:54:0x0030, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzm(final android.content.Context r3, @javax.annotation.Nullable java.lang.String r4, @javax.annotation.Nullable com.google.android.gms.ads.initialization.OnInitializationCompleteListener r5) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzej.zzm(android.content.Context, java.lang.String, com.google.android.gms.ads.initialization.OnInitializationCompleteListener):void");
    }

    final /* synthetic */ void zzn(Context context, String str) {
        synchronized (this.zzf) {
            zzy(context, null);
        }
    }

    final /* synthetic */ void zzo(Context context, String str) {
        synchronized (this.zzf) {
            zzy(context, null);
        }
    }

    public final void zzp(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzf) {
            zzz(context);
            this.zzh = onAdInspectorClosedListener;
            try {
                this.zzg.zzm(new zzeg(null));
            } catch (RemoteException unused) {
                zzbza.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzq(Context context, String str) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzg.zzn(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e) {
                zzbza.zzh("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzr(Class cls) {
        synchronized (this.zzf) {
            try {
                this.zzg.zzh(cls.getCanonicalName());
            } catch (RemoteException e) {
                zzbza.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void zzs(boolean z) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzg.zzp(z);
            } catch (RemoteException e) {
                zzbza.zzh("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzt(float f) {
        boolean z = true;
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzf) {
            if (this.zzg == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzg.zzq(f);
            } catch (RemoteException e) {
                zzbza.zzh("Unable to set app volume.", e);
            }
        }
    }

    public final void zzu(String str) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.zzg.zzt(str);
            } catch (RemoteException e) {
                zzbza.zzh("Unable to set plugin.", e);
            }
        }
    }

    public final void zzv(RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzf) {
            RequestConfiguration requestConfiguration2 = this.zzi;
            this.zzi = requestConfiguration;
            if (this.zzg == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zzA(requestConfiguration);
            }
        }
    }

    public final float zza() {
        synchronized (this.zzf) {
            zzco zzcoVar = this.zzg;
            float fZze = 1.0f;
            if (zzcoVar == null) {
                return 1.0f;
            }
            try {
                fZze = zzcoVar.zze();
            } catch (RemoteException e) {
                zzbza.zzh("Unable to get app volume.", e);
            }
            return fZze;
        }
    }

    public final boolean zzw() {
        synchronized (this.zzf) {
            zzco zzcoVar = this.zzg;
            boolean zZzv = false;
            if (zzcoVar == null) {
                return false;
            }
            try {
                zZzv = zzcoVar.zzv();
            } catch (RemoteException e) {
                zzbza.zzh("Unable to get app mute state.", e);
            }
            return zZzv;
        }
    }
}
