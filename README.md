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

If it worked, you should see output like:

```
scala-fortify ... licensed to ...@lightbend (expires: ...)
scala-fortify: writing translated files to .../.fortify/sca.../build/sample
```

If you run `sbt` without the extra flag, Fortify remains completely
disabled.

## How it works

The `fortify.sbt` file adds a new sbt setting `fortifyEnabled` which
looks at a Java system property of the same name to decide whether to
add the plugin to the classpath and control it using compiler options.

## Other sample repos

The following small sample applications contains example security
vulnerabilities caught by Fortify:

* [akka-http-webgoat](https://github.com/akka/akka-http-webgoat/tree/fortify)
* [play-webgoat](https://github.com/playframework/play-webgoat/tree/fortify)

In both repos, the Fortify configuration files are on a `fortify` branch.

## Documentation

For full documentation on using the Fortify plugin for Scala, visit
https://developer.lightbend.com/docs/fortify/current/
