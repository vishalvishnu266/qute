#!/usr/bin/zsh
for i in {1..100}
do
  curl localhost:9000/hello
done
