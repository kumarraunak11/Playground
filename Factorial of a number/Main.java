#include <stdio.h>
int main() {
  int n,i,mul=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    mul=mul*i;
  }
  printf("%d",mul);
	//Type your code
	return 0;
}