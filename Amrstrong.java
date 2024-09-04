package IT;

import java.util.Scanner;

public class Amrstrong {
	public static void main(String args []) {
		Scanner scr=new Scanner(System.in);
		int n=scr.nextInt();
		
		int count =0;
		while(n>0) {
			n=n/10;
			count++;
			
		}
		int Sum=n;
		while(n>0) {
			int rem=n%10;
			Sum= Sum +rem^count;
			//Sum=(int) (Sum + Math.pow(rem,count));
			n= n/10;
		}
		if (Sum ==n) {
			System.out.println("its armstrong");
		}else {
			System.out.println("its not armstrong");
		}
		
	}
	
}
