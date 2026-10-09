class Solution {
    public int minimumDeletions(int[] nums) {
        int minIdx = 0;
        int maxIdx = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[minIdx] >= nums[i]){
                minIdx = i;
            }
            if(nums[maxIdx]  <= nums[i]){
                maxIdx = i;
            }
        }

        int left = Math.min(minIdx, maxIdx);
        int right = Math.max(minIdx, maxIdx);

        int n = nums.length;
        if(right + 1 <= n - left && right + 1 <= (left + 1 + n - right)){
            return right + 1;
        }
        else if(n - left <= right + 1 && n - left <= (left + 1 + n - right)){
            return n - left;
        }
        else{
            return left + 1 + n - right;
        }
    }
}