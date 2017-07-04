package flowControl;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n/2;){
			if(n%i==0){
				System.out.println(n+" is not Prime");
				break;
			}
				System.out.println(n+" is Prime");
				break;
		}
			sc.close();
	}

}
