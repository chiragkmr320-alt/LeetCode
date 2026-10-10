class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int longest = 1;
        int length = 1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
                if(nums[i] == nums[i-1]+1){
                    length++;
                }else{
                    longest = Math.max(longest , length);
                    length = 1;
                }
        }
         longest = Math.max(longest , length);
        return longest;
    }
}

