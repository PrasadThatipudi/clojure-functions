;; PROBLEM 4: Find Greatest Common Divisor (GCD)
;; Implement the Euclidean algorithm to find GCD of two positive integers.
;; The algorithm works by repeatedly replacing the larger number with the remainder of division.
;; Continue until one number becomes 0, then the other number is the GCD.
;; Example: gcd(48, 18) -> 6, gcd(17, 13) -> 1, gcd(100, 25) -> 25

(defn smaller [first-number second-number]
  (cond (< first-number second-number) first-number :else second-number))

(defn divisible? [number divisor] (= (mod number divisor) 0))

(defn gcd [first-number second-number]
  (loop [divisor 1 current-gcd-value 1]
    (cond  (< (smaller first-number second-number) divisor) current-gcd-value
           (and
            (divisible? first-number divisor)
            (divisible? second-number divisor))
           (recur (inc divisor) divisor)
           :else  (recur (inc divisor) current-gcd-value))))

(print (gcd 100 25))