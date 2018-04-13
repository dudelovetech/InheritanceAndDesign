/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceanddesign;

/**
 * a Point object represents a pair of (x, y) coordinates.
 * Fourth version: encapsulated.
 * 
 * @author donny
 */
public class Point {
    private int x;
    private int y;
    
    // constructs a new Point at the origin, (0, 0)
    public Point(){
        setLocation(0, 0);
    }
    
    // constructs a new point with the given (x, y) location
    public Point(int x, int y){
        setLocation(x, y);
    }
    
    // returns the distance between this point and (0, 0)
    public double distanceFromOrigin(){
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
    
    // returns the x-coordiante of this point
    public int getX(){
        return this.x;
    }
    
    // returns the y-coordinate of this point
    public int getY(){
        return this.y;
    }
    
    // sets this point's (x, y) location to the given values
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    // returns a String representation of this point
    public String toString(){
        return"(" + x + "," + y + ")";
    }
    
    // shifts this point's location by the given amount
    public void translate(int dx, int dy){
        setLocation(x + dx, y + dy);
    }
}
