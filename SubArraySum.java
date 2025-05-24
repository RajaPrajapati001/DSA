
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
      ArrayList<Integer> arrlist=new ArrayList();
      int count=0;
      for(int i=0;i<arr.length;i++){
          int sum=0;
          for(int j=i;j<arr.length;j++){
              sum+=arr[j];
              if(sum==target){
                  arrlist.add(i+1);
                  arrlist.add(j+1);
                  count++;
              }
              if(count==1){
                  break;
              }
          }
           if(count==1){
                  break;
              }
      }
      if(arrlist.size()==0){
          arrlist.add(-1);
      }
      return arrlist;
    }
}
