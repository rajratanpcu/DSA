class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;  // no valid subarray if k <= 1

        int count = 0;
        long product = 1;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            // shrink window until product < k
            while (product >= k && left <= right) {
                product /= nums[left];
                left++;
            }

            // all subarrays ending at right are valid
            count += (right - left + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {10, 5, 2, 6};
        int k = 100;

        System.out.println(sol.numSubarrayProductLessThanK(nums, k)); // Output: 8
    }
}
