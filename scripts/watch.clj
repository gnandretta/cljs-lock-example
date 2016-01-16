(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'cljs-lock-example.core
   :output-to "out/cljs_lock_example.js"
   :output-dir "out"})
