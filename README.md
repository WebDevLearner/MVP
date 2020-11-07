# MVP

Here are some endpoints that you can call:

 1. Creating a new resource:

Request URL: http://localhost:8080/users/ Method: POST Accept: application/json Content-Type: application/json

Request Body will be of the following format:

{ "firstName":"Test", "lastName":"User", "password":"12345678", "email":"test@test.com" }

Response: { "firstName": "Test", "lastName": "User", "email": "test@test.com", "userId": "14aacbae-f47d-48f0-a38d-a4c53847f66d" }
