package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzccx extends zzccu {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzccx(zzcbj zzcbjVar) {
        super(zzcbjVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            zzbza.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            zzbza.zzj("Could not create preload cache directory at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        } else {
            if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
                return;
            }
            zzbza.zzj("Could not set cache file permissions at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        }
    }

    private final File zza(File file) {
        return new File(this.zzg, String.valueOf(file.getName()).concat(".done"));
    }

    @Override // com.google.android.gms.internal.ads.zzccu
    public final void zzf() {
        this.zzh = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0346, code lost:
    
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x034c, code lost:
    
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0354, code lost:
    
        if (com.google.android.gms.ads.internal.util.zze.zzm(3) == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0356, code lost:
    
        com.google.android.gms.internal.ads.zzbza.zze("Preloaded " + com.google.android.gms.internal.ads.zzccx.zzf.format(r13) + " bytes from " + r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0379, code lost:
    
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0382, code lost:
    
        if (r0.isFile() == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0384, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x038c, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x040a  */
    @Override // com.google.android.gms.internal.ads.zzccu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzt(final java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 1081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzccx.zzt(java.lang.String):boolean");
    }
}
