package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.MetadataChangeSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LN {
    public static byte[] A00;
    public static String[] A01 = {"R2O7PMYP6nkOeNui3I4WlXx4fu7rpRKA", "y", "n9RLgUbY6qPVyxnn4C2MCNq6tOX6tKMu", "KtI8XvYnNiAs4lVQz", "VIjGruAAxxfbDEfj8", "jnPluIPOifq7BY1vqnqKLiUetY3DHsfM", "J5aiTqmsNT2689NKU", "zCaDldCe0EtEl2h3W"};
    public static final Package A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final Set<C0947Xy> A06;
    public static final AtomicReference<LW> A07;
    public static final AtomicReference<LY> A08;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-68, -49, -46, -36, -27, -19, -49, -46, -19, -35, -48, -40, -19, -41, -46, -19, -39, -45, -25, 102, 121, 124, -122, -113, -105, -121, -118, -127, 127, -127, -122, 121, -124, -105, 125, -112, -116, -118, 121, -117, -94, -75, -72, -62, -53, -45, -57, -75, -54, -71, -72, -45, -57, -56, -75, -56, -71, -45, -72, -75, -56, -75, -33, -19, 2, -15, -16, -84, -1, 0, -19, 0, -15, -84, -18, 1, -6, -16, -8, -15, -84, -11, -1, -84, -15, -7, -4, 0, 5, -83, -77, -75, -58, -79, -57, -58, -69, -66, -82, -69, -84, -80, -71, -74, -78, -69, -63, -84, -63, -68, -72, -78, -69};
    }

    static {
        A07();
        A02 = LN.class.getPackage();
        A04 = A02 + A06(40, 22, 98);
        A03 = A02 + A06(0, 19, MetadataChangeSet.CUSTOM_PROPERTY_SIZE_LIMIT_BYTES);
        A05 = A02 + A06(19, 21, 38);
        A06 = Collections.newSetFromMap(new WeakHashMap());
        A07 = new AtomicReference<>();
        A08 = new AtomicReference<>();
    }

    public static Intent A00(Intent cloneIntent) {
        Intent intentCloneFilter = cloneIntent.cloneFilter();
        intentCloneFilter.setFlags(cloneIntent.getFlags());
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(cloneIntent.getExtras());
        intentCloneFilter.putExtra(A05, parcelObtain.marshall());
        parcelObtain.recycle();
        return intentCloneFilter;
    }

    public static Intent A01(Intent startIntent, ClassLoader classLoader) {
        Intent intentCloneFilter = startIntent.cloneFilter();
        intentCloneFilter.setFlags(startIntent.getFlags());
        Bundle bundle = new Bundle();
        Parcel parcelObtain = Parcel.obtain();
        byte[] byteArrayExtra = startIntent.getByteArrayExtra(A05);
        if (byteArrayExtra != null) {
            parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            parcelObtain.setDataPosition(0);
            bundle = parcelObtain.readBundle(classLoader);
            parcelObtain.recycle();
        }
        intentCloneFilter.putExtras(bundle);
        return intentCloneFilter;
    }

    public static Bundle A02(Bundle bundle, ClassLoader classLoader) {
        Parcel parcelObtain = Parcel.obtain();
        byte[] byteArray = bundle.getByteArray(A04);
        if (byteArray != null) {
            parcelObtain.unmarshall(byteArray, 0, byteArray.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle2 = parcelObtain.readBundle(classLoader);
            parcelObtain.recycle();
            String[] strArr = A01;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "08vXapB5qdF8q1e2g";
            strArr2[3] = "bPV7EQI3jYdBWJzP2";
            return bundle2;
        }
        throw new IllegalStateException(A06(62, 28, 122));
    }

    @Nullable
    public static C0947Xy A03(Intent intent) {
        String adId = intent.getStringExtra(A03);
        if (adId != null) {
            for (C0947Xy c0947Xy : A06) {
                if (adId.equals(c0947Xy.A0D().getId())) {
                    return c0947Xy;
                }
            }
            return null;
        }
        return null;
    }

    public static AdActivityIntent A04(C0947Xy c0947Xy) {
        AdActivityIntent adActivityIntent = new AdActivityIntent(c0947Xy.getApplicationContext(), A05());
        adActivityIntent.putExtra(A03, c0947Xy.A0D().getId());
        A06.add(c0947Xy);
        return adActivityIntent;
    }

    public static Class A05() {
        if (A01[1].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "4NnM5dRGBMW0KGxzs";
        strArr[3] = "N6FCbEqQMIqNBYuck";
        return AudienceNetworkActivity.class;
    }

    public static void A08(Bundle bundle, Bundle bundle2) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle2);
        bundle.putByteArray(A04, parcelObtain.marshall());
        parcelObtain.recycle();
    }

    public static void A09(C0947Xy c0947Xy, AdActivityIntent adActivityIntent) throws LL {
        try {
            c0947Xy.getApplicationContext().startActivity(A00(adActivityIntent));
        } catch (ActivityNotFoundException e) {
            throw new LL(e);
        }
    }

    public static boolean A0A(Intent intent, Set<String> set) {
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        String prefix = data.toString();
        for (String url : set) {
            if (prefix.startsWith(url)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0B(C0947Xy c0947Xy, Intent intent) throws LL {
        return A0D(c0947Xy, intent, A07.get());
    }

    public static boolean A0C(C0947Xy c0947Xy, Intent intent) throws LL {
        LW lw = A07.get();
        if (lw == null || c0947Xy.A0C() == null) {
            return false;
        }
        String requestId = c0947Xy.A0A();
        try {
            Activity activityA0C = c0947Xy.A0C();
            if (requestId == null) {
                requestId = A06(0, 0, 81);
            }
            return lw.startActivityForResult(intent, 0, activityA0C, requestId);
        } catch (ActivityNotFoundException e) {
            throw new LL(e);
        } catch (Exception e2) {
            c0947Xy.A06().A8y(A06(90, 8, 64), C03298z.A07, new AnonymousClass90(e2));
            return false;
        }
    }

    @VisibleForTesting
    public static boolean A0D(C0947Xy c0947Xy, Intent intent, @Nullable LW lw) throws LL {
        if (A0A(intent, JR.A0W(c0947Xy))) {
            return false;
        }
        Context context = c0947Xy;
        String[] strArr = A01;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A01[1] = "W";
        Activity activityA0C = c0947Xy.A0C();
        if (activityA0C != null) {
            context = activityA0C;
        } else {
            intent.addFlags(DriveFile.MODE_READ_ONLY);
        }
        if (lw != null && !A0A(intent, JR.A0Y(c0947Xy))) {
            String requestId = c0947Xy.A0A();
            if (requestId == null) {
                try {
                    requestId = A06(0, 0, 81);
                } catch (ActivityNotFoundException e) {
                    throw new LL(e);
                } catch (Exception e2) {
                    c0947Xy.A06().A8y(A06(90, 8, 64), C03298z.A08, new AnonymousClass90(e2));
                    return false;
                }
            }
            return lw.startActivity(context, intent, requestId);
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e3) {
            throw new LL(e3);
        }
    }

    public static boolean A0E(C0947Xy c0947Xy, Uri uri, String str) throws ActivityNotFoundException {
        return A0F(c0947Xy, uri, str, A08.get());
    }

    @VisibleForTesting
    public static boolean A0F(C0947Xy c0947Xy, Uri uri, String str, @Nullable LY ly) throws ActivityNotFoundException {
        if (ly == null || c0947Xy.A0C() == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString(A06(98, 15, 59), str);
        return ly.handleUriForResult(c0947Xy, uri.toString(), bundle, null, 0, c0947Xy.A0C());
    }
}
