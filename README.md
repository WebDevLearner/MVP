# MVP

Docker file: navneetbehl/mvp

Here are some endpoints that you can call:

 1. Creating a new resource (you do not need JWT token to create user). 

Request URL: http://localhost:8080/users/ Method: POST Accept: application/json Content-Type: application/json

Request Body will be of the following format:

{
    "firstName": "Extra",
    "lastName":"User",
    "email":"extra1@user.com",
    "password": "122346"
}

Response: 
{
    "userId": "BmyJ6NCFmrrxYSiMG562D5K3MwCPB1",
    "firstName": "Extra",
    "lastName": "User",
    "email": "extra1@user.com"
}



2. User Login. Once user is created. login to get JWT token.

Request URL: http://localhost:8080/users/login Method: POST Accept: application/json Content-Type: application/json

Request Body will be of the following format:
{
    "email":"kanav@behl.com",
    "password": "12345"
}

Response: 200 OK
Copy JWT token from Headers
Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJleHRyYTFAdXNlci5jb20iLCJleHAiOjE2MDU3MDkxNDV9.g9wTmy1PuKJ2rzVC-CkDMXDO_Zk30WEw7J91NUf2XEb-w4SpkRk5WbMGRberrJnR6hRNrnpmtGFfVTtzepPGHg





3. Update user.

Request URL: http://localhost:8080/users/{id} Method: POST Accept: application/json Content-Type: application/json

also include "Authorization" header with JWT token.

Request Body will be of the following format. 
{
    "firstName": "New",
    "lastName":"Name"

}

Response body will be of following format:

{
    "userId": "BmyJ6NCFmrrxYSiMG562D5K3MwCPB1",
    "firstName": "New",
    "lastName": "Name",
    "email": "extra1@user.com"
}





4. GET User
Request URL: http://localhost:8080/users/{id} Method: GET Accept: application/json
also include "Authorization" header with JWT token.

Response body will be of following format:
{
    "userId": "BmyJ6NCFmrrxYSiMG562D5K3MwCPB1",
    "firstName": "New",
    "lastName": "Name",
    "email": "extra1@user.com"
}


5. GET All Users (with optional page & limit query parameters)
Request URL: http://localhost:8080/users?page=0&limit=5Method: GET Accept: application/json
also include "Authorization" header with JWT token.


Response body will be of following format:
[
    {
        "userId": "BmyJ6NCFmrrxYSiMG562D5K3MwCPB1",
        "firstName": "New",
        "lastName": "Name",
        "email": "extra1@user.com"
    },
    {
        "userId": "glheWNpxf1wxr3QGgtV1GBlXkOYiuD",
        "firstName": "Extra2",
        "lastName": "User2",
        "email": "extra2@user.com"
    },
    {
        "userId": "iNSJYQ1CFYcaplbdfLFQi0D5knLl7L",
        "firstName": "Extra3",
        "lastName": "User3",
        "email": "extra3@user.com"
    }
]
