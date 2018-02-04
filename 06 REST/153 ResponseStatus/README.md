# Spring Professional Certification.

mvn clean install (This command triggers WAR packaging)

mvn tomcat7:run (This command runs embedded tomcat and deploy war file automatically)  

Open a web browser and execute http://localhost:8080/orders/600 (Not valid order)  
Open a web browser and execute http://localhost:8080/orders/500 (Valid order)

