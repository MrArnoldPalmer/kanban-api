(ns kanban-api.core
  (:require [kanban-api.routes.core :as routes]
            [kanban-api.db.core :as users]
            [compojure.core :refer [defroutes]]))

(defroutes app-routes
  routes/routes)


