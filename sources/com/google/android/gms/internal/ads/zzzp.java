package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzzp implements zzaab {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    private static final zzzo zzc = new zzzo(new zzzn() { // from class: com.google.android.gms.internal.ads.zzzl
        @Override // com.google.android.gms.internal.ads.zzzn
        public final Constructor zza() {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzzu.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final zzzo zzd = new zzzo(new zzzn() { // from class: com.google.android.gms.internal.ads.zzzm
        @Override // com.google.android.gms.internal.ads.zzzn
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzzu.class).getConstructor(null);
        }
    });
    private zzfqk zze;

    @Override // com.google.android.gms.internal.ads.zzaab
    public final synchronized zzzu[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a6 A[Catch: all -> 0x0341, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:114:0x01a6, B:115:0x01a9, B:213:0x031f, B:214:0x0322, B:216:0x0327, B:219:0x032d, B:220:0x0330, B:221:0x0333, B:118:0x01b2, B:120:0x01ba, B:123:0x01c4, B:126:0x01cf, B:128:0x01d7, B:131:0x01e1, B:134:0x01ec, B:137:0x01f7, B:140:0x0202, B:142:0x020a, B:144:0x0212, B:147:0x021c, B:149:0x022a, B:152:0x0234, B:155:0x023f, B:157:0x0247, B:159:0x0255, B:161:0x0263, B:164:0x0273, B:166:0x0281, B:169:0x028b, B:171:0x0293, B:173:0x029b, B:175:0x02a3, B:178:0x02ac, B:180:0x02b4, B:183:0x02c3, B:185:0x02cb, B:188:0x02d4, B:190:0x02dc, B:193:0x02e5, B:195:0x02ed, B:198:0x02f6, B:13:0x0042, B:14:0x004a, B:95:0x0177, B:16:0x004f, B:19:0x005b, B:22:0x0067, B:25:0x0073, B:28:0x007f, B:31:0x008a, B:34:0x0095, B:37:0x00a0, B:40:0x00ac, B:43:0x00b8, B:46:0x00c4, B:49:0x00d0, B:52:0x00db, B:55:0x00e6, B:58:0x00f1, B:61:0x00fd, B:64:0x0109, B:67:0x0115, B:70:0x0120, B:73:0x012b, B:76:0x0136, B:79:0x0141, B:82:0x014b, B:85:0x0156, B:88:0x0161, B:91:0x016c), top: B:229:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b2 A[Catch: all -> 0x0341, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0018, B:9:0x001f, B:114:0x01a6, B:115:0x01a9, B:213:0x031f, B:214:0x0322, B:216:0x0327, B:219:0x032d, B:220:0x0330, B:221:0x0333, B:118:0x01b2, B:120:0x01ba, B:123:0x01c4, B:126:0x01cf, B:128:0x01d7, B:131:0x01e1, B:134:0x01ec, B:137:0x01f7, B:140:0x0202, B:142:0x020a, B:144:0x0212, B:147:0x021c, B:149:0x022a, B:152:0x0234, B:155:0x023f, B:157:0x0247, B:159:0x0255, B:161:0x0263, B:164:0x0273, B:166:0x0281, B:169:0x028b, B:171:0x0293, B:173:0x029b, B:175:0x02a3, B:178:0x02ac, B:180:0x02b4, B:183:0x02c3, B:185:0x02cb, B:188:0x02d4, B:190:0x02dc, B:193:0x02e5, B:195:0x02ed, B:198:0x02f6, B:13:0x0042, B:14:0x004a, B:95:0x0177, B:16:0x004f, B:19:0x005b, B:22:0x0067, B:25:0x0073, B:28:0x007f, B:31:0x008a, B:34:0x0095, B:37:0x00a0, B:40:0x00ac, B:43:0x00b8, B:46:0x00c4, B:49:0x00d0, B:52:0x00db, B:55:0x00e6, B:58:0x00f1, B:61:0x00fd, B:64:0x0109, B:67:0x0115, B:70:0x0120, B:73:0x012b, B:76:0x0136, B:79:0x0141, B:82:0x014b, B:85:0x0156, B:88:0x0161, B:91:0x016c), top: B:229:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0176  */
    @Override // com.google.android.gms.internal.ads.zzaab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.zzzu[] zzb(android.net.Uri r22, java.util.Map r23) {
        /*
            Method dump skipped, instruction units count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzp.zzb(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzzu[]");
    }

    private final void zzc(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzahc());
                break;
            case 1:
                list.add(new zzahf());
                break;
            case 2:
                list.add(new zzahi(0));
                break;
            case 3:
                list.add(new zzabj(0));
                break;
            case 4:
                zzzu zzzuVarZza = zzc.zza(0);
                if (zzzuVarZza == null) {
                    list.add(new zzaca(0));
                } else {
                    list.add(zzzuVarZza);
                }
                break;
            case 5:
                list.add(new zzacd());
                break;
            case 6:
                list.add(new zzaeu(0));
                break;
            case 7:
                list.add(new zzafc(0));
                break;
            case 8:
                list.add(new zzafx(0, null));
                list.add(new zzagc(0));
                break;
            case 9:
                list.add(new zzagq());
                break;
            case 10:
                list.add(new zzail());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzfqk.zzo();
                }
                list.add(new zzaiv(1, new zzeu(0L), new zzahk(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzajh());
                break;
            case 14:
                list.add(new zzaci());
                break;
            case 15:
                zzzu zzzuVarZza2 = zzd.zza(new Object[0]);
                if (zzzuVarZza2 != null) {
                    list.add(zzzuVarZza2);
                }
                break;
            case 16:
                list.add(new zzabo());
                break;
        }
    }
}
