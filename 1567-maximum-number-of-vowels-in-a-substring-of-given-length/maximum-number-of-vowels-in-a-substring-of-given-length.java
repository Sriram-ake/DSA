class Solution {
    public int maxVowels(String s, int k) {
        int cnt = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i)))
                cnt++;
        }
        int sum = cnt;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                cnt++;
            }
            if (isVowel(s.charAt(i - k))) {
                cnt--;
            }
            sum = Math.max(sum, cnt);
        }
        return sum;
    }
    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}