class Solution {
    public int maximumWealth(int[][] accounts) {
        int len = accounts.length;
        int max = 0;
        for(int i=0;i<len;i++){
            int len1=accounts[i].length;
            int wealth = 0;
            for(int j=0;j<len1;j++){
                wealth += accounts[i][j];
            }
            if(max<wealth){
                max = wealth;
            }
        }
        return max;
    }
}
