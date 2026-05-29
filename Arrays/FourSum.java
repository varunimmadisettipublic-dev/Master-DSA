/*

This can be solved using Two Pointer approch. place 2 pointers in the start and other 2 pointers searches for other 2 nums to make sum as zero
ofcourse sorting is required for sure 

 */
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            //skip i no need to find for same i
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                //for fixed i no need to go for same j
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int k = j+1;
                int l = nums.length-1;

                while(k<l){
                    //as per constraints we need to use long else we won't get correct answer
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];

                    if(sum>target){
                        l--;
                    }else if(sum<target){
                        k++;
                    }else{
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        ans.add(temp);
                        k++;
                        //once you find a pair for i and j we must either k or l, even we move one, we can remove repetations
                        while(k<l && nums[k]==nums[k-1]){
                            k++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}