(ns learningclojure.core
  (:gen-class))

;;(print-str "Hello, World!")
;;(print-str "Hello, World!" " " "from Clojure")
;; (quot x y) will give you the whole number part of x divided by y.
;; (rem x y) will give you the remainder of x divided by y.


(defn reverse-recursively [coll]
  (loop [r (rest coll)
         acc (conj () (first coll))]
    (if (= (count r) 0)
      acc
      (do
        (print acc)
        (recur (rest r) (conj acc (first r)))))))

(defn reverse-recursively [coll]
  (loop [[r & more :as all] (seq coll)
         acc '()]
    (if all
      (recur more (cons r acc))      
      acc)))


;;my solution
(defn callmyreverse [coll] (myreverse coll () (count coll)))

(defn myreverse [mylist x n]
  (if (= (count x) n)
    x (recur (rest mylist) (conj x (first mylist)) n))) 
  
;; Returns a lazy sequence of x, (f x), (f (f x)) etc. f must be free of side-effects
(take 5 (iterate inc 5))
(#(take % (map first (iterate (fn [[a b]] [b (+ a b)]) [1 1]))) 5)
  

(defn -main
  "I don't do a whole lot ... yet."
  [& args])
  
