// https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/
// 1685. Sum of Absolute Differences in a Sorted Array
class Sum_of_Absolute_Differences_in_a_Sorted_Array {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int sum=0;
        int sumarr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            sumarr[i]=sum;
        }
        int result[]= new int[nums.length];
        for(int i=0; i<nums.length;i++){
            int rightsum=(sumarr[nums.length-1]-sumarr[i])-(nums[i]*(nums.length-i-1));
            int leftsum;
            if(i!=0){
            leftsum=(nums[i]*i)-(sumarr[i-1]);
            }else { leftsum=0;}
            int total=rightsum + leftsum;
            result[i]=total;
        }

       return result;
    }
}