class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        int i=0;
        ArrayList<Integer> list=new ArrayList();
      while(i+k<=arr.length){
          HashSet<Integer> set=new HashSet();
          for(int j=i;j<i+k;j++){
              set.add(arr[j]);
          }
          list.add(set.size());
          i++;
      }
      return list;
    }
}
