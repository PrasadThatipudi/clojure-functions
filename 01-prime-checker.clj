;; PROBLEM 1: Check if a number is prime
;; A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
;; Implement an efficient algorithm that can handle large numbers (up to 10^6).
;; The function should return true if the number is prime, false otherwise.
;; Example: 17 -> true, 25 -> false, 2 -> true, 1 -> false

(defn divisible? [number divisor] (= (mod number divisor) 0))

(defn is-prime [number]
  (if (<= number 2)
    (if (= number 2) true false)
    (if (even? number)
      false
      (loop [divisor 3]
        (if (<= number divisor) true
            (if (divisible? number divisor) false (recur (+ divisor 2))))))))

(print (is-prime 13))