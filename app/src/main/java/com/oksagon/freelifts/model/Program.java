package com.oksagon.freelifts.model;

/**
 * Models the progression logic of the training program.
 * @author Janne Oksanen <janne.oksanen@gmail.com>
 * @since 2019-02-15
 */
public interface Program {

    /**
     * Returns the next {@link Workout} to be performed with correct repetitions and weights
     * @return next workout
     */
    public Workout nextWorkout();

    /**
     * Name of the program
     * @return name of the program
     */
    public String getName();

}
