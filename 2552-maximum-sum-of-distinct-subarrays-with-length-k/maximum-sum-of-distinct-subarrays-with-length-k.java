class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        long sum = 0;
        long maxsum =0;
        int left =0;
        for(int right =0; right<nums.length;right++){
            sum+=nums[right];
            map.put(
                nums[right],
                map.getOrDefault(nums[right],0)+1
            );
            if(right - left +1>k){
                int leftelement = nums[left];
                sum-= leftelement;
                map.put(
                    leftelement,
                    map.get(leftelement) -1
                );
                if(map.get(leftelement) == 0){
                    map.remove(leftelement);
                }
                left++;
            }
            if(right-left +1 == k){
                if(map.size()==k){
                    maxsum = Math.max(maxsum,sum);
                }
            }
        }
        return maxsum;

    }
}