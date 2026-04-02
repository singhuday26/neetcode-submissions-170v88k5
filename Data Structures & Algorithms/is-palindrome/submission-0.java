class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        // 1. Filter and Normalize
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // Check if it's a letter or digit
            if (Character.isLetterOrDigit(c)) {
                // Convert to lowercase to ignore case differences
                sb.append(Character.toLowerCase(c));
            }
        }

        // 2. Two-Pointer Check
        String res = sb.toString();
        int i = 0;
        int j = res.length() - 1;

        while (i < j) {
            if (res.charAt(i) != res.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}