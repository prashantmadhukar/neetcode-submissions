class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> map = new HashMap<>();

        for(String s : strs){
            int[] countLetters = new int[26];
            for(char ch : s.toCharArray()){
                countLetters[ch-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i:countLetters){
                sb.append(i);
                sb.append("#");
            }
            String key =sb.toString();
            map.computeIfAbsent(key,k->new ArrayList<String>()).add(s);
        }
        return new ArrayList(map.values());
    }
}
