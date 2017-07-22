package Beginners;

import java.util.Scanner;

public class FirstcharDigOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		if(str.charAt(0)>='0'&&str.charAt(0)<='9'){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		sc.close();
	}

}
