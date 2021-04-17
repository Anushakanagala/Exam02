/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Scanner;

/**
 *
 * @author Anusha Kanagala
 */
public class ques6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner
		Scanner sc = new Scanner(System.in);

		
                // Prompt the user to enter three sides of a triangle a color 
		// and a Boolean value to indicate whether the triangle is filled
		System.out.print("Enter three sides of the triangle: ");
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();

		System.out.print("Enter a color: ");
		String color = sc.next();

		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = sc.nextBoolean();

		// Create a Triangle
		Triangle triangle = new Triangle(side1, side2, side3, color, filled);

		
                 
                 System.out.println("The perimeter of Triangle is: " +triangle.perimeter());
                 
                 System.out.println("The area of Triangle is: " +Math.round(triangle.area() * 100.00) / 100.00);
                 
                 System.out.println("The Traingle is of color " + triangle.getColor());
                 
                 System.out.println("The Triangle is Filled: " +triangle.filled());
    }
    
}
