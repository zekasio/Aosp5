package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.video.Videos;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzex implements Videos.CaptureAvailableResult {
    private final /* synthetic */ Status zzfc;

    zzex(zzeu zzeuVar, Status status) {
        this.zzfc = status;
    }

    @Override // com.google.android.gms.games.video.Videos.CaptureAvailableResult
    public final boolean isAvailable() {
        return false;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzfc;
    }
}
