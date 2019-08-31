
  #include<stdio.h>
int main()
{
  int n,a,d,t_n1,t_n2,ap;
  scanf("%d",&n);
  if(n%2==1){
    a=0,d=2;
    t_n1=(n+1)/2;
    ap=a+(t_n1-1)*d;
    printf("%d",ap);
  }
  else{
    a=0,d=1;
    t_n2=n/2;
    ap=a+(t_n2-1)*d;
    printf("%d",ap);
  }
	//type your code here
	
}
	//type your code here
	
