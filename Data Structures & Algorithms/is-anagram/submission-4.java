class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        /*
        char[] sc =s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);

        for(int i =0;i<sc.length;i++){
            if(sc[i]!=tc[i]){
                return false;
            }
        }

        return true;
        */

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(char ch : s.toCharArray()){
            count1[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int c : count1){
            sb.append(c+"#");
        }
        String str1=sb.toString();

        for(char ch : t.toCharArray()){
            count2[ch-'a']++;
        }
        StringBuilder sb1=new StringBuilder();
        for(int c1 : count2){
            sb1.append(c1+"#");
        }
        String str2=sb1.toString();
        return str1.equals(str2);

        // return Arrays.equals(sc,tc);
    }
}
