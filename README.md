# HeartBeat
Pet Project to keep self updated with latest and almost all technologies targeting Full Stack AI Expert  


Set Up.
1. switch to config service dir
2. run command "mvn clean install" to create jar of config service.
3. run command "java -jar <jar path>"
4. Access url "http://localhost:8888/eureka-service/dev" to check configuration of eureka service in config store at github
5. switch to eureka service dir
6. run command "mvn clean install" to create jar of eureka service.
7. run command "java -jar <jar path>"
8. Access url "http://localhost:8889" to check eureka is up & config service is registered.
9. switch to gateway service dir
10. run command "mvn clean install" to create jar of gateway service.
11. run command "java -jar <jar path>"
12. Access url "http://localhost:8889" to check gateway service is registered.
13. switch to auth service dir
14. make sure rename resource file data.txt to data.sql.
15. run command "mvn clean install" to create jar of auth service.
16. install mysql and set password as "password" for user "root"
17. run command "java -jar <jar path>"
18. Access url "http://localhost:8889" to check auth service is registered.
19. switch to onboarding service dir
20. run command "mvn clean install" to create jar of onboarding service.
21. run command "java -jar <jar path>"
22. Access url "http://localhost:8889" to check onboarding service is registered.
23. switch to search service dir
24. run command "mvn clean install" to create jar of search service.
25. run command "java -jar <jar path>"
26. Access url "http://localhost:8889" to check search service is registered.


Access application:
1. generate basic authentication for user "mobile" , password "pin" from url https://www.blitter.se/utils/basic-authentication-header-generator/
2. use above generated basic token to get bearer access token from url "http://localhost:9180/oauth/oauth/token"
    verify from attached images
3. use this token to access the application for url "http://localhost:9180/search/profile/default"  or "http://localhost:9180/onboarding/greet/formal/search"
 verify from attached images.