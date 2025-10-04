;; PROBLEM 9: Check if a number is an Armstrong number (Narcissistic number)
;; An Armstrong number is equal to the sum of its own digits each raised to the power of the number of digits.
;; For example, 153 has 3 digits, and 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
;; First count the digits, then calculate the sum of each digit raised to that power.
;; Example: 9474 -> 4 digits -> 9^4 + 4^4 + 7^4 + 4^4 = 6561 + 256 + 2401 + 256 = 9474 (true)
(defn div [dividend divisor] (/ (- dividend (mod dividend divisor)) divisor))

(defn digit-count [number]
  (loop [counter 0 remaining-number number]
    (cond (<= remaining-number 0) counter
          :else (recur (inc counter) (div remaining-number 10)))))

(defn pow [base exponent]
  (loop [counter 0 product 1]
    (cond (<= exponent counter) product
          :else (recur (inc counter) (* product base)))))

(defn armstrong-number? [number]
  (loop [sum 0 remaining-number number]
    (cond (<= remaining-number 0) (= sum number)
          :else (recur
                 (+ sum (pow (mod remaining-number 10) (digit-count number))) (div remaining-number 10)))))

(print (armstrong-number? 9473))