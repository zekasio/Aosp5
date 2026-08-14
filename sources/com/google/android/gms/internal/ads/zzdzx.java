package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.games.GamesActivityResultCodes;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdzx {
    private final zzawe zza;
    private final Context zzb;
    private final zzdzb zzc;
    private final zzbzg zzd;
    private final String zze;
    private final zzfdk zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzdzx(Context context, zzbzg zzbzgVar, zzawe zzaweVar, zzdzb zzdzbVar, String str, zzfdk zzfdkVar) {
        this.zzb = context;
        this.zzd = zzbzgVar;
        this.zza = zzaweVar;
        this.zzc = zzdzbVar;
        this.zze = str;
        this.zzf = zzfdkVar;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long jZze = 0;
        for (int i = 0; i < size; i++) {
            zzayn zzaynVar = (zzayn) arrayList.get(i);
            if (zzaynVar.zzw() == 2 && zzaynVar.zze() > jZze) {
                jZze = zzaynVar.zze();
            }
        }
        if (jZze != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jZze));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    public final void zzb(final boolean z) {
        try {
            this.zzc.zza(new zzfcd() { // from class: com.google.android.gms.internal.ads.zzdzt
                @Override // com.google.android.gms.internal.ads.zzfcd
                public final Object zza(Object obj) throws Exception {
                    this.zza.zza(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            zzbza.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    final /* synthetic */ Void zza(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhS)).booleanValue()) {
            zzfdj zzfdjVarZzb = zzfdj.zzb("oa_upload");
            zzfdjVarZzb.zza("oa_failed_reqs", String.valueOf(zzdzq.zza(sQLiteDatabase, 0)));
            zzfdjVarZzb.zza("oa_total_reqs", String.valueOf(zzdzq.zza(sQLiteDatabase, 1)));
            zzfdjVarZzb.zza("oa_upload_time", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zzfdjVarZzb.zza("oa_last_successful_time", String.valueOf(zzdzq.zzb(sQLiteDatabase, 2)));
            zzfdjVarZzb.zza("oa_session_id", this.zzg.zzP() ? "" : this.zze);
            this.zzf.zzb(zzfdjVarZzb);
            ArrayList arrayListZzc = zzdzq.zzc(sQLiteDatabase);
            zzc(sQLiteDatabase, arrayListZzc);
            int size = arrayListZzc.size();
            for (int i = 0; i < size; i++) {
                zzayn zzaynVar = (zzayn) arrayListZzc.get(i);
                zzfdj zzfdjVarZzb2 = zzfdj.zzb("oa_signals");
                zzfdjVarZzb2.zza("oa_session_id", this.zzg.zzP() ? "" : this.zze);
                zzayi zzayiVarZzf = zzaynVar.zzf();
                String strValueOf = zzayiVarZzf.zzf() ? String.valueOf(zzayiVarZzf.zzh() - 1) : "-1";
                String string = zzfqy.zzb(zzaynVar.zzk(), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdzw
                    @Override // com.google.android.gms.internal.ads.zzfnj
                    public final Object apply(Object obj) {
                        return ((zzaxc) obj).name();
                    }
                }).toString();
                zzfdjVarZzb2.zza("oa_sig_ts", String.valueOf(zzaynVar.zze()));
                zzfdjVarZzb2.zza("oa_sig_status", String.valueOf(zzaynVar.zzw() - 1));
                zzfdjVarZzb2.zza("oa_sig_resp_lat", String.valueOf(zzaynVar.zzd()));
                zzfdjVarZzb2.zza("oa_sig_render_lat", String.valueOf(zzaynVar.zzc()));
                zzfdjVarZzb2.zza("oa_sig_formats", string);
                zzfdjVarZzb2.zza("oa_sig_nw_type", strValueOf);
                zzfdjVarZzb2.zza("oa_sig_wifi", String.valueOf(zzaynVar.zzx() - 1));
                zzfdjVarZzb2.zza("oa_sig_airplane", String.valueOf(zzaynVar.zzt() - 1));
                zzfdjVarZzb2.zza("oa_sig_data", String.valueOf(zzaynVar.zzu() - 1));
                zzfdjVarZzb2.zza("oa_sig_nw_resp", String.valueOf(zzaynVar.zza()));
                zzfdjVarZzb2.zza("oa_sig_offline", String.valueOf(zzaynVar.zzv() - 1));
                zzfdjVarZzb2.zza("oa_sig_nw_state", String.valueOf(zzaynVar.zzj().zza()));
                if (zzayiVarZzf.zze() && zzayiVarZzf.zzf() && zzayiVarZzf.zzh() == 2) {
                    zzfdjVarZzb2.zza("oa_sig_cell_type", String.valueOf(zzayiVarZzf.zzg() - 1));
                }
                this.zzf.zzb(zzfdjVarZzb2);
            }
        } else {
            ArrayList arrayListZzc2 = zzdzq.zzc(sQLiteDatabase);
            zzayo zzayoVarZza = zzays.zza();
            zzayoVarZza.zzb(this.zzb.getPackageName());
            zzayoVarZza.zzd(Build.MODEL);
            zzayoVarZza.zze(zzdzq.zza(sQLiteDatabase, 0));
            zzayoVarZza.zza(arrayListZzc2);
            zzayoVarZza.zzg(zzdzq.zza(sQLiteDatabase, 1));
            zzayoVarZza.zzc(zzdzq.zza(sQLiteDatabase, 3));
            zzayoVarZza.zzh(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
            zzayoVarZza.zzf(zzdzq.zzb(sQLiteDatabase, 2));
            final zzays zzaysVar = (zzays) zzayoVarZza.zzal();
            zzc(sQLiteDatabase, arrayListZzc2);
            this.zza.zzb(new zzawd() { // from class: com.google.android.gms.internal.ads.zzdzu
                @Override // com.google.android.gms.internal.ads.zzawd
                public final void zza(zzaxt zzaxtVar) {
                    zzaxtVar.zzi(zzaysVar);
                }
            });
            zzazd zzazdVarZza = zzaze.zza();
            zzazdVarZza.zza(this.zzd.zzb);
            zzazdVarZza.zzc(this.zzd.zzc);
            zzazdVarZza.zzb(true == this.zzd.zzd ? 0 : 2);
            final zzaze zzazeVar = (zzaze) zzazdVarZza.zzal();
            this.zza.zzb(new zzawd() { // from class: com.google.android.gms.internal.ads.zzdzv
                @Override // com.google.android.gms.internal.ads.zzawd
                public final void zza(zzaxt zzaxtVar) {
                    zzaze zzazeVar2 = zzazeVar;
                    zzaxl zzaxlVar = (zzaxl) zzaxtVar.zzb().zzaB();
                    zzaxlVar.zzb(zzazeVar2);
                    zzaxtVar.zzg(zzaxlVar);
                }
            });
            this.zza.zzc(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED);
        }
        zzdzq.zzf(sQLiteDatabase);
        return null;
    }
}
