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
public class Triangle extends GeometricObject {
   private double side1;
    private double side2;
    private double side3;
    private String color;
    private boolean Filled;

    public Triangle(double side1, double side2, double side3, String color, boolean Filled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
        this.Filled = Filled;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    
    
      public String getColor() {
        return color;
    }

    public boolean filled() {
        return Filled;
    }

   

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }   
    
     @Override
    public double area() {
        double a = perimeter();
        
        return Math.sqrt(a * (a - side1) * (a - side2) * (a - side3));
    }
}
