//HEADER
//Program Name: Assignment4_Problem1
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 01/30/2021
//Description: Loops that print out 1-10 individually


//PSUEDOCODE
//Program Start
//Print "For Loop:" for clarity
//create int number
//assign number value 1
//create for loop
//insert parameters that keep values between one and ten
//for numbers 1 through 10 add one with ++ increment
//tell loop to print out value as long as parameters are met
//Print "While Loop" for clarity
//create int i 
//assign i value 1
//create while loop
//insert i<=10 parameter
//inside loop tell function to print out i 
//inside loop tell function to increment i with ++ function
//print "Do While Loop:" For clarity
//create int c
//Initialize int c with value 1
//create do while loop
//assign do to print out c and increment it 
//assign while to c<=10 parameter
//Program End

package cs161_am_assignment4;

public class Assignment4_Problem1 {
	
	

	public static void main(String args[]) {
		
		System.out.println("For Loop:  ");
		
		int number;
		number = 1;
		
		for (number=1;number<=10;number++)
		{
			System.out.println(number);
		}
		
		
		System.out.println("While loop:");
		
		
		int i;
		i = 1;
		
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		
		System.out.println("Do While Loop:");
		
		
		int c;
		c = 1;
		do {
			System.out.println(c);
			c++;
		}while (c<=10); 
		
	
}
	
}

//FOOTER
//For Loop:  
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//While loop:
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//Do While Loop:
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
