console.log("Hello");

const on_exit = require('signal-exit');

on_exit(function (code, signal) {console.log("signal-exit:", code, signal);});

//process.once('SIGINT', function (code) {
//    console.log('SIGINT received');
//  });

//process.once('SIGTERM', function (code) {
//  console.log('SIGTERM received');
//});

setTimeout(function () {console.log("Bye");}, 30000);
