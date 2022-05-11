/*Create a class to print the area of a square and a rectangle. The class has two functions with the 
same name but different number of parameters. The function for printing the area of rectangle has two 
parameters which are its length and breadth respectively while the other function for printing the area 
of square has one parameter which is the side of the square.*/

package com.area;

public class Square {
	void Area(double side)
    {
        System.out.println("Area of the Square: "+ side * side);
    }
    
    void Area(float side)
    {
        System.out.println("Area of the Square: "+ side * side);
    }

}
