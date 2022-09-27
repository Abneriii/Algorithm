package Others;

/**
 * Author:
 * Created at:2022/8/31
 * Updated at:
 *
 * 剑指 Offer 12. 矩阵中的路径
 **/
public class IfWordsInGrid {

    /**
     *
     * 2022.8.31---HouAlgo--------------代码实现了，通过率63/83，此算法存在bug，因为二维网格可以有字母重复。
     * 在二维网络中找到单词的首字母，然后查找四周是否存在下一个字母，以此类推。
     * 先在二维网格找到第一个字母所在位置grid[m][n],然后调用递归函数find(int [][] grid[i][j],int x,int y,int index)
     * find(int[][] grid,int ,int x,int y,int index)
     *    if index==String的长度
     *          return true;
     *    对比String[index]处的字母是等于上下左右的哪一个字母，然后循环调用find函数
     *    如果String[index]处的字母的上下左右都不等于，则return false
     *-------------------------------------------------
     */
    static class Solution1{
        public boolean exist(char[][] board, String word) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j <board[i].length ; j++) {
                    if(board[i][j]==word.charAt(0)){
                        if(word.length()==1) return true;
                        return find(board,word,i,j,1);
                    }
                }

            }
            return false;
        }
        private boolean find(char[][] board,String word,int x,int y,int index){
            if(index==word.length()){
                return true;
            }
            if(y>0&&board[x][y-1]==word.charAt(index)){
                return find(board,word,x,y-1,index+1);
            }
            if(y<board[0].length-1&&board[x][y+1]==word.charAt(index)){
                return find(board,word,x,y+1,index+1);
            }
            if(x>0&&board[x-1][y]==word.charAt(index)){
                return find(board,word,x-1,y,index+1);
            }
            if(x<board.length-1&&board[x+1][y]==word.charAt(index)){
                return find(board,word,x+1,y,index+1);
            }
            return false;
        }
    }


}
