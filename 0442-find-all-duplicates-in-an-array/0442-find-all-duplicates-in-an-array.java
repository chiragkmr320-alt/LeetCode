class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i :nums){
            map.put(i ,map.getOrDefault(i , 0)+1);
        }
        List<Integer> result = new ArrayList<>();
        for(int i : map.keySet()){
            if(map.get(i) > 1){
                result.add(i);
            }
        }
        return result;
    }
}