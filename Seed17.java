package Pro;

import java.util.Scanner;

public class Seed17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int n=s;
		int mul=1;
		int temp;
		while(n%10>0){
			temp=n%10;
			n=n/10;
			mul=mul*temp;
		}
		mul=mul*s;
		System.out.println(mul);
		sc.close();
	}

}
