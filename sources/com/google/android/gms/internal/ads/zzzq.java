package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzzq {
    public final String zza;

    private zzzq(int i, int i2, String str) {
        this.zza = str;
    }

    public static zzzq zza(zzen zzenVar) {
        String str;
        zzenVar.zzG(2);
        int iZzk = zzenVar.zzk();
        int i = iZzk >> 1;
        int i2 = iZzk & 1;
        int iZzk2 = zzenVar.zzk() >> 3;
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        int i3 = iZzk2 | (i2 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(i3 >= 10 ? "." : ".0");
        sb.append(i3);
        return new zzzq(i, i3, sb.toString());
    }
}
