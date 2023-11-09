# Fortify + Scala + sbt

This example of how to enable or disable Fortify translation of
Scala code in an sbt build using a command line flag.

This is typically used for leaving the Fortify plugin disabled during
normal development, but enabling it when needed, such as in a special
CI job.

## How to use it

To compile your code with Fortify enabled:

```
sbt -DfortifyEnabled=true compile
```

If you run `sbt` without the extra flag, Fortify remains completely
disabled.

## How it works

The `fortify.sbt` file adds a new setting `fortifyEnabled` which controls
whether the compiler plugin is added to the compile-time classpath.

## Other example repos

The following small sample applications contains example security
vulnerabilities caught by Fortify:

* [akka-http-webgoat](https://github.com/akka/akka-http-webgoat/tree/fortify)
* [play-webgoat](https://github.com/playframework/play-webgoat/tree/fortify)

In both repos, the Fortify configuration files are on a `fortify` branch.

## Documentation

For full documentation on using the Fortify plugin for Scala, visit
https://developer.lightbend.com/docs/fortify/current/
