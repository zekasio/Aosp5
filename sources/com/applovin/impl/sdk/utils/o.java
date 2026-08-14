package com.applovin.impl.sdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class o implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1495a;
    private final float b;
    private final SensorManager c;
    private final Sensor d;
    private final Sensor e;
    private final com.applovin.impl.sdk.p f;
    private float[] g;
    private float h;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public o(com.applovin.impl.sdk.p pVar) {
        this.f = pVar;
        SensorManager sensorManager = (SensorManager) com.applovin.impl.sdk.p.y().getSystemService("sensor");
        this.c = sensorManager;
        this.d = sensorManager.getDefaultSensor(9);
        this.e = sensorManager.getDefaultSensor(4);
        this.f1495a = ((Integer) pVar.a(com.applovin.impl.sdk.c.b.en)).intValue();
        this.b = ((Float) pVar.a(com.applovin.impl.sdk.c.b.em)).floatValue();
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void a() {
        this.c.unregisterListener(this);
        if (((Boolean) this.f.N().a(com.applovin.impl.sdk.c.b.ek)).booleanValue()) {
            this.c.registerListener(this, this.d, (int) TimeUnit.MILLISECONDS.toMicros(this.f1495a));
        }
        if (((Boolean) this.f.N().a(com.applovin.impl.sdk.c.b.el)).booleanValue()) {
            this.c.registerListener(this, this.e, (int) TimeUnit.MILLISECONDS.toMicros(this.f1495a));
        }
    }

    public float b() {
        return this.h;
    }

    public float c() {
        if (this.g == null) {
            return 0.0f;
        }
        return (float) Math.toDegrees(Math.acos(r0[2] / 9.81f));
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.g = sensorEvent.values;
        } else if (sensorEvent.sensor.getType() == 4) {
            float f = this.h * this.b;
            this.h = f;
            this.h = f + Math.abs(sensorEvent.values[0]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[2]);
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.c.unregisterListener(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }
}
