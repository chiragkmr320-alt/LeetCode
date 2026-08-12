class Solution {
    public int subtractProductAndSum(int n) {
        int sum =0;
        int multi =1;
        while(n!=0){
            int last = n % 10;
            int temp = last;
            sum += last;
            multi *= temp;
            n = n/10;
        }
        return (multi -  sum);
    }
}