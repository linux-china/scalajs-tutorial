build:
  sbt fastOptJS

build-optimized:
  sbt fullOptJS

run:
  sbt run

node-run: build
  node target/scala-2.13/scala-js-tutorial-fastopt.js

setup:
  npm install jsdom