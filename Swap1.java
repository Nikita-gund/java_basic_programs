//3. swap two integers without using third variable.
package nik.program.april28;

public class Swap1 {
public static void main(String[]args) {
	int a= 10;
	int b= 25;
	
	a=a+b;//35
	b=a-b;//10
	a=a-b;
	System.out.println("a= "+a+" b= "+b);
}
}
