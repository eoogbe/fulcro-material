(ns ogbe.fulcro.mui.icons.sports-outlined
  #?(:cljs (:require
            ["@mui/icons-material/SportsOutlined" :default SportsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sports-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SportsOutlined)))