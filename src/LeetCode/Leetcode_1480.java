package LeetCode;

class Solution {
    public int[] runningSum(int[] numss) {
        int[] nums = {1, 2, 3, 4};
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            while (i >= 0) {
                sum += nums[i];
                i--;
            }
            ans[i] = sum;
        }
        return ans;
    }
}

