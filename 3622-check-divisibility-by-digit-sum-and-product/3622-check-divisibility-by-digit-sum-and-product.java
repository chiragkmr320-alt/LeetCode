class Solution {
    public boolean checkDivisibility(int n) {
       
        int temp = n;
        int sum = 0;
        int mult = 1;
        while(n > 0){
            int digit = n%10;
            sum += digit;
            mult *=digit;
            n = n / 10;
        }
        return temp %( sum + mult) == 0;
    }
}