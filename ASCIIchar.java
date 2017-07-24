package Beginners;

public class ASCIIchar {

	public static void main(String[] args) {
		for(int i=1;i<=255;i++){
			Character c=new Character((char)i);
			System.out.println(i+" "+c);
		}
	}

}
