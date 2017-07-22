package Beginners;

import java.util.Scanner;

public class CmpWithoutUsingcmp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1=sc.next();
		if(str.equals(str1)){
			System.out.println("equal");
		}
		else{
			System.out.println("Not equal");
		}
		sc.close();
	}

}
