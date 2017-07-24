package Beginners;

import java.util.Scanner;

public class CountAlphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++){
			if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z')){
				count++;
			}
		}
			System.out.println(count);
			sc.close();
	}

}
