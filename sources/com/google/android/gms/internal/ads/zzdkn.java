package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdkn extends zzbeq {
    private final Context zza;
    private final zzdgi zzb;
    private zzdhi zzc;
    private zzdgd zzd;

    public zzdkn(Context context, zzdgi zzdgiVar, zzdhi zzdhiVar, zzdgd zzdgdVar) {
        this.zza = context;
        this.zzb = zzdgiVar;
        this.zzc = zzdhiVar;
        this.zzd = zzdgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final zzbdu zzf() throws RemoteException {
        return this.zzd.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final zzbdx zzg(String str) {
        return (zzbdx) this.zzb.zzh().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final String zzi() {
        return this.zzb.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final String zzj(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final List zzk() {
        SimpleArrayMap simpleArrayMapZzh = this.zzb.zzh();
        SimpleArrayMap simpleArrayMapZzi = this.zzb.zzi();
        String[] strArr = new String[simpleArrayMapZzh.size() + simpleArrayMapZzi.size()];
        int i = 0;
        for (int i2 = 0; i2 < simpleArrayMapZzh.size(); i2++) {
            strArr[i] = (String) simpleArrayMapZzh.keyAt(i2);
            i++;
        }
        for (int i3 = 0; i3 < simpleArrayMapZzi.size(); i3++) {
            strArr[i] = (String) simpleArrayMapZzi.keyAt(i3);
            i++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zzl() {
        zzdgd zzdgdVar = this.zzd;
        if (zzdgdVar != null) {
            zzdgdVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zzm() {
        String strZzB = this.zzb.zzB();
        if ("Google".equals(strZzB)) {
            zzbza.zzj("Illegal argument specified for omid partner name.");
            return;
        }
        if (TextUtils.isEmpty(strZzB)) {
            zzbza.zzj("Not starting OMID session. OM partner name has not been configured.");
            return;
        }
        zzdgd zzdgdVar = this.zzd;
        if (zzdgdVar != null) {
            zzdgdVar.zzt(strZzB, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zzn(String str) {
        zzdgd zzdgdVar = this.zzd;
        if (zzdgdVar != null) {
            zzdgdVar.zzE(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zzo() {
        zzdgd zzdgdVar = this.zzd;
        if (zzdgdVar != null) {
            zzdgdVar.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdgd zzdgdVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof View) || this.zzb.zzu() == null || (zzdgdVar = this.zzd) == null) {
            return;
        }
        zzdgdVar.zzI((View) objUnwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final boolean zzq() {
        zzdgd zzdgdVar = this.zzd;
        return (zzdgdVar == null || zzdgdVar.zzV()) && this.zzb.zzq() != null && this.zzb.zzr() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdhi zzdhiVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdhiVar = this.zzc) == null || !zzdhiVar.zzf((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzr().zzao(new zzdkm(this));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final boolean zzs() {
        IObjectWrapper iObjectWrapperZzu = this.zzb.zzu();
        if (iObjectWrapperZzu == null) {
            zzbza.zzj("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzd(iObjectWrapperZzu);
        if (this.zzb.zzq() == null) {
            return true;
        }
        this.zzb.zzq().zzd("onSdkLoaded", new ArrayMap());
        return true;
    }
}
