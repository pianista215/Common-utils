# Changelog

## 0.9.0 (upcoming)

* Pending changelog

## 0.8.0 (January 30, 2017)

* Update Zookeeper repository management

## 0.7.0 (October 2016)

* Upgrade typesafe config to 1.3.0
* Upgrade akka to 2.4.9
* Upgrade json4s to 3.4.0
* Upgrade spark to 1.6.2
* Remove scala 2.10
* Upgrade curator to 3.2.0

## 0.6.0 (July 2016)

* Added coveralls badge
* Added compatibility for invoking Future.sequence for Options in Scala [(SI-9694)](https://issues.scala-lang
.org/browse/SI-9694)

## 0.5.0 (March 2016)

* Enabled Scala cross builds for Scala 2.10 and Scala 2.11.
* Added functional extensions library with State(full|less) iterators and reflect type support.
* Added Cancellable abstraction whereby it is possible to build cancellable-like futures.
* Provide a fancy DSL (so an easy way) to determine type equality in Scala.
* Updated akka and Json4s versions.

## 0.4.3 (Febrary 2016)

* Added functional features to support iterators over next and has next pattern.
* Bug corrected in Dao Generic with Formats.

## 0.4.2 (Febrary 2016)

* Getnodes added in Zookeeper repository.
* Bug corrected in Zookeeper repository and try encapsulation.

## 0.4.1 (January 2016)

* Bug in the serializer of Json4s.

## 0.4.0 (January 2016)

* Entity listener for Zookeeper.
* Upsert funtion in Repository
* MapConfig Component for Map of properties.
* Typesafe Component refactor.
* More generic DAO Component with manifest type.


## 0.3.0 (January 2016)

* Generic DAO for Zookeeper.
* Curator Factory with pull of Connections.
* Bugs corrected in Typesafe Component.
* Integration test added for Zookeeper.


## 0.2.0 (January 2016)

* Corrected bug in Zookeeper Repository Component.


## 0.1.0 (January 2016)

* Spark Logger Component.
* SLF4J Logger Component.
* Zookeeper Repository Component.
* TypeSafe Configuration Component.
