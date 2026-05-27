/*

We can use nested for loop and find i,j such that there sum gives target but it takes O(n^2) complexity
When it comes to optimization we have Two Pointer approch, sliding window, prefixsum, kadane's algo
Here Two Pointer approch makes more sense because goal is to find 2 indices.
in addition to that it is mentioned that array is sorted. so if temp sum is high we decrement end else we increment start


*/

class TwoSumInSortedArray {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]>target){
                j--;
            }else if(nums[i]+nums[j]<target){
                i++;
            }else{
                break;
            }
        }
        return new int[]{i+1, j+1};
    }
}