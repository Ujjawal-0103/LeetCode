class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int smallest = nums[0];
        int largest = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= largest){
                largest = nums[i];
            }
            if(nums[i] <= smallest){
                smallest = nums[i];
            }
        }
        
        List<Integer> out = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != smallest){
                out.add(smallest);
                i--;
            }
            smallest++;
        }

        return out;
    }
}