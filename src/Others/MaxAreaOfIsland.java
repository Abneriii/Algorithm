package Others;

/**
 * Author:
 * Created at:2022/8/24
 * Updated at:
 *
 * 695. 岛屿的最大面积
 *
 *
 *
 *
 **/
public class MaxAreaOfIsland {

    /**
     *
     *
     * -------2022.8.24---------HouAlgo-----------------感觉算法没问题，dai实现
     * 遍历这个矩形，如果遇到值等于1，则调用dfs_function，每开启一次dfs_function，都要记录这次遍历的面积大小
     *
     * dfs_function:将上下左右所有的1的位置都设为0
     *
     *
     * int area=0;
     * int maxArea=0;
     * CalculateMaxAreaOfIsland(int island[][]){
     *     for i=0 to MaxX
     *         for j=0 to MaxJ
     *            area=0;
     *            if(island[i][j]==1){
     *               dfs(i,j);
     *               maxArea=max(area,maxArea);
     *          }
     *
     * }
     *
     *  dfs(int[] island,int x,int y){
     *    area+=1;
     *    island[x][y]=0;
     *    if(左面没超过边界，且左边为1){
     *        dfs(island,x-1,y)
     *    }
     *    if(上....){
     *        ...........
     *    }
     *    if(右...){
     *        ...........
     *    }
     *    if(下){
     *        ..............
     *    }
     *
     *
     *
     *  }
     * -----------------------------------------------------------------------
     *
     */


}
