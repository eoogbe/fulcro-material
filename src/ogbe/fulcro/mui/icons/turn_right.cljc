(ns ogbe.fulcro.mui.icons.turn-right
  #?(:cljs (:require
            ["@mui/icons-material/TurnRight" :default TurnRight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-turn-right
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TurnRight)))