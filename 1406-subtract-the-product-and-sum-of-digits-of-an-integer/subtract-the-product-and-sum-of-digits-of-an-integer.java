class Solution {
    public int subtractProductAndSum(int n) {
        
        int sum = 0;
        int multiply = 1;
        while(n>0){
        int last_digit = n % 10;
        sum += last_digit;
        multiply *= last_digit;
      
        n = n / 10;
          }
        return multiply - sum;
        
    }
   
    

}