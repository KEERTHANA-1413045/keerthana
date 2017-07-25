package Beginners;

import java.util.Scanner;

public class CountNumerichar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		String str=sc.next();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
