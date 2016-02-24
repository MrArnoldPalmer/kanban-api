(ns kanban-api.routes.users-test
  (:require [clojure.test :refer :all]
            [kanban-api.routes.users :refer :all]
            [ring.mock.request :refer :all]))

(deftest users-route
  (testing "GET /users"
    (let [response (routes (request :get "/users"))]
      (is (= (:status response) 200)))))
