package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ads.zzbyt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzp {
    public static final zzp zza = new zzp();

    protected zzp() {
    }

    public final zzl zza(Context context, zzdx zzdxVar) {
        Context context2;
        List listUnmodifiableList;
        String strZzr;
        Date dateZzn = zzdxVar.zzn();
        long time = dateZzn != null ? dateZzn.getTime() : -1L;
        String strZzk = zzdxVar.zzk();
        int iZza = zzdxVar.zza();
        Set setZzq = zzdxVar.zzq();
        if (setZzq.isEmpty()) {
            context2 = context;
            listUnmodifiableList = null;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(setZzq));
            context2 = context;
        }
        boolean zZzs = zzdxVar.zzs(context2);
        Bundle bundleZzf = zzdxVar.zzf(AdMobAdapter.class);
        String strZzl = zzdxVar.zzl();
        SearchAdRequest searchAdRequestZzi = zzdxVar.zzi();
        zzfh zzfhVar = searchAdRequestZzi != null ? new zzfh(searchAdRequestZzi) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzay.zzb();
            strZzr = zzbyt.zzr(Thread.currentThread().getStackTrace(), packageName);
        } else {
            strZzr = null;
        }
        boolean zZzr = zzdxVar.zzr();
        RequestConfiguration requestConfigurationZzc = zzej.zzf().zzc();
        return new zzl(8, time, bundleZzf, iZza, listUnmodifiableList, zZzs, Math.max(zzdxVar.zzc(), requestConfigurationZzc.getTagForChildDirectedTreatment()), false, strZzl, zzfhVar, null, strZzk, zzdxVar.zzg(), zzdxVar.zze(), Collections.unmodifiableList(new ArrayList(zzdxVar.zzp())), zzdxVar.zzm(), strZzr, zZzr, null, Math.max(-1, requestConfigurationZzc.getTagForUnderAgeOfConsent()), (String) Collections.max(Arrays.asList(null, requestConfigurationZzc.getMaxAdContentRating()), new Comparator() { // from class: com.google.android.gms.ads.internal.client.zzo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return RequestConfiguration.zza.indexOf((String) obj) - RequestConfiguration.zza.indexOf((String) obj2);
            }
        }), zzdxVar.zzo(), zzdxVar.zzb(), zzdxVar.zzj());
    }
}
