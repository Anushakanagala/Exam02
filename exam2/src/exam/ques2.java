/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Scanner;

/**
 *
 * @author S542268
 */
public class ques2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        for (int i = 0; i < m1.length; i++)
            for (int j = 0; j < m1[i].length; j++)
                m1[i][j] = input.nextInt();
        
        
        System.out.print("Enter list2: ");
        for (int i = 0; i < m2.length; i++)
            for (int j = 0; j < m2[i].length; j++)
                m2[i][j] = input.nextInt();

        if (equals(m1, m2)) {
            System.out.println("The two arrays are strictly identical.");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }

	/** equals returns true if m1 and m2 are strictly identical */
	public static boolean equals(int[][] m1, int[][] m2) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (m1[i][j] != m2[i][j])
					return false;
			}
		}
		return true;
	}

	
    }
    
