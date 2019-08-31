#include <stdio.h>
int main() {
  int n,sec,second;
  scanf("%d",&n);
  second=n;
  while(second>=100){
    second=second/10;
  }
  sec=second%10;
  printf("%d",sec);

	//Type your code
	return 0;
}