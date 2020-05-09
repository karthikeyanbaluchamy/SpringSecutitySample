# SpringSecutitySample
Intergration of  rest service  with  user id's
For developing the sample i have used Spring web starter and spring security jars
There are two users configured
  USER  - user/password
  ADMIN - admin/password
 
 The end point to accesss the applicatoin
 http://localhost:8080/config/api/getconfigdetails has permission of ADMIN
 http://localhost:8080/products/api/getproductdetails has permission of USER
 
when you access the ned point with the below userid
http://localhost:8080/config/api/getconfigdetails

user:admin/password 

Success response
{
    "SampleConfiguration": "1000 liters of milk sales per day",
    "Chocldates": "Details are empty"
}

user:user/password

{
    "timestamp": "2020-05-09T10:01:26.384+0000",
    "status": 403,
    "error": "Forbidden",
    "message": "Forbidden",
    "path": "/config/api/getconfigdetails"
}

for other user name this not configured in the code
{
    "timestamp": "2020-05-09T10:01:52.339+0000",
    "status": 401,
    "error": "Unauthorized",
    "message": "Unauthorized",
    "path": "/config/api/getconfigdetails"
}

For another endpoint
http://localhost:8080/products/api/getproductdetails 

user - user/password

success reposnse:
{
    "Product": "Milk,Chocolates,CoolDrinks,Rice",
    "Chocolates": "DiaryMilk,FiveStar",
    "Milk": "Raw,Cows"
}

user - admin/password

{
    "timestamp": "2020-05-09T10:05:00.801+0000",
    "status": 403,
    "error": "Forbidden",
    "message": "Forbidden",
    "path": "/products/api/getproductdetails"
}






