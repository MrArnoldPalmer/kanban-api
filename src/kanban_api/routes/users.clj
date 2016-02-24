(ns kanban-api.routes.users
  (:require [compojure.core :refer [GET POST defroutes]]
            [kanban-api.db.core :refer [db]]
            [monger.collection :as mc]))

(defroutes routes
  (GET "/users" [] (mc/find-maps db "users"))
  (POST "/users" {body :body} (println "POST to users")))
