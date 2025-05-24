import java.util.Collections;
class Solution {
    public int trap(int[] height) {
        int water=0;
        ArrayList<Integer> left=new ArrayList();
        // ArrayList<Integer> right=new ArrayList();
        //  for (int num : height) {
        //     right.add(num);
        // }
        Integer[] heightObj = Arrays.stream(height).boxed().toArray(Integer[]::new);
        ArrayList<Integer> right = new ArrayList<>(Arrays.asList(heightObj));
        for(int i=0;i<height.length;i++){
        int leftMax=0,rightMax=0;
        if(left.size()!=0 && right.size()!=0){
         leftMax=Collections.max(left);
         rightMax=Collections.max(right);
        }
        // int minValue= Math.min(leftMax,rightMax);
        if(Math.min(leftMax,rightMax)-height[i]>0){
            water+=Math.min(leftMax,rightMax)-height[i];
        }
        left.add(height[i]);
        right.remove(Integer.valueOf(height[i]));
        }
        return water;
    }
}
