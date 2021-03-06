(defproject mori "0.2.2-SNAPSHOT"
  :description "Persistent Data Structures for JavaScript"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1835"]]
  :plugins [[lein-cljsbuild "0.3.2"]]
  :cljsbuild
  {:builds
    [{:source-paths ["src"],
      :id "dev",
      :compiler
      {:output-to "mori.dev.js",
       :optimizations :simple
       :pretty-print true}}
     {:source-paths ["src"],
      :id "release",
      :compiler
      {:output-to "mori.bare.js",
       :optimizations :advanced
       :pretty-print false}}]})
