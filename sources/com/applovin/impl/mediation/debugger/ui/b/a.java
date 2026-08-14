package com.applovin.impl.mediation.debugger.ui.b;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.mediation.debugger.ui.b.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.b;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.sdk.R;
import cz.msebera.android.httpclient.protocol.HTTP;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f1060a;
    private DataSetObserver b;
    private FrameLayout c;
    private ListView d;
    private com.applovin.impl.adview.a e;

    @Override // com.applovin.impl.mediation.debugger.ui.a
    protected p getSdk() {
        b bVar = this.f1060a;
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.c = (FrameLayout) findViewById(android.R.id.content);
        this.d = (ListView) findViewById(R.id.listView);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share == menuItem.getItemId()) {
            a();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.d.setAdapter((ListAdapter) this.f1060a);
        b bVar = this.f1060a;
        if (bVar == null || bVar.a()) {
            return;
        }
        b();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        b bVar = this.f1060a;
        if (bVar != null) {
            bVar.unregisterDataSetObserver(this.b);
            this.f1060a.a((d.a) null);
        }
    }

    public void setListAdapter(b bVar, final com.applovin.impl.sdk.a aVar) {
        DataSetObserver dataSetObserver;
        b bVar2 = this.f1060a;
        if (bVar2 != null && (dataSetObserver = this.b) != null) {
            bVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f1060a = bVar;
        this.b = new DataSetObserver() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.1
            @Override // android.database.DataSetObserver
            public void onChanged() {
                a.this.c();
                a aVar2 = a.this;
                aVar2.a((Context) aVar2);
            }
        };
        a((Context) this);
        this.f1060a.registerDataSetObserver(this.b);
        this.f1060a.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar2, final c cVar) {
                int iA = aVar2.a();
                if (iA == b.EnumC0070b.APP_INFO.ordinal() || iA == b.EnumC0070b.MAX.ordinal()) {
                    Utils.showAlert(cVar.l(), cVar.m(), a.this);
                    return;
                }
                if (iA == b.EnumC0070b.ADS.ordinal()) {
                    if (aVar2.b() == b.a.AD_UNITS.ordinal()) {
                        if (a.this.f1060a.d().size() > 0) {
                            com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerAdUnitsListActivity.class, aVar, new b.a<MaxDebuggerAdUnitsListActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.1
                                @Override // com.applovin.impl.sdk.utils.b.a
                                public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                                    maxDebuggerAdUnitsListActivity.initialize(a.this.f1060a.d(), false, a.this.f1060a.c());
                                }
                            });
                            return;
                        } else {
                            Utils.showAlert("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", a.this);
                            return;
                        }
                    }
                    if (aVar2.b() == b.a.SELECT_LIVE_NETWORKS.ordinal()) {
                        if (a.this.f1060a.i().size() > 0 || a.this.f1060a.j().size() > 0) {
                            if (a.this.f1060a.c().av().a()) {
                                Utils.showAlert("Restart Required", cVar.m(), a.this);
                                return;
                            } else {
                                com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerTestLiveNetworkActivity.class, aVar, new b.a<MaxDebuggerTestLiveNetworkActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.2
                                    @Override // com.applovin.impl.sdk.utils.b.a
                                    public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                                        maxDebuggerTestLiveNetworkActivity.initialize(a.this.f1060a.i(), a.this.f1060a.j(), a.this.f1060a.c());
                                    }
                                });
                                return;
                            }
                        }
                        Utils.showAlert("Complete Integrations", "Please complete integrations in order to access this.", a.this);
                        return;
                    }
                    if (aVar2.b() == b.a.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                        if (a.this.f1060a.c().av().a()) {
                            if (a.this.f1060a.k().size() > 0) {
                                com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerTestModeNetworkActivity.class, aVar, new b.a<MaxDebuggerTestModeNetworkActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.3
                                    @Override // com.applovin.impl.sdk.utils.b.a
                                    public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                                        maxDebuggerTestModeNetworkActivity.initialize(a.this.f1060a.k(), a.this.f1060a.c());
                                    }
                                });
                                return;
                            } else {
                                Utils.showAlert("Complete Integrations", "Please complete integrations in order to access this.", a.this);
                                return;
                            }
                        }
                        a.this.getSdk().av().d();
                        Utils.showAlert("Restart Required", cVar.m(), a.this);
                        return;
                    }
                    if (aVar2.b() == b.a.INITIALIZATION_AD_UNITS.ordinal()) {
                        com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerAdUnitsListActivity.class, aVar, new b.a<MaxDebuggerAdUnitsListActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.4
                            @Override // com.applovin.impl.sdk.utils.b.a
                            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                                maxDebuggerAdUnitsListActivity.initialize(a.this.f1060a.f(), true, a.this.f1060a.c());
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((iA == b.EnumC0070b.INCOMPLETE_NETWORKS.ordinal() || iA == b.EnumC0070b.COMPLETED_NETWORKS.ordinal()) && (cVar instanceof com.applovin.impl.mediation.debugger.ui.b.a.a)) {
                    com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerDetailActivity.class, aVar, new b.a<MaxDebuggerDetailActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.5
                        @Override // com.applovin.impl.sdk.utils.b.a
                        public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                            maxDebuggerDetailActivity.initialize(((com.applovin.impl.mediation.debugger.ui.b.a.a) cVar).f());
                        }
                    });
                }
            }
        });
    }

    private void a() {
        String strL = this.f1060a.l();
        if (TextUtils.isEmpty(strL)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(HTTP.PLAIN_TEXT_TYPE);
        intent.putExtra("android.intent.extra.TEXT", strL);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, null));
    }

    private void b() {
        c();
        com.applovin.impl.adview.a aVar = new com.applovin.impl.adview.a(this, 50, android.R.attr.progressBarStyleLarge);
        this.e = aVar;
        aVar.setColor(-3355444);
        this.c.addView(this.e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.c.bringChildToFront(this.e);
        this.e.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.applovin.impl.adview.a aVar = this.e;
        if (aVar != null) {
            aVar.b();
            this.c.removeView(this.e);
            this.e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context) {
        if (!StringUtils.isValidString(this.f1060a.h()) || this.f1060a.b()) {
            return;
        }
        this.f1060a.a(true);
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.3
            @Override // java.lang.Runnable
            public void run() {
                Utils.showAlert(a.this.f1060a.g(), a.this.f1060a.h(), context);
            }
        });
    }
}
