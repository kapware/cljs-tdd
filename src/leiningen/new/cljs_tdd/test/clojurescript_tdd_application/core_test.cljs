(ns {{ns-name}}.core-test
  (:require [cljs.test :refer-macros [is testing async]]
            [devcards.core :refer-macros [deftest]]))

(deftest a-test
  (testing "FIXME, I fail."
    (async done
           (js/setTimeout
            (fn []
              (is (= 1 1))
              (done))
            100))))
