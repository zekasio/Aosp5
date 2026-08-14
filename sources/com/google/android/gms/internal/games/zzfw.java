package com.google.android.gms.internal.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfw<E> extends zzfq<E> {
    private final zzft<E> zzmu;

    zzfw(zzft<E> zzftVar, int i) {
        super(zzftVar.size(), i);
        this.zzmu = zzftVar;
    }

    @Override // com.google.android.gms.internal.games.zzfq
    protected final E get(int i) {
        return this.zzmu.get(i);
    }
}
