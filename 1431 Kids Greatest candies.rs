use std::cmp::{max};
impl Solution {
    pub fn kids_with_candies(candies: Vec<i32>, extra_candies: i32) -> Vec<bool> {
        let mut mx = 0;
        let len = candies.len();
        let mut ans = Vec::new();

        for i in (0..len) {
            mx = max(candies[i], mx);
        }
        mx -= extra_candies;
        for i in (0..len) {
            ans.push(candies[i] >= mx);
        }
        ans
    }
}
