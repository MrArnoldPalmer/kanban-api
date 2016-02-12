(ns kanban-api.core-test
  (:require [clojure.test :refer :all]
            [kanban-api.core :refer :all]
            [ring.mock.request :refer :all]))

(deftest routes
  (testing "root endpoint"
    (let [response (app (request :get "/"))]
      (is (= (:status response) 200))))
  (testing "bad endpoint"
    (let [response (app (request :get "/bad-endpoint"))]
      (is (= (:status response) 404))
      (is (= (:message response) "Route not found")))))
