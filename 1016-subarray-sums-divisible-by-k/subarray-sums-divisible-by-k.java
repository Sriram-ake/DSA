class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] count = new int[k];
        count[0]=1;
        int prefixSum=0;
        int result=0;
        for(int num:nums){
            prefixSum += num;
            int rem = (prefixSum % k);
            if(rem<0){
                rem +=k;
            }
            result += count[rem];
            count[rem]++;
        }
        return result;
    }
}
