(ns euler.problem1-test
  (:use clojure.test 
        euler.problem1))

(deftest a-test
  (testing "Sum of multiple of 3 and 5 below 0"
    (is (= 0 (sum-multiple-of-three-and-five 0))))
  (testing "Sum of multiple of 3 and 5 below 4"
    (is (= 3 (sum-multiple-of-three-and-five 4))))
  (testing "Sum of multiple of 3 and 5 below 6"
    (is (= 8 (sum-multiple-of-three-and-five 6))))
  (testing "Sum of multiple of 3 and 5 below 16"
    (is (= 60 (sum-multiple-of-three-and-five 16))))
  (testing "Sum of multiple of 3 and 5 below 0"
    (is (= 98 (sum-multiple-of-three-and-five 21)))))
