class Solution {
    public boolean isPalindrome(int x) {
        int ans = 0;
        int x1 = x;
        if(x<0){
            return false;
        }
        while(x>0){
            ans = (ans*10) + (x%10);
            x /= 10;
        }
        if(ans == x1){
            return true;
        }
        return false;
    }
}
