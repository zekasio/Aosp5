package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzom {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private final zzol zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    private zzok zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzom(zzol zzolVar) {
        this.zza = zzolVar;
        int i = zzew.zza;
        try {
            this.zzn = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
    }

    private final long zzl(long j) {
        return (j * 1000000) / ((long) this.zzg);
    }

    private final long zzm() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        if (this.zzx != -9223372036854775807L) {
            return Math.min(this.zzA, this.zzz + ((((SystemClock.elapsedRealtime() * 1000) - this.zzx) * ((long) this.zzg)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        long j = 0;
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.zzh) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.zzu = this.zzs;
                }
                playState = 2;
            }
            playbackHeadPosition += this.zzu;
        }
        if (zzew.zza <= 29) {
            if (playbackHeadPosition != 0) {
                j = playbackHeadPosition;
            } else if (this.zzs > 0 && playState == 3) {
                if (this.zzy == -9223372036854775807L) {
                    this.zzy = SystemClock.elapsedRealtime();
                }
                return this.zzs;
            }
            this.zzy = -9223372036854775807L;
            playbackHeadPosition = j;
        }
        if (this.zzs > playbackHeadPosition) {
            this.zzt++;
        }
        this.zzs = playbackHeadPosition;
        return playbackHeadPosition + (this.zzt << 32);
    }

    private final void zzn() {
        this.zzl = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzm = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzk = false;
    }

    public final int zza(long j) {
        return this.zze - ((int) (j - (zzm() * ((long) this.zzd))));
    }

    public final long zzb(boolean z) {
        long jZzl;
        Method method;
        AudioTrack audioTrack;
        zzom zzomVar = this;
        AudioTrack audioTrack2 = zzomVar.zzc;
        audioTrack2.getClass();
        if (audioTrack2.getPlayState() == 3) {
            long jZzl2 = zzomVar.zzl(zzm());
            if (jZzl2 != 0) {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - zzomVar.zzm >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    long[] jArr = zzomVar.zzb;
                    int i = zzomVar.zzv;
                    jArr[i] = jZzl2 - jNanoTime;
                    zzomVar.zzv = (i + 1) % 10;
                    int i2 = zzomVar.zzw;
                    if (i2 < 10) {
                        zzomVar.zzw = i2 + 1;
                    }
                    zzomVar.zzm = jNanoTime;
                    zzomVar.zzl = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = zzomVar.zzw;
                        if (i3 >= i4) {
                            break;
                        }
                        zzomVar.zzl += zzomVar.zzb[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!zzomVar.zzh) {
                    zzok zzokVar = zzomVar.zzf;
                    zzokVar.getClass();
                    if (zzokVar.zzg(jNanoTime)) {
                        long jZzb = zzokVar.zzb();
                        long jZza = zzokVar.zza();
                        if (Math.abs(jZzb - jNanoTime) > 5000000) {
                            zzpa zzpaVar = (zzpa) zzomVar.zza;
                            zzee.zze("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + jZza + ", " + jZzb + ", " + jNanoTime + ", " + jZzl2 + ", " + zzpaVar.zza.zzF() + ", " + zzpaVar.zza.zzG());
                            zzokVar.zzd();
                        } else if (Math.abs(zzomVar.zzl(jZza) - jZzl2) > 5000000) {
                            zzpa zzpaVar2 = (zzpa) zzomVar.zza;
                            zzee.zze("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + jZza + ", " + jZzb + ", " + jNanoTime + ", " + jZzl2 + ", " + zzpaVar2.zza.zzF() + ", " + zzpaVar2.zza.zzG());
                            zzokVar.zzd();
                        } else {
                            zzokVar.zzc();
                        }
                        zzomVar = this;
                    }
                    if (zzomVar.zzq && (method = zzomVar.zzn) != null && jNanoTime - zzomVar.zzr >= 500000) {
                        try {
                            audioTrack = zzomVar.zzc;
                        } catch (Exception unused) {
                            zzomVar.zzn = null;
                        }
                        if (audioTrack == null) {
                            throw null;
                        }
                        Integer num = (Integer) method.invoke(audioTrack, null);
                        int i5 = zzew.zza;
                        long jIntValue = num.intValue();
                        long j = zzomVar.zzi;
                        Long.signum(jIntValue);
                        long j2 = (jIntValue * 1000) - j;
                        zzomVar.zzo = j2;
                        long jMax = Math.max(j2, 0L);
                        zzomVar.zzo = jMax;
                        if (jMax > 5000000) {
                            zzee.zze("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                            zzomVar.zzo = 0L;
                        }
                        zzomVar.zzr = jNanoTime;
                    }
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        zzok zzokVar2 = zzomVar.zzf;
        zzokVar2.getClass();
        boolean zZzf = zzokVar2.zzf();
        if (zZzf) {
            jZzl = zzomVar.zzl(zzokVar2.zza()) + zzew.zzs(jNanoTime2 - zzokVar2.zzb(), zzomVar.zzj);
        } else {
            jZzl = zzomVar.zzw == 0 ? zzomVar.zzl(zzm()) : zzomVar.zzl + jNanoTime2;
            if (!z) {
                jZzl = Math.max(0L, jZzl - zzomVar.zzo);
            }
        }
        if (zzomVar.zzD != zZzf) {
            zzomVar.zzF = zzomVar.zzC;
            zzomVar.zzE = zzomVar.zzB;
        }
        long j3 = jNanoTime2 - zzomVar.zzF;
        if (j3 < 1000000) {
            long jZzs = zzomVar.zzE + zzew.zzs(j3, zzomVar.zzj);
            long j4 = (j3 * 1000) / 1000000;
            jZzl = ((jZzl * j4) + ((1000 - j4) * jZzs)) / 1000;
        }
        if (!zzomVar.zzk) {
            long j5 = zzomVar.zzB;
            if (jZzl > j5) {
                zzomVar.zzk = true;
                int i6 = zzew.zza;
                long jCurrentTimeMillis = System.currentTimeMillis() - zzew.zzz(zzew.zzu(zzew.zzz(jZzl - j5), zzomVar.zzj));
                zzpf zzpfVar = ((zzpa) zzomVar.zza).zza;
                if (zzpfVar.zzq != null) {
                    ((zzpk) zzpfVar.zzq).zza.zzc.zzr(jCurrentTimeMillis);
                }
            }
        }
        zzomVar.zzC = jNanoTime2;
        zzomVar.zzB = jZzl;
        zzomVar.zzD = zZzf;
        return jZzl;
    }

    public final void zzc(long j) {
        this.zzz = zzm();
        this.zzx = SystemClock.elapsedRealtime() * 1000;
        this.zzA = j;
    }

    public final void zzd() {
        zzn();
        this.zzc = null;
        this.zzf = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.zzc = r3
            r2.zzd = r6
            r2.zze = r7
            com.google.android.gms.internal.ads.zzok r0 = new com.google.android.gms.internal.ads.zzok
            r0.<init>(r3)
            r2.zzf = r0
            int r3 = r3.getSampleRate()
            r2.zzg = r3
            r3 = 0
            if (r4 == 0) goto L25
            int r4 = com.google.android.gms.internal.ads.zzew.zza
            r0 = 23
            if (r4 >= r0) goto L25
            r4 = 5
            r0 = 1
            if (r5 == r4) goto L26
            r4 = 6
            if (r5 != r4) goto L25
            r5 = 6
            goto L26
        L25:
            r0 = 0
        L26:
            r2.zzh = r0
            boolean r4 = com.google.android.gms.internal.ads.zzew.zzW(r5)
            r2.zzq = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r7 = r7 / r6
            long r4 = (long) r7
            long r4 = r2.zzl(r4)
            goto L3d
        L3c:
            r4 = r0
        L3d:
            r2.zzi = r4
            r4 = 0
            r2.zzs = r4
            r2.zzt = r4
            r2.zzu = r4
            r2.zzp = r3
            r2.zzx = r0
            r2.zzy = r0
            r2.zzr = r4
            r2.zzo = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.zzj = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzom.zze(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final boolean zzg(long j) {
        if (j > zzm()) {
            return true;
        }
        if (!this.zzh) {
            return false;
        }
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && zzm() == 0;
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j) {
        return this.zzy != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200;
    }

    public final boolean zzj(long j) {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            }
            if (playState == 1) {
                if (zzm() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzp;
        boolean zZzg = zzg(j);
        this.zzp = zZzg;
        if (z && !zZzg && playState != 1) {
            zzol zzolVar = this.zza;
            int i = this.zze;
            long jZzz = zzew.zzz(this.zzi);
            zzpa zzpaVar = (zzpa) zzolVar;
            if (zzpaVar.zza.zzq != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                zzpf zzpfVar = zzpaVar.zza;
                ((zzpk) zzpfVar.zzq).zza.zzc.zzt(i, jZzz, jElapsedRealtime - zzpfVar.zzU);
            }
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx != -9223372036854775807L) {
            return false;
        }
        zzok zzokVar = this.zzf;
        zzokVar.getClass();
        zzokVar.zze();
        return true;
    }

    public final void zzf() {
        zzok zzokVar = this.zzf;
        zzokVar.getClass();
        zzokVar.zze();
    }
}
