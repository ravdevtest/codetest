Coded accordingly to: https://github.com/unravelin/code-test

In FRONTEND directory there is only modified index.html file (added angular.js code responsible for the frontend part). I have been launching it using python SimpleHTTPServer, e.g.

```
python -m SimpleHTTPServer 8000
```

In BACKEND directory there is Java Spring boot application, that can be run using maven:

```
mvn spring-boot:run
```

The backend project also includes JUnit tests.

