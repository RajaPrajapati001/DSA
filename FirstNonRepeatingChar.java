class Solution {
    static char nonRepeatingChar(String s) {
        char answer='$';
       Map<Character, Integer> count = new HashMap<>();

for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);
    if (count.containsKey(ch)) {
        count.put(ch, count.get(ch) + 1);
    } else {
        count.put(ch, 1);
    }
}
 
 for(int j=0;j<s.length();j++){
    if(count.get(s.charAt(j))==1){
        answer=s.charAt(j);
        break;
    }
 }
 return answer;
    }
}
