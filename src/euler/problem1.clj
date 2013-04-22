(ns euler.problem1)

(defn sum-multiple-of-three-and-five [upper]
  (let [mult3-and-5 (fn [upper]
                      (for [x (range upper) :when (or (= 0 (rem x 3))
                                        (= 0 (rem x 5)))] x))]
  (reduce + 0 (mult3-and-5 upper))))
