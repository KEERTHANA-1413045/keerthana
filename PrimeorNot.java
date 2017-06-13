import java.io.*;
import java.util.*;
public class PrimeOrNot{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int number1=sc.nextInt();
    int number2=sc.nextInt();
    int count;
    for(int i=number1;i<number2;i++){
    count=0;
      for(int n=1;n<i;n++){
      if(n%i==0)
       count++;
      }
      if(count==0){
      System.out.println(i);
    }
    }
