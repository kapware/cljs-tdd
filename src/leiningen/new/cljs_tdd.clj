(ns leiningen.new.cljs-tdd
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "cljs-tdd"))

(defn cljs-tdd
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data ["src/{{sanitized}}/core.cljs" (render "src/clojurescript_tdd_application/core.cljs" data)]
["test/runners/browser.cljs" (render "test/runners/browser.cljs" data)]
["test/{{sanitized}}/core_test.cljs" (render "test/clojurescript_tdd_application/core_test.cljs" data)]
["test/runners/doo.cljs" (render "test/runners/doo.cljs" data)]
["test/runners/tests.cljs" (render "test/runners/tests.cljs" data)]
["project.clj" (render "project.clj" data)]
["resources/public/index.html" (render "resources/public/index.html")]
["resources/public/tests.html" (render "resources/public/tests.html")]
)))