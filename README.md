
# Teach Stack #
Spring Boot , PostGres


# Features
* User can ask questions
* User can give answers
* User can add comments
* User can follow other users
* User can unfollow other users
* User can see what their friends are posting
* User can see latest questions asked 
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
 
 
