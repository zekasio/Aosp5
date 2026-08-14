package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzalt extends zzako {
    private final Object zza;
    private final zzakt zzb;

    public zzalt(int i, String str, zzakt zzaktVar, zzaks zzaksVar) {
        super(i, str, zzaksVar);
        this.zza = new Object();
        this.zzb = zzaktVar;
    }

    @Override // com.google.android.gms.internal.ads.zzako
    protected final zzaku zzh(zzakk zzakkVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzakkVar.zzb;
            Map map = zzakkVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzakkVar.zzb);
        }
        return zzaku.zzb(str, zzall.zzb(zzakkVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzako
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzo(String str) {
        zzakt zzaktVar;
        synchronized (this.zza) {
            zzaktVar = this.zzb;
        }
        zzaktVar.zza(str);
    }
}
