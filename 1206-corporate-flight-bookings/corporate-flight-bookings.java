class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr=new int[n];
        for(int[] booking:bookings) {
            int first=booking[0];
            int middle=booking[1];
            int last=booking[2];
            for(int i=first-1;i<middle;i++) {
                arr[i]+=last;
            }
        }
        return arr;
    }
}