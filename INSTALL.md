
1. Unzip the archive in resources/javacsv2.1.zip

1. Local install to maven repository e.g.

```sh
$user> mvn install:install-file -Durl=file:repo -DgroupId=local\
                                -DartifactId=javacsv -Dversion=2.0\
                                -Dpackaging=jar -Dfile=javacsv.jar
```

The leiningen project file already contains the references, I just didn't want
to upload it to Clojars or anything as I'm trying this out to compare results
with other libraries and performance on a 14MB csv I have somewhere.

License
Copyright (C) 2010 Miki Tebeka <miki.tebeka@gmail.com>
Distributed under the Eclipse Public License, the same as Clojure.
