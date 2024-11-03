package com.mycompany.csc325_oop_designreview_lab;

/**
 * The {@code Freshman} class represents a freshman student.
 * It extends the {@code Student} class and adds a specific property for credits.
 */
public class Freshman extends Student {
    private int credits;

    /**
     * Constructs a new {@code Freshman} object with the specified name, age, and credits.
     *
     * @param name    the name of the freshman student
     * @param age     the age of the freshman student
     * @param credits the number of credits the freshman student has earned
     */
    public Freshman(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    /**
     * Gets the number of credits the freshman student has.
     *
     * @return the credits of the freshman student
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Sets the number of credits for the freshman student.
     *
     * @param credits the new credit value for the freshman student
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    /**
     * Returns a string representation of the {@code Freshman} object,
     * including superclass details and the number of credits.
     *
     * @return a string representation of the freshman student
     */
    @Override
    public String toString() {
        return "Freshman Student: " + super.toString() + " || credits = " + credits;
    }
}
