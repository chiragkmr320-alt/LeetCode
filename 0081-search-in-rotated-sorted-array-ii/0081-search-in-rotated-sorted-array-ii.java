class Solution {
    public boolean search(int[] nums, int target) {
        int i=0;
        int n =nums.length;
        int j=n-1;
        while(i<=j){
            if(nums[i] == target || nums[j] == target){
                return true;
            }else if(nums[i] < target){
                i++;
            }else {
                j--;
            }
        }
        return false;
    }
}