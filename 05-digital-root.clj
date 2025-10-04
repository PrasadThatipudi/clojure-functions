;; PROBLEM 5: Calculate Digital Root
;; The digital root is the recursive sum of all digits in a number until a single digit is obtained.
;; Keep adding the digits of the result until you get a single digit.
;; Implement this using iteration (not the mathematical formula digit_root = 1 + (n-1) % 9).
;; Example: 9875 -> 9+8+7+5 = 29 -> 2+9 = 11 -> 1+1 = 2, so digital root is 2

(defn digital-root [number])