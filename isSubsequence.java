class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (count < s.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}