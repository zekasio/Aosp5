package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdte implements SensorEventListener {
    private final Context zza;

    @Nullable
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzdtd zzf;
    private boolean zzg;

    zzdte(Context context) {
        this.zza = context;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzij)).booleanValue()) {
            float f = sensorEvent.values[0] / 9.80665f;
            float f2 = sensorEvent.values[1] / 9.80665f;
            float f3 = sensorEvent.values[2] / 9.80665f;
            if (((float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3))) < ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzik)).floatValue()) {
                return;
            }
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            if (this.zzd + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzil)).intValue()) > jCurrentTimeMillis) {
                return;
            }
            if (this.zzd + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzim)).intValue()) < jCurrentTimeMillis) {
                this.zze = 0;
            }
            com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
            this.zzd = jCurrentTimeMillis;
            int i = this.zze + 1;
            this.zze = i;
            zzdtd zzdtdVar = this.zzf;
            if (zzdtdVar != null) {
                if (i == ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzin)).intValue()) {
                    zzdsf zzdsfVar = (zzdsf) zzdtdVar;
                    zzdsfVar.zzh(new zzdsc(zzdsfVar), zzdse.GESTURE);
                }
            }
        }
    }

    public final void zza() {
        synchronized (this) {
            if (this.zzg) {
                SensorManager sensorManager = this.zzb;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.zzc);
                    com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                }
                this.zzg = false;
            }
        }
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzij)).booleanValue()) {
                if (this.zzb == null) {
                    SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                    this.zzb = sensorManager2;
                    if (sensorManager2 == null) {
                        zzbza.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.zzc = sensorManager2.getDefaultSensor(1);
                }
                if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.zzd = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzil)).intValue());
                    this.zzg = true;
                    com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                }
            }
        }
    }

    public final void zzc(zzdtd zzdtdVar) {
        this.zzf = zzdtdVar;
    }
}
