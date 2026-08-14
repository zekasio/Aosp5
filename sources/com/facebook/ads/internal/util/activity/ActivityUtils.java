package com.facebook.ads.internal.util.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import com.facebook.ads.redexgen.X.AnonymousClass90;
import com.facebook.ads.redexgen.X.C03298z;
import com.facebook.ads.redexgen.X.C0946Xx;
import com.facebook.ads.redexgen.X.C0947Xy;
import com.facebook.ads.redexgen.X.JR;
import com.facebook.ads.redexgen.X.LM;
import com.facebook.ads.redexgen.X.LO;
import com.facebook.ads.redexgen.X.LP;
import com.facebook.ads.redexgen.X.LT;
import com.facebook.ads.redexgen.X.MM;
import com.google.android.gms.drive.MetadataChangeSet;
import com.vungle.warren.AdLoader;
import cz.msebera.android.httpclient.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ActivityUtils implements Application.ActivityLifecycleCallbacks {
    public static Context A01;
    public static C0946Xx A02;
    public static byte[] A03;
    public static String[] A04 = {"ouMPsLdF8VOzsynXqmRiTnVq9sCULlEK", "RDluICFSUJyOT3sC2lXOFgStPQc7gg7Y", "UmtUlnThENixw5hdz8sG1KFdsGmJDk97", "fTn296Ch3TXxkAVBDyGQxp9TrJ", "IUqXVRs0X8uhoFuXuWrDHC", "AqSoSQ8lTXl56yd6tw1FPxb5AEpw6", "5ylHfIThOZnGyEtaFkstDkkPbeVs18fd", "i0x"};
    public static final LT A05;
    public static final List<LP> A06;
    public static final List<Runnable> A07;
    public static final Map<Activity, Integer> A08;
    public final Class<? extends Activity> A00;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A04;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "4AKSMNDzmxTAf23dNNcZP8";
            strArr2[7] = "cH1";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 12);
            i4++;
        }
    }

    public static void A02() {
        A03 = new byte[]{54, 58, 91, 121, 110, 115, 108, 115, 110, 99, 32, 58, 92, 80, 2, Ascii.NAK, Ascii.SYN, 74, 80, 115, 81, 70, 91, 68, 91, 70, 75, Ascii.DC2, 86, 91, 65, 81, 64, 87, 66, 83, 92, 81, 91, 87, 65, Ascii.FS, 55, 6, 6, 53, Ascii.EM, Ascii.CAN, 2, 19, Ascii.SO, 2, 86, Ascii.US, 5, 86, Ascii.CAN, Ascii.EM, 2, 86, 55, 6, 6, Ascii.SUB, Ascii.US, Ascii.NAK, Ascii.ETB, 2, Ascii.US, Ascii.EM, Ascii.CAN, 88, 40, 4, 5, 8, Ascii.RS, Ascii.EM, Ascii.EM, Ascii.SO, 5, Ascii.US, 75, 6, 4, Ascii.SI, 2, Ascii.CR, 2, 8, 10, Ascii.US, 2, 4, 5, 75, Ascii.SO, 19, 8, Ascii.SO, Ascii.ESC, Ascii.US, 2, 4, 5, 75, Ascii.US, 3, Ascii.EM, 4, Ascii.FS, 5, Ascii.SI, Ascii.RS, Ascii.EM, 2, 5, Ascii.FF, 75, Ascii.EM, Ascii.SO, Ascii.FF, 2, Ascii.CAN, Ascii.US, Ascii.SO, Ascii.EM, 42, 8, Ascii.US, 2, Ascii.GS, 2, Ascii.US, Ascii.DC2, 40, 10, 7, 7, 9, 10, 8, 0, Ascii.CAN, 39, 2, Ascii.CAN, Ascii.US, Ascii.SO, 5, Ascii.SO, Ascii.EM, 10, 41, 33, 101, 36, 38, 49, 44, 51, 44, 49, 60, 101, 54, 49, 36, 49, 32, 127, 101, 115, 66, 86, 80, 70, 71, 3, 66, 64, 87, 74, 85, 74, 87, 90, 3, 74, 80, 3, 77, 76, 87, 3, 81, 70, 80, 86, 78, 70, 71, Ascii.CR, 74, 125, 107, 34, 56, Ascii.US, Ascii.GS, 10, 33, Ascii.VT, 10, Ascii.ETB, Ascii.DC2, 4, Ascii.NAK, Ascii.FF};
    }

    static {
        A02();
        A08 = Collections.synchronizedMap(new WeakHashMap());
        A06 = Collections.synchronizedList(new ArrayList());
        A07 = new ArrayList();
        A05 = LT.A00();
    }

    public ActivityUtils(Class<? extends Activity> adsActivityClass) {
        this.A00 = adsActivityClass;
    }

    @Nullable
    public static synchronized Activity A00() {
        Activity lastResumedActivity = null;
        Iterator<Map.Entry<Activity, Integer>> it = A08.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Activity, Integer> next = it.next();
            if (next.getValue().intValue() == 3) {
                Activity lastResumedActivity2 = next.getKey();
                lastResumedActivity = lastResumedActivity2;
                break;
            }
        }
        Activity activityA00 = null;
        boolean z = lastResumedActivity == null || Build.VERSION.SDK_INT < 28;
        if (z) {
            activityA00 = LM.A00();
        }
        if (A02 != null && z && lastResumedActivity != activityA00) {
            AnonymousClass90 anonymousClass90 = new AnonymousClass90(A01(19, 23, 62), A01(HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, 5, 20) + lastResumedActivity + A01(12, 7, MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES) + activityA00);
            anonymousClass90.A03(1);
            A02.A06().A8y(A01(208, 8, 114), C03298z.A03, anonymousClass90);
        }
        return lastResumedActivity != null ? lastResumedActivity : activityA00;
    }

    public static void A03(@NonNull C0947Xy c0947Xy) {
        if (!JR.A19(c0947Xy) || Build.VERSION.SDK_INT >= 29) {
            return;
        }
        LO lo = new LO(c0947Xy);
        synchronized (A07) {
            A07.add(lo);
        }
        MM.A01.A01().postDelayed(lo, AdLoader.RETRY_DELAY);
    }

    public static synchronized void A04(C0946Xx c0946Xx, Class<? extends Activity> cls) {
        A02 = c0946Xx;
        A01 = c0946Xx.getApplicationContext();
        if (A01 instanceof Application) {
            ANActivityLifecycleCallbacksListener aNActivityLifecycleCallbacksListener = ANActivityLifecycleCallbacksListener.getANActivityLifecycleCallbacksListener();
            if (aNActivityLifecycleCallbacksListener != null) {
                Map<Activity, Integer> activityStateMap = aNActivityLifecycleCallbacksListener.getActivityStateMap();
                synchronized (activityStateMap) {
                    try {
                        A08.putAll(activityStateMap);
                    } catch (ConcurrentModificationException unused) {
                        c0946Xx.A06().A8y(A01(208, 8, 114), C03298z.A02, new AnonymousClass90(A01(72, 80, 103)));
                    }
                }
                ANActivityLifecycleCallbacksListener.unregisterActivityCallbacks(c0946Xx);
            }
            ((Application) A01).registerActivityLifecycleCallbacks(new ActivityUtils(cls));
        } else {
            c0946Xx.A06().A8y(A01(216, 3, 105), C03298z.A0d, new AnonymousClass90(A01(42, 30, 122)));
        }
    }

    public static void A05(LP lp) {
        A06.add(lp);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        A08.put(activity, 1);
        Iterator<LP> it = A06.iterator();
        while (it.hasNext()) {
            it.next().onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        A08.put(activity, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList;
        Integer num = A08.get(activity);
        if (num == null || num.intValue() != 3) {
            AnonymousClass90 anonymousClass90 = new AnonymousClass90(A01(172, 31, 47), A01(152, 20, 73) + num + A01(0, 12, 22) + activity);
            anonymousClass90.A03(0);
            A02.A06().A8y(A01(208, 8, 114), C03298z.A03, anonymousClass90);
        }
        A08.put(activity, 4);
        if (activity.getClass() != this.A00) {
            synchronized (A07) {
                arrayList = new ArrayList(A07);
                A07.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MM.A01.A01().removeCallbacks((Runnable) it.next());
            }
        }
        A05.A01();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        A08.put(activity, 3);
        A05.A02();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        A08.put(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        A08.put(activity, 5);
    }
}
