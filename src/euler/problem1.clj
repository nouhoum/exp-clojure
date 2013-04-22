(ns euler.problem1)

(defn mult3-and-5 [upper]
  (for [x (range upper) :when (or (= 0 (rem x 3))
                                        (= 0 (rem x 5)))] x))                             

(defn sum-multiple-of-three-and-five [upper]
  (reduce + 0 (mult3-and-5 upper)))
