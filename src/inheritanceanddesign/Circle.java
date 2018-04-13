/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceanddesign;

/**
 * Represents circular shape
 * @author donny
 */
public class Circle implements Shape{
    private double radius;
    
    // constructs a new rectangle with the given dimensions
    public Circle(double radius){
        setSize(radius);
        
    }
    
    private void setSize(double radius){
        if (radius <= 0) throw new IllegalArgumentException("radius can only be positive number");
        this.radius = radius;
    }
    
    // returns the area of this rectangle
    public double getArea(){
        return Math.PI * radius * radius;   
    }
    
    public double getPerimeter(){
        return 2.0 * Math.PI * radius;
    }
}