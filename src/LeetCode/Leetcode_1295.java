package LeetCode;

class Solution1295 {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int n : nums){
            if((int)Math.log10(n)%2 != 0){
                ans++;
            }
        }
        return ans;
    }
}