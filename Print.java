/*Create a class to print an integer and a character using two functions having the 
same name but different sequence of the integer and the character parameters.
For example, if the parameters of the first function are of the form (int n, char c), 
then that of the second function will be of the form (char c, int n).*/
package com.Datatype;

public class Print {

	public static void main(String[] args) {
		  Print obj = new Print();

	        obj.Printn(10, 'A');

	        obj.Printn('B', 5);
	}
	    

	    void Printn(int a , char c)
	    {  

	        System.out.println("Integer is: "+a+ "\t Char is: "+c);

	    }    

	     void Printn(char c,int a )
	     {

	        System.out.println("Char is: "+c+ "\tInteger is: "+a );

	    }   

}




