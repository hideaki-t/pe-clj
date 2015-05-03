(defn fib [a b]
  (cons a (lazy-seq (fib b (+ a b)))))

(reduce + 0 (filter #(zero? (mod % 2)) (take-while #(< % 4000000) (fib 1 2))))
