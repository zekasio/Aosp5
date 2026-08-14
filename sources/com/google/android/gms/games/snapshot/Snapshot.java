package com.google.android.gms.games.snapshot;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface Snapshot extends Parcelable, Freezable<Snapshot> {
    SnapshotMetadata getMetadata();

    SnapshotContents getSnapshotContents();
}
