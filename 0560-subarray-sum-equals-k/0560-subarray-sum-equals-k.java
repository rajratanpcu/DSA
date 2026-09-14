class Solution {
    public int subarraySum(int[] nums, int k) {

        int sum = 0;
        int res = 0;

        HashMap<Integer, Integer> f = new HashMap<>();

        f.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            int ques = sum - k;

            int frequency = f.getOrDefault(ques, 0);

            res += frequency;

            f.put(sum, f.getOrDefault(sum, 0) + 1);
        }

        return res;
    }
}