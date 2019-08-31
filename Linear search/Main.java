#include<stdio.h>
int main()
{
  int array[100],i,search,n;
  scanf("%d\n",&n);
  for(i=0;i<n;i++){
  scanf("%d",&array[i]);}
  
  scanf("%d",&search);
  for(i=0;i<n;i++){
    if(array[i]==search){
      printf("%d",i+1);
      break;}
  }
  if(i==n){
    printf("%d isn't present in the array.",search);
  
  }
  
  
  
  
  
  //Type your code here
  return 0;
}