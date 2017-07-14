package Players;

import java.util.Scanner;

/* Area of Triangle
   rectangle
   circle*/
public class Area {
	static double circle(int r){
		return (3.14*r*r);
	}
	static double triangle(int l,int b){
		return (0.5*l*b);
	}
	static double rectangle(int l,int b){
		return (l*b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int radius=sc.nextInt();
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		System.out.println(circle(radius));
		System.out.println(triangle(length,breadth));
		System.out.println(rectangle(length,breadth));
		sc.close();
	}

}
