package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzalx implements zzaly {
    private static final Logger zzb = Logger.getLogger(zzalx.class.getName());
    final ThreadLocal zza = new zzalw(this);

    public abstract zzamb zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzaly
    public final zzamb zzb(zzgwk zzgwkVar, zzamc zzamcVar) throws IOException {
        int iZza;
        long jZzc;
        long jZzb = zzgwkVar.zzb();
        ((ByteBuffer) this.zza.get()).rewind().limit(8);
        do {
            iZza = zzgwkVar.zza((ByteBuffer) this.zza.get());
            if (iZza == 8) {
                ((ByteBuffer) this.zza.get()).rewind();
                long jZze = zzama.zze((ByteBuffer) this.zza.get());
                byte[] bArr = null;
                if (jZze < 8 && jZze > 1) {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jZze);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.zza.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (jZze == 1) {
                        ((ByteBuffer) this.zza.get()).limit(16);
                        zzgwkVar.zza((ByteBuffer) this.zza.get());
                        ((ByteBuffer) this.zza.get()).position(8);
                        jZzc = zzama.zzf((ByteBuffer) this.zza.get()) - 16;
                    } else {
                        jZzc = jZze == 0 ? zzgwkVar.zzc() - zzgwkVar.zzb() : jZze - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) this.zza.get()).limit(((ByteBuffer) this.zza.get()).limit() + 16);
                        zzgwkVar.zza((ByteBuffer) this.zza.get());
                        bArr = new byte[16];
                        for (int iPosition = ((ByteBuffer) this.zza.get()).position() - 16; iPosition < ((ByteBuffer) this.zza.get()).position(); iPosition++) {
                            bArr[iPosition - (((ByteBuffer) this.zza.get()).position() - 16)] = ((ByteBuffer) this.zza.get()).get(iPosition);
                        }
                        jZzc -= 16;
                    }
                    long j = jZzc;
                    zzamb zzambVarZza = zza(str, bArr, zzamcVar instanceof zzamb ? ((zzamb) zzamcVar).zza() : "");
                    zzambVarZza.zzc(zzamcVar);
                    ((ByteBuffer) this.zza.get()).rewind();
                    zzambVarZza.zzb(zzgwkVar, (ByteBuffer) this.zza.get(), j, this);
                    return zzambVarZza;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (iZza >= 0);
        zzgwkVar.zze(jZzb);
        throw new EOFException();
    }
}
