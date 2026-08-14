package com.google.android.gms.games;

import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface GamesMetadataClient {
    Task<Game> getCurrentGame();

    Task<AnnotatedData<Game>> loadGame();
}
