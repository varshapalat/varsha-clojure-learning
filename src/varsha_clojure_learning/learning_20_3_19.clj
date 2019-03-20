(ns varsha-clojure-learning.learning_20_3_19
  (:require [varsha-clojure-learning.data.planets :as data]))

;- volume of a planet
(defn volume [{:keys [radius]}]
  (* 4/3 Math/PI (Math/pow radius 3)))

(volume (first data/target-planets))

;- difference of volumes between earth and mars
(def mercury (nth data/target-planets 0))
(def earth (nth data/target-planets 2))
(def mars (nth data/target-planets 3))

(defn diff-volume [planet1 planet2]
  (- (volume planet1) (volume planet2)))

(diff-volume earth mars)

;- difference in average surface temperature between two planets
(defn avg-surface-temp [{:keys [surface-temp-deg-c]}]
  (/ (+ (:low surface-temp-deg-c) (:high surface-temp-deg-c)) 2))

(defn diff-avg-surface-temp [planet1 planet2]
  (- (avg-surface-temp planet1) (avg-surface-temp planet2)))

(diff-avg-surface-temp earth mars)
(avg-surface-temp mars)

;- sub-zero-planet?
(defn sub-zero-planet? [planet]
  (if (< (avg-surface-temp planet) 0) "yes" "no"))

(sub-zero-planet? earth)
(sub-zero-planet? mercury)

;heavier-planet
(defn weight [planet]
  (:mass planet))
(weight earth)
(defn heavier-planet [planet1 planet2]
  (if (> (weight planet1) (weight planet2)) (:pname planet1) (:pname planet2))
  )
(heavier-planet earth mercury)

;weight-of-person-in-planet
(defn get-mass [weight-on-earth]
  (/ weight-on-earth (:gravity earth)))

(def my-weight 50)
(get-mass my-weight)

(defn weight-of-person-in-planet [mass {:keys [gravity]}]
  (* mass gravity))

(weight-of-person-in-planet (get-mass my-weight) mars)



