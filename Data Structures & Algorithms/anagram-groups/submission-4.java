class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            
            if (!groups.containsKey(sorted)) {
                groups.put(sorted, new ArrayList<>());
            }
            groups.get(sorted).add(s);
        }

        return new ArrayList(groups.values());
    }
}
