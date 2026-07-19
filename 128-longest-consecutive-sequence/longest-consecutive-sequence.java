class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer>h=new HashSet<>();
        for(int a:nums){
            h.add(a);
        }
        int max=0;
        for(int a:h){
            if(!h.contains(a-1)){
                int curr=a;
                int len=1;
                while(h.contains(curr+1)){
                    curr++;
                    len++;
                }
                max=Math.max(max,len);
            }
        }
        return max;
    }
}