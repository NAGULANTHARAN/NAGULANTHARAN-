package IT;

import java.util.Scanner;  

public class LeapYear {
 
	public static void main(String argvs[])  {  
	LeapYear obj = new LeapYear();    
	Scanner srn = new Scanner(System.in);  
	System.out.println("Enter Year "); 
	int y=0;
	int year = srn.nextInt(); 
	
	if(((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))  {  
		
	    System.out.println("The year " + year + " is a leap year.");  
	}  
	else  {  
	    System.out.println("The year " + year + " is not a leap year.");  
	}  
	  
	System.out.println();  
  
	}
}
