import java.util.*;
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        //using the list 
        List<Integer> vec = new ArrayList<>();
        for (int i = left; i <= right; ++i) {
            int n = i;
            boolean con = true;
            while (n > 0) {
                int rem = n % 10;
                if (rem == 0 || i % rem != 0) {
                    con = false;
                    break;
                }
                n /= 10;
            }
            if (con) {
                vec.add(i);
            }
        }
        return vec;
    }
}