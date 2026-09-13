class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            char c = s.charAt(right);
            freq[c - 'A']++;

            // Maximum frequency in current window
            maxFreq = Math.max(maxFreq, freq[c - 'A']);

            // Number of replacements required
            int windowLength = right - left + 1;
            int replacements = windowLength - maxFreq;

            // If more than k replacements are needed,
            // shrink the window
            while (replacements > k) {

                char leftChar = s.charAt(left);
                freq[leftChar - 'A']--;

                left++;

                windowLength = right - left + 1;
                replacements = windowLength - maxFreq;
            }

            // Update answer
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
