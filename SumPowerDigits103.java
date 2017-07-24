package Hunters;

import java.util.Scanner;

public class SumPowerDigits103 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=n;
		int pow=0,mul;
		int n1=0;
		while(s%10>0){
			int temp=s%10;
			s=s/10;
			n1++;
		}
		while(n%10!=0){
			int temp=n%10;
			mul=1;
			for(int i=0;i<n1;i++){
				mul*=temp;
			}
			pow+=mul;
			n=n/10;
		}
		System.out.println(pow);
		sc.close();
	}

}
