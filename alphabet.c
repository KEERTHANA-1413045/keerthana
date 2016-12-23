#include<stdio.h>
#include<conio.h>
void main()
{
 char ch;
 scanf("%c",&ch);
 if(isalpha(ch)>0)
 printf("%c is alphabet",&ch);
 else
    printf("not alphabet");
 getch();
}
