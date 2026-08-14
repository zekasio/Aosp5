package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzccb extends zzcap implements TextureView.SurfaceTextureListener, zzcaz {
    private final zzcbj zzd;
    private final zzcbk zze;
    private final zzcbi zzf;
    private zzcao zzg;
    private Surface zzh;
    private zzcba zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm;
    private zzcbh zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzccb(Context context, zzcbk zzcbkVar, zzcbj zzcbjVar, boolean z, boolean z2, zzcbi zzcbiVar, Integer num) {
        super(context, num);
        this.zzm = 1;
        this.zzd = zzcbjVar;
        this.zze = zzcbkVar;
        this.zzo = z;
        this.zzf = zzcbiVar;
        setSurfaceTextureListener(this);
        zzcbkVar.zza(this);
    }

    private static String zzS(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzT() {
        zzcba zzcbaVar = this.zzi;
        if (zzcbaVar != null) {
            zzcbaVar.zzO(true);
        }
    }

    private final void zzU() {
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbw
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzH();
            }
        });
        zzn();
        this.zze.zzb();
        if (this.zzq) {
            zzp();
        }
    }

    private final void zzV(boolean z) {
        zzcba zzcbaVar = this.zzi;
        if ((zzcbaVar != null && !z) || this.zzj == null || this.zzh == null) {
            return;
        }
        if (z) {
            if (!zzac()) {
                zzbza.zzj("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcbaVar.zzS();
                zzX();
            }
        }
        if (this.zzj.startsWith("cache:")) {
            zzccu zzccuVarZzp = this.zzd.zzp(this.zzj);
            if (zzccuVarZzp instanceof zzcdd) {
                zzcba zzcbaVarZza = ((zzcdd) zzccuVarZzp).zza();
                this.zzi = zzcbaVarZza;
                if (!zzcbaVarZza.zzT()) {
                    zzbza.zzj("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzccuVarZzp instanceof zzcda)) {
                    zzbza.zzj("Stream cache miss: ".concat(String.valueOf(this.zzj)));
                    return;
                }
                zzcda zzcdaVar = (zzcda) zzccuVarZzp;
                String strZzE = zzE();
                ByteBuffer byteBufferZzk = zzcdaVar.zzk();
                boolean zZzl = zzcdaVar.zzl();
                String strZzi = zzcdaVar.zzi();
                if (strZzi == null) {
                    zzbza.zzj("Stream cache URL is null.");
                    return;
                } else {
                    zzcba zzcbaVarZzD = zzD();
                    this.zzi = zzcbaVarZzD;
                    zzcbaVarZzD.zzF(new Uri[]{Uri.parse(strZzi)}, strZzE, byteBufferZzk, zZzl);
                }
            }
        } else {
            this.zzi = zzD();
            String strZzE2 = zzE();
            Uri[] uriArr = new Uri[this.zzk.length];
            int i = 0;
            while (true) {
                String[] strArr = this.zzk;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            this.zzi.zzE(uriArr, strZzE2);
        }
        this.zzi.zzK(this);
        zzY(this.zzh, false);
        if (this.zzi.zzT()) {
            int iZzt = this.zzi.zzt();
            this.zzm = iZzt;
            if (iZzt == 3) {
                zzU();
            }
        }
    }

    private final void zzW() {
        zzcba zzcbaVar = this.zzi;
        if (zzcbaVar != null) {
            zzcbaVar.zzO(false);
        }
    }

    private final void zzX() {
        if (this.zzi != null) {
            zzY(null, true);
            zzcba zzcbaVar = this.zzi;
            if (zzcbaVar != null) {
                zzcbaVar.zzK(null);
                this.zzi.zzG();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzY(Surface surface, boolean z) {
        zzcba zzcbaVar = this.zzi;
        if (zzcbaVar == null) {
            zzbza.zzj("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcbaVar.zzQ(surface, z);
        } catch (IOException e) {
            zzbza.zzk("", e);
        }
    }

    private final void zzZ() {
        zzaa(this.zzr, this.zzs);
    }

    private final void zzaa(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.zzt != f) {
            this.zzt = f;
            requestLayout();
        }
    }

    private final boolean zzab() {
        return zzac() && this.zzm != 1;
    }

    private final boolean zzac() {
        zzcba zzcbaVar = this.zzi;
        return (zzcbaVar == null || !zzcbaVar.zzT() || this.zzl) ? false : true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzt;
        if (f != 0.0f && this.zzn == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcbh zzcbhVar = this.zzn;
        if (zzcbhVar != null) {
            zzcbhVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.zzo) {
            zzcbh zzcbhVar = new zzcbh(getContext());
            this.zzn = zzcbhVar;
            zzcbhVar.zzd(surfaceTexture, i, i2);
            this.zzn.start();
            SurfaceTexture surfaceTextureZzb = this.zzn.zzb();
            if (surfaceTextureZzb != null) {
                surfaceTexture = surfaceTextureZzb;
            } else {
                this.zzn.zze();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzV(false);
        } else {
            zzY(surface, true);
            if (!this.zzf.zza) {
                zzT();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzaa(i, i2);
        } else {
            zzZ();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzL();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcbh zzcbhVar = this.zzn;
        if (zzcbhVar != null) {
            zzcbhVar.zze();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzW();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzY(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbz
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzM();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzcbh zzcbhVar = this.zzn;
        if (zzcbhVar != null) {
            zzcbhVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzN(i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzf(this);
        this.zza.zza(surfaceTexture, this.zzg);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdExoPlayerView3 window visibility changed to " + i);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcby
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzP(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzA(int i) {
        zzcba zzcbaVar = this.zzi;
        if (zzcbaVar != null) {
            zzcbaVar.zzP(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzC(int i, int i2) {
        this.zzr = i;
        this.zzs = i2;
        zzZ();
    }

    final zzcba zzD() {
        zzcdv zzcdvVar = new zzcdv(this.zzd.getContext(), this.zzf, this.zzd);
        zzbza.zzi("ExoPlayerAdapter initialized.");
        return zzcdvVar;
    }

    final String zzE() {
        return com.google.android.gms.ads.internal.zzt.zzp().zzc(this.zzd.getContext(), this.zzd.zzn().zza);
    }

    final /* synthetic */ void zzF(String str) {
        zzcao zzcaoVar = this.zzg;
        if (zzcaoVar != null) {
            zzcaoVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void zzG() {
        zzcao zzcaoVar = this.zzg;
        if (zzcaoVar != null) {
            zzcaoVar.zza();
        }
    }

    final /* synthetic */ void zzH() {
        zzcao zzcaoVar = this.zzg;
        if (zzcaoVar != null) {
            zzcaoVar.zzf();
        }
    }

    final /* synthetic */ void zzI(boolean z, long j) {
        this.zzd.zzv(z, j);
    }

    final /* synthetic */ void zzJ(String str) {
        zzcao zzcaoVar = this.zzg;
        if (zzcaoVar != null) {
            zzcaoVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void zzK() {
        zzcao zzcaoVar = this.zzg;
        if (zzcaoVar != null) {
            zzcaoVar.zzg();
        }
    }

    final /* synthetic */ void zzL() {
        zzcao zzcaoVar = this.zzg;
        if (zzcaoVar != null) {
            zzcaoVar.zzh();
        }
    }

    final /* synthetic */ void zzM() {
        zzcao zzcaoVar = this.zzg;
        if (zzcaoVar != null) {
            zzcaoVar.zzi();
        }
    }

    final /* synthetic */ void zzN(int i, int i2) {
        zzcao zzcaoVar = this.zzg;
        if (zzcaoVar != null) {
            zzcaoVar.zzj(i, i2);
        }
    }

    final /* synthetic */ void zzO() {
        float fZza = this.zzb.zza();
        zzcba zzcbaVar = this.zzi;
        if (zzcbaVar == null) {
            zzbza.zzj("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcbaVar.zzR(fZza, false);
        } catch (IOException e) {
            zzbza.zzk("", e);
        }
    }

    final /* synthetic */ void zzP(int i) {
        zzcao zzcaoVar = this.zzg;
        if (zzcaoVar != null) {
            zzcaoVar.onWindowVisibilityChanged(i);
        }
    }

    final /* synthetic */ void zzQ() {
        zzcao zzcaoVar = this.zzg;
        if (zzcaoVar != null) {
            zzcaoVar.zzd();
        }
    }

    final /* synthetic */ void zzR() {
        zzcao zzcaoVar = this.zzg;
        if (zzcaoVar != null) {
            zzcaoVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final int zza() {
        if (zzab()) {
            return (int) this.zzi.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final int zzb() {
        zzcba zzcbaVar = this.zzi;
        if (zzcbaVar != null) {
            return zzcbaVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final int zzc() {
        if (zzab()) {
            return (int) this.zzi.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final int zzd() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final int zze() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final long zzf() {
        zzcba zzcbaVar = this.zzi;
        if (zzcbaVar != null) {
            return zzcbaVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final long zzg() {
        zzcba zzcbaVar = this.zzi;
        if (zzcbaVar != null) {
            return zzcbaVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final long zzh() {
        zzcba zzcbaVar = this.zzi;
        if (zzcbaVar != null) {
            return zzcbaVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzi(final boolean z, final long j) {
        if (this.zzd != null) {
            zzbzn.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbx
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzI(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.zzo ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzk(String str, Exception exc) {
        final String strZzS = zzS(str, exc);
        zzbza.zzj("ExoPlayerAdapter error: ".concat(strZzS));
        this.zzl = true;
        if (this.zzf.zza) {
            zzW();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbo
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzF(strZzS);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzl(String str, Exception exc) {
        final String strZzS = zzS("onLoadException", exc);
        zzbza.zzj("ExoPlayerAdapter exception: ".concat(strZzS));
        com.google.android.gms.ads.internal.zzt.zzo().zzt(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbr
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzJ(strZzS);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzm(int i) {
        if (this.zzm != i) {
            this.zzm = i;
            if (i == 3) {
                zzU();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.zzf.zza) {
                zzW();
            }
            this.zze.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbu
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzG();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap, com.google.android.gms.internal.ads.zzcbm
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbs
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzO();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzo() {
        if (zzab()) {
            if (this.zzf.zza) {
                zzW();
            }
            this.zzi.zzN(false);
            this.zze.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbt
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzQ();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzp() {
        if (!zzab()) {
            this.zzq = true;
            return;
        }
        if (this.zzf.zza) {
            zzT();
        }
        this.zzi.zzN(true);
        this.zze.zzc();
        this.zzb.zzb();
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbq
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzR();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzq(int i) {
        if (zzab()) {
            this.zzi.zzH(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzr(zzcao zzcaoVar) {
        this.zzg = zzcaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzs(String str) {
        if (str != null) {
            zzB(str, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzt() {
        if (zzac()) {
            this.zzi.zzS();
            zzX();
        }
        this.zze.zze();
        this.zzb.zzc();
        this.zze.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzu(float f, float f2) {
        zzcbh zzcbhVar = this.zzn;
        if (zzcbhVar != null) {
            zzcbhVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaz
    public final void zzv() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcca
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzK();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzw(int i) {
        zzcba zzcbaVar = this.zzi;
        if (zzcbaVar != null) {
            zzcbaVar.zzI(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzx(int i) {
        zzcba zzcbaVar = this.zzi;
        if (zzcbaVar != null) {
            zzcbaVar.zzJ(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzy(int i) {
        zzcba zzcbaVar = this.zzi;
        if (zzcbaVar != null) {
            zzcbaVar.zzL(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzz(int i) {
        zzcba zzcbaVar = this.zzi;
        if (zzcbaVar != null) {
            zzcbaVar.zzM(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzB(String str, String[] strArr) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzk = new String[]{str};
        } else {
            this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzj;
        boolean z = false;
        if (this.zzf.zzl && str2 != null && !str.equals(str2) && this.zzm == 4) {
            z = true;
        }
        this.zzj = str;
        zzV(z);
    }
}
