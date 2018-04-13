/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceanddesign;

/**
 * Represents triangular shapes
 *
 * @author donny
 */
public class Triangle implements Shape {

    private double a; // side a
    private double b; // side b
    private double c; // side c

    // constructs a new triangle with the given side lengths
    public Triangle(double a, double b, double c) {
        setTriangle(a, b, c);
    }

    private void setTriangle(double a, double b, double c) {
        if (a <= 0) {
            throw new IllegalArgumentException("the lenght of the side must be a positive number");
        }
        if (b <= 0) {
            throw new IllegalArgumentException("the lenght of the side must be a positive number");
        }
        if (c <= 0) {
            throw new IllegalArgumentException("the lenght of the side must be a positive number");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    // returns this triangle's area using Heron's formula
    public double getArea(){
        double s = (a + b + c)/2;
        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
    
    // returns the perimeter of the triangle
    public double getPerimeter(){
        return a + b + c;
    }
}
