#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
 char str[10],*rev;
 printf("Enter the string:");
 gets(str);
 rev=strrev(str);
 printf("The reversed string:%s",rev);
 getch();
}
