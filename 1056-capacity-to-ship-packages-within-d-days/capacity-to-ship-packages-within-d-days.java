class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0, sum = 0;
        for(int w : weights) {
            max = Math.max(max, w);
            sum += w;
        }
        int left = max;
        int right = sum;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(ispossible(weights, days, mid)) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
    private boolean ispossible(int[] weights, int days, int cap) {
        int load = 0;
        int countDays = 1;
        for(int w : weights) {
            if(load + w > cap) {
                countDays++;
                load = 0;
            }
            load += w;
        }
        return countDays <= days;
    }
}