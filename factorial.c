#include<stdio.h>
#include<conio.h>
void main()
{
 int fact=1,i,num;
 scanf("%d",&num);
 if(num==0)
 fact=1;
 else
 {
  for(i=1;i<=num;i++)
  fact=fact*i;
 }
 printf("\nThe factorial of %d is %d",num,fact);
 getch();
}
