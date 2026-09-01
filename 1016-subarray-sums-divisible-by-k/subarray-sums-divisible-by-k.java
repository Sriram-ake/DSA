class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
            int prefix=sum%k;
            if(prefix<0) prefix+=k;
            if(map.containsKey(prefix)) {
                cnt+=map.get(prefix);
            }
            map.put(prefix,map.getOrDefault(prefix,0) + 1);
        }
        return cnt;
    }
}