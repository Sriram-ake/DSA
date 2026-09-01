class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i]%2;
            if(map.containsKey(sum-k)) {
                cnt+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}