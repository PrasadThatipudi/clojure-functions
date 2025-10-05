;; PROBLEM 2: Generate nth Fibonacci number
;; The Fibonacci sequence starts with 0, 1, and each subsequent number is the sum of the two preceding ones.
;; Implement a function that returns the nth Fibonacci number efficiently (handle n up to 50).
;; Consider both iterative and recursive approaches, but choose the most efficient one.
;; Example: n = 7 -> 13 (sequence: 0,1,1,2,3,5,8,13), n = 0 -> 0, n = 1 -> 1

(defn fibonacci [number]
  (loop [current 0 next 1 counter 0]
    (if (= number counter) current
        (recur next (+ current next) (inc counter)))))

(print (fibonacci 0))