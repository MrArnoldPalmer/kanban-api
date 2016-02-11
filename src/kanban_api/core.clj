(ns kanban-api.core
  (:require [monger.core :as mongo]
            [monger.collection :as mc]))

(def conn (mongo/connect {:host (System/getenv "MONGO_PORT_27017_TCP_ADDR")}))
(def db (mongo/get-db conn "kanban"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (mc/insert db "documents" { :_id "test" :first_name "John" :last_name "Lennon" })
  (println (mc/find-maps db "documents"))
  (println "Hello, World!"))





