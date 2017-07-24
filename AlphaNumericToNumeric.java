package Beginners;

import java.util.Scanner;

public class AlphaNumericToNumeric {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String s="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
				s+=str.charAt(i);
			}
		}
		System.out.println(s);
		sc.close();
	}

}
