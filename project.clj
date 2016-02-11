(defproject kanban-api "0.1.0-SNAPSHOT"
  :description "GraphQl api for https://github.com/mrarnoldpalmer/kanban"
  :url "https://github.com/mrarnoldpalmer/kanban-api"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [com.novemberain/monger "3.0.2"]]
  :main ^:skip-aot kanban-api.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
