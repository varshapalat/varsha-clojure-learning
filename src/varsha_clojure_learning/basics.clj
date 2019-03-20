(ns varsha_clojure_learning.basics)

(+ 1 2)

(+ 1 2 3)

(* 5 (+ 1 2 3))

(* 2 5 (+ 1 2 3))

(- (* 2 5 (+ 1 2 3)) 18)

; define as radius
(def my-radius (- (* 2 5 (+ 1 2 3)) 18))

;- check if radius is even
(even? my-radius)

;- is radius < 64, and is radius >= 42?
(<= 42 my-radius 64)

;- get circumference, get area, get diameter
(defn circumference [radius]
  (* 2 Math/PI radius))

(circumference my-radius)

(defn area [radius]
  (* Math/PI (Math/pow radius 2)))

(area my-radius)

(defn diameter [radius]
  (* 2 radius))

(diameter my-radius)

;- if 2 nos are equal, :yes else no
(defn are-equal? [x y]
  (if (= x y) "yes" "no"))

(are-equal? 2 52)
(are-equal? 2 2)

;- if pos, return sqrt, else return self
(defn sqrt-or-self [x]
  (if (pos? x) (Math/sqrt x) x))

(sqrt-or-self 25)
(sqrt-or-self -2)

;- if char is vowel or consonant
(def vowels
  #{\a \e \i \o \u})

(defn is-vowel? [x]
  (if (contains? vowels x) "yes" "no"))

(is-vowel? \a)
(is-vowel? \p)

;- profit or loss, given revenue expenditure (edited)
(defn profit-or-loss [revenue expenditure]
  (if (< revenue expenditure) :loss :profit))

(profit-or-loss 450 90)