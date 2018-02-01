(ns learningclojure.core
  (:gen-class))

(print-str "Hello, World!")
(print-str "Hello, World!" " " "from Clojure")
;; (quot x y) will give you the whole number part of x divided by y.
;; (rem x y) will give you the remainder of x divided by y.

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
