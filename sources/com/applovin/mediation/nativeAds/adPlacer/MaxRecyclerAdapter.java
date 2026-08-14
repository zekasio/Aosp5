package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.applovin.impl.mediation.nativeAds.a.c;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class MaxRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements MaxAdPlacer.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxAdPlacer f1540a;
    private final RecyclerView.Adapter b;
    private final a c;
    private RecyclerView d;
    private c e;
    private MaxAdPlacer.Listener f;
    private int g;
    private AdPositionBehavior h;

    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.Adapter adapter, Activity activity) {
        a aVar = new a();
        this.c = aVar;
        this.g = 8;
        this.h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f1540a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(adapter.hasStableIds());
        this.b = adapter;
        adapter.registerAdapterDataObserver(aVar);
    }

    public void destroy() {
        try {
            this.b.unregisterAdapterDataObserver(this.c);
        } catch (Exception unused) {
        }
        this.f1540a.destroy();
        c cVar = this.e;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f = listener;
    }

    public void setLookAhead(int i) {
        this.g = i;
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.h = adPositionBehavior;
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f1540a;
    }

    public void loadAds() {
        this.f1540a.loadAds();
    }

    public int getAdjustedPosition(int i) {
        return this.f1540a.getAdjustedPosition(i);
    }

    public int getOriginalPosition(int i) {
        return this.f1540a.getOriginalPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == -42) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.max_native_ad_recycler_view_item, viewGroup, false);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            RecyclerView.LayoutManager layoutManager = this.d.getLayoutManager();
            if (layoutManager != null && layoutManager.canScrollHorizontally()) {
                layoutParams.width = -2;
                layoutParams.height = -1;
            } else {
                layoutParams.width = -1;
                layoutParams.height = -2;
            }
            viewInflate.setLayoutParams(layoutParams);
            return new MaxAdRecyclerViewHolder(viewInflate);
        }
        return this.b.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int iDpToPx;
        int iDpToPx2;
        this.e.a(viewHolder.itemView, i);
        if (this.f1540a.isAdPosition(i)) {
            AppLovinSdkUtils.Size adSize = this.f1540a.getAdSize(i, a(i));
            ViewGroup containerView = ((MaxAdRecyclerViewHolder) viewHolder).getContainerView();
            ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
            if (adSize != AppLovinSdkUtils.Size.ZERO) {
                if (adSize.getWidth() < 0) {
                    iDpToPx = adSize.getWidth();
                } else {
                    iDpToPx = AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
                }
                layoutParams.width = iDpToPx;
                if (adSize.getHeight() < 0) {
                    iDpToPx2 = adSize.getHeight();
                } else {
                    iDpToPx2 = AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
                }
                layoutParams.height = iDpToPx2;
                containerView.setLayoutParams(layoutParams);
                this.f1540a.renderAd(i, containerView);
                return;
            }
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
            return;
        }
        this.b.onBindViewHolder(viewHolder, this.f1540a.getOriginalPosition(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f1540a.isAdPosition(i)) {
            return -42;
        }
        return this.b.getItemViewType(this.f1540a.getOriginalPosition(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
        this.b.unregisterAdapterDataObserver(this.c);
        this.b.setHasStableIds(z);
        this.b.registerAdapterDataObserver(this.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (!this.b.hasStableIds()) {
            return -1L;
        }
        if (this.f1540a.isFilledPosition(i)) {
            return this.f1540a.getAdItemId(i);
        }
        return this.b.getItemId(this.f1540a.getOriginalPosition(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1540a.getAdjustedCount(this.b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.d = recyclerView;
        c cVar = new c(recyclerView);
        this.e = cVar;
        cVar.a(new c.a() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter.1
            @Override // com.applovin.impl.mediation.nativeAds.a.c.a
            public void a(int i, int i2) {
                MaxRecyclerAdapter.this.f1540a.updateFillablePositions(i, Math.min(i2 + MaxRecyclerAdapter.this.g, MaxRecyclerAdapter.this.getItemCount() - 1));
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.d = null;
        c cVar = this.e;
        if (cVar != null) {
            cVar.a();
            this.e = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        c cVar = this.e;
        if (cVar != null) {
            cVar.a(viewHolder.itemView);
        }
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            if (this.f1540a.isFilledPosition(viewHolder.getBindingAdapterPosition())) {
                ((MaxAdRecyclerViewHolder) viewHolder).getContainerView().removeAllViews();
            }
            super.onViewRecycled(viewHolder);
            return;
        }
        this.b.onViewRecycled(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            return super.onFailedToRecycleView(viewHolder);
        }
        return this.b.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(viewHolder);
        } else {
            this.b.onViewAttachedToWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.b.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i) {
        notifyItemChanged(i);
        MaxAdPlacer.Listener listener = this.f;
        if (listener != null) {
            listener.onAdLoaded(i);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i) {
        MaxAdPlacer.Listener listener = this.f;
        if (listener != null) {
            listener.onAdRemoved(i);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    private int a(int i) {
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.d.getContext(), this.d.getWidth());
        RecyclerView.LayoutManager layoutManager = this.d.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager)) {
            return layoutManager instanceof StaggeredGridLayoutManager ? iPxToDp / ((StaggeredGridLayoutManager) layoutManager).getSpanCount() : iPxToDp;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        return (iPxToDp / gridLayoutManager.getSpanCount()) * gridLayoutManager.getSpanSizeLookup().getSpanSize(i);
    }

    private class a extends RecyclerView.AdapterDataObserver {
        private a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            int adjustedPosition = MaxRecyclerAdapter.this.f1540a.getAdjustedPosition(i);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f1540a.getAdjustedPosition((i + i2) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            boolean z = i + i2 >= MaxRecyclerAdapter.this.b.getItemCount();
            if (MaxRecyclerAdapter.this.h != AdPositionBehavior.FIXED && (MaxRecyclerAdapter.this.h != AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND || !z)) {
                int adjustedPosition = MaxRecyclerAdapter.this.f1540a.getAdjustedPosition(i);
                for (int i3 = 0; i3 < i2; i3++) {
                    MaxRecyclerAdapter.this.f1540a.insertItem(adjustedPosition);
                }
                MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i2);
                return;
            }
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            int itemCount = MaxRecyclerAdapter.this.b.getItemCount();
            boolean z = i + i2 >= itemCount;
            if (MaxRecyclerAdapter.this.h != AdPositionBehavior.FIXED && (MaxRecyclerAdapter.this.h != AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND || !z)) {
                int adjustedPosition = MaxRecyclerAdapter.this.f1540a.getAdjustedPosition(i);
                int adjustedCount = MaxRecyclerAdapter.this.f1540a.getAdjustedCount(itemCount + i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    MaxRecyclerAdapter.this.f1540a.removeItem(adjustedPosition);
                }
                int adjustedCount2 = MaxRecyclerAdapter.this.f1540a.getAdjustedCount(itemCount);
                int size = adjustedCount - adjustedCount2;
                Collection<Integer> collectionClearTrailingAds = MaxRecyclerAdapter.this.f1540a.clearTrailingAds(adjustedCount2 - 1);
                if (!collectionClearTrailingAds.isEmpty()) {
                    size += collectionClearTrailingAds.size();
                }
                MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (size - i2), size);
                return;
            }
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }
    }

    public static class MaxAdRecyclerViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f1543a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f1543a = (ViewGroup) view.findViewById(R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f1543a;
        }
    }
}
