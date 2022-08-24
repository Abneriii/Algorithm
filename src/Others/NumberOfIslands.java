package Others;

/**
 * Author:
 * Created at:2022/8/24
 * Updated at:
 *
 *
 *
 * 200. 岛屿数量
 *
 * 2022.8.24---不会------题解看懂了。
 **/
public class NumberOfIslands {

    /**
     * 力扣题解
     */
    static class Solution2 {

        public static void dfs(char[][] grid, int r, int c) {
            int nr = grid.length;
            int nc = grid[0].length;

            if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
                return;
            }

            grid[r][c] = '0';
            dfs(grid, r - 1, c);
            dfs(grid, r + 1, c);
            dfs(grid, r, c - 1);
            dfs(grid, r, c + 1);
        }

        public static int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0) {
                return 0;
            }

            int nr = grid.length;
            int nc = grid[0].length;
            int num_islands = 0;
            for (int r = 0; r < nr; ++r) {
                for (int c = 0; c < nc; ++c) {
                    if (grid[r][c] == '1') {
                        ++num_islands;
                        dfs(grid, r, c);
                    }
                }
            }

            return num_islands;
        }
    }


    /**
     * LC.200.岛屿数量
     * 2022.3.31:Hou:"dfs思想"，代码实现了。
     */

    static class Solution1 {

        int row;
        int column;
        public  void continuousArea(char[][] grid,int x,int y){
            grid[x][y]='0';
            //查看上下左右
            if(x<row-1&&grid[x+1][y]=='1'){
                continuousArea(grid,x+1,y);
            }
            if(y<column-1&&grid[x][y+1]=='1'){
                continuousArea(grid,x,y+1);
            }
            if(y>0&&grid[x][y-1]=='1'){
                continuousArea(grid,x,y-1);
            }
            if(x>0&&grid[x-1][y]=='1'){
                continuousArea(grid,x-1,y);
            }

        }

        public int numIslands(char[][] grid) {

            //遍历二维矩阵，从每一个元素1开始将其相邻的元素变为0，这样算一个陆地，重复以上过程直到将所有的元素均变为0，即得到总陆地数
            row=grid.length;
            column=grid[0].length;
            int res=0;
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++){
                    if(grid[i][j]=='1' ){
                        res++;
                        continuousArea(grid,i,j);

                    }

                }


            }
            return res;
        }





    }




}
