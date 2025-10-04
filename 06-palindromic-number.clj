;; PROBLEM 6: Check if a number is palindromic
;; A palindromic number reads the same forwards and backwards.
;; Convert the number to string and check if it's equal to its reverse.
;; Do NOT use built-in reverse functions - implement the reversal logic yourself.
;; Example: 12321 -> true, 12345 -> false, 7 -> true, 1001 -> true
(defn div [dividend divisor] (/ (- dividend (mod dividend divisor)) divisor))

(defn reverse-number [number]
  (loop [reversed-number 0 remaining-number number]
    (cond (<= remaining-number 0) reversed-number
          :else (recur
                 (+ (* reversed-number 10) (mod remaining-number 10))
                 (div remaining-number 10)))))

(defn palindromic-number? [number] (= (reverse-number number) number))

(print (palindromic-number? 12321))
