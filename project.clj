(defproject csvlib "0.3.0"

  :description "A CSV library for Clojure, using csvreader.com"

  :url "https://bitbucket.org/tebeka/csvlib/src"

  :min-lein-version "2.0.0"

  :repositories      {"project" "file:repo"}

  :resource-paths    ["src/resources"]

  :jvm-opts          ["-Xmx1024m"]

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [local/javacsv "2.0"]]

  :main csvlib.core

  :global-vars {*warn-on-reflection* true
                *assert* false}

  )

                 ;[com.csvreader/javacsv "2.0"]
