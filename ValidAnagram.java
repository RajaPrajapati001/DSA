class Solution {
    public boolean isAnagram(String s, String t) {
        TreeMap<String, Integer> arr1 = new TreeMap<>();
        TreeMap<String, Integer> arr2 = new TreeMap<>();
        arr1=loop(s);
        arr2=loop(t);
        if (arr1.equals(arr2)) {
            return true;
        }else{
            return false;
        }
    }
    public static TreeMap loop(String name){
        TreeMap<String, Integer> arr = new TreeMap<>();
        for(int i=0;i<name.length();i++){
            String letter=Character.toString(name.charAt(i));
            if(arr.containsKey(letter)){
                int value=arr.get(letter);
                arr.put(letter,value+1);
            }else{
                arr.put(letter,1);
            }
        }
        return arr;
    }
}
