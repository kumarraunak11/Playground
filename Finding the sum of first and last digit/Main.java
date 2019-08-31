#include <stdio.h>
int main() {
  int n,first,last;
  int sum=0;
  scanf("%d",&n);
  last=n%10;
  while(n>=10){
    first=n/10;
    n=first;
  }
    sum=n+last;
  
  printf("%d",sum);
  
	//Type your code
	return 0;
}