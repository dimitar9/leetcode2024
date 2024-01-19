class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        List<Boolean> resultList = new ArrayList<>(len);

        int max = 0;
        for(int i = 0; i < candies.length; i++){
            max = Math.max(max, candies[i]);
        }
        for(int i = 0; i < candies.length; i++){
            resultList.add( candies[i] + extraCandies >= max ? true: false);
        }
        return resultList;

    }
}
