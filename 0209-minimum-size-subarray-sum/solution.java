class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0, sum = 0, ans = Integer.MAX_VALUE;

        while(j < nums.length) {
            sum += nums[j];

            while(sum >= target) {
                ans = Math.min(ans, j - i + 1);
                sum -= nums[i];
                i++;
            }

            j++;
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
