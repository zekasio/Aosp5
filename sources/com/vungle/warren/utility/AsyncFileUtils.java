package com.vungle.warren.utility;

import android.os.AsyncTask;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class AsyncFileUtils {
    private static volatile Executor taskExecutor = new SDKExecutors().getTaskExecutor();

    public interface FileExistCallback {
        void status(boolean z);
    }

    public static void setTaskExecutor(Executor executor) {
        taskExecutor = executor;
    }

    public static ExistenceOperation isFileExistAsync(File file, FileExistCallback fileExistCallback) {
        FileExistenceTask fileExistenceTask = new FileExistenceTask(file, fileExistCallback);
        ExistenceOperation existenceOperation = new ExistenceOperation(fileExistenceTask);
        fileExistenceTask.executeOnExecutor(taskExecutor, new Void[0]);
        return existenceOperation;
    }

    private static class FileExistenceTask extends AsyncTask<Void, Void, Boolean> {
        private FileExistCallback callback;
        private final File file;

        public FileExistenceTask(File file, FileExistCallback fileExistCallback) {
            this.file = file;
            this.callback = fileExistCallback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Boolean doInBackground(Void... voidArr) {
            File file = this.file;
            return Boolean.valueOf(file != null && file.exists());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            synchronized (this) {
                FileExistCallback fileExistCallback = this.callback;
                if (fileExistCallback != null) {
                    fileExistCallback.status(bool.booleanValue());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void clear() {
            this.callback = null;
        }
    }

    public static class ExistenceOperation {
        private final FileExistenceTask task;

        ExistenceOperation(FileExistenceTask fileExistenceTask) {
            this.task = fileExistenceTask;
        }

        public void cancel() {
            this.task.clear();
            this.task.cancel(true);
        }
    }
}
