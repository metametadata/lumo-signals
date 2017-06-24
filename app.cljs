#!/usr/bin/env lumo
(ns core.app)

(.log js/console "Hello")

(def on-exit (js/require "signal-exit"))
(on-exit (fn [code signal]
             (.log js/console "signal-exit:" (pr-str code) (pr-str signal))))

#_(.once js/process "SIGINT" (fn [_code]
                                 (.log js/console "SIGINT received")))

#_(.once js/process "SIGTERM" (fn [_code]
                                  (.log js/console "SIGTERM received")))

(js/setTimeout #(.log js/console "Bye")
               30000)