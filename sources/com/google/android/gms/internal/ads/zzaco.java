package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaco {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzack zza(java.lang.String r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaco.zza(java.lang.String):com.google.android.gms.internal.ads.zzack");
    }

    private static zzfqk zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        zzfqh zzfqhVarZzi = zzfqk.zzi();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (zzex.zzc(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strZza = zzex.zza(xmlPullParser, strConcat2);
                String strZza2 = zzex.zza(xmlPullParser, strConcat3);
                String strZza3 = zzex.zza(xmlPullParser, strConcat4);
                String strZza4 = zzex.zza(xmlPullParser, strConcat5);
                if (strZza == null || strZza2 == null) {
                    return zzfqk.zzo();
                }
                zzfqhVarZzi.zzf(new zzacj(strZza, strZza2, strZza3 != null ? Long.parseLong(strZza3) : 0L, strZza4 != null ? Long.parseLong(strZza4) : 0L));
            }
        } while (!zzex.zzb(xmlPullParser, str.concat(":Directory")));
        return zzfqhVarZzi.zzi();
    }
}
