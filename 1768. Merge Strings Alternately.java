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

/*
Rust

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

Racket

(define/contract (merge-alternately word1 word2)
  (-> string? string? string?)
    (list->string (merge-list-alternately (string->list word1) (string->list word2)))
  )

(define (merge-list-alternately wl1 wl2)
    (cond ((empty? wl1) wl2)
          ((empty? wl2) wl1)
          (else (cons (car wl1) (cons (car wl2) (merge-list-alternately (cdr wl1) (cdr wl2))))))
)

*/
