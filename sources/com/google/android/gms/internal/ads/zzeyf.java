package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeyf {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final long zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzeye zzi;
    public final Bundle zzj;
    public final String zzk;
    public final String zzl;

    zzeyf(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List listEmptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        jsonReader.beginObject();
        String strNextString = "";
        String strNextString2 = "";
        zzeye zzeyeVar = null;
        long jNextLong = 0;
        int iNextInt = 0;
        int iNextInt2 = 0;
        boolean zNextBoolean = false;
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("nofill_urls".equals(strNextName)) {
                listEmptyList = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString2 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                String str = strNextString5;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhF)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzeyeVar = new zzeye(jsonReader);
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString3 = jsonReader.nextString();
                } else if ("response_info_extras".equals(strNextName)) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzgs)).booleanValue()) {
                        try {
                            Bundle bundleZza = com.google.android.gms.ads.internal.util.zzbu.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                            if (bundleZza != null) {
                                bundle = bundleZza;
                            }
                        } catch (IOException | JSONException unused) {
                        } catch (IllegalStateException unused2) {
                            jsonReader.skipValue();
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                } else if ("adRequestPostBody".equals(strNextName)) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziy)).booleanValue()) {
                        strNextString5 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                } else if ("adRequestUrl".equals(strNextName)) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zziy)).booleanValue()) {
                        strNextString4 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                } else {
                    jsonReader.skipValue();
                }
                strNextString5 = str;
            }
        }
        jsonReader.endObject();
        this.zza = listEmptyList;
        this.zzc = iNextInt;
        this.zzb = strNextString;
        this.zzd = strNextString2;
        this.zze = iNextInt2;
        this.zzf = jNextLong;
        this.zzi = zzeyeVar;
        this.zzg = zNextBoolean;
        this.zzh = strNextString3;
        this.zzj = bundle;
        this.zzk = strNextString4;
        this.zzl = strNextString5;
    }
}
