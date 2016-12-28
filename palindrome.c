#include<stdio.h>
#include<conio.h>
void main()
{
 int temp,num,rev_no=0,rem;
 printf("\nEnter the number:");
 scanf("%d",&num);
 temp=num;
 while(num!=0)
 {
 rem=num%10;
 rev_no=rev_no*10+rem;
 num/=10;
 }
 if(temp==rev_no)
  printf("\n %d is palindrome",temp);
  else
  printf("%d is  not a palindrome",temp);
  getch();
}
