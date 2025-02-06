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

(defn interests []
  [:div
   [:h3 "Interests"]
   [:ul
    [:li "Boxing"]
    [:li "Computer Science"]
    [:li "Linguistics"]
    [:li "Music"]
    [:li "Reading"]]])
;; ===========================================================================|
;; Content Endpoints
(defn page-header []
  [:h1 "About Me"])

(defn page-content []
  [:div
   [about-me]
   [interests]])
