# Url Mapping Issue
Example of the UrlMappings issue in Grails 2.4.5+

# Grails 2.4.4
Running this in Grails 2.4.4 and navigating to [http://localhost:8080/urlApp/test/index] produces
```
http://localhost:8080/urlApp/books/1
```


# Grails 2.4.5+
Running this in Grails 2.4.5+ and navigating to [http://localhost:8080/urlApp/test/index] produces
```
http://localhost:8080/urlApp/books?id=1
```
