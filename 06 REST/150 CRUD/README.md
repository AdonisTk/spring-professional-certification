1) Build the project:  

mvn clean install

2) Create database and table MySQL:

CREATE SCHEMA `people` DEFAULT CHARACTER SET utf8;

USE people;

CREATE TABLE `person` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `country` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

3) Deploy the file crud.war in a Servlet Container (Tomcat / Jetty)

4) Deployed application:

http://localhost:8080/crud/persons