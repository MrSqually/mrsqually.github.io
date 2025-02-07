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
   [:h2 {:style {:color "red"}}
    "Welcome to the Homepage :^)"]])

(defn page-content []
  [:div])
