class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        //sb.append("#");
        
        for(String s : strs){
            sb.append(s.length()+"#"+s);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {
       // String[] strings = str.split("#",-1);
        List<String> strs = new ArrayList<>();

        int i=0;
        

        while (i<str.length()){
            int j =i;
            while(str.charAt(j)!='#')
            j++;

            int len = Integer.parseInt(str.substring(i,j));
            strs.add(str.substring(j+1,j+1+len));
            i=j+1+len;
        }

        
        
            
        
        return strs;
    }
}
