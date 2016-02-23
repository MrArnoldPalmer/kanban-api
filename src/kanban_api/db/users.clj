(ns kanban-api.db.users
  (:require [monger.core :as mg]
            [monger.collection :as mc]))

(defn create-user
  "Returns a clojure map representing a user data model for database operations"
  [first-name last-name user-name]
  {:first-name first-name
   :last-name last-name
   :user-name user-name})
