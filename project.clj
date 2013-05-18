(defproject to-be-heard "0.1.0-SNAPSHOT"
  :description "To Be Heard: Rhyme a Word. Conversation Planning That Works."
  :url "http://tobeheard.net"
  :license {:name "CC BY-NC-SA 3.0"
            :url "http://creativecommons.org/licenses/by-nc-sa/3.0/"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [midje "1.5.1"]
                 [tailrecursion/javelin "1.0.0-SNAPSHOT"]
                 [org.clojure/google-closure-library-third-party "0.0-2029"]; domina needs this
                 [domina "1.0.0"]
                 [prismatic/dommy "0.1.1"]
                 [lobos "1.0.0-beta1"]
                 [korma "0.3.0-RC5"]
                 [prismatic/plumbing "0.1.0"]
                 [clj-webdriver "0.6.0"]
                 [clojure-opennlp "0.3.0"]]
  :plugins [[jonase/eastwood "0.0.2"]
            [lein-kibit "0.0.8"]
            [lein-difftest "2.0.0"]
            [lein-bikeshed "0.1.3"]
            [lein-midje "3.0.1"]
            [lein-cljsbuild "0.3.2"]]
  :hooks [leiningen.cljsbuild]
  :jar true
  :cljsbuild {
    :builds [{
        :source-paths ["src/cljs"]
        :compiler {
          :optimizations :whitespace
          :pretty-print true}}]})
