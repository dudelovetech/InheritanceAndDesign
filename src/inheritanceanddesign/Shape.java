/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceanddesign;

/**
 * A general interface for shape classes.
 * @author donny
 */
public interface Shape {
    public double getArea();
    public double getPerimeter();
    
    public static void main(String[] args){
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(18, 18);
        shapes[1] = new Circle(12);
        shapes[2] = new Triangle(30, 30, 30);
        
        for (Shape shape : shapes) {
            System.out.println("area = " + shape.getArea() + ", perimeter = " + shape.getPerimeter());
        }
    }
}
