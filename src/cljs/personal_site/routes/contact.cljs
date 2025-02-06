;; Contact Page
;; source by: Mr. Squally
;; ===========================================================================|
;; Namespace Declaration
(ns personal-site.routes.contact)

;; ===========================================================================|
;; Page Components

;; ===========================================================================|
;; Content Endpoints
(defn page-header []
  [:div
   [:h1 "Contact Me"]])

(defn page-content []
  [:div
   [:p "Under Construction"]
   [:ul
    [:li "Github"]
    [:li "Linkedin"]
    [:li "Email"]]])
