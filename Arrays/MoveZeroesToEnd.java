/**
    we can use Two Pointer approch.
    Generally i pointer is placed and start and j pointer at the end right. 
    But this problem won't work in that way, to preserve order we must not keep it at the end
    i points to first zero all the time to get swapped and j points to first non-zero next to i pointer thus order gets maintained


 */
class Solution {
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void moveZeroes(int[] nums) {
        int i = -1;
        int j=0;

        for(;j<nums.length;j++){
            if(nums[j]==0){
                i=j;
                break;
            }
        }
        //if no zero found no need to do swaps just return
        if(i==-1) return;
        j=i+1;

        //i points to first zero. from here keep on moving j till end
        while(j<nums.length){
            if(nums[j]!=0){
                swap(nums, i, j);
                i++;
            }
            j++;
        }
    }
}

/*

we have seen i and j starting from same direction. between i and j we only have zeroes if we observe
j always moving i moving only when required.
 */