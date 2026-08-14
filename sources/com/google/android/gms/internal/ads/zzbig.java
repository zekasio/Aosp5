package com.google.android.gms.internal.ads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;
import cz.msebera.android.httpclient.protocol.HTTP;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbig implements zzbhp {
    private final Context zza;

    public zzbig(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbhp
    public final void zza(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType(HTTP.PLAIN_TEXT_TYPE);
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey(TJAdUnitConstants.String.TITLE)) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get(TJAdUnitConstants.String.TITLE));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzQ(this.zza, intent);
        } catch (ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
