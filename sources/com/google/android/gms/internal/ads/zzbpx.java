package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.drive.DriveFile;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TJAdUnitConstants;
import cz.msebera.android.httpclient.HttpHeaders;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbpx extends zzbqf {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbpx(zzcei zzceiVar, Map map) {
        super(zzceiVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzceiVar.zzi();
        this.zzc = zze("description");
        this.zzf = zze("summary");
        this.zzd = zzd("start_ticks");
        this.zze = zzd("end_ticks");
        this.zzg = zze(FirebaseAnalytics.Param.LOCATION);
    }

    private final long zzd(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String zze(String str) {
        return TextUtils.isEmpty((CharSequence) this.zza.get(str)) ? "" : (String) this.zza.get(str);
    }

    final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra(TJAdUnitConstants.String.TITLE, this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j = this.zzd;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.zze;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(DriveFile.MODE_READ_ONLY);
        return data;
    }

    public final void zzc() {
        if (this.zzb == null) {
            zzg("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (!new zzbab(this.zzb).zzb()) {
            zzg("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder builderZzG = com.google.android.gms.ads.internal.util.zzs.zzG(this.zzb);
        Resources resourcesZzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        builderZzG.setTitle(resourcesZzd != null ? resourcesZzd.getString(R.string.s5) : "Create calendar event");
        builderZzG.setMessage(resourcesZzd != null ? resourcesZzd.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        builderZzG.setPositiveButton(resourcesZzd != null ? resourcesZzd.getString(R.string.s3) : HttpHeaders.ACCEPT, new zzbpv(this));
        builderZzG.setNegativeButton(resourcesZzd != null ? resourcesZzd.getString(R.string.s4) : "Decline", new zzbpw(this));
        builderZzG.create().show();
    }
}
