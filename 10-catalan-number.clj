;; PROBLEM 10: Calculate nth Catalan number
;; Catalan numbers appear in combinatorial mathematics. The nth Catalan number is given by:
;; C(n) = (1/(n+1)) * (2n choose n) = (2n)! / ((n+1)! * n!)
;; Alternatively: C(0)=1, and C(n) = sum from i=0 to n-1 of C(i)*C(n-1-i)
;; Implement using the recursive formula with memoization for efficiency.
;; Example: C(4) = 14, C(5) = 42, C(0) = 1, C(1) = 1, C(2) = 2, C(3) = 5

(defn catalan-number [number]
  (cond (= number 0) 1
        :else
        (loop [counter 0 current-catalan 0]
          (cond (= number counter) current-catalan
                :else
                (recur (inc counter)
                       (+ current-catalan
                          (* (catalan-number counter)
                             (catalan-number (- number counter 1)))))))))

(print (catalan-number 5))