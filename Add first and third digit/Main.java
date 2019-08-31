#include<stdio.h>
int main()
{
  int f,t,n,s;
  scanf("%d",&n);
  t=n%10;
  f=n/100;
  s=f+t;
  printf("%d",s);
  //Type your code here
  return 0;
}