/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle_caculate;

/**
 *
 * @author Karta Yu
 */
public class Sphere {
	private double radius;
        //private double in_r;
	public final double PI = 3.14;

	public void setRadius(double a) {
		this.radius = a;
	}
       
	public double getRadius() {
		return radius;
	}
        
        public double getValue(){
            double a = radius * PI * 2;
             return a;
        }
	
	public double getArea() {
		return radius * radius * PI;
	}
	  
	public double getVolume() {
		return (radius * radius * radius * PI * 4) / 3;
	}   
}
