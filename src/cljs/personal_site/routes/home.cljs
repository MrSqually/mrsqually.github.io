;; About Page
;; source by: Mr. Squally
;; ===========================================================================|
;; Namespace Declaration
(ns personal-site.routes.home)

;; ===========================================================================|
;; Page Components

;; ===========================================================================|
;; Content Endpoints
(defn page-header []
  [:div
   [:h1 "Mr. Squally"]])

(defn page-content []
  [:div {:style {:color "red"}}
   [:p "Welcome to the Homepage"]])
