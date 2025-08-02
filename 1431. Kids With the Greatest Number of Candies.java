class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        int max = 0;
        for(int i : candies){
            max=Math.max(max,i);
        }
        List<Boolean> result = new ArrayList<>();
        for(int i : candies){
            if((i + extraCandies) >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}
