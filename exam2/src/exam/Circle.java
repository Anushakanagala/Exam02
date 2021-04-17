/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author Anusha Kanagala
 */
public class Circle {
        private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    
    @Override
    public String toString() {
        return "Circle radius = " + radius ;
    }
}
