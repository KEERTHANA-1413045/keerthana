package Beginners;

import java.util.Scanner;

public class Mul {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=sc.nextInt();
		for(int i=1;i<n;i++){
			System.out.println(i+"*"+num+"="+(i*num));
		}
		sc.close();
	}

}
