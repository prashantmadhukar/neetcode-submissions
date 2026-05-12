class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List> m = new HashMap<>();

        for(String s:strs){
            int[] count=new int[26];
            char[] ch=s.toCharArray();
            for(char c:ch){
                count[c-'a']++;
            }
            StringBuilder sb= new StringBuilder();
            for(int i=0;i<26;i++){
                 sb.append(count[i]);
                 sb.append("#");
            }

            if(m.containsKey(sb.toString())){
                m.get(sb.toString()).add(s);
            }else{
                m.put(sb.toString(),new ArrayList<String>());
                m.get(sb.toString()).add(s);
            }
        }

        return new ArrayList(m.values());
        
    }


}
