package com.oksagon.freelifts.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Models a single workout in the training cycle.
 * @author Janne Oksanen <janne.oksanen@gmail.com>
 * @since 2019-02-15
 */
public class Workout {

    /**
     * The sequence number of the {@link Workout} in the current {@link Program} cycle
     */
    final int mSequenceNumber;

    /**
     * Sets to be performed in this workout
     */
    List<Set> mSets;

    /**
     * Constructor
     * @param sequenceNumber Sequence number within the training cycle
     * @param sets {@link Set}s to be performed
     */
    public Workout(final int sequenceNumber, final List<Set> sets) {
        this.mSequenceNumber = sequenceNumber;
        this.mSets = sets;
    }

    /**
     * Get a list of the sets
     * @return List of sets or empty list
     */
    public List<Set> getSets(){
        if ( mSets == null ){
            mSets = new ArrayList<>();
        }
        return mSets;
    }

    /**
     * Add a new set to the {@link Workout}
     * @param set new set
     * @param position where does it go in the workout
     */
    public void addSet( final Set set, final int position ){
        mSets.add(position, set);
    }

    /**
     * Remove set from the workout
     * @param position
     */
    public void removeSet( final int position ) {
        mSets.remove(position);
    }
}
