class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int vowel = 0;
        int consonant = 0;
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(char ch : map.keySet()) {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel = Math.max(vowel, map.get(ch));
            }
            else {
                consonant = Math.max(consonant, map.get(ch));
            }
        }
        return vowel + consonant;
    }
}