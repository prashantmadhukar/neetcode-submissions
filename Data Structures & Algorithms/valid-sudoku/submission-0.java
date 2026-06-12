class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<String> hs = new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')
                    continue;
                String rowstr=board[i][j]+"found at"+i +"row";
                String colstr=board[i][j]+"found at"+j +"col";
                String boxstr=board[i][j]+"found at "+i/3+j/3 +" box";
                
                if(hs.contains(rowstr)||hs.contains(colstr)||hs.contains(boxstr)){
                    return false;
                }else{
                    hs.add(rowstr);
                    hs.add(colstr);
                    hs.add(boxstr);
                }
            }
        }
        
        return true;
    }
}
