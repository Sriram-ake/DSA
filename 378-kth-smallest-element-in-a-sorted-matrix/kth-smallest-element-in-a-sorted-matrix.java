class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m=matrix.length,n=matrix[0].length;
        int left=matrix[0][0];
        int right=matrix[m-1][n-1];
        while(left < right) {
            int mid=left+(right-left)/2;
            int cnt=0;
            int j=n-1;
            for(int i=0;i<m;i++) {
                while(j>=0 && matrix[i][j]>mid) {
                    j--;
                }
                    cnt+=j+1;
            }
                if(cnt<k) left=mid+1;
                else right=mid;
        }
        return left;
    }
}