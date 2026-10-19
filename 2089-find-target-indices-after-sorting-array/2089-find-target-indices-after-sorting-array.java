class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        int smaller = 0;
        int equal = 0 ;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                equal++;
            }else if(nums[i] < target){
                smaller++;
            }
        }
        for(int i=smaller;i<smaller+equal;i++){
            list.add(i);
        }
        return list;
    }
}