
# Teach Stack #
Spring Boot , PostGres


# Features
* Its a Q-A app
* User can ask questions
* User can give answers
* User can add comments
* User can follow other users
* User can unfollow other users
* User can see what their friends are posting
* User can see latest questions aske
* Users can see the answers given to their questions

# Implementation
* JWT authentication to secure the endpoints
* Spring Security
* Rest Api

# Structure
```
└───Discuss
    ├───.mvn
    │   └───wrapper
    ├───src
    │   ├───main
    │   │   ├───java
    │   │   │   └───com
    │   │   │       └───example
    │   │   │           └───Discuss
    │   │   │               ├───config
    │   │   │               ├───Controller
    │   │   │               ├───dto
    │   │   │               ├───Exceptions
    │   │   │               ├───helper
    │   │   │               ├───models
    │   │   │               ├───repo
    │   │   │               ├───security
    │   │   │               └───service
    │   │   └───resources
    │   │       ├───static
    │   │       └───templates
    │   └───test
    │       └───java
    │           └───com
    │               └───example
    │                   └───Discuss
    └───target
        ├───classes
        │   ├───com
        │   │   └───example
        │   │       └───Discuss
        │   │           ├───config
        │   │           ├───Controller
        │   │           ├───dto
        │   │           ├───Exceptions
        │   │           ├───helper
        │   │           ├───models
        │   │           ├───repo
        │   │           ├───security
        │   │           └───service
        │   └───templates
        ├───generated-sources
        │   └───annotations
        ├───generated-test-sources
        │   └───test-annotations
        └───test-classes
            └───com
                └───example
                    └───Discuss

```
### DTOS
```
    AnswerDto.java
    AuthenticationResponse.java
    CommentDto.java
    LoginRequest.java
    output.doc
    QuestionDto.java
    RegisterRequest.java
 ```
### Controllers
```
    AnswerController.java
    AuthController.java
    CommentController.java
    FeedController.java
    FriendsController.java
    QuestionController.java
 ```
### Services
```
    AnswerCreateService.java
    AuthService.java
    CommentCreateService.java
    FriendsService.java
    QuestionCreateService.java
    UserDetailServiceImp.java
 ```
 
 ### Models
 ```
    Answers.java
    Comments.java
    Friends.java
    output.doc
    Question.java
    User.java
 ```
 
 ### Repositry
 ```
    AnswerRepo.java
    CommentsRepo.java
    FriendsRepo.java
    output.doc
    QuestionRepo.java
    UserRepo.java
 ```
 ### Reason for choosing SQL database :
 ```
  So  according to my limited undestanding and findings. Lets take the example of catalog system like Amazon we see that it soesnt     remain same every day new sellers and products and sub products etc comes.  Storing each of them and query pattern becomes a        daunting   task. But here I have used  SQL databases because query pattern will remain same so I used this.
```

