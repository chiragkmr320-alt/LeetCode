class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    HashMap<Integer , Integer> map = new HashMap<>();
        for(int i : nums1){
             map.put( i , map.getOrDefault(i , 0)+1);
        }
    int ans[] = new int[Math.min(nums1.length , nums2.length)];
    int i=0;
        for(int a :nums2){
            if(map.containsKey(a)){
                ans[i++] = a;
                if(map.get(a) == 1){
                    map.remove(a);
                }else{
                    map.put(a , map.get(a)-1);
                }
            }
        }
       return Arrays.copyOf(ans, i);
    }
}