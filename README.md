<h1 align="center"><a href="https://github.com/balaji-singh/Spring-Boot" target="_blank">Spring Boot Practices</a></h1>

<p align="center">
  <a href="https://travis-ci.com/balaji-singh/Spring-Boot"><img alt="Travis-CI" src="https://travis-ci.com/balaji-singh/Spring-Boot.svg?branch=master"/></a>
  <a href="https://masterjavaonline.com"><img alt="author" src="https://img.shields.io/badge/author-Bala.S.Singh-blue.svg"/></a>
  <a href="https://www.oracle.com/technetwork/java/javase/downloads/index.html"><img alt="JDK" src="https://img.shields.io/badge/JDK-1.8.0_162-orange.svg"/></a>
  <a href="https://docs.spring.io/spring-boot/docs/2.1.7.RELEASE/reference/html/"><img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-2.1.7.RELEASE-brightgreen.svg"/></a>
</p>

<p align="center">
  <a href="https://github.com/balaji-singh/Spring-Boot/stargazers"><img alt="star" src="https://img.shields.io/github/stars/balaji-singh/Spring-Boot.svg?label=Stars&style=social"/></a>
  <a href="https://github.com/balaji-singh/Spring-Boot/network/members"><img alt="star" src="https://img.shields.io/github/forks/balaji-singh/Spring-Boot.svg?label=Fork&style=social"/></a>
  <a href="https://github.com/balaji-singh/Spring-Boot/watchers"><img alt="star" src="https://img.shields.io/github/watchers/balaji-singh/Spring-Boot.svg?label=Watch&style=social"/></a>
</p>

## Introduction

`Spring Boot Practices ` is a project for learning and practicing `spring boot`, including 7 demos, and more have to do.

This project has integrated actuator (`monitoring`),  JPA (`powerful ORM framework `),swagger (`API interface management and tests`), GraphQL (`Graph Query Language`).

## Branch Introduction

- branch master: Based on Spring Boot version `2.1.0.RELEASE`. Every module's parent dependency is the pom.xml at root directory in convenience of managing common dependencies and learning spring boot.

## Environment

- **JDK 1.8 +**
- **Maven 3.5 +**
- **IntelliJ IDEA Community Edition 2019.2 +** (*Note: Please use IDEA and make sure plugin `lombok` installed.*)
- **Mysql 5.7 +** (*Please use version 5.7 or higher because mysql has some new features and is not backward compatible at version 5.7. Althought this project will try to avoid this incompatibility*)
- **H2**
- **Hsql DB**

## Getting Started

1. `git clone https://github.com/balaji-singh/Spring-Boot`
2. Open the cloned project in IDEA
3. Import the `pom.xml` file from the root directory using `Maven Projects` panel
4. If you can not find `Maven Projects` panel, try to tick `View -> Tool Buttons` on and the `Maven Projects` panel will appear on the right side of IDEA.
5. Find each Application class to run each module.
6. **`Note: Each demo has a detailed README file. Remember to check it before running the demo~`**
7. **`Note: In some condition you have to execute sql to prepare data before running demo, don't forget it~`**

## Stargazers over time

[![Stargazers over time](https://starchart.cc/balaji-singh/spring-boot.svg)](https://starchart.cc/balaji-singh/spring-boot)
## Introduction of each Module

| Module Name                                                  | Module Description                                           |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| [springboot-demo](./springboot-demo) | a helloworld demo.                                           |
| [springboot-first-microservice](./springboot-first-microservice) | a demo to crate first microservice by using spring boot.           |
| [springboot-graphql-gui-annotations](./springboot-graphql-gui-annotations)     | a demo to use annotations with GraphQL and spring-boot. |
| [springboot-graphql](./springboot-graphql) | a demo to  integrate spring-boot with GraphQL |
| [springboot-jpa-rest-demo](./springboot-jpa-rest-demo) | a JPA demo to  integrate spring-boot with DB |
| [springboot-mvc-chatapp](./springboot-mvc-chatapp)       | TODO.                 |


