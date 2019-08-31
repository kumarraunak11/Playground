#include <stdio.h>
#include <math.h>
int main()
{
  int b,e,power;
  scanf("%d\n%d",&b,&e);
  if(e<0)
  {
    printf("Wrong input");
  }
  else{
  power=pow(b,e);
  printf("%d",power);
  }
  	//Your code here       
    return 0;
}