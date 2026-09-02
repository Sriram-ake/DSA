class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int tot=0;
        for(int i=0;i<arr.length;i++) {
            int sum=0;
            for(int j=i;j<arr.length;j++) {
                sum+=arr[j];
                int len=j-i+1;
                if(len%2==1) tot+=sum;
            }
        }
        return tot;
    }
}