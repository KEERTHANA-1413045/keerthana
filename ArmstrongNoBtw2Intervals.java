package Beginners;

import java.util.Scanner;

public class ArmstrongNoBtw2Intervals {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int s1=sc.nextInt();
		int num1;
		int n,num=0;
		for(int i=s;i<=s1;i++){
			n=i;
		while(n>0){
			num1=n%10;
			n=n/10;
			num=num+(num1*num1*num1);
		}
		if(num==i){
			System.out.print(i+" ");
		}
		num=0;
		}
		sc.close();
	}

}
