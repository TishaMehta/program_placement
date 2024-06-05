public class Solution {
    public int strStr(String haystack, String needle) {
        // Check if the needle is empty
        if (needle.isEmpty()) {
            return 0;
        }

        // Get the lengths of both haystack and needle
        int haystackLen = haystack.length();
        int needleLen = needle.length();

        // If needle is longer than haystack, it can't be a substring
        if (needleLen > haystackLen) {
            return -1;
        }

        // Loop through the haystack to find the needle
        for (int i = 0; i <= haystackLen - needleLen; i++) {
            // Check if the substring of haystack starting from i matches needle
            if (haystack.substring(i, i + needleLen).equals(needle)) {
                return i;
            }
        }

        // If no match is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println(solution.strStr(haystack1, needle1));  // Output: 0

        // Example 2
        }
}
