#include<stdio.h>
#include<conio.h>
void main()
{
 int num,rev_no=0,rem;
 printf("Enter the number");
 scanf("%d",&num);
 while(num!=0)
 {
 rem=num%10;
 rev_no=rev_no*10+rem;
 num/=10;
 }
 printf("%d",rev_no);
 getch();
}
