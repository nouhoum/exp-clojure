(ns euler.problem1)

(defn sum-multiple-of-three-and-five [upper]
  (let [mult3-or-5 (fn [upper]
                      (for [x (range upper) :when (or (= 0 (rem x 3))
                                        (= 0 (rem x 5)))] x))]
  (reduce + 0 (mult3-or-5 upper))))

(defn sum-multiple-of-three-and-five2 [upper]
  (letfn [(multiple-of-three? [x]
            (= 0 (rem x 3)))
          (multiple-of-five? [y]
            (= 0 (rem y 5)))]
    (reduce + 0 (for [x (range upper) :when (or (multiple-of-three? x)
                                                (multiple-of-five? x))
                      ] x))))
                          
                            
