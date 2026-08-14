package com.vungle.warren.log;

import android.text.TextUtils;
import android.util.Log;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.persistence.FilePreferences;
import com.vungle.warren.utility.FileUtility;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
class LogSender {
    private static final String HEADER_LOG_BATCH_ID = "batch_id";
    private static final String HEADER_LOG_DEVICE_ID = "device_guid";
    private static final String HEADER_LOG_PAYLOAD = "payload";
    private static final String PREFS_BATCH_ID_KEY = "batch_id";
    private static final String PREFS_DEVICE_ID_KEY = "device_id";
    private static final String TAG = "LogSender";
    private final FilePreferences prefs;
    private final VungleApiClient vungleApiClient;
    private final String deviceId = getDeviceId();
    private int batchId = getBatchId();

    LogSender(VungleApiClient vungleApiClient, FilePreferences filePreferences) {
        this.vungleApiClient = vungleApiClient;
        this.prefs = filePreferences;
    }

    void sendLogs(File[] fileArr) {
        JsonArray payload;
        for (File file : fileArr) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("batch_id", Integer.valueOf(this.batchId));
            jsonObject.addProperty(HEADER_LOG_DEVICE_ID, this.deviceId);
            try {
                payload = getPayload(file);
            } catch (IOException unused) {
                Log.e(TAG, "Failed to generate request payload.");
            }
            if (payload == null) {
                FileUtility.delete(file);
            } else {
                jsonObject.add(HEADER_LOG_PAYLOAD, payload);
                if (this.vungleApiClient.sendLog(jsonObject).execute().isSuccessful()) {
                    FileUtility.delete(file);
                }
                if (this.batchId >= Integer.MAX_VALUE) {
                    this.batchId = -1;
                }
                this.batchId++;
            }
        }
        saveBatchId();
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0035: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:17:0x0035 */
    private JsonArray getPayload(File file) throws Throwable {
        BufferedReader bufferedReader;
        Closeable closeable;
        JsonArray jsonArray = new JsonArray();
        Closeable closeable2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            jsonArray.add(JsonParser.parseString(line).getAsJsonObject());
                        } else {
                            FileUtility.closeQuietly(bufferedReader);
                            return jsonArray;
                        }
                    } catch (Exception unused) {
                        Log.e(TAG, "Invalidate log document file.");
                        FileUtility.closeQuietly(bufferedReader);
                        return null;
                    }
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                FileUtility.closeQuietly(closeable2);
                throw th;
            }
        } catch (Exception unused2) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            FileUtility.closeQuietly(closeable2);
            throw th;
        }
    }

    private String getDeviceId() {
        String string = this.prefs.getString(PREFS_DEVICE_ID_KEY, "");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.prefs.put(PREFS_DEVICE_ID_KEY, string2);
        this.prefs.apply();
        return string2;
    }

    private int getBatchId() {
        return this.prefs.getInt("batch_id", 0);
    }

    private void saveBatchId() {
        this.prefs.put("batch_id", this.batchId);
        this.prefs.apply();
    }
}
