#include <stdio.h>
int main() {
  int n,fac;
  scanf("%d",&n);
  for(fac=1;fac<=n;fac++)
  {
    if(n%fac==0)
    {
printf("%d\n",fac);
  }
  }//Type your code
	return 0;
}