(ns kanban-api.db.core
  (:require [monger.core :as mongo]
            [monger.collection :as mc])
  (:import org.bson.types.ObjectId))

(def conn (mongo/connect {:host (System/getenv "MONGO_PORT_27017_TCP_ADDR")}))
(def db (mongo/get-db conn "kanban"))

(defn create-user
  "Returns a clojure map representing a user data model for database operations"
  [first-name last-name user-name]
  {:first-name first-name
   :last-name last-name
   :user-name user-name})
