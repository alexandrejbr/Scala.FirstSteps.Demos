In this case, sbt works purely by convention. sbt will find the following automatically:

- Sources in the base directory
- Sources in src/main/scala or src/main/java
- Tests in src/test/scala or src/test/java
- Data files in src/main/resources or src/test/resources
- jars in lib

By default, sbt will build projects with the same version of Scala used to run sbt itself.