class Solution {
    public int maximumSum(int[] arr) {
        int noDelete = arr[0];
        int oneDelete = arr[0];
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int oldNoDelete = noDelete;
            int oldOneDelete = oneDelete;
            noDelete = Math.max(current,oldNoDelete + current);
            oneDelete = Math.max(oldNoDelete,oldOneDelete + current);
            ans = Math.max(ans, Math.max(noDelete, oneDelete));
        }

        return ans;
    }
}