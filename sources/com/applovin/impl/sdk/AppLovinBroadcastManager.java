package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class AppLovinBroadcastManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Receiver, ArrayList<b>> f1174a = CollectionUtils.map();
    private static final Map<String, ArrayList<b>> b = CollectionUtils.map();
    private static final ArrayList<a> c = new ArrayList<>();
    private static final Handler d = new Handler(Looper.getMainLooper()) { // from class: com.applovin.impl.sdk.AppLovinBroadcastManager.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.b();
            } else {
                super.handleMessage(message);
            }
        }
    };

    public interface Receiver {
        void onReceive(Intent intent, Map<String, Object> map);
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final IntentFilter f1176a;
        final Receiver b;
        boolean c;
        boolean d;

        b(IntentFilter intentFilter, Receiver receiver) {
            this.f1176a = intentFilter;
            this.b = receiver;
        }
    }

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f1175a;
        final Map<String, Object> b;
        final List<b> c;

        a(Intent intent, Map<String, Object> map, List<b> list) {
            this.f1175a = intent;
            this.b = map;
            this.c = list;
        }
    }

    public static void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        Map<Receiver, ArrayList<b>> map = f1174a;
        synchronized (map) {
            b bVar = new b(intentFilter, receiver);
            ArrayList<b> arrayList = map.get(receiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                map.put(receiver, arrayList);
            }
            arrayList.add(bVar);
            Iterator<String> itActionsIterator = intentFilter.actionsIterator();
            while (itActionsIterator.hasNext()) {
                String next = itActionsIterator.next();
                Map<String, ArrayList<b>> map2 = b;
                ArrayList<b> arrayList2 = map2.get(next);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    map2.put(next, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    public static void unregisterReceiver(Receiver receiver) {
        Map<Receiver, ArrayList<b>> map = f1174a;
        synchronized (map) {
            ArrayList<b> arrayListRemove = map.remove(receiver);
            if (arrayListRemove == null) {
                return;
            }
            for (b bVar : arrayListRemove) {
                bVar.d = true;
                Iterator<String> itActionsIterator = bVar.f1176a.actionsIterator();
                while (itActionsIterator.hasNext()) {
                    String next = itActionsIterator.next();
                    ArrayList<b> arrayList = b.get(next);
                    if (arrayList != null) {
                        Iterator<b> it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (it.next().b == receiver) {
                                bVar.d = true;
                                it.remove();
                            }
                        }
                        if (arrayList.size() <= 0) {
                            b.remove(next);
                        }
                    }
                }
            }
        }
    }

    public static boolean sendBroadcast(Intent intent, Map<String, Object> map) {
        synchronized (f1174a) {
            List<b> listA = a(intent);
            if (listA == null) {
                return false;
            }
            c.add(new a(intent, map, listA));
            Handler handler = d;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
            return true;
        }
    }

    public static boolean sendBroadcastWithAdObject(String str, Object obj) {
        Map map = CollectionUtils.map(1);
        map.put("ad", obj);
        return sendBroadcast(new Intent(str), map);
    }

    public static void sendBroadcastSync(Intent intent, Map<String, Object> map) {
        List<b> listA = a(intent);
        if (listA == null) {
            return;
        }
        for (b bVar : listA) {
            if (!bVar.d) {
                bVar.b.onReceive(intent, map);
            }
        }
    }

    public static void sendBroadcastSyncWithPendingBroadcasts(Intent intent, Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            b();
        }
    }

    private static List<b> a(Intent intent) {
        synchronized (f1174a) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            ArrayList<b> arrayList = b.get(action);
            if (arrayList == null) {
                return null;
            }
            ArrayList arrayList2 = null;
            for (b bVar : arrayList) {
                if (!bVar.c && bVar.f1176a.match(action, null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(bVar);
                    bVar.c = true;
                }
            }
            if (arrayList2 == null) {
                return null;
            }
            Iterator<b> it = arrayList2.iterator();
            while (it.hasNext()) {
                it.next().c = false;
            }
            return arrayList2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        int size;
        a[] aVarArr;
        while (true) {
            synchronized (f1174a) {
                ArrayList<a> arrayList = c;
                size = arrayList.size();
                if (size <= 0) {
                    return;
                }
                aVarArr = new a[size];
                arrayList.toArray(aVarArr);
                arrayList.clear();
            }
            for (int i = 0; i < size; i++) {
                a aVar = aVarArr[i];
                if (aVar != null) {
                    for (b bVar : aVar.c) {
                        if (bVar != null && !bVar.d) {
                            bVar.b.onReceive(aVar.f1175a, aVar.b);
                        }
                    }
                }
            }
        }
    }
}
