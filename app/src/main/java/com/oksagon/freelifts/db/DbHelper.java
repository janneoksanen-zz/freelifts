package com.oksagon.freelifts.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "FreeLifts.db";

    private static final String SQL_CREATE_WORKOUTS =
            "CREATE TABLE " + DbContract.Workouts.TABLE_NAME + " (" +
                    DbContract.Workouts._ID + " INTEGER PRIMARY KEY," +
                    DbContract.Workouts.COLUMN_NAME_PROGRAM_NAME + " TEXT," +
                    DbContract.Workouts.COLUMN_NAME_WORKOUT_SEQUENCE_NUMBER + " INTEGER," +
                    DbContract.Workouts.COLUMN_NAME_START_TIME + " INTEGER," +
                    DbContract.Workouts.COLUMN_NAME_END_TIME + " INTEGER," +
                    DbContract.Workouts.COLUMN_NAME_NOTE + " TEXT," +
                    DbContract.Workouts.COLUMN_NAME_RATING + " INTEGER)";

    private static final String SQL_CREATE_SETS =
            "CREATE TABLE " + DbContract.Sets.TABLE_NAME + " (" +
                    DbContract.Sets._ID + " INTEGER PRIMARY KEY," +
                    DbContract.Sets.COLUMN_NAME_WORKOUT_ID + " INTEGER," +
                    DbContract.Sets.COLUMN_NAME_LIFT + " TEXT," +
                    DbContract.Sets.COLUMN_NAME_MASS + " REAL," +
                    DbContract.Sets.COLUMN_NAME_PLANNED_REPS + " INTEGER," +
                    DbContract.Sets.COLUMN_NAME_DONE_REPS + " INTEGER," +
                    DbContract.Sets.COLUMN_NAME_TIME + " INTEGER," +
                    DbContract.Sets.COLUMN_NAME_NOTE + " TEXT," +
                    DbContract.Workouts.COLUMN_NAME_RATING + " INTEGER)";


    public DbHelper( final Context appContext) {
        super(appContext, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_WORKOUTS);
        db.execSQL(SQL_CREATE_SETS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // No need to implement in v1
    }
}
