class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        Map<Character, Integer> tMap = new HashMap<Character, Integer>();

        for(int counter = 0; counter < s.length(); counter++){
            if(sMap.containsKey(s.charAt(counter))){
                sMap.put(s.charAt(counter), sMap.get(s.charAt(counter)) + 1);
            } else{
                sMap.put(s.charAt(counter), 1);
            }
        }
        for(int counter = 0; counter < t.length(); counter++){
            if(tMap.containsKey(t.charAt(counter))){
                tMap.put(t.charAt(counter), tMap.get(t.charAt(counter)) + 1);
            } else{
                tMap.put(t.charAt(counter), 1);
            }
        }


        boolean isAnagram = (tMap.entrySet().equals(sMap.entrySet())) ? true : false;

        return isAnagram;

    }
}
