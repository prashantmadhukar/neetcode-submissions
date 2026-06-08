class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
        return false;

        int [] ch1 = new int[26];
        int [] ch2 = new int[26];

        for(char c : s.toCharArray()){
            ch1[c-'a']++;
        }
        for(char c : t.toCharArray()){
            ch2[c-'a']++;
        }

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i : ch1){
            sb1.append(i+"#");
        }
        for(int i : ch2){
            sb2.append(i+"#");
        }

        return (sb1.toString()).equals(sb2.toString());
    }
}
