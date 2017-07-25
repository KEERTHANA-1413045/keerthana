package Beginners;

import java.util.Scanner;

public class CountSpclChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		String str=sc.next();
		for(int i=0;i<str.length();i++){
			if((str.charAt(i)>=0&&str.charAt(i)<=47)||(str.charAt(i)>=58&&str.charAt(i)<=64)||(str.charAt(i)>=91&&str.charAt(i)<=96)||(str.charAt(i)>=123&&str.charAt(i)<=127)){
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
