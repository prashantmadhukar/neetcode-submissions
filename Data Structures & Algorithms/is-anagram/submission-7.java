class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
        return false;

        int [] ch1 = new int[26];
        //int [] ch2 = new int[26];

        for(char c : s.toCharArray())
            ch1[c-'a']++;
        
        for(char c : t.toCharArray()){
            ch1[c-'a']--;
            if(ch1[c-'a']<0)
                return false;
        }
            
        for(int i : ch1){
            if(ch1[i]!=0){
                return false;
            }
        }
        
        return true;
    }
}
