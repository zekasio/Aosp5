package com.google.ads.mediation.applovin;

import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes.dex */
public final class AppLovinRewardItem implements RewardItem {
    private final int amount;
    private final String type;

    public AppLovinRewardItem(int i, String str) {
        this.amount = i;
        this.type = str;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        return this.type;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return this.amount;
    }
}
