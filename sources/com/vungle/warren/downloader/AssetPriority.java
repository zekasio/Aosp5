package com.vungle.warren.downloader;

/* JADX INFO: loaded from: classes3.dex */
public class AssetPriority implements Comparable {
    private final Integer firstPriority;
    private final Integer secondPriority;

    public AssetPriority(int i, int i2) {
        this.firstPriority = Integer.valueOf(i);
        this.secondPriority = Integer.valueOf(i2);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof AssetPriority)) {
            return -1;
        }
        AssetPriority assetPriority = (AssetPriority) obj;
        int iCompareTo = this.firstPriority.compareTo(assetPriority.firstPriority);
        return iCompareTo == 0 ? this.secondPriority.compareTo(assetPriority.secondPriority) : iCompareTo;
    }

    public String toString() {
        return "AssetPriority{firstPriority=" + this.firstPriority + ", secondPriority=" + this.secondPriority + '}';
    }
}
