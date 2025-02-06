;; About Page
;; source by: Mr. Squally
;; ===========================================================================|
;; Namespace Declaration
(ns personal-site.routes.about
  (:require [reagent.core :as r]))

;; ===========================================================================|
;; Page Components
(defn about-me []
  [:p {} "a burgeoning functional programmer"])
;; ===========================================================================|
;; Content Endpoints
(defn page-header []
  [:div
   [:h1 "About Squally"]])

(defn page-content []
  [:div
   [about-me]])
