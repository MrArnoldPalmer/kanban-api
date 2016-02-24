(ns kanban-api.routes.users
  (:require [compojure.core :refer [GET POST defroutes]]
            [kanban-api.db.core :refer [db]]
            [monger.collection :as mc])
  (:import org.bson.types.ObjectId))

(defroutes routes
  (GET "/users" [] (mc/find-maps db "users"))
  (GET "/users/:id" [id] (mc/find-one-as-map db "users" (ObjectId. id)))
  (POST "/users" {body :body} (println "POST to users")))
