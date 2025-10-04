;; PROBLEM 4: Find Greatest Common Divisor (GCD)
;; Implement the Euclidean algorithm to find GCD of two positive integers.
;; The algorithm works by repeatedly replacing the larger number with the remainder of division.
;; Continue until one number becomes 0, then the other number is the GCD.
;; Example: gcd(48, 18) -> 6, gcd(17, 13) -> 1, gcd(100, 25) -> 25
(def a 48)
(def b 18)
;; START YOUR CODE AFTER THIS LINE. DO NOT REMOVE THIS LINE