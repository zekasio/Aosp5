package com.google.android.gms.internal.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfa {
    public static String zzo(int i) {
        if (i == 0) {
            return "DAILY";
        }
        if (i == 1) {
            return "WEEKLY";
        }
        if (i == 2) {
            return "ALL_TIME";
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Unknown time span ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
