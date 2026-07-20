class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[]pos=new int[n/2];
        int[]neg=new int[n/2];
        int po=0;
        int ne=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[po]=nums[i];
                po++;
            }
            else{
                neg[ne]=nums[i];
                ne++;
            }
        }
        po=0;
        ne=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=pos[po];
                po++;
            }
            else{
                nums[i]=neg[ne];
                ne++;
            }
        }
        return nums;
    }
}