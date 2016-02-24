(ns kanban-api.routes.core-test
  (:require [clojure.test :refer :all]
            [kanban-api.routes.core :refer :all]
            [ring.mock.request :refer :all]))

(deftest routes-core
  (testing "bad endpoint"
    (let [response (routes (request :get "/bad-endpoint"))]
      (is (= (:status response) 404))
      (is (= (:message response) "Route not found")))))
