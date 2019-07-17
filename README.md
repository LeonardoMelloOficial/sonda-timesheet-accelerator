Sonda Timesheet Accelerator 
===

Application built to accelerate the time recording process of Sonda employees.

It consists of providing one endpoint where employees inform their userId/password and the system do the time registry.  


## Technology stack

- [Gradle](https://gradle.org)
- [Spring Boot](https://spring.io/projects/spring-boot) 
- [Selenium](https://www.seleniumhq.org/)
- [Chrome Web Driver](http://chromedriver.chromium.org/getting-started)
- [Swagger](https://swagger.io)
- [Heroku](https://www.heroku.com/)

## Running

There is an instance running on https://sonda-timesheet-accelerator.herokuapp.com

You can use the Swagger api tester or even add an issue event on https://github.com/LeonardoMelloOficial/octoevents/issues and after call: 
```http request
[GET] https://octo-events-javalin.herokuapp.com/issues/:number/events
```

## Running local

To a complete test you will need to provide a public URL that routes to your local endpoint, so, the use of [ngrok](https://ngrok.com/) is recommended. 

The database H2 will be instantiated in memory on start up. 

```bash
$ git clone https://github.com/LeonardoMelloOficial/octoevents.git

$ cd octoevents

# gradlew.bat run (on Windows)
$ ./gradlew run
```

Checkout it running [here](http://localhost:7000)
```
http://localhost:7000
```

After configuring ngrok the app will listen on a public address and now you can configure the github webhooks with the register endpoint:
```
e.g. https://f7b985c1.ngrok.io/issue-events
```

## Running tests

```bash
$ ./gradlew test
```

## Features

**Github Issue Events register**

```http request
[POST] /issue-events
```

**Issue Events**

```http request
[GET] /issues/:number/events
```

## Going further

Checkout the project continuous inspection of code quality [here](https://sonarcloud.io/dashboard?id=octoevents) 

## Author

* **Leonardo Mello** - [LeonardoMelloOficial](https://github.com/LeonardoMelloOficial)
