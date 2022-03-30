# Sample Spring Boot Microservices

It's a simple microservice repo to show how we use microservices via Netflix Eureka.

Contains 3 projects:
 - **eureka-server** = Naming eureka server, run this first.
 - **currency-service** = Eureka client, exchange currencies.
 - **convertor-service** = Eureka client, gets currency-service instance and converts to UI format (for now it prints the data only).

<br/>

After you run eureka server and clients:
1. Call the ``/testdata`` endpoint of currency-service, it will add one sample row to DB.
2. After that call the ``/data`` endpoint of the convertor-service, and you will see the testdata which you added in currency-service.

You can also call the ``/exchange/usd/try`` endpoint of the currency-service to see it from currency-service side.