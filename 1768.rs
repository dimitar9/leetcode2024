impl Solution {
    pub fn merge_alternately(word1: String, word2: String) -> String {
        let mut chars1 = word1.chars();
        let mut chars2 = word2.chars();
        let mut ans = String::with_capacity(word1.len() + word2.len());
        for _ in 0..word1.len().min(word2.len()) {
            ans.push(chars1.next().unwrap());
            ans.push(chars2.next().unwrap());
        }
        ans.extend(chars1);
        ans.extend(chars2);
        ans
    }
}
