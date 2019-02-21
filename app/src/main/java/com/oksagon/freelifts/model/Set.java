package com.oksagon.freelifts.model;

import com.oksagon.freelifts.misc.Constants;

/**
 * Models a set of lifts.
 * @author Janne Oksanen <janne.oksanen@gmail.com>
 * @since 2019-02-15
 */
public class Set {

    /**
     * Type of lift e.g. squat or bench press
     */
    private final Constants.LiftType mLift;

    /**
     * How much iron on the bar
     */
    private final float mMass;

    /**
     * How many repetitions were planned
     */
    private final int mRepsPlanned;

    /**
     * How many repetitions were actually performed
     */
    private int mRepsDone;

    /**
     * Optional text note
     */
    private String mNote;

    /**
     * Constructor for creating {@link Set} to be performed in the future.
     * @param lift which lift type
     * @param mass how much iron on the bar
     * @param repsPlanned how many repetitions
     */
    public Set(final Constants.LiftType lift, final float mass, final int repsPlanned) {
        mLift = lift;
        mMass = mass;
        mRepsPlanned = repsPlanned;
    }

    /**
     * Constructor for populating {@link Set} from the database
     * @param lift which lift type
     * @param mass how much iron on the bar
     * @param repsPlanned how many repetitions
     */
    public Set(final Constants.LiftType lift, final float mass, final int repsPlanned, final int repsDone, final String note) {
        mLift = lift;
        mMass = mass;
        mRepsPlanned = repsPlanned;
        mRepsDone = repsDone;
        mNote = note;
    }

    /**
     * Which kind of lift
     * @return lift type
     */
    public Constants.LiftType getLift() {
        return mLift;
    }

    /**
     * How much iron on the bar
     * @return total mass of iron moved
     */
    public float getMass() {
        return mMass;
    }

    /**
     * How many repetitions were planned
     * @return number of repetitions planned
     */
    public int getRepsPlanned() {
        return mRepsPlanned;
    }

    /**
     * How many reps were done
     * @return
     */
    public int getRepsDone() {
        return mRepsDone;
    }

    /**
     * Set the number of reps performed
     * @param repsDone
     */
    public void setRepsDone(int repsDone) {
        this.mRepsDone = repsDone;
    }

    /**
     * Optional note about the {@link Set}
     * @return
     */
    public String getNote() {
        if ( mNote == null ){
            mNote = "";
        }
        return mNote;
    }

    /**
     * Add optional note to the {@link Set}
     * @param note
     */
    public void setNote(String note) {
        this.mNote = note;
    }

}
