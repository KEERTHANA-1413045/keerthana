package Hunters;

import java.util.Scanner;

public class SumOfDigits102 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=String.valueOf(n).toString();
		int n1=Integer.parseInt(str);
		int sum1=0;
		int[] temp =new int[str.length()];
		for(int i=0;i<temp.length;i++){
			temp[i]=n1%10;
			n1=n1/10;
		}
		for(int i=0;i<temp.length;i++){
			int sum=0;
			for(int j=0;j<=i;j++){
				sum+=temp[i];
			}
			sum1+=sum;
		}
		System.out.println(sum1);
		sc.close();
	}
}
