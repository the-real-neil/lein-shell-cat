(defproject lein-shell-cat "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main lein-shell-cat.core
  :plugins [[lein-shell "0.3.0"]]
  :prep-tasks [["shell" "echo" "Hello, lein-shell"] "javac" "compile"]
  )
