class Solution {
    public int maxProduct(int[] nums) {
        int min_ending = nums[0];
        int max_ending = nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            int v1 = current;
            int v2 = min_ending * current;
            int v3 = max_ending * current;

            int new_max = Math.max(v1, Math.max(v2, v3));
            int new_min = Math.min(v1, Math.min(v2, v3));

            max_ending = new_max;
            min_ending = new_min;

            res = Math.max(res, max_ending);
        }

        return res;
    }
}