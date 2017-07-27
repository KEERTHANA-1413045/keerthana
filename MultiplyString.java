package Hunters;

import java.util.Scanner;

public class MultiplyString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		int n=Integer.parseInt(str);
		int n1=Integer.parseInt(str1);
		int mul=n*n1;
		String m=String.valueOf(mul).toString();
		System.out.println(m);
		sc.close();
	}

}
