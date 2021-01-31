//HEADER
//Program Name: Assignment4_Problem3
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 01/30/2021
//Description: A loop that adds 1 through 10 together 


//PSEUDOCODE
//Program Start
//declare int num and sum
//Initialize num to 10 (the number you want to add up to)
//Initialize sum to 0
//create for loop
//insert the parameters that i=1 and must be less than or equal to num int
//add incrementation to parameters with ++i
//inside for loop assign sum to addition assignment operator
//outside of loop Print "Sum = " plus the sum int
//Program End

package cs161_am_assignment4;

public class Assignment4_Problem3 {
	
	
	public static void main(String args[]) {
		
		int num = 10, sum = 0;
		
		for (int i =1; i<=num; ++i) {
			sum += i;
			
		}
		System.out.println("Sum = " + sum);
	}

}

//FOOTER
//Sum = 55
