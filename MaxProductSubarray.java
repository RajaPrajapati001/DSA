class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        if(nums.length==1){
            return nums[0];
        }else{
       for(int i=0;i<nums.length;i++){
        int multi=1;
        if(nums[i]>max){
            max=nums[i];
        }
        for(int j=i+1;j<nums.length;j++){
            if(j==i+1){
                multi=multi*nums[i]*nums[j];
            }else{
                multi=multi*nums[j];
            }
            if(max<multi){
                max=multi;
            }
        }
        if(i==nums.length-1){
            if(max<nums[nums.length-1]){
                max=nums[nums.length-1];
            }
        }
       } 
       return max;}
    }
}