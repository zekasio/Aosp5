package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import com.tapjoy.TapjoyAuctionFlags;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzam {
    private final Application zza;
    private final SharedPreferences zzb;
    private final Set<String> zzc;

    zzam(Application application) {
        this.zza = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.zzb = sharedPreferences;
        this.zzc = new HashSet(sharedPreferences.getStringSet("written_values", Collections.emptySet()));
    }

    public final int zza() {
        return this.zzb.getInt("consent_status", 0);
    }

    public final Map<String, String> zzb() {
        String string;
        Application application = this.zza;
        Set<String> stringSet = this.zzb.getStringSet("stored_info", Collections.emptySet());
        HashMap map = new HashMap();
        for (String str : stringSet) {
            zzby zzbyVarZza = zzca.zza(application, str);
            if (zzbyVarZza == null) {
                String strValueOf = String.valueOf(str);
                Log.d("UserMessagingPlatform", strValueOf.length() != 0 ? "Fetching request info: failed for key: ".concat(strValueOf) : new String("Fetching request info: failed for key: "));
            } else {
                Object obj = application.getSharedPreferences(zzbyVarZza.zza, 0).getAll().get(zzbyVarZza.zzb);
                if (obj == null) {
                    String strValueOf2 = String.valueOf(str);
                    Log.d("UserMessagingPlatform", strValueOf2.length() != 0 ? "Stored info not exists: ".concat(strValueOf2) : new String("Stored info not exists: "));
                } else {
                    if (obj instanceof Boolean) {
                        string = true != ((Boolean) obj).booleanValue() ? "0" : TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE;
                    } else if (obj instanceof Number) {
                        string = obj.toString();
                    } else if (obj instanceof String) {
                        string = (String) obj;
                    } else {
                        String strValueOf3 = String.valueOf(str);
                        Log.d("UserMessagingPlatform", strValueOf3.length() != 0 ? "Failed to fetch stored info: ".concat(strValueOf3) : new String("Failed to fetch stored info: "));
                    }
                    map.put(str, string);
                }
            }
        }
        return map;
    }

    public final Set<String> zzc() {
        return this.zzc;
    }

    public final void zzd() {
        zzca.zzb(this.zza, this.zzc);
        this.zzc.clear();
        this.zzb.edit().remove("stored_info").remove("consent_status").remove("consent_type").apply();
    }

    public final void zze() {
        this.zzb.edit().putStringSet("written_values", this.zzc).apply();
    }

    public final void zzf(int i) {
        this.zzb.edit().putInt("consent_status", i).apply();
    }

    public final void zzg(Set<String> set) {
        this.zzb.edit().putStringSet("stored_info", set).apply();
    }
}
