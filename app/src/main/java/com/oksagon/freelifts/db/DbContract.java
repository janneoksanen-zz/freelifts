package com.oksagon.freelifts.db;

import android.provider.BaseColumns;

public final class DbContract {

    private DbContract() {}; // We don't want anybody actually using this

    public static class Workouts implements BaseColumns {
        public static final String TABLE_NAME = "workouts";

        public static final String COLUMN_NAME_PROGRAM_NAME = "program_name";
        public static final String COLUMN_NAME_WORKOUT_SEQUENCE_NUMBER = "workout_seq_num";
        public static final String COLUMN_NAME_START_TIME = "start_time";
        public static final String COLUMN_NAME_END_TIME = "end_time";
        public static final String COLUMN_NAME_NOTE = "workout_note";
        public static final String COLUMN_NAME_RATING = "workout_rating";
    }

    public static class Sets implements BaseColumns {
        public static final String TABLE_NAME = "sets";

        public static final String COLUMN_NAME_WORKOUT_ID = "workout_id";

        public static final String COLUMN_NAME_LIFT = "lift";
        public static final String COLUMN_NAME_MASS = "mass";
        public static final String COLUMN_NAME_PLANNED_REPS = "planned_reps";
        public static final String COLUMN_NAME_DONE_REPS = "done_reps";
        public static final String COLUMN_NAME_TIME = "time";
        public static final String COLUMN_NAME_NOTE = "set_note";
        public static final String COLUMN_NAME_RATING = "set_rating";

    }

}
