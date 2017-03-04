(defproject morse/lein-template "0.1.1"
  :description "Lein template to generate Morse project"
  :url "https://github.com/Otann/morse"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :eval-in-leiningen true

  ;; Artifact deployment info
  :scm {:name "git"
        :url "https://github.com/otann/morse"}

  :pom-addition [:developers [:developer
                              [:name "Anton Chebotaev"]
                              [:url "http://otann.com"]
                              [:email "anton.chebotaev@gmail.com"]
                              [:timezone "+1"]]])
