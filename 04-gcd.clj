;; PROBLEM 4: Find Greatest Common Divisor (GCD)
;; Implement the Euclidean algorithm to find GCD of two positive integers.
;; The algorithm works by repeatedly replacing the larger number with the remainder of division.
;; Continue until one number becomes 0, then the other number is the GCD.
;; Example: gcd(48, 18) -> 6, gcd(17, 13) -> 1, gcd(100, 25) -> 25

(defn divisible? [number divisor] (= (mod number divisor) 0))

(defn gcd [first-number second-number]
  (loop [greatest second-number smallest first-number]
    (cond  (zero? smallest) greatest
           :else (recur smallest (mod greatest smallest)))))

(print (gcd 3 4))