(defproject kanban-api "0.1.0-SNAPSHOT"
  :description "GraphQl api for https://github.com/mrarnoldpalmer/kanban"
  :url "https://github.com/mrarnoldpalmer/kanban-api"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [ring/ring-core "1.4.0"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [ring/ring-json "0.4.0"]
                 [compojure "1.4.0"]
                 [korma "0.4.0"]
                 [org.postgresql/postgresql "9.4-1206-jdbc42"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler kanban-api.core/app}
  :main ^:skip-aot kanban-api.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :plugins [[cider/cider-nrepl "0.10.2"]]
             :dev {:dependencies [[ring/ring-mock "0.3.0"]]}})
