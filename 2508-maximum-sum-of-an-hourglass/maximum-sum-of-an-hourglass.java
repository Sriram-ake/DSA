class Solution {
    public int maxSum(int[][] grid) {
        //brute force
        int m=grid.length;
        int n=grid[0].length;
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<=m-3;i++) {
            for(int j=0;j<=n-3;j++) {
               int res=grid[i][j]+grid[i][j+1]+grid[i][j+2]
                +grid[i+1][j+1]
                +grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
                sum=Math.max(sum,res);
            }
        }
        return sum;
    }
}