(ns training-day)

(def fruit-prices
  {:apple 0.75,
   :orange 0.80,
   :pomegranate 2.50,
   :banana 0.50,
   :plum 1.20,
   :peach 1.00,
   :persimmon 1.75,
   :lime 0.60})


(def answer 42)

(def hai "O HAI!")

(defn square [x]
  ":(")

(defn average [a b]
  ":(")

(defn tally-item [prices line-item]
  (let [name (first line-item)
        number (second line-item)
        price (get prices name)]
    (* price number)
    )
  )

