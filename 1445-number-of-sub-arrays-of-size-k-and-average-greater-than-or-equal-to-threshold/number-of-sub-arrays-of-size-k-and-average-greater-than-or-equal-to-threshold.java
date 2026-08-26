class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int l=0,r=k-1,sum=0,avg=0,cnt=0;
        for(int i=l;i<=r;i++) {
            sum+=arr[i];
        }
        while(r < n) {
            if(sum/k >= threshold) cnt++;
            sum-=arr[l];
            l++;
            r++;
            if(r<n) sum+=arr[r];
        }
        return cnt;
    }
}