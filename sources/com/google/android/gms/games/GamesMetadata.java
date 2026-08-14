package com.google.android.gms.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface GamesMetadata {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    @Deprecated
    public interface LoadGamesResult extends Releasable, Result {
        GameBuffer getGames();
    }

    Game getCurrentGame(GoogleApiClient googleApiClient);

    PendingResult<LoadGamesResult> loadGame(GoogleApiClient googleApiClient);
}
