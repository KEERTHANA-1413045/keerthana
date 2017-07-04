package flowControl;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int rem,rev=0;
		while(number!=0)
		{
			rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		System.out.println(rev);
		sc.close();
	}

}
