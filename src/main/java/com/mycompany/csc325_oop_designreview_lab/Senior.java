package com.mycompany.csc325_oop_designreview_lab;

/**
 * The {@code Senior} class represents a senior student, extending the {@code Student} class.
 * It includes an additional property for the number of credits, as seniors have specific credit requirements.
 */
public class Senior extends Student {

    private int credits;

    /**
     * Constructs a new {@code Senior} object with the specified name, age, and credits.
     *
     * @param name    the name of the senior student
     * @param age     the age of the senior student
     * @param credits the number of credits the senior student has earned
     */
    public Senior(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    /**
     * Returns a string representation of the {@code Senior} object,
     * including superclass details and the number of credits.
     *
     * @return a string representation of the senior student
     */
    @Override
    public String toString() {
        return "Senior Student: " + super.toString() + " || credits = " + credits;
    }

    /**
     * Gets the number of credits the senior student has.
     *
     * @return the credits of the senior student
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Sets the number of credits for the senior student.
     *
     * @param credits the new credit value for the senior student
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }
}
