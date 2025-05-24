class Solution {
    public int hIndex(int[] citations) {
        int answer=0;
        int size=citations.length;
        Arrays.sort(citations);
        for(int i=citations.length-1;i>=0;i--){
            System.out.println(citations[i]);
        }
        while(size>0){
            int count=0;
            for(int i=0;i<citations.length;i++){
                if(citations[i]>=size){
                    count++;
                }
            }
            if(count>=size){
                answer=size;
                break;
            }
            size--;
        }
        return answer;
    }
}
