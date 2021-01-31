//HEADER
//Program Name: Assignment4_Problem2
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 01/30/2021
//Description: A loops that prints values 1-10 while skipping four and seven


//PSEUDOCODE
//Program Start
//create integer "number"
//assign number to value 1
//create for loop
//create if statement
//assign if statement value 4 
//insert continue statement
//create second if statement 
//assign if statement value 7
//insert continue statement
//create print value
//Program End

package cs161_am_assignment4;

public class Assignment4_Problem2 {
	
	public static void main(String args[]) {
		
	int number;
	number=1;
	
	
	for(number=1;number<=10;number++) {
		if(number==4) {
			continue;
		
		}
		if(number==7) {
			continue;
		}
		
		System.out.println(number);
	
	}
	
	
}
}
//FOOTER
//1
//2
//3
//5
//6
//8
//9
//10

