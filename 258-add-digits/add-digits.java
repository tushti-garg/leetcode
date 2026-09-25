class Solution {
    public int addDigits(int num) {
        while(num >= 10){
            int sum = 0;
            while(num > 0){
            int last_digit = num % 10;
            sum += last_digit;
            num = num /10;
            }
           num = sum;

            
        }
        return num;
        
    }
}