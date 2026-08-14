package com.tapjoy.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.tapjoy.TapjoyAuctionFlags;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public class d<E> extends i0<E> implements l0<E>, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SQLiteDatabase f1777a;
    public final r0<E> b;
    public int c;

    public d(File file, r0<E> r0Var) {
        Cursor cursorRawQuery = null;
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
        this.f1777a = sQLiteDatabaseOpenOrCreateDatabase;
        this.b = r0Var;
        if (sQLiteDatabaseOpenOrCreateDatabase.getVersion() != 1) {
            this.f1777a.beginTransaction();
            try {
                this.f1777a.execSQL("CREATE TABLE IF NOT EXISTS List(value BLOB)");
                this.f1777a.setVersion(1);
                this.f1777a.setTransactionSuccessful();
            } finally {
                this.f1777a.endTransaction();
            }
        }
        try {
            cursorRawQuery = this.f1777a.rawQuery("SELECT COUNT(1) FROM List", null);
            int i = cursorRawQuery.moveToNext() ? cursorRawQuery.getInt(0) : 0;
            a(cursorRawQuery);
            this.c = i;
        } catch (Throwable th) {
            a(cursorRawQuery);
            throw th;
        }
    }

    public static Cursor a(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        cursor.close();
        return null;
    }

    @Override // com.tapjoy.internal.l0
    public void b(int i) throws Throwable {
        int i2;
        if (i < 1 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException();
        }
        if (i == i2) {
            clear();
            return;
        }
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f1777a;
            StringBuilder sb = new StringBuilder("SELECT rowid FROM List ORDER BY rowid LIMIT ");
            sb.append(i - 1);
            sb.append(",1");
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
            try {
                if (!cursorRawQuery.moveToNext()) {
                    throw new IllegalStateException();
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                int iDelete = this.f1777a.delete("List", "rowid <= " + j, null);
                this.c = this.c - iDelete;
                if (iDelete == i) {
                    a(null);
                    return;
                }
                throw new IllegalStateException("Try to delete " + i + ", but deleted " + iDelete);
            } catch (Throwable th) {
                th = th;
                cursor = cursorRawQuery;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        a(cursor);
        throw th;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f1777a.delete("List", TapjoyAuctionFlags.AUCTION_TYPE_FIRST_PRICE, null);
        this.c = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SQLiteDatabase sQLiteDatabase = this.f1777a;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.f1777a = null;
        }
    }

    public void finalize() throws Throwable {
        close();
        super.finalize();
    }

    @Override // com.tapjoy.internal.l0
    public E get(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException();
        }
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.f1777a.rawQuery("SELECT value FROM List ORDER BY rowid LIMIT " + i + ",1", null);
            if (!cursorRawQuery.moveToNext()) {
                throw new NoSuchElementException();
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(cursorRawQuery.getBlob(0));
            try {
                try {
                    return this.b.a(byteArrayInputStream);
                } catch (IOException e) {
                    throw new IllegalStateException(e);
                }
            } finally {
                i6.a(byteArrayInputStream);
            }
        } finally {
            a(cursorRawQuery);
        }
    }

    @Override // java.util.Queue
    public E peek() {
        if (this.c > 0) {
            return get(0);
        }
        return null;
    }

    @Override // java.util.Queue
    public E poll() throws Throwable {
        if (this.c <= 0) {
            return null;
        }
        E ePeek = peek();
        b(1);
        return ePeek;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.c;
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        e.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                this.b.a(byteArrayOutputStream, e);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                i6.a(byteArrayOutputStream);
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", byteArray);
                if (this.f1777a.insert("List", null, contentValues) == -1) {
                    return false;
                }
                this.c++;
                return true;
            } catch (IOException e2) {
                throw new IllegalArgumentException(e2);
            }
        } catch (Throwable th) {
            i6.a(byteArrayOutputStream);
            throw th;
        }
    }
}
