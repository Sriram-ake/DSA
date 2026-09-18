class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        long total = 0;
        for (int i = 0; i < n; i++) {
            total += piles[i];
        }
        int low = (int) ((total + h -1) / h);
        int high = (int) ((total - 2*n + h + 1) / (h - n + 1));
        while (low < high) {
            int mid = low + (high - low) / 2;
            int time = 0;
            for (int i = 0; i < n; i++) {
                time += (int) ((piles[i] + mid - 1) / mid) ;
            }
            if (time > h) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}