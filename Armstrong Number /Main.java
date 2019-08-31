#include <stdio.h>
#include<math.h>
int main() {
  int n,sum=0,power,rem=0,temp;
  scanf("%d",&n);
  temp=n;
  while(n!=0)
  {
rem=n%10;
    power=pow(rem,3);
    sum=sum+power;
    n=n/10;
  }
  if(sum==temp)
  
printf("Armstrong Number");
  
  else
  
    printf("Not an Armstrong Number");
  
	//Type your code
	return 0;
}