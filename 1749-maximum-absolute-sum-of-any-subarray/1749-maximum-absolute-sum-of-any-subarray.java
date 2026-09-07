class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnding = 0;
        int minEnding = 0;

        int maxSum = 0;
        int minSum = 0;

        for (int num : nums) {
            maxEnding = Math.max(0, maxEnding + num);
            minEnding = Math.min(0, minEnding + num);

            maxSum = Math.max(maxSum, maxEnding);
            minSum = Math.min(minSum, minEnding);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }
}