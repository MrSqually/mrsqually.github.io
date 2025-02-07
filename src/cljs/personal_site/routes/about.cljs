;; About Page
;; source by: Mr. Squally
;; ===========================================================================|
;; Namespace Declaration
(ns personal-site.routes.about
  (:require [reagent.core :as r]))

;; ===========================================================================|
;; Page Components
(defn about-me []
  [:div
   [:p "Howdy, folks. This is a general list of the stuff I'm interested in, both from a work and personal standpoint."]
   [:h4 "Professional Interests:"]
   [:ul
    [:li "Computer Science"
     [:ul
      [:li "DevOps"]
      [:li "Functional Programming"]
      [:li "Graphs & Dynamic Parsing"]
      [:li "Meta-programming & Lisp(s)"]]]
    [:li "Linguistics"
     [:ul
      [:li "Systemic Functional Linguistics"]
      [:li "Head-Driven Phrase Structure Grammar"]]]
    [:li "Machine Learning"
     [:ul
      [:li "Embedding Spaces"]
      [:li "Knowledge Graphs & Question-Answering Systems"]
      [:li "Language Model Epistemologies & Semantic Drift"]]]]
   [:h4 "Personal Interests:"]
   [:ul
    [:li "Boxing"]
    [:li "Cooking"]
    [:li "Music"]]])

;; ===========================================================================|
;; Content Endpoints
(defn page-header []
  [:h2 "About Me"])

(defn page-content []
  [:div
   [about-me]])
