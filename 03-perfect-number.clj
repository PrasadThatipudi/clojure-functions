;; PROBLEM 3: Check if a number is perfect
;; A perfect number is a positive integer that is equal to the sum of its proper positive divisors.
;; Proper divisors are all positive divisors except the number itself.
;; Find all divisors efficiently and check if their sum equals the original number.
;; Example: 28 -> true (divisors: 1,2,4,7,14 and 1+2+4+7+14=28), 12 -> false, 6 -> true
(defn divisible? [number divisor] (= (mod number divisor) 0))

(defn perfect-number? [number]
  (loop [divisor 1 sum-of-divisors 0]
    (cond (<= number divisor) (= number sum-of-divisors)
          (divisible? number divisor)
          (recur (inc divisor) (+ sum-of-divisors divisor))
          :else (recur (inc divisor) sum-of-divisors))))

(print (perfect-number? 28))