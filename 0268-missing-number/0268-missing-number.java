class Solution {
    public int missingNumber(int[] nums) {
        int sum = (nums.length)*(nums.length+1)/2;
        int arrSum = 0;
        for(int ele : nums){
            arrSum += ele;
        }

        return (sum - arrSum);
    }
}