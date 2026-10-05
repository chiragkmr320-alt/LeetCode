class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    HashMap<Integer , Integer> map = new HashMap<>();
        for(int i : nums1){
             map.put( i , map.getOrDefault(i , 0)+1);
        }
    List<Integer> list = new ArrayList<>();
        for(int a :nums2){
            if(map.containsKey(a)){
                list.add(a);
                if(map.get(a) == 1){
                    map.remove(a);
                }else{
                    map.put(a , map.get(a)-1);
                }
            }
        }
        int ans[] = new int[list.size()];
        int i=0;
        for(int n : list){
            ans[i++] = n;
        }
        return ans;
    }
}