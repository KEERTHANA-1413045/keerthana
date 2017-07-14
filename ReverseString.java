package Hunters;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s ="";
		String[] str1=str.split(" ");
		for(int i=str1.length-1;i>=0;i--){
			s=s+" "+str1[i];
		}
		System.out.println(s);
		sc.close();
	}

}
