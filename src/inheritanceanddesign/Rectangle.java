/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceanddesign;

/**
 * Represents rectangle shapes.
 * @author donny
 */
public class Rectangle implements Shape{
    private double width;
    private double height;
    
    // constructs a new rectangle with the given dimensions
    public Rectangle(double width, double height){
        setSize(width, height);
        
    }
    
    private void setSize(double width, double height){
        if (width <= 0) throw new IllegalArgumentException("width cann only be positive number");
        if (height <= 0) throw new IllegalArgumentException("height cann only be positive number");
        this.width = width;
        this.height = height;
    }
    
    // returns the area of this rectangle
    public double getArea(){
        return width * height;   
    }
    
    public double getPerimeter(){
        return 2.0 * (width + height);
    }
}
