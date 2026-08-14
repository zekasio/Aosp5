package com.facebook.ads.redexgen.X;

import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public interface B6 {
    void onAudioSessionId(B5 b5, int i);

    void onAudioUnderrun(B5 b5, int i, long j, long j2);

    void onDecoderDisabled(B5 b5, int i, C0402Bw c0402Bw);

    void onDecoderEnabled(B5 b5, int i, C0402Bw c0402Bw);

    void onDecoderInitialized(B5 b5, int i, String str, long j);

    void onDecoderInputFormatChanged(B5 b5, int i, Format format);

    void onDownstreamFormatChanged(B5 b5, C0479Fn c0479Fn);

    void onDrmKeysLoaded(B5 b5);

    void onDrmKeysRemoved(B5 b5);

    void onDrmKeysRestored(B5 b5);

    void onDrmSessionManagerError(B5 b5, Exception exc);

    void onDroppedVideoFrames(B5 b5, int i, long j);

    void onLoadError(B5 b5, C0478Fm c0478Fm, C0479Fn c0479Fn, IOException iOException, boolean z);

    void onLoadingChanged(B5 b5, boolean z);

    void onMediaPeriodCreated(B5 b5);

    void onMediaPeriodReleased(B5 b5);

    void onMetadata(B5 b5, Metadata metadata);

    void onPlaybackParametersChanged(B5 b5, C0362Ah c0362Ah);

    void onPlayerError(B5 b5, AM am);

    void onPlayerStateChanged(B5 b5, boolean z, int i);

    void onPositionDiscontinuity(B5 b5, int i);

    void onReadingStarted(B5 b5);

    void onRenderedFirstFrame(B5 b5, Surface surface);

    void onSeekProcessed(B5 b5);

    void onSeekStarted(B5 b5);

    void onTimelineChanged(B5 b5, int i);

    void onTracksChanged(B5 b5, TrackGroupArray trackGroupArray, HR hr);

    void onVideoSizeChanged(B5 b5, int i, int i2, int i3, float f);
}
