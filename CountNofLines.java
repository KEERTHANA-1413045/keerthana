package Beginners;

import java.util.Scanner;

public class CountNofLines {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		String[] str1=str.split("/n");
		for(int i=0;i<str1.length;i++){
			count++;
		}
		System.out.println(count);
		sc.close();
	}

}
