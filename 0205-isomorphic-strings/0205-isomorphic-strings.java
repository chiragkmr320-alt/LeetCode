class Solution {
    public boolean isIsomorphic(String s, String t) {
      char a[] = t.toCharArray();
      HashMap<Character , Character> map = new HashMap<>();
      for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(map.containsKey(ch)){
            if(!map.get(ch).equals(a[i])){
                return false;
            }
        }else{
            if(map.containsValue(a[i])){
                return false;
            }else{
                map.put(ch , a[i]);
            }
        }
      }
      return true;
    }
}