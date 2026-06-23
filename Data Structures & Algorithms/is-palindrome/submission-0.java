class Solution {
    public boolean isPalindrome(String s) {
        // 1. Clean the string using StringBuilder
        StringBuilder cleaned = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            // Check if it's an alphanumeric character
            if (Character.isLetterOrDigit(curr)) {
                cleaned.append(Character.toLowerCase(curr));
            }
        }
        
        // 2. Convert back to string for your palindrome check
        String filteredStr = cleaned.toString();
        int sLen = filteredStr.length();

        // 3. Your excellent palindrome logic
        for (int i = 0; i < sLen / 2; i++) {
            if (filteredStr.charAt(i) != filteredStr.charAt(sLen - i - 1)) {
                return false;
            }
        }

        return true;
    }
}