# cljs-tdd
Leiningen template for cljs development ready for CI (phantomjs) and browser testing (devcards), based on terrific howto at:
https://8thlight.com/blog/eric-smith/2016/10/05/a-testable-clojurescript-setup.html

# Instalation
Until deployed to clojars, clone repository and install to local `~/.m2` by executing:
```
lein install
```

# Usage
## Creating new project
Create new app with lein, passing template name
```
lein new cljs-tdd [my-tdd-ready-app]
```

## Running phantomjs tests (headless, slower, for CI)
```
lein cljsbuild test
```

## Running tests in browser (quick, typical workflow)
```
lein figwheel devcards-test dev
```
