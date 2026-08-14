package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.tapjoy.TJAdUnitConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcan extends zzcap implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map zzd;
    private final zzcbj zze;
    private final zzcbk zzf;
    private final boolean zzg;
    private int zzh;
    private int zzi;
    private MediaPlayer zzj;
    private Uri zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzcbh zzo;
    private final boolean zzp;
    private int zzq;
    private zzcao zzr;
    private boolean zzs;
    private Integer zzt;

    static {
        HashMap map = new HashMap();
        zzd = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcan(Context context, zzcbj zzcbjVar, boolean z, boolean z2, zzcbi zzcbiVar, zzcbk zzcbkVar, Integer num) {
        super(context, num);
        this.zzh = 0;
        this.zzi = 0;
        this.zzs = false;
        this.zzt = null;
        setSurfaceTextureListener(this);
        this.zze = zzcbjVar;
        this.zzf = zzcbkVar;
        this.zzp = z;
        this.zzg = z2;
        zzcbkVar.zza(this);
    }

    private final void zzC() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzk == null || surfaceTexture == null) {
            return;
        }
        zzD(false);
        try {
            com.google.android.gms.ads.internal.zzt.zzk();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzj = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzj.setOnCompletionListener(this);
            this.zzj.setOnErrorListener(this);
            this.zzj.setOnInfoListener(this);
            this.zzj.setOnPreparedListener(this);
            this.zzj.setOnVideoSizeChangedListener(this);
            this.zzn = 0;
            if (this.zzp) {
                zzcbh zzcbhVar = new zzcbh(getContext());
                this.zzo = zzcbhVar;
                zzcbhVar.zzd(surfaceTexture, getWidth(), getHeight());
                this.zzo.start();
                SurfaceTexture surfaceTextureZzb = this.zzo.zzb();
                if (surfaceTextureZzb != null) {
                    surfaceTexture = surfaceTextureZzb;
                } else {
                    this.zzo.zze();
                    this.zzo = null;
                }
            }
            this.zzj.setDataSource(getContext(), this.zzk);
            com.google.android.gms.ads.internal.zzt.zzl();
            this.zzj.setSurface(new Surface(surfaceTexture));
            this.zzj.setAudioStreamType(3);
            this.zzj.setScreenOnWhilePlaying(true);
            this.zzj.prepareAsync();
            zzE(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            zzbza.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(String.valueOf(this.zzk))), e);
            onError(this.zzj, 1, 0);
        }
    }

    private final void zzD(boolean z) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView release");
        zzcbh zzcbhVar = this.zzo;
        if (zzcbhVar != null) {
            zzcbhVar.zze();
            this.zzo = null;
        }
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzj.release();
            this.zzj = null;
            zzE(0);
            if (z) {
                this.zzi = 0;
            }
        }
    }

    private final void zzE(int i) {
        if (i == 3) {
            this.zzf.zzc();
            this.zzb.zzb();
        } else if (this.zzh == 3) {
            this.zzf.zze();
            this.zzb.zzc();
        }
        this.zzh = i;
    }

    private final void zzF(float f) {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer == null) {
            zzbza.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        }
    }

    private final boolean zzG() {
        int i;
        return (this.zzj == null || (i = this.zzh) == -1 || i == 0 || i == 1) ? false : true;
    }

    static /* bridge */ /* synthetic */ void zzl(zzcan zzcanVar, MediaPlayer mediaPlayer) {
        MediaPlayer.TrackInfo[] trackInfo;
        MediaFormat format;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzbG)).booleanValue() || zzcanVar.zze == null || mediaPlayer == null || (trackInfo = mediaPlayer.getTrackInfo()) == null) {
            return;
        }
        HashMap map = new HashMap();
        for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
            if (trackInfo2 != null) {
                int trackType = trackInfo2.getTrackType();
                if (trackType == 1) {
                    MediaFormat format2 = trackInfo2.getFormat();
                    if (format2 != null) {
                        if (format2.containsKey("frame-rate")) {
                            try {
                                map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                            } catch (ClassCastException unused) {
                                map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                            }
                        }
                        if (format2.containsKey("bitrate")) {
                            Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                            zzcanVar.zzt = numValueOf;
                            map.put("bitRate", String.valueOf(numValueOf));
                        }
                        if (format2.containsKey(TJAdUnitConstants.String.WIDTH) && format2.containsKey(TJAdUnitConstants.String.HEIGHT)) {
                            map.put("resolution", format2.getInteger(TJAdUnitConstants.String.WIDTH) + "x" + format2.getInteger(TJAdUnitConstants.String.HEIGHT));
                        }
                        if (format2.containsKey("mime")) {
                            map.put("videoMime", format2.getString("mime"));
                        }
                        if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                            map.put("videoCodec", format2.getString("codecs-string"));
                        }
                    }
                } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                    if (format.containsKey("mime")) {
                        map.put("audioMime", format.getString("mime"));
                    }
                    if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                        map.put("audioCodec", format.getString("codecs-string"));
                    }
                }
            }
        }
        if (map.isEmpty()) {
            return;
        }
        zzcanVar.zze.zzd("onMetadataEvent", map);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzn = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView completion");
        zzE(5);
        this.zzi = 5;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcag(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = zzd;
        String str = (String) map.get(Integer.valueOf(i));
        String str2 = (String) map.get(Integer.valueOf(i2));
        zzbza.zzj("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        zzE(-1);
        this.zzi = -1;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcah(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map map = zzd;
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i))) + ":" + ((String) map.get(Integer.valueOf(i2))));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.zzl
            int r0 = getDefaultSize(r0, r6)
            int r1 = r5.zzm
            int r1 = getDefaultSize(r1, r7)
            int r2 = r5.zzl
            if (r2 <= 0) goto L7e
            int r2 = r5.zzm
            if (r2 <= 0) goto L7e
            com.google.android.gms.internal.ads.zzcbh r2 = r5.zzo
            if (r2 != 0) goto L7e
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L41
            int r0 = r5.zzl
            int r1 = r0 * r7
            int r2 = r5.zzm
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7e
        L3c:
            if (r1 <= r3) goto L63
            int r1 = r3 / r0
            goto L54
        L41:
            r0 = 1073741824(0x40000000, float:2.0)
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L56
            int r0 = r5.zzm
            int r0 = r0 * r6
            int r2 = r5.zzl
            int r0 = r0 / r2
            if (r1 != r3) goto L53
            if (r0 <= r7) goto L53
            goto L63
        L53:
            r1 = r0
        L54:
            r0 = r6
            goto L7e
        L56:
            if (r1 != r2) goto L67
            int r1 = r5.zzl
            int r1 = r1 * r7
            int r2 = r5.zzm
            int r1 = r1 / r2
            if (r0 != r3) goto L65
            if (r1 <= r6) goto L65
        L63:
            r0 = r6
            goto L3a
        L65:
            r0 = r1
            goto L3a
        L67:
            int r2 = r5.zzl
            int r4 = r5.zzm
            if (r1 != r3) goto L73
            if (r4 <= r7) goto L73
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L75
        L73:
            r1 = r2
            r7 = r4
        L75:
            if (r0 != r3) goto L65
            if (r1 <= r6) goto L65
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L54
        L7e:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.zzcbh r6 = r5.zzo
            if (r6 == 0) goto L88
            r6.zzc(r0, r1)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcan.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView prepared");
        zzE(2);
        this.zzf.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcaf(this, mediaPlayer));
        this.zzl = mediaPlayer.getVideoWidth();
        this.zzm = mediaPlayer.getVideoHeight();
        int i = this.zzq;
        if (i != 0) {
            zzq(i);
        }
        if (this.zzg && zzG() && this.zzj.getCurrentPosition() > 0 && this.zzi != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView nudging MediaPlayer");
            zzF(0.0f);
            this.zzj.start();
            int currentPosition = this.zzj.getCurrentPosition();
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            while (zzG() && this.zzj.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - jCurrentTimeMillis <= 250) {
            }
            this.zzj.pause();
            zzn();
        }
        zzbza.zzi("AdMediaPlayerView stream dimensions: " + this.zzl + " x " + this.zzm);
        if (this.zzi == 3) {
            zzp();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface created");
        zzC();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcai(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null && this.zzq == 0) {
            this.zzq = mediaPlayer.getCurrentPosition();
        }
        zzcbh zzcbhVar = this.zzo;
        if (zzcbhVar != null) {
            zzcbhVar.zze();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcak(this));
        zzD(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface changed");
        int i3 = this.zzi;
        boolean z = false;
        if (this.zzl == i && this.zzm == i2) {
            z = true;
        }
        if (this.zzj != null && i3 == 3 && z) {
            int i4 = this.zzq;
            if (i4 != 0) {
                zzq(i4);
            }
            zzp();
        }
        zzcbh zzcbhVar = this.zzo;
        if (zzcbhVar != null) {
            zzcbhVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcaj(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzf.zzf(this);
        this.zza.zza(surfaceTexture, this.zzr);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.zzl = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzm = videoHeight;
        if (this.zzl == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView window visibility changed to " + i);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcae
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzm(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.View
    public final String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final int zza() {
        if (zzG()) {
            return this.zzj.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final int zzb() {
        if (Build.VERSION.SDK_INT < 26 || !zzG()) {
            return -1;
        }
        return this.zzj.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final int zzc() {
        if (zzG()) {
            return this.zzj.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final int zzd() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final int zze() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final long zzg() {
        if (this.zzt != null) {
            return (zzh() * ((long) this.zzn)) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final long zzh() {
        if (this.zzt != null) {
            return ((long) zzc()) * ((long) this.zzt.intValue());
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final String zzj() {
        return "MediaPlayer".concat(true != this.zzp ? "" : " spherical");
    }

    final /* synthetic */ void zzm(int i) {
        zzcao zzcaoVar = this.zzr;
        if (zzcaoVar != null) {
            zzcaoVar.onWindowVisibilityChanged(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap, com.google.android.gms.internal.ads.zzcbm
    public final void zzn() {
        zzF(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzo() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView pause");
        if (zzG() && this.zzj.isPlaying()) {
            this.zzj.pause();
            zzE(4);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcam(this));
        }
        this.zzi = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzp() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView play");
        if (zzG()) {
            this.zzj.start();
            zzE(3);
            this.zza.zzb();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcal(this));
        }
        this.zzi = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzq(int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView seek " + i);
        if (!zzG()) {
            this.zzq = i;
        } else {
            this.zzj.seekTo(i);
            this.zzq = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzr(zzcao zzcaoVar) {
        this.zzr = zzcaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzs(String str) {
        Uri uri = Uri.parse(str);
        zzavq zzavqVarZza = zzavq.zza(uri);
        if (zzavqVarZza == null || zzavqVarZza.zza != null) {
            if (zzavqVarZza != null) {
                uri = Uri.parse(zzavqVarZza.zza);
            }
            this.zzk = uri;
            this.zzq = 0;
            zzC();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzt() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzj.release();
            this.zzj = null;
            zzE(0);
            this.zzi = 0;
        }
        this.zzf.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzu(float f, float f2) {
        zzcbh zzcbhVar = this.zzo;
        if (zzcbhVar != null) {
            zzcbhVar.zzf(f, f2);
        }
    }
}
