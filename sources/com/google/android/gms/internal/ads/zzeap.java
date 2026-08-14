package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.tapjoy.TapjoyConstants;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeap implements zzeaq {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzffp zzf(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L20
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 1
            goto L35
        L20:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 2
            goto L35
        L2a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L43
            if (r4 == r3) goto L40
            if (r4 == r2) goto L3d
            r4 = 0
            return r4
        L3d:
            com.google.android.gms.internal.ads.zzffp r4 = com.google.android.gms.internal.ads.zzffp.VIDEO
            return r4
        L40:
            com.google.android.gms.internal.ads.zzffp r4 = com.google.android.gms.internal.ads.zzffp.NATIVE_DISPLAY
            return r4
        L43:
            com.google.android.gms.internal.ads.zzffp r4 = com.google.android.gms.internal.ads.zzffp.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeap.zzf(java.lang.String):com.google.android.gms.internal.ads.zzffp");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzffr zzg(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L20
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 2
            goto L35
        L20:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 1
            goto L35
        L2a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L44
            if (r4 == r3) goto L41
            if (r4 == r2) goto L3e
            com.google.android.gms.internal.ads.zzffr r4 = com.google.android.gms.internal.ads.zzffr.UNSPECIFIED
            return r4
        L3e:
            com.google.android.gms.internal.ads.zzffr r4 = com.google.android.gms.internal.ads.zzffr.ONE_PIXEL
            return r4
        L41:
            com.google.android.gms.internal.ads.zzffr r4 = com.google.android.gms.internal.ads.zzffr.DEFINED_BY_JAVASCRIPT
            return r4
        L44:
            com.google.android.gms.internal.ads.zzffr r4 = com.google.android.gms.internal.ads.zzffr.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeap.zzg(java.lang.String):com.google.android.gms.internal.ads.zzffr");
    }

    private static zzffs zzh(String str) {
        return TapjoyConstants.TJC_PLUGIN_NATIVE.equals(str) ? zzffs.NATIVE : "javascript".equals(str) ? zzffs.JAVASCRIPT : zzffs.NONE;
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final IObjectWrapper zza(String str, WebView webView, String str2, String str3, String str4, zzeas zzeasVar, zzear zzearVar, String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue() || !zzffi.zzb()) {
            return null;
        }
        zzfft zzfftVarZza = zzfft.zza("Google", str);
        zzffs zzffsVarZzh = zzh("javascript");
        zzffp zzffpVarZzf = zzf(zzearVar.toString());
        if (zzffsVarZzh == zzffs.NONE) {
            zzbza.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzffpVarZzf == null) {
            zzbza.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzearVar))));
            return null;
        }
        zzffs zzffsVarZzh2 = zzh(str4);
        if (zzffpVarZzf == zzffp.VIDEO && zzffsVarZzh2 == zzffs.NONE) {
            zzbza.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return ObjectWrapper.wrap(zzffk.zza(zzffl.zza(zzffpVarZzf, zzg(zzeasVar.toString()), zzffsVarZzh, zzffsVarZzh2, true), zzffm.zzb(zzfftVarZza, webView, str5, "")));
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final IObjectWrapper zzb(String str, WebView webView, String str2, String str3, String str4, String str5, zzeas zzeasVar, zzear zzearVar, String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue() || !zzffi.zzb()) {
            return null;
        }
        zzfft zzfftVarZza = zzfft.zza(str5, str);
        zzffs zzffsVarZzh = zzh("javascript");
        zzffs zzffsVarZzh2 = zzh(str4);
        zzffp zzffpVarZzf = zzf(zzearVar.toString());
        if (zzffsVarZzh == zzffs.NONE) {
            zzbza.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzffpVarZzf == null) {
            zzbza.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(String.valueOf(zzearVar))));
            return null;
        }
        if (zzffpVarZzf == zzffp.VIDEO && zzffsVarZzh2 == zzffs.NONE) {
            zzbza.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return ObjectWrapper.wrap(zzffk.zza(zzffl.zza(zzffpVarZzf, zzg(zzeasVar.toString()), zzffsVarZzh, zzffsVarZzh2, true), zzffm.zzc(zzfftVarZza, webView, str6, "")));
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final void zzc(IObjectWrapper iObjectWrapper, View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue() && zzffi.zzb()) {
            Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (objUnwrap instanceof zzffk) {
                ((zzffk) objUnwrap).zzd(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final void zzd(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue() && zzffi.zzb()) {
            Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (objUnwrap instanceof zzffk) {
                ((zzffk) objUnwrap).zze();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final boolean zze(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzeC)).booleanValue()) {
            zzbza.zzj("Omid flag is disabled");
            return false;
        }
        if (zzffi.zzb()) {
            return true;
        }
        zzffi.zza(context);
        return zzffi.zzb();
    }
}
