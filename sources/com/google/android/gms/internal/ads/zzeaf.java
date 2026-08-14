package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeaf extends SQLiteOpenHelper {
    private final Context zza;
    private final zzfuu zzb;

    public zzeaf(Context context, zzfuu zzfuuVar) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzhJ)).intValue());
        this.zza = context;
        this.zzb = zzfuuVar;
    }

    static /* synthetic */ Void zzb(zzbzf zzbzfVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        zzj(sQLiteDatabase, zzbzfVar);
        return null;
    }

    static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, zzbzf zzbzfVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzbzfVar);
    }

    static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, zzbzf zzbzfVar) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor cursorQuery = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = cursorQuery.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (cursorQuery.moveToNext()) {
                int columnIndex = cursorQuery.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i] = cursorQuery.getString(columnIndex);
                }
                i++;
            }
            cursorQuery.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i2 = 0; i2 < count; i2++) {
                zzbzfVar.zza(strArr[i2]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    final /* synthetic */ Void zza(zzeah zzeahVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzeahVar.zza));
        contentValues.put("gws_query_id", zzeahVar.zzb);
        contentValues.put("url", zzeahVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzeahVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzbr zzbrVarZzv = com.google.android.gms.ads.internal.util.zzs.zzv(this.zza);
        if (zzbrVarZzv != null) {
            try {
                zzbrVarZzv.zze(ObjectWrapper.wrap(this.zza));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    public final void zzc(final String str) {
        zze(new zzfcd() { // from class: com.google.android.gms.internal.ads.zzeac
            @Override // com.google.android.gms.internal.ads.zzfcd
            public final Object zza(Object obj) {
                zzeaf.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final zzeah zzeahVar) {
        zze(new zzfcd() { // from class: com.google.android.gms.internal.ads.zzeaa
            @Override // com.google.android.gms.internal.ads.zzfcd
            public final Object zza(Object obj) throws Exception {
                this.zza.zza(zzeahVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final void zze(zzfcd zzfcdVar) {
        zzfuj.zzq(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.getWritableDatabase();
            }
        }), new zzeae(this, zzfcdVar), this.zzb);
    }

    final void zzg(final SQLiteDatabase sQLiteDatabase, final zzbzf zzbzfVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzz
            @Override // java.lang.Runnable
            public final void run() {
                zzeaf.zzf(sQLiteDatabase, str, zzbzfVar);
            }
        });
    }

    public final void zzh(final zzbzf zzbzfVar, final String str) {
        zze(new zzfcd() { // from class: com.google.android.gms.internal.ads.zzead
            @Override // com.google.android.gms.internal.ads.zzfcd
            public final Object zza(Object obj) {
                this.zza.zzg((SQLiteDatabase) obj, zzbzfVar, str);
                return null;
            }
        });
    }
}
