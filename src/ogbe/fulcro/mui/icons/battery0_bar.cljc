(ns ogbe.fulcro.mui.icons.battery0-bar
  #?(:cljs (:require
            ["@mui/icons-material/Battery0Bar" :default Battery0Bar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery0-bar
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Battery0Bar)))