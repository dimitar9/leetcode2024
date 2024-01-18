class Solution {
    public String mergeAlternately(String word1, String word2) {
        String output = "";

        for(int i = 0; i < Math.max(word1.length(), word2.length()); i++){
            if(word1.length()> i) {
            output+=word1.charAt(i);
            }
            if(word2.length()> i) {
                output+=word2.charAt(i);
            }
        }
        
        return output;
    }

}

