class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        map.put(0,-1);
        int prefix=0;
        for(int i=0;i<n;i++) {
           prefix+=nums[i];
           int sum=prefix%k;
           if(map.containsKey(sum)) {
            if(i-map.get(sum) >= 2) {
                return true;
            }
           }
           else {
            map.put(sum,i);
           }
        }
        return false;
    }
}