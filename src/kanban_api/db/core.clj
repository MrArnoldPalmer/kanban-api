(ns kanban-api.db.core
  (:require [monger.core :as mongo]
            [monger.collection :as mc])
  (:import org.bson.types.ObjectId))

(def conn (mongo/connect {:host (System/getenv "MONGO_PORT_27017_TCP_ADDR")}))
(def db (mongo/get-db conn "kanban"))

