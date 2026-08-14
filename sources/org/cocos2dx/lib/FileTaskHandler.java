package org.cocos2dx.lib;

import android.util.Log;
import com.loopj.android.http.FileAsyncHttpResponseHandler;
import cz.msebera.android.httpclient.Header;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
class FileTaskHandler extends FileAsyncHttpResponseHandler {
    private Cocos2dxDownloader _downloader;
    File _finalFile;
    int _id;
    private long _initFileLen;
    private long _lastBytesWritten;

    void LogD(String str) {
        Log.d("Cocos2dxDownloader", str);
    }

    public FileTaskHandler(Cocos2dxDownloader cocos2dxDownloader, int i, File file, File file2) {
        super(file, true);
        this._finalFile = file2;
        this._downloader = cocos2dxDownloader;
        this._id = i;
        this._initFileLen = getTargetFile().length();
        this._lastBytesWritten = 0L;
    }

    @Override // com.loopj.android.http.AsyncHttpResponseHandler
    public void onProgress(long j, long j2) {
        long j3 = j - this._lastBytesWritten;
        long j4 = this._initFileLen;
        this._downloader.onProgress(this._id, j3, j + j4, j2 + j4);
        this._lastBytesWritten = j;
    }

    @Override // com.loopj.android.http.AsyncHttpResponseHandler
    public void onStart() {
        this._downloader.onStart(this._id);
    }

    @Override // com.loopj.android.http.AsyncHttpResponseHandler
    public void onFinish() {
        this._downloader.runNextTaskIfExists();
    }

    @Override // com.loopj.android.http.FileAsyncHttpResponseHandler
    public void onFailure(int i, Header[] headerArr, Throwable th, File file) {
        String string;
        LogD("onFailure(i:" + i + " headers:" + headerArr + " throwable:" + th + " file:" + file);
        if (th == null) {
            string = "";
        } else {
            string = th.toString();
        }
        this._downloader.onFinish(this._id, i, string, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    @Override // com.loopj.android.http.FileAsyncHttpResponseHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSuccess(int r3, cz.msebera.android.httpclient.Header[] r4, java.io.File r5) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onSuccess(i:"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " headers:"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " file:"
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = r0.toString()
            r2.LogD(r3)
            java.io.File r3 = r2._finalFile
            boolean r3 = r3.exists()
            r4 = 0
            if (r3 == 0) goto L64
            java.io.File r3 = r2._finalFile
            boolean r3 = r3.isDirectory()
            if (r3 == 0) goto L47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Dest file is directory:"
            r3.<init>(r5)
            java.io.File r5 = r2._finalFile
            java.lang.String r5 = r5.getAbsolutePath()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            goto L6e
        L47:
            java.io.File r3 = r2._finalFile
            boolean r3 = r3.delete()
            if (r3 != 0) goto L64
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Can't remove old file:"
            r3.<init>(r5)
            java.io.File r5 = r2._finalFile
            java.lang.String r5 = r5.getAbsolutePath()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            goto L6e
        L64:
            java.io.File r3 = r2.getTargetFile()
            java.io.File r5 = r2._finalFile
            r3.renameTo(r5)
            r3 = r4
        L6e:
            org.cocos2dx.lib.Cocos2dxDownloader r5 = r2._downloader
            int r0 = r2._id
            r1 = 0
            r5.onFinish(r0, r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.cocos2dx.lib.FileTaskHandler.onSuccess(int, cz.msebera.android.httpclient.Header[], java.io.File):void");
    }
}
