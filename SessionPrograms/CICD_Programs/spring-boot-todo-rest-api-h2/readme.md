# Todo and Hello World Rest APIs Connecting to H2 In memory database running on port 5000

Run com.bharath.learning.restfulwebservices.RestfulWebServicesApplication as a Java Application.


## Hello World Resource

- http://localhost:5000/hello-world

```txt
Hello World
```

- http://localhost:5000/hello-world-bean

```json
{"message":"Hello World - Changed"}
```

- http://localhost:5000/hello-world/path-variable/iambharath

```json
{"message":"Hello World, iambharath"}
```


## Todo Resource

- GET - http://localhost:5000/jpa/users/iambharath/todos

```
[
  {
    "id": 10001,
    "username": "iambharath",
    "description": "Learn JPA",
    "targetDate": "2019-06-27T06:30:30.696+0000",
    "done": false
  },
  {
    "id": 10002,
    "username": "iambharath",
    "description": "Learn Data JPA",
    "targetDate": "2019-06-27T06:30:30.700+0000",
    "done": false
  },
  {
    "id": 10003,
    "username": "iambharath",
    "description": "Learn Microservices",
    "targetDate": "2019-06-27T06:30:30.701+0000",
    "done": false
  }
]
```

#### Retrieve a specific todo

- GET - http://localhost:5000/jpa/users/iambharath/todos/10001

```
{
  "id": 10001,
  "username": "iambharath",
  "description": "Learn JPA",
  "targetDate": "2019-06-27T06:30:30.696+0000",
  "done": false
}
```

#### Creating a new todo



- POST to http://localhost:5000/jpa/users/iambharath/todos with BODY of Request given below

```
{
  "username": "iambharath",
  "description": "Learn to Drive a Car",
  "targetDate": "2030-11-09T10:49:23.566+0000",
  "done": false
}
```

#### Updating an existing todo

- PUT Request to http://localhost:5000/jpa/users/iambharath/todos/10001 with BODY of Request given below

```
{
  "id": 10001,
  "username": "iambharath",
  "description": "Learn to Drive a Car",
  "targetDate": "2045-11-09T10:49:23.566+0000",
  "done": false
}
```

#### Delete todo

- DELETE to http://localhost:5000/jpa/users/iambharath/todos/10001


## H2 Console

- http://localhost:5000/h2-console
- Use `jdbc:h2:mem:testdb` as JDBC URL 


## Build Spec for AWS Code Pipeline
```
version: 0.2
            
phases:
  install:
    runtime-versions:
      java: openjdk8
    commands:
      - echo install
  pre_build:
    commands:
      - echo pre_build
  build:
    commands:
      - mvn package
      - echo build
  post_build:
    commands:
      - echo post_build

artifacts:
  files:
    - target/spring-boot-todo-rest-api-h2-aws-codepipeline-0.0.1-SNAPSHOT.jar
```