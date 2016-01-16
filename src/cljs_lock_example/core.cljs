(ns cljs-lock-example.core
  (:require [clojure.browser.repl :as repl]
            cljsjs.auth0-lock))

;; (defonce conn
;;   (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)

(println "Hello world!")

(def cid "yKJO1ckwuY1X8gPEhTRfhJXyObfiLxih")
(def domain "mdocs.auth0.com")
(def lock (js/Auth0Lock. cid domain))
(.show lock)
