(ns kanban-api.routes.core
  (:require [compojure.core :refer [GET defroutes]]
            [compojure.route :as route]
            [kanban-api.routes.users  :as users]))

(defroutes routes
  users/routes
  (GET "/" [] "<h1>Hello World</h1>")
  (route/not-found {:message "Route not found"}))
