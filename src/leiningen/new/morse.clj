(ns leiningen.new.morse
  (:require [leiningen.new.templates :as t]
            [leiningen.core.main :as main]))

(def render (t/renderer "morse"))

(defn morse
  "FIXME: write documentation"
  [name]
  (let [main-ns (t/multi-segment (t/sanitize-ns name))
        data {:raw-name name
              :name (t/project-name name)
              :namespace main-ns
              :nested-dirs (t/name-to-path main-ns)
              :year (t/year)
              :date (t/date)}]
    (main/info "Generating fresh 'lein new' morse project.")
    (t/->files data
      ["project.clj" (render "project.clj" data)]
      ["README.md" (render "README.md" data)]
      [".gitignore" (render "gitignore" data)]
      [".hgignore" (render "hgignore" data)]
      ["src/{{nested-dirs}}.clj" (render "core.clj" data)]
      ["test/{{nested-dirs}}_test.clj" (render "test.clj" data)]
      ["LICENSE" (render "LICENSE" data)]
      ["CHANGELOG.md" (render "CHANGELOG.md" data)]
      "resources")))
