package com.thiru.x;

/*
1) 	what is viewresolver
2)	what is multithredding
3)  what is the diff b/w hashmap & hashset
4)  what is restControllor/controller
5)  How can we overcome deadlock situation
6) 	what is wrapper class
7)  how to link service layer in controller layer(by using autowiring)
8)	what is the difference between get,put,post and patch
9)  what is the difference between model,model map and view
10) diff b/w final,finally and finalaise


 How can we overcome deadlock situation
 =======================================
Identify the deadlock: Use tools like thread dump analysis or monitoring tools to identify 
which threads are involved in the deadlock and which resources they are waiting for
 
Identify the deadlock.
Analyze the locking order.
Release locks in a timely manner.
Use timeouts when acquiring locks.
Apply resource allocation strategie



what is the difference between get,put,post and patch
=======================================================
GET retrieves data.
PUT updates or replaces an existing resource.
POST submits/save data to create a new resource.
PATCH partially updates an existing resource
User


encrypred data where can be safe in get or post mapping
=========================================================
Sensitive encrypted data should generally be transmitted in the request body using the "POST method" for improved security.
 

different type of responce codes
================================
 	Informational (1xx):
        100: Continue
        101: Switching Protocols
        102: Processing

    Success (2xx):
        200: OK
        201: Created
        202: Accepted
        204: No Content

    Re3direction (3xx):
        300: Multiple Choices
        301: Moved Permanently
        302: Found
        304: Not Modified
        307: Temporary Redirect
        308: Permanent Redirect

    Client Errors (4xx):
        400: Bad Request
        401: Unauthorized
        403: Forbidden
        404: Not Found
        405: Method Not Allowed
        409: Conflict
        415: Unsupported Media Type
        429: Too Many Requests

    Server Errors (5xx):
        500: Internal Server Error
        501: Not Implemented
        503: Service Unavailable
        504: Gateway Timeout
        
  Certainly! Here's a table summarizing the differences between Model, ModelMap, and View in Spring Boot:
-------------------------------------------------------------------------------------------------------------------------------------------------
|         			 	| Model                                	| ModelMap                            | View                                 	|
|----------				|--------------------------------------	|-------------------------------------|--------------------------------------	|
| Purpose  				| Holds data to be passed to the view   | Holds data to be passed to the view  | Renders the data and presents it      	|
-------------------------------------------------------------------------------------------------------------------------------------------------
| Interface				| `org.springframework.ui.Model`      	| `org.springframework.ui.ModelMap`   | N/A (Implemented by view technologies)	|
-------------------------------------------------------------------------------------------------------------------------------------------------
| Implementation		| N/A                             		| `org.springframework.ui.ModelMap`   | N/A (Implemented by view technologies)	|
-------------------------------------------------------------------------------------------------------------------------------------------------
| Adding attributes		| `addAttribute()` method        		| `addAttribute()` method             | N/A                                  	|
-------------------------------------------------------------------------------------------------------------------------------------------------
| Data Access			| Can be accessed by the view        	| Can be accessed by the view         | N/A                                  	|
-------------------------------------------------------------------------------------------------------------------------------------------------
| Rendering				| N/A                                 	| N/A                                  | Renders the data to produce output   	|
-------------------------------------------------------------------------------------------------------------------------------------------------
| Used in  				| Spring Boot controllers              	| Spring Boot controllers               | Spring Boot controllers               |
-------------------------------------------------------------------------------------------------------------------------------------------------


Please note that the View itself is not an interface or class in Spring Boot but is implemented by specific view technologies like Thymeleaf, JSP, or others. The table primarily focuses on the Model and ModelMap, which are used to carry data from the controller to the view. The View is responsible for rendering the data received from the Model/ModelMap.      
        
        
        
        
        
        
        
        
 */

public class GivenStringIsPolindromeOrNot {

	public static void main(String[] args) {
		

	}

}
