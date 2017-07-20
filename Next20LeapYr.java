package Players;

import java.util.Scanner;

public class Next20LeapYr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<20;i++){
			if(n%4==0){
				n=n+4;
				System.out.println(n);
			}
			else{
				while(n%4!=0)
					n+=1;
				System.out.println(n);
			}
		}
		sc.close();
	}

}
