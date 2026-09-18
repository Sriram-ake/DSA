class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = maxi(piles);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long totalHours = tt_hours(piles, mid);
            if (totalHours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    private long tt_hours(int[] piles, int speed) {
        long total = 0;
        for (int num : piles) {
            total += (num + speed - 1) / speed;
        }
        return total;
    }
    private int maxi(int[] piles) {
        int maxm = Integer.MIN_VALUE;
        for (int num : piles) {
            maxm = Math.max(maxm, num);
        }
        return maxm;
    }
}