package Beginners;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int num1;
		int n,num=0;
		n=s;
		while(n>0){
			num1=n%10;
			n=n/10;
			num=num+(num1*num1*num1);
		}
		if(num==s){
			System.out.println("Armstrong no.");
		}
		else{
			System.out.println("Not Armstrong no.");
		}
		sc.close();
	}

}
