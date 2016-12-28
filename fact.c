#include<stdio.h>
#include<conio.h>
long int fact(int num);
void main()
{
 int num;
 printf("Enter the number:");
 scanf("%d",&num);
 printf("\nFactorial of %d=%ld",num,fact(num));
 getch();
}
long int fact(int num)
{
if(num>=1)
return num*fact(num-1);
else
return 1;
}
