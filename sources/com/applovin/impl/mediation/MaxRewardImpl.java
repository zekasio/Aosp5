package com.applovin.impl.mediation;

import com.applovin.mediation.MaxReward;

/* JADX INFO: loaded from: classes.dex */
public class MaxRewardImpl implements MaxReward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f933a;
    private final int b;

    public static MaxReward createDefault() {
        return create(0, "");
    }

    public static MaxReward create(int i, String str) {
        return new MaxRewardImpl(i, str);
    }

    private MaxRewardImpl(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.f933a = str;
        this.b = i;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f933a;
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.b;
    }

    public String toString() {
        return "MaxReward{amount=" + this.b + ", label=" + this.f933a + "}";
    }
}
