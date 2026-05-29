/*

This can be done using 2 pointer approch but we will have 3 pointers here. 
ofcourse we know first we need to sort the array
now keep 1 pointer at the start and the other 2 pointers searches for pairs

 */

class Solution {    
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            //remove repetations by skipping fixed i
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = nums.length-1;

            while(j<k && j<nums.length){
                int sum = nums[i]+nums[j]+nums[k];

                if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(temp);
                    j++;
                    //remove repetations for fixed i by changing either j or k
                    while(j<nums.length && nums[j]==nums[j-1]){
                        j++;
                    }
                }
            }
        }
        return ans;
    }
}