import java.util.*;

public class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer, Set<Integer>> count = new HashMap<>();

        for (int i = 0; i <= nums.length - k; i++) {
            for (int j = i; j < i + k; j++) {
                count.putIfAbsent(nums[j], new HashSet<>());
                count.get(nums[j]).add(i);
            }
        }

        int ans = -1;
        for (int num : count.keySet()) {
            if (count.get(num).size() == 1) {
                ans = Math.max(ans, num);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {3, 9, 2, 1, 7};
        int k = 3;
        System.out.println(sol.largestInteger(nums, k)); // Output: 7
    }
}

