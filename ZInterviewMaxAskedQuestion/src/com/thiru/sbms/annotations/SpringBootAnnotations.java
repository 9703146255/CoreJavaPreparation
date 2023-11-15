package com.thiru.sbms.annotations;




/*
 * 
 Core Spring Framework Annotations
 ==================================
 
 @Required:
 ==========
 @Required:
 
 @Required
 SBSM
 
  ==>It applies to the "Spring bean setter method".
  
 ==> It indicates that the "annotated "Spring bean must be" populated/popular at configuration time" with the required property,
 
  else it throws an exception BeanInitilizationException.
  
  
  @Autowired: (sm,c,v)
  ===========
 -> Spring provides annotation-based auto-wiring by providing @Autowired annotation. 
 
 -> It is used in  "setter methods", "instance variable", and "constructor".
 
 ->When we use @Autowired annotation, the "spring container" auto-wires/auto connection the spring bean/class by matching data-type.
 
 
@Configuration
 ==============    @Configuration+@Bean
 
 -> If we want to "perform customized configurations" then we will use @Configuration annotation along with @Bean methods.
 -> Based on requirement we can have multiple @Configuration classes in the project.

	Ex: Swagger Config, DB Config, RestTemplate Config, Kafka Config, Redis Config, Security Config etc...
Note: @Bean annotated method we can keep in any "spring bean class" but it is highly recommended to keep them in @Configuration classes. 

 

 
 What is ComponentScan ?
+++++++++++++++++++++

-> The process of scanning packges "in the application" to identify "spring bean" classes is called as Component Scan

-> Component Scan is "built-in" concept

-> Component Scanning will start from "base package"

Note: The package which contains "start class" is called as base package.

-> After "base packge scanning completed" it will scan "sub packages of base package".

Note: The package names which are starting with "base package name" are called as sub packages.
 
 
 basepack(start).subpack      start class==> base package
       
 
+++++++++++++++++++++++
What is @Bean annotation
+++++++++++++++++++++++

-> @Bean is a method level annotation

-> When we want "to customize any object creation" then we will use @Bean annotation for that

->It is an alternative of XML <bean> tag. 



@Configuration
public class AppConfig {

	@Bean
	public AppSecurity createInstance() {
		AppSecurity as = new AppSecurity();
		// custom logic to secure our functionality
		return as;
	}
}


Note: @Bean method we can write in "any spring bean class" but recommended to write in @Configuration class like above.




How to represent java class as a Spring Bean?
++++++++++++++++++++++++++++++++++++++

(CSR   CR CB)
@Component
@Service
@Repository

@Controller
@RestController

@Configuration
@Bean


Note: All the above annotations are class level annotations but  @Bean is method level annotation


-> @Component is a "general purpose annotation" to represent "java class as Spring Bean"

-> @Service annotation is a "specialization of @Component" annotation. 
   
   .. This is also used to represent "java class as spring bean." 
   
   ''It is allowing for implementation classes to be autodetected through classpath scanning.

	Note: For business classes we will use @Service annotation

-> @Repository annotation is a "specialization of @Component annotaton". This is also used to "represent java class as spring bean."

   .. It is having "Data Access Exception translation"

	Note: For dao classes we will use @Repository




@Controller
==========
-> In "Web applications" to represent java class as "controller"
   
    ..we will use @Controller annotation. It is used for C2B communication.



@RestController
================
-> In Distributed application to represent java class as "distributed component" we will use @RestController annotation. 
It is used for B2B communication.



@Configuration
===============
-> If we want to perform customized configurations then we will use @Configuration annotation along with @Bean methods.
 Based on requirement we can have multiple @Configuration classes in the project.

	Ex: Swagger Config, DB Config, RestTemplate Config, Kafka Config, Redis Config, Security Config etc...

Note: @Bean annotated method we can keep in any spring bean class but it is highly recommended to keep them in @Configuration classes. 



@Component
===========
->It is a class-level annotation. 
->@Component is a "general purpose annotation" to represent "java class as Spring Bean"

@Service
 ========
 ->It is a class-level annotation. 
 ->@Service annotation is a specialization of @Component annotation.
 ->This is also used to represent java class as spring bean.
 
 ->Note: For business classes we will use @Service annotation
 
 @Repository
 ============
 ->It is a interface-level annotation. 
 ->@Repository annotation is a specialization of @Component annotaton.
 ->This is also used to represent java class as spring bean.
 ->It is having Data Access Exception translation

	Note: For dao classes we will use @Repository

 @Controller
 ===========
 -> In Web applications to represent java class as controller we will use @Controller annotation. 
 ->It is used for C2B communication.
 
 @RestController
 ===========
 -> In Distributed application to represent java class as distributed component we will use @RestController annotation.
 ->It is used for B2B communication.
 
 @Configuration
 ==============
 -> If we want to perform customized configurations then we will use @Configuration annotation along with @Bean methods.
 -> Based on requirement we can have multiple @Configuration classes in the project.

	Ex: Swagger Config, DB Config, RestTemplate Config, Kafka Config, Redis Config, Security Config etc...
Note: @Bean annotated method we can keep in any "spring bean class" but it is highly recommended to keep them in @Configuration classes. 

 
 Spring Framework Stereotype Annotations
 =========================================
 
 @Component
===========
->It is a class-level annotation. 
->@Component is a "general purpose annotation" to represent "java class as Spring Bean"

@Service
 ========
 ->It is a class-level annotation. 
 ->@Service annotation is a specialization of @Component annotation.
 ->This is also used to represent java class as spring bean.
 
 ->Note: For business classes we will use @Service annotation
 
 @Repository
 ============
 ->It is a class-level annotation. 
 ->@Repository annotation is a specialization of @Component annotaton.
 ->This is also used to represent java class as spring bean.
 ->It is having Data Access Exception translation

	Note: For dao classes we will use @Repository

 @Controller
 ===========
  ->It is a class-level annotation. 
 -> In Web applications to represent java class as controller we will use @Controller annotation. 
 ->It is used for C2B communication.




Spring Boot Annotations
==============================================
+++++++++++++++++++++++++++
What is @SpringBootApplication ?
++++++++++++++++++++++++++++

-> This annotation used "at start class" of spring boot

-> This annotation is equal to below 3 annotations

	1) @SpringBootConfiguration
	2) @EnableAutoConfiguration
	3) @ComponentScan





@EnableAutoConfiguration:
========================
@EnableAutoConfiguration: It auto-configures the bean that is present in the classpath and configures it to run the methods.
The use of this annotation is reduced in Spring Boot 1.2.0 release because developers provided an alternative of the annotation,
 i.e. @SpringBootApplication.
 
@SpringBootApplication: It is a combination of three annotations @EnableAutoConfiguration, @ComponentScan, and @Configuration.


Spring MVC and REST Annotations
===============================
@RequestMapping:
===============
@RequestMapping:
 It is used to map the web requests. to perticular/specific method and 
 requast mapping class level and requast mapping at method level it should be unique.




 @GetMapping:
 ============
    @GetMapping: "It maps" the "HTTP GET requests" on the "specific "handler method."
    
     			 It is used to create a "web service endpoint."
     			 
     			 that fetches/update It is used instead of using: @RequestMapping(method = RequestMethod.GET)
 @PostMapping:
 =============
   @PostMapping: "It maps" the "HTTP POST requests" on the "specific handler method".
   
     			 It is used to create a "web service endpoint" that "creates" 
     			 
     			 It is used instead of using: @RequestMapping(method = RequestMethod.POST)
 @PutMapping:
 ============
    @PutMapping: "It maps" the HTTP PUT requests on the specific handler method. 
    
    			 It is used to create a web service endpoint that creates or updates 
    			 
    			 It is used instead of using: @RequestMapping(method = RequestMethod.PUT)
 @DeleteMapping:
 ============== 
 @DeleteMapping:"It maps" the HTTP DELETE requests on the specific handler method. 
 
 			 	It is used to create a "web service endpoint" that deletes a resource.
 			 	
 			  	It is used instead of using: @RequestMapping(method = RequestMethod.DELETE)
 			  	
 @PatchMapping:
 ==============
    		@PatchMapping: It maps the HTTP PATCH requests on the specific handler method.
    		 It is used instead of using: @RequestMapping(method = RequestMethod.PATCH)
    
    
    
    
    @RequestBody: It is used to bind HTTP request with an object in a method parameter. 
    			  Internally it uses HTTP MessageConverters to convert the body of the request.
    			   When we annotate a method parameter with @RequestBody, 
    			   the Spring framework binds the incoming HTTP request body to that parameter.
    			   
    			   
    @ResponseBody: It binds the method return value to the response body.
     			 	It tells the Spring Boot Framework to serialize a return an object into JSON and XML format.
     			 	
    @PathVariable: It is used to extract the values from the URI. //
    			   It is most suitable for the RESTful web service,
    			   where the URL contains a path variable.
    			    We can define multiple @PathVariable in a method.
    			    
    			    @GetMapping("/api/employees/{id}")
					@ResponseBody
					public String getEmployeesById(@PathVariable String id) {
    				return "ID: " + id;
					}
    			    
    @Re quest Param: It is used to extract the "query parameters" form the URL. //
     			   It is also known as a "query parameter".
     			   it start ? and ends with &
     			    It is most suitable for web applications.
     			     It can specify default values if the query parameter is not present in the URL.
     			     
    @RequestHeader: It is used to "get the details about the HTTP request headers".
     				We use this annotation as a method parameter.
     				
     				 The optional elements of the annotation are name, required, value, defaultValue. 
     				 For each detail in the header,
     				  we should specify separate annotations. We can use it multiple time in a method
     				  
    @RestController
 ===========
 -> In Distributed application to represent java class as distributed component we will use @RestController annotation.
 ->It is used for B2B communication.
 
    				 
    @RequestAttribute:  It binds a "method parameter" to "request attribute."
     					It provides convenient access to the request attributes from a controller method. 
     					With the help of @RequestAttribute annotation,
     				 	we can access objects that are populated on the server-side.

 

















 *
 */



















public class SpringBootAnnotations {

}
