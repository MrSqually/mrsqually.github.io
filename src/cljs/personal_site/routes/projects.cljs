;; Projects Page
;; source by: Mr. Squally
;; ===========================================================================|
;; Namespace Declaration
(ns personal-site.routes.projects)

;; ===========================================================================|
;; Page Components
(defn category [title body img path]
  [:div
   [:span.category
    [:img {:src img :align "left" :width 100 :height 100}]
    [:a {:href path} [:h3 title]]
    [:p body]]
   [:hr]])

(defn gamedev []
  (category
   "Gamedev"
   "Projects involving video-game development."
   "images/projects/categories/gamedev.png"
   "projects/gamedev"))

(defn software []
  (category
   "Software Dev"
   "Projects involving computer science & software engineering"
   "images/projects/categories/software.png"
   "projects/software"))

(defn music []
  (category
   "Music"
   "Musical Projects, Bands, etc."
   "images/projects/categories/music.png"
   "projects/music"))

;; ===========================================================================|
;; Content Endpoints
(defn page-header []
  [:div
   [:h2 "Projects"]])

(defn page-content []
  [:div
   [gamedev]
   [software]
   [music]])
