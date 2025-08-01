class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s : sentences){
            int count = 1;
            int len = s.length();
            for(int i=0;i<len;i++){
                if(s.charAt(i) == ' '){
                    count++;
                }
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
