package Beginners;

import java.util.Scanner;

public class Isogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count=0;
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					count++;
				}
			}
		}
		if(count==0){
			System.out.println("Isogram");
		}
		else{
			System.out.println("Not Isogram");
		}
		sc.close();
	}

}
