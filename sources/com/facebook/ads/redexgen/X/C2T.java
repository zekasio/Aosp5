package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2T {
    public static C2T A05;
    public static byte[] A06;
    public static final Object A07;
    public final Context A00;
    public final Handler A01;
    public final HashMap<BroadcastReceiver, ArrayList<C2S>> A04 = new HashMap<>();
    public final HashMap<String, ArrayList<C2S>> A03 = new HashMap<>();
    public final ArrayList<C2R> A02 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{-116, -116, -78, -43, -40, -32, -47, -34, -116, -48, -43, -48, -116, -38, -37, -32, -116, -39, -51, -32, -49, -44, -90, -116, -111, -111, -73, -38, -35, -27, -42, -29, -111, -34, -46, -27, -44, -39, -42, -43, -110, -111, -111, -34, -46, -27, -44, -39, -82, -95, -23, -102, -23, -32, -102, -29, -24, -18, -33, -24, -18, -102, 126, -47, -63, -58, -61, -53, -61, 126, -88, -54, -37, -48, -42, -43, -121, -45, -48, -38, -37, -95, -121, Ascii.ESC, 62, 50, 48, 59, 17, 65, 62, 48, 51, 50, 48, 66, 67, Ascii.FS, 48, 61, 48, 54, 52, 65, -51, -31, -12, -29, -24, -23, -18, -25, -96, -31, -25, -31, -23, -18, -13, -12, -96, -26, -23, -20, -12, -27, -14, -96, -80, -61, -47, -51, -54, -44, -57, -52, -59, 126, -46, -41, -50, -61, 126, -19, -17, 0, -11, -5, -6, -3, -5, Ascii.SO, -1, 1, 9, Ascii.FF, 19, 9, 6, Ascii.EM, 6, Ascii.GS, 34, Ascii.EM, Ascii.SO, -53, -60, -63, -60, -59, -51, -60, 118, -56, -69, -73, -55, -59, -60};
    }

    static {
        A03();
        A07 = new Object();
    }

    public C2T(Context context) {
        this.A00 = context;
        final Looper mainLooper = context.getMainLooper();
        this.A01 = new Handler(mainLooper) { // from class: com.facebook.ads.redexgen.X.2Q
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    this.A00.A02();
                }
            }
        };
    }

    public static C2T A00(Context context) {
        C2T c2t;
        synchronized (A07) {
            if (A05 == null) {
                A05 = new C2T(context.getApplicationContext());
            }
            c2t = A05;
        }
        return c2t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C2R[] c2rArr;
        while (true) {
            synchronized (this.A04) {
                int size = this.A02.size();
                if (size > 0) {
                    c2rArr = new C2R[size];
                    this.A02.toArray(c2rArr);
                    this.A02.clear();
                } else {
                    return;
                }
            }
            for (C2R c2r : c2rArr) {
                int size2 = c2r.A01.size();
                for (int i = 0; i < size2; i++) {
                    C2S c2s = c2r.A01.get(i);
                    if (!c2s.A01) {
                        c2s.A02.onReceive(this.A00, c2r.A00);
                    }
                }
            }
        }
    }

    public final void A05(BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            ArrayList<C2S> arrayListRemove = this.A04.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                C2S c2s = arrayListRemove.get(size);
                c2s.A01 = true;
                for (int i = 0; i < c2s.A03.countActions(); i++) {
                    String action = c2s.A03.getAction(i);
                    ArrayList<C2S> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            C2S c2s2 = arrayList.get(size2);
                            if (c2s2.A02 == broadcastReceiver) {
                                c2s2.A01 = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A06(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.A04) {
            C2S c2s = new C2S(intentFilter, broadcastReceiver);
            ArrayList<C2S> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c2s);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<C2S> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(c2s);
            }
        }
    }

    public final boolean A07(Intent intent) {
        String str;
        String strA01;
        synchronized (this.A04) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            int i = 0;
            int i2 = (intent.getFlags() & 8) != 0 ? 1 : 0;
            if (i2 != 0) {
                String str2 = A01(128, 15, 14) + strResolveTypeIfNeeded + A01(62, 8, 14) + scheme + A01(51, 11, 42) + intent;
            }
            ArrayList<C2S> arrayList = this.A03.get(intent.getAction());
            if (arrayList != null) {
                if (i2 != 0) {
                    String str3 = A01(70, 13, 23) + arrayList;
                }
                ArrayList arrayList2 = null;
                while (i < arrayList.size()) {
                    C2S c2s = arrayList.get(i);
                    if (i2 != 0) {
                        String str4 = A01(104, 24, 48) + c2s.A03;
                    }
                    if (!c2s.A00) {
                        str = strResolveTypeIfNeeded;
                        int iMatch = c2s.A03.match(action, strResolveTypeIfNeeded, scheme, data, categories, A01(83, 21, 127));
                        if (iMatch >= 0) {
                            if (i2 != 0) {
                                String str5 = A01(24, 27, 33) + Integer.toHexString(iMatch);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c2s);
                            c2s.A00 = true;
                        } else if (i2 != 0) {
                            if (iMatch == -4) {
                                strA01 = A01(149, 8, 74);
                            } else if (iMatch == -3) {
                                strA01 = A01(143, 6, 60);
                            } else if (iMatch == -2) {
                                strA01 = A01(157, 4, 85);
                            } else if (iMatch != -1) {
                                strA01 = A01(165, 14, 6);
                            } else {
                                strA01 = A01(161, 4, 89);
                            }
                            String str6 = A01(0, 24, 28) + strA01;
                        }
                    } else if (i2 != 0) {
                        str = strResolveTypeIfNeeded;
                    } else {
                        str = strResolveTypeIfNeeded;
                    }
                    i++;
                    strResolveTypeIfNeeded = str;
                }
                if (arrayList2 != null) {
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        ((C2S) arrayList2.get(i3)).A00 = false;
                    }
                    this.A02.add(new C2R(intent, arrayList2));
                    if (!this.A01.hasMessages(1)) {
                        this.A01.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
