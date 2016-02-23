(ns kanban-api.core
  (:require [monger.core :as mongo]
            [monger.collection :as mc]
            [compojure.core :refer :all]
            [compojure.route :as route]))

(def conn (mongo/connect {:host (System/getenv "MONGO_PORT_27017_TCP_ADDR")}))
(def db (mongo/get-db conn "kanban"))

(defroutes app
  (GET "/" [] "<h1>Hello World</h1>")
  (route/not-found {:message "Route not found"}))



