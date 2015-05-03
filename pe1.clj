(reduce + 0 (filter #(or (zero? (mod % 3)) (zero? (mod % 5))) (range 1 1000)))
