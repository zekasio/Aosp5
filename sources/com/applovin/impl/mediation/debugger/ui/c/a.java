package com.applovin.impl.mediation.debugger.ui.c;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.b.c.b;
import com.applovin.impl.mediation.debugger.ui.c.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.b;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f1076a;
    private ListView b;

    public a() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public void initialize(final com.applovin.impl.mediation.debugger.b.c.b bVar) {
        setTitle(bVar.i());
        b bVar2 = new b(bVar, this);
        this.f1076a = bVar2;
        bVar2.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.c.a.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar) {
                if (aVar.a() == b.a.TEST_ADS.ordinal()) {
                    p pVarY = bVar.y();
                    b.EnumC0065b enumC0065bC = bVar.c();
                    if (a.this.f1076a.a(aVar)) {
                        if (b.EnumC0065b.READY == enumC0065bC) {
                            com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerMultiAdActivity.class, pVarY.w(), new b.a<MaxDebuggerMultiAdActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.c.a.1.1
                                @Override // com.applovin.impl.sdk.utils.b.a
                                public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                                    maxDebuggerMultiAdActivity.initialize(bVar);
                                }
                            });
                            return;
                        } else if (b.EnumC0065b.DISABLED == enumC0065bC) {
                            pVarY.av().d();
                            Utils.showAlert(cVar.l(), cVar.m(), a.this);
                            return;
                        } else {
                            Utils.showAlert(cVar.l(), cVar.m(), a.this);
                            return;
                        }
                    }
                    Utils.showAlert(cVar.l(), cVar.m(), a.this);
                    return;
                }
                Utils.showAlert(cVar.l(), cVar.m(), a.this);
            }
        });
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.b = listView;
        listView.setAdapter((ListAdapter) this.f1076a);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    protected p getSdk() {
        b bVar = this.f1076a;
        if (bVar != null) {
            return bVar.a().y();
        }
        return null;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f1076a.a().m().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f1076a.b();
            this.f1076a.m();
        }
    }
}
