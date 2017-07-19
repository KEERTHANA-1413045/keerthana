package Beginners;

import java.util.Scanner;

public class PowOfDig {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int n=s;
		int sum=0,temp,count=0;
		while(n%10!=0){
			temp=n%10;
			n=n/10;
			count++;
		}
		//System.out.println(count);
		for(int i=0;i<count;i++){
			int mul=1;
			for(int j=0;j<count;j++){
			temp=s%10;
			mul*=temp;
			//System.out.println(mul);
		}
			s=s/10;
			sum+=mul;
		}
		System.out.println(sum);
	}

}
