#include<stdio.h>
#include<conio.h>
void main()
{
 int pow,num,r;
 long i;
 printf("Enter the number:");
 scanf("%d",&num);
 printf("Enter the power value:");
  scanf("%d",&pow);
 for(i=1;pow!='\0';pow--)
 i*=num;
 printf("%ld",i);
}
