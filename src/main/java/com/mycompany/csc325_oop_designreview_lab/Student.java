/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 * The {@code Student} class represents a student and extends the {@code Human} class.
 * It includes additional properties specific to students, such as GPA.
 * This class provides methods to get and set the student's GPA and address.
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {

    private int GPA;

    /**
     * Constructs a new {@code Student} object with the specified name and age.
     *
     * @param name the name of the student
     * @param age  the age of the student
     */
    public Student(String name, short age) {
        super(name, age);
    }

    /**
     * Gets the address of the student.
     *
     * @return the address of the student
     */
    @Override
    public String getAddress() {
        return super.address;
    }

    /**
     * Sets the address of the student.
     *
     * @param address the new address of the student
     */
    @Override
    public void setAddress(String address) {
        super.address = address;
    }

    /**
     * Gets the GPA of the student.
     *
     * @return the GPA of the student
     */
    public int getGPA() {
        return GPA;
    }

    /**
     * Sets the GPA of the student.
     *
     * @param GPA the new GPA value for the student
     */
    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    /**
     * Returns a string representation of the {@code Student} object,
     * including GPA, address, and superclass details.
     *
     * @return a string representation of the student
     */
    @Override
    public String toString() {
        return "GPA=" + GPA + " || address='" + address + "' || " + super.toString();
    }
}
