class Solution {
    public int countTriplets(int[] arr, int target) {
        Arrays.sort(arr);
        int count=0;
      for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
              for(int k=j+1;k<arr.length;k++){
                  if(arr[i]+arr[j]+arr[k]==target){
                      count++;
                  }
              }
          }
      }
       return count;
    }
}
