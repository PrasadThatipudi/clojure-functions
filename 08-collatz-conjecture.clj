;; PROBLEM 8: Collatz Conjecture (3n+1 problem)
;; Starting with any positive integer n, repeatedly apply these rules:
;; - If n is even, divide it by 2
;; - If n is odd, multiply by 3 and add 1
;; Count how many steps it takes to reach 1.
;; Example: n = 7 -> 7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1 (16 steps)

(defn collatz-steps [number]
  (loop [counter 0 current-number number]
    (cond (= current-number 1) counter
          (even? current-number) (recur (inc counter) (/ current-number 2))
          :else (recur (inc counter) (+ (* current-number 3) 1)))))

(print (collatz-steps 7))