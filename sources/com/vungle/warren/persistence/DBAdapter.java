package com.vungle.warren.persistence;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes3.dex */
public interface DBAdapter<T> {
    T fromContentValues(ContentValues contentValues);

    String tableName();

    ContentValues toContentValues(T t);
}
