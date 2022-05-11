package com.area;

public class Circle {
	 static final double PI = Math.PI;
	  
	    
	    void Area(double r)
	    {
	        double A = PI * r * r;
	  
	        System.out.println("The area of the circle is :" + A);
	    }
	  
	   
	    void Area(float r)
	    {
	        double A = PI * r * r;
	  
	        System.out.println("The area of the circle is :" + A);
	    }

}
