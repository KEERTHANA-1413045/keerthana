package Hunters;

import java.util.Scanner;

public class WorkingDay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String[] str={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		String str1=sc.next();
		if(str1.equals("sunday")){
			System.out.println("false");
		}
			else
			{
				System.out.println("true");
			}
		sc.close();
	}

}
