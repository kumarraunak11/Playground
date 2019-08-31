#include<stdio.h>
 
int main()
{
      int num, count, fact, rem, sum = 0, temp;
      scanf("%d", &num);
      for(temp = num; num > 0; num = num / 10)
      {
            fact = 1;
            rem = num % 10;
            for(count = 1; count <= rem; count++)
            {
                  fact = fact * count; 
            } 
            sum = sum + fact;
      }
      if(sum == temp)
      {
            printf("Yes\n", temp);
      }
      else
      {
            printf("No\n", temp);
      }
      return 0; 
}
