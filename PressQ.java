package Beginners;

import java.util.Scanner;

public class PressQ {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='q'||ch=='Q'){
			System.exit(ch);
			//System.out.println("exit");
		}
		else{
			System.out.println(ch);
		}
		sc.close();
	}

}
