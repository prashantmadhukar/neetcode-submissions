class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> hs = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')
                    continue;
                String rowstr=board[i][j]+"@"+i +"row";
                String colstr=board[i][j]+"@"+j +"col";
                String boxstr=board[i][j]+"@"+i/3+j/3 +" box";
                
                if(!hs.add(rowstr)||!hs.add(colstr)||!hs.add(boxstr)){
                    return false;
                }
            }
        }
        return true;
    }
}
