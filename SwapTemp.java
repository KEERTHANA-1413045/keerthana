package Beginners;

import java.util.Scanner;

public class SwapTemp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+","+b);
		sc.close();
	}

}
