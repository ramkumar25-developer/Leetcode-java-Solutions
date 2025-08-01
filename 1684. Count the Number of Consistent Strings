class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] arr = new boolean[26];
        for(char i : allowed.toCharArray()){
            arr[i-'a'] = true;
        }
        int count = words.length;
        for(String s : words){
            for(char c : s.toCharArray()){
                if(!arr[c-'a']){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
