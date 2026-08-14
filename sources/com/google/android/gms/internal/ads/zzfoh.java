package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfoh {
    private final zzfng zza;
    private final zzfog zzb;

    private zzfoh(zzfog zzfogVar) {
        zzfnf zzfnfVar = zzfnf.zza;
        this.zzb = zzfogVar;
        this.zza = zzfnfVar;
    }

    public static zzfoh zzb(int i) {
        return new zzfoh(new zzfod(4000));
    }

    public static zzfoh zzc(zzfng zzfngVar) {
        return new zzfoh(new zzfob(zzfngVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzfoe(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        Iterator itZzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZzg.hasNext()) {
            arrayList.add((String) itZzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
