(ns kanban-api.core
  (:require [kanban-api.routes.core :as routes]
            [kanban-api.db.core :as users]
            [ring.middleware.json :as middleware]
            [compojure.core :refer [defroutes]]))

(defroutes app-routes
  routes/routes)

(defroutes app
  (-> app-routes
      (middleware/wrap-json-body)
      (middleware/wrap-json-response)))
