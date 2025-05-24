
class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
       Arrays.sort(arr);
      HashSet<Integer> set= new HashSet<>(); 
       for(int i=0;i<arr.length;i++){
           if(arr[i]>0){
               set.add(arr[i]);
           }
       }
       int res=1;
       while(set.contains(res)){
           res++;
       }
       return res;
    }
}
