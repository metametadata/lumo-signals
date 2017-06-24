Demonstrates difference between signal handling in `Lumo` and `NodeJS`.

First install deps:

    yarn install

Run Lumo app:

    lumo app.cljs

or its NodeJS counterpart:

    node app.js

Apps will automatically quit after some timeout.
Until then you're able to send signals to them. E.g. in MacOS Terminal:

`Ctrl+C` -> `SIGINT`

`Ctrl+\` -> `SIGQUIT`

E.g.:

```
ᐅ lumo app.cljs
Hello
^\signal-exit: nil "SIGQUIT"
[1]    31667 quit       lumo app.cljs
```

To send `SIGTERM` app must be first started in background, e.g.:

```
ᐅ node app.js &
[1] 31300
Hello

ᐅ kill $!
signal-exit: null SIGTERM
[1]  + 31300 terminated  node app.js
```



