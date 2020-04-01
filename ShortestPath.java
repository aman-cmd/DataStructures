class Solution {
    public int minPathSum(int[][] grid) {
        int sum = 0;
        return findMinPath(grid,0,0,sum);
    }
    int findMinPath(int[][] grid,int i,int j,int sum){
        if(i==grid.length-1&&j==grid[0].length-1){
            return sum + grid[i][j];
        }
        else if(i==grid.length-1){
            return findMinPath(grid,i,j+1,sum+grid[i][j+1]);
        }
        else if(j==grid[0].length-1){
            return findMinPath(grid,i+1,j,sum+grid[i+1][j]);
        }
        else{
            return Math.min(findMinPath(grid,i+1,j,sum+grid[i+1][j]),findMinPath(grid,i,j+1,sum+grid[i][j+1]));
        }
    }
}