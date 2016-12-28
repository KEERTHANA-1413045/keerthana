#include<stdio.h>
#include<conio.h>
void main()
{
 char ch;
 scanf("%c",&ch);
 if(isdigit(ch))
 printf("True");
 else
 printf("False");
 getch();
}
