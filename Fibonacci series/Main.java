#include<stdio.h>
int main()
{
  int a=0,b=1,c,n;
  scanf("%d",&n);
  printf("%d %d",a,b);
  for(int i=1;i<n-1;++i){
    c=a+b;
    printf(" %d",c);
    a=b;
    b=c;  
  }

  
  //Type your code here
  return 0;
}