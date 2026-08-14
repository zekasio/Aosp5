package com.applovin.impl.mediation.debugger.ui.a;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.b;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.applovin.impl.mediation.debugger.ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.a.a> f1053a;
    private p b;
    private com.applovin.impl.mediation.debugger.ui.d.d c;
    private List<com.applovin.impl.mediation.debugger.ui.d.c> d;
    private boolean e;
    private ListView f;

    public void initialize(final List<com.applovin.impl.mediation.debugger.b.a.a> list, boolean z, final p pVar) {
        this.f1053a = list;
        this.e = z;
        this.b = pVar;
        this.d = a(list);
        com.applovin.impl.mediation.debugger.ui.d.d dVar = new com.applovin.impl.mediation.debugger.ui.d.d(this) { // from class: com.applovin.impl.mediation.debugger.ui.a.c.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected int e() {
                return 1;
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected int a(int i) {
                return list.size();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected com.applovin.impl.mediation.debugger.ui.d.c b(int i) {
                return new e("");
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i) {
                return c.this.d;
            }
        };
        this.c = dVar;
        dVar.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.a.c.2
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(final com.applovin.impl.mediation.debugger.ui.d.a aVar, com.applovin.impl.mediation.debugger.ui.d.c cVar) {
                com.applovin.impl.sdk.utils.b.a(c.this, MaxDebuggerAdUnitDetailActivity.class, pVar.w(), new b.a<MaxDebuggerAdUnitDetailActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.a.c.2.1
                    @Override // com.applovin.impl.sdk.utils.b.a
                    public void a(MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
                        maxDebuggerAdUnitDetailActivity.initialize((com.applovin.impl.mediation.debugger.b.a.a) list.get(aVar.b()), null, pVar);
                    }
                });
            }
        });
        this.c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    protected p getSdk() {
        return this.b;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle((this.e ? "Selective Init " : "").concat("Ad Units"));
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f = listView;
        listView.setAdapter((ListAdapter) this.c);
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> a(List<com.applovin.impl.mediation.debugger.b.a.a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (com.applovin.impl.mediation.debugger.b.a.a aVar : list) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(aVar.a(), ViewCompat.MEASURED_STATE_MASK));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(aVar.c(), ViewCompat.MEASURED_STATE_MASK));
            arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.a(c.b.DETAIL).a(StringUtils.createSpannedString(aVar.b(), ViewCompat.MEASURED_STATE_MASK, 18, 1)).b(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }
}
