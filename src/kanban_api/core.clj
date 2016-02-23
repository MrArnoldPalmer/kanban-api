(ns kanban-api.core
  (:require [korma.db :as korma]
            [compojure.core :refer :all]
            [compojure.route :as route]))

(korma/defdb db (korma/postgres {:db "postgres"
                     :user (System/getenv "POSTGRES_USER")
                     :password (System/getenv "POSTGRES_PASSWORD")}))
(defroutes app
  (GET "/" [] "<h1>Hello World</h1>")
  (route/not-found {:message "Route not found"}))



