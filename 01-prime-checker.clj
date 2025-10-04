;; PROBLEM 1: Check if a number is prime
;; A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
;; Implement an efficient algorithm that can handle large numbers (up to 10^6).
;; The function should return true if the number is prime, false otherwise.
;; Example: 17 -> true, 25 -> false, 2 -> true, 1 -> false
(def number 17)
;; START YOUR CODE AFTER THIS LINE. DO NOT REMOVE THIS LINE
(defn isPrime [number] 
  (> number 1))

(println (isPrime 1))