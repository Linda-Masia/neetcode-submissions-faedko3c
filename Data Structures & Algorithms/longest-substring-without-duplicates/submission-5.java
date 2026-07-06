
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int slen = s.length();
        if (slen <= 1) return slen;

        int left = 0; // Tracks where the current search started
        int max = 0;
        int curr = 0;
        HashSet<Character> subString = new HashSet<Character>();

        for (int right = 0; right < slen; right++) {

            if (subString.contains(s.charAt(right))) {
                max = Math.max(max, curr);

                // Reset the loop pointer to where we started, 
                // then move our starting point up by 1
                right = left; 
                left++; 

                subString.clear();
                curr = 0;
            } else {
                // Braces added here so ALL three lines belong to the else
                curr++;
                subString.add(s.charAt(right));
            }
        }

        return Math.max(max, curr);
    }
}