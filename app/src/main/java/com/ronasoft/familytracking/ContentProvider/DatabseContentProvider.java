package com.ronasoft.familytracking.ContentProvider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

import com.j256.ormlite.android.apptools.OrmLiteBaseActivity;
import com.ronasoft.familytracking.commons.DatabaseHelper;

public class DatabseContentProvider  extends OrmLiteBaseActivity<DatabaseHelper> {

  /*  @Override
    public boolean onCreate() {
        return false;
    }

    @androidx.annotation.Nullable
    @Override
    public Cursor query(@androidx.annotation.NonNull Uri uri, @androidx.annotation.Nullable String[] strings, @androidx.annotation.Nullable String s, @androidx.annotation.Nullable String[] strings1, @androidx.annotation.Nullable String s1) {
        return null;
    }

    @androidx.annotation.Nullable
    @Override
    public String getType(@androidx.annotation.NonNull Uri uri) {
        return null;
    }

    @androidx.annotation.Nullable
    @Override
    public Uri insert(@androidx.annotation.NonNull Uri uri, @androidx.annotation.Nullable ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(@androidx.annotation.NonNull Uri uri, @androidx.annotation.Nullable String s, @androidx.annotation.Nullable String[] strings) {
        return 0;
    }

    @Override
    public int update(@androidx.annotation.NonNull Uri uri, @androidx.annotation.Nullable ContentValues contentValues, @androidx.annotation.Nullable String s, @androidx.annotation.Nullable String[] strings) {
        return 0;
    }
    */
}
