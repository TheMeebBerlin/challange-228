(ns challenge-228.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hellooooooo, World!"))

(def my-words ["billowy" "biopsy" "chinos" "defaced" "chintz" "sponged" "bijoux" "abhors" "fiddle" "begins" "chimps" "wronged"])

(defn char-compare
  [char-one char-two]
    (<= (int char-one) (int char-two))
  )

(defn is-orderly
  [my-word]
    (every? true?
      (map char-compare my-word (rest my-word))))


(defn print-list
  [my-list]
    (doseq
      [a my-list]
      (println (str a " " (if (is-orderly a)
        "IN ORDER"
        "NOT IN ORDER" )))))
