# jmh-benchmarks-personal
A collection of short JMH benchmarks for quick performance measurements.
To compile and run all the benchmarks simply build and run:
```
mvn clean install
java -jar target/benchmarks.jar
```
# About the Maven project
The benchmarks are based off the `jmh-java-benchmark-archetype` and are created using the following Maven command:
```
mvn archetype:generate -DinteractiveMode=false -DarchetypeGroupId=org.openjdk.jmh -DarchetypeArtifactId=jmh-java-benchmark-archetype -DgroupId=org.openj9 -DartifactId=indexof-jmh -Dversion=1.0
```
