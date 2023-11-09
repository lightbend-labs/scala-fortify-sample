# Fortify scanner with command line toggle example 

This project shows and example of how to setup Fortify scanning based on a
command line flag.

To compile and scan with Fortify use:

```
sbt -DfortifyEnabled=true
```

To run sbt without enabling Fortify, ie with Fortify completely disabled, you
can either run sbt as usual with 

```
sbt
```

or if you want to be very explicit about it

```
sbt -DfortifyEnabled=false
```

## How does it work

The `lightbend.sbt` file adds a new setting `fortifyEnabled` which controls
whether the compiler plugin is added into the compilation of the configuration.
