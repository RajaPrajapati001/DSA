class Solution {
    public boolean isAnagram(String s, String t) {
        TreeMap<String, Integer> arr1 = new TreeMap<>();
        for(int i=0;i<s.length();i++){
            String letter=Character.toString(s.charAt(i));
            if(arr1.containsKey(letter)){
                int value=arr1.get(letter);
                arr1.put(letter,value+1);
            }else{
                arr1.put(letter,1);
            }
        }
        TreeMap<String, Integer> arr2 = new TreeMap<>();
        for(int i=0;i<t.length();i++){
            String letter=Character.toString(t.charAt(i));
            if(arr2.containsKey(letter)){
                int value=arr2.get(letter);
                arr2.put(letter,value+1);
            }else{
                arr2.put(letter,1);
            }
        }
        if (arr1.equals(arr2)) {
            return true;
        }else{
            return false;
        }
    }
}
