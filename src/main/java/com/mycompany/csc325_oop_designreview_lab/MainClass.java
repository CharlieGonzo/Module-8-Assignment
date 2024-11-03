/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of the Student class
	 //create a normal student class
	 Student std1= new Student("James", (short) 20);

                // Todo 7: Create two classes for Freshman and Senior
	 //create Freshman and Senior instances
	 Freshman std2= new Freshman("Jim", (short)20, 12); // name, age, credits

	 Senior std3 = new Senior("John", (short)30, 90);
	 // ToDo 8: The senior class should have a minimum of 85 credits

		// ToDo 9: Add a toString method for the Student class
		// ToDo 10: Add a toString method for the Freshman class


		// ToDo 12: Set the gpa of the student using the scanner and user
		// 			input and then print the output.
	 //set GPA for students
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter gpa for James");
	 int firstGPA = in.nextByte();
	 std1.setGPA(firstGPA);
	 System.out.println("Enter gpa for Jim");
	 int secondGPA = in.nextByte();
	 std2.setGPA(secondGPA);
	 System.out.println("Enter gpa for John");
	 int thirdGPA = in.nextByte();
	 std3.setGPA(thirdGPA);

	 //output student info
		System.out.println(std1);

		System.out.println(std2);

	 	System.out.println(std3);

		// ToDo 13: add comments and explain your code

	}

}

