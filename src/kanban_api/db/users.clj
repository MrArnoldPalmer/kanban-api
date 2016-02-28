(ns kanban-api.db.users
  (:require [schema.core :as schema]
            [monger.core :as mg]
            [monger.collection :as mc]))

(def User
  "Schema for User collection in db"
  {:first-name schema/Str
   :last-name schema/Str})
;(defn create-user
;  "Returns a clojure map representing a user data model for database operations"
;  [first-name last-name user-name]
;  {:first-name first-name
;   :last-name last-name
;   :user-name user-name})
