;; PROBLEM 7: Sum of unique prime factors
;; Find all unique prime factors of a given number and return their sum.
;; For example, if n = 12, prime factors are 2 and 3, so sum = 5.
;; If n = 30, prime factors are 2, 3, and 5, so sum = 10.
;; Implement efficient prime factorization and ensure each prime is counted only once.
;; Example: 60 -> prime factors: 2,3,5 -> sum = 10, 17 -> 17 (itself is prime)
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

(defn sum-of-prime-factors [number]
  (loop [divisor 1 sum 0]
    (cond
      (< number divisor) sum
      (and (divisible? number divisor) (prime? divisor))
      (recur (inc divisor) (+ sum divisor))
      :else (recur (inc divisor) sum))))

(print (sum-of-prime-factors 12))