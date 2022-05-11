package com.rectangle;

public class AccessRectangle {
	int length;
    int breadth;

    public AccessRectangle()
    { 
        int length = 0;
        int breadth = 0;

    }

    public AccessRectangle(int lenght)
    {
        this.length = 4 ;
         breadth = 5;

    }
    public AccessRectangle(int length,int breadth)
    {
        this.length = 7;
        this.breadth = 8;
    }
    public void display()
    {
        System.out.println(length*breadth);
    }
}


