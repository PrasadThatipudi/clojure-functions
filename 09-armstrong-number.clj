;; PROBLEM 9: Check if a number is an Armstrong number (Narcissistic number)
;; An Armstrong number is equal to the sum of its own digits each raised to the power of the number of digits.
;; For example, 153 has 3 digits, and 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
;; First count the digits, then calculate the sum of each digit raised to that power.
;; Example: 9474 -> 4 digits -> 9^4 + 4^4 + 7^4 + 4^4 = 6561 + 256 + 2401 + 256 = 9474 (true)

(defn armstrong-number? [number])