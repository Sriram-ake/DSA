class Solution {
    public int[] getAverages(int[] nums,int k) {
        int n=nums.length;
        int[] ans=new int[n];
        Arrays.fill(ans,-1);
        if(2*k+1>n) return ans;
        long[] prefix=new long[n+1];
        for(int i=0;i<n;i++) {
            prefix[i+1]=prefix[i]+nums[i];
        }
        for(int i=k;i<n-k;i++) {
            long sum=prefix[i+k+1]-prefix[i-k];
            ans[i]=(int)(sum/(2*k+1));
        }
        return ans;
    }
}