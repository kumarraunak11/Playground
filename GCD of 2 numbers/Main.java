#include <iostream> 
using namespace std; 
// Recursive function to return gcd of a and b 
int gcd(int a, int b) 
{ 
    if (b == 0) 
        return a; 
    return gcd(b, a % b);  
      
} 
   
// Driver program to test above function 
int main() 
{ 
  int a,b;
    cin>>a>>b;
    cout<<gcd(a, b); 
    return 0; 
} 