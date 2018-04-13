/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceanddesign;

/**
 * A Point3D object represents an (x, y, z) location.
 * This is not a good design to follow.
 * 
 * @author donny
 */
public class Point3D extends Point{
   private int z;
   
   // constructs a new 3D point with the given coordinates
   public Point3D(int x, int y, int z){
       super(x, y);
       this.z = z;
   }
   
   // returns the z-coordinates of this Point3D
   public int getZ(){
       return z;
   }
   
   // returns whether o refers to a Point with the same
   // (x, y) coordiantes as this Point
   public boolean equals(Object o){
       if(o instanceof Point3D){
           Point3D other = (Point3D) o;
           return this.getX() == other.getX() && this.getY() == other.getY();
       }else{
           return false;
       }
   }
   
   
}
