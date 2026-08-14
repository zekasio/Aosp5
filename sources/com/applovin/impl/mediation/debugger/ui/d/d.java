package com.applovin.impl.mediation.debugger.ui.d;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends BaseAdapter implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<c> f1085a = new ArrayList();
    private Map<Integer, Integer> b = CollectionUtils.map();
    protected Context c;
    private a d;

    public interface a {
        void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar);
    }

    protected abstract int a(int i);

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    protected abstract c b(int i);

    protected abstract List<c> c(int i);

    protected abstract int e();

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    protected c n() {
        return null;
    }

    protected d(Context context) {
        this.c = context.getApplicationContext();
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    public void m() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.debugger.ui.d.d.1
            @Override // java.lang.Runnable
            public void run() {
                d.this.notifyDataSetChanged();
            }
        });
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return getItem(i).c();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return c.h();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return getItem(i).i();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f1085a.size();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c getItem(int i) {
        return this.f1085a.get(i);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i;
        this.f1085a = new ArrayList();
        int iE = e();
        this.b = CollectionUtils.map(iE);
        c cVarN = n();
        if (cVarN != null) {
            this.f1085a.add(cVarN);
            i = 1;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < iE; i2++) {
            int iA = a(i2);
            if (iA != 0) {
                this.f1085a.add(b(i2));
                this.f1085a.addAll(c(i2));
                this.b.put(Integer.valueOf(i2), Integer.valueOf(i));
                i += iA + 1;
            }
        }
        this.f1085a.add(new e(""));
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        b bVar;
        c item = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            bVar = new b();
            bVar.f1082a = (TextView) view.findViewById(R.id.text1);
            bVar.b = (TextView) view.findViewById(R.id.text2);
            bVar.c = (ImageView) view.findViewById(com.applovin.sdk.R.id.imageView);
            bVar.d = (ImageView) view.findViewById(com.applovin.sdk.R.id.detailImageView);
            view.setTag(bVar);
            view.setOnClickListener(this);
        } else {
            bVar = (b) view.getTag();
        }
        bVar.a(i);
        bVar.a(item);
        view.setEnabled(item.c());
        return view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        b bVar = (b) view.getTag();
        c cVarB = bVar.b();
        com.applovin.impl.mediation.debugger.ui.d.a aVarE = e(bVar.a());
        a aVar = this.d;
        if (aVar == null || aVarE == null) {
            return;
        }
        aVar.a(aVarE, cVarB);
    }

    private com.applovin.impl.mediation.debugger.ui.d.a e(int i) {
        for (int i2 = 0; i2 < e(); i2++) {
            Integer num = this.b.get(Integer.valueOf(i2));
            if (num != null) {
                if (i <= num.intValue() + a(i2)) {
                    return new com.applovin.impl.mediation.debugger.ui.d.a(i2, i - (num.intValue() + 1));
                }
            }
        }
        return null;
    }
}
