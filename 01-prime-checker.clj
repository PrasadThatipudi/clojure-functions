;; PROBLEM 1: Check if a number is prime
;; A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
;; Implement an efficient algorithm that can handle large numbers (up to 10^6).
;; The function should return true if the number is prime, false otherwise.
;; Example: 17 -> true, 25 -> false, 2 -> true, 1 -> false

(defn divisible? [number divisor] (= (mod number divisor) 0))

(defn prime? [number]
  (cond
    (= number 2) true
    (< number 2) false
    (even? number) false
    :else (loop [divisor 3]
            (cond
              (<= number divisor) true
              (divisible? number divisor) false
              :else (recur (+ number 2))))))

(print (prime? 15))
