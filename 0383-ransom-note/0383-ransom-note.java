class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       HashMap<Character, Integer>map = new HashMap<>();
       for(int s=0;s<ransomNote.length();s++){
        char ch = ransomNote.charAt(s);
        map.put(ch , map.getOrDefault(ch , 0)+1);
       }
       for(int s=0;s<magazine.length();s++){
        char ch = magazine.charAt(s);
        if(map.containsKey(ch)){
            if(map.get(ch) == 1){
                map.remove(ch);
            }else{
                map.put(ch , map.get(ch)-1);
            }
        }
       }
       if(map.size() == 0){
        return true;
       } 
       return false;
    }
}