public class Question4 {
    //You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
    //An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include any square that is an obstacle.
    //Return the number of possible unique paths that the robot can take to reach the bottom-right corner.

    public static void main(String[] args) {
        int[][] grid = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(findUniquePaths(grid)); //2
        int[][] grid2 = {{0,1},{0,0}};
        System.out.println(findUniquePaths(grid2)); //1

    }

    //time complexity: 0(m * n)
    public static int findUniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i = 0; i < m; i++) {
            for(int j =0; j < n; j++) {
                if(i == 0 || j == 0) {
                    if(grid[i][j] == 1 || (i != 0 && grid[i - 1][j] == 0) || (j != 0 && grid[i][j - 1] == 0)){
                        grid[i][j] = 0;
                    }else{
                        grid[i][j] = 1;
                    }
                }else{
                    if(grid[i][j] == 1) {
                        grid[i][j] = 0;
                    }else{
                        grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
                    }
                }
            }
        }

        return grid[m - 1][n - 1];
    }


}
