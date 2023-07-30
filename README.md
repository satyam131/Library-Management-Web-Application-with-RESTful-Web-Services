PROJECT NAME :-
---------------
 Library Management Web Application with RESTful Web Services
 ------------------------------------------------------------

 The Library Management Web Application is a comprehensive Java web application developed using Spring MVC, JSP, Spring Boot, and Hibernate. 
 The application facilitates the management of books by librarians while maintaining the details of books and authors on a separate server that 
 exposes RESTful web services using Spring Boot.
 
 -> Web application (Application 1) using Spring MVC and JSP for Library Management. A librarian can login to application and manage books.
 -> However, the details of the books and authors are maintained on a separate server (Application 2) which exposes RESTful webservices using Spring Boot 
    to support CRUD operations on books data.
 A book must be associated with an author. Authors needs to be configured in Database (not to be added through UI). While adding a book, authors will be 
 shown in the dropdown to choose from the list.
 REST APIs for CRUD operations on Author has to be provided.


Key Features:
=============

1.Librarian Login: The application provides a secure login system where librarians can authenticate themselves to access the library management features.

2.Books Listing: Upon successful login, librarians can view a list of all books in the library, along with their details such as title, author, ISBN, 
and availability status.

3.Add a Book: Librarians have the option to add new books to the library. When adding a book, they can select the author from a dropdown list, which is 
populated from the database of authors.

4.Edit Book Details: Librarians can update the details of existing books, such as title, author, ISBN, and availability status, through the web interface.

5.Author Configuration: The authors' details are stored in the database, and they are not managed through the UI. Instead, the authors' data is configured 
in the database and made available for selection when adding or editing a book.

6.REST APIs for CRUD Operations on Authors Data: The application provides RESTful web services for managing authors' data. These APIs allow external applications
to perform CRUD operations on authors' information in the database.

7.REST APIs for CRUD Operations on Books Data: The application also exposes RESTful web services for CRUD operations on books data. These APIs enable external 
applications, such as the separate server (Application 2), to interact with the books database.

8.Server-to-Server Webservice Communication: The web application communicates with the separate server (Application 2) using RESTful web services. 
This ensures that books and authors' data are maintained on the separate server, promoting data consistency and scalability.

9.Java Coding Standards and Best Practices: The codebase follows Java coding standards, guidelines, and best practices, ensuring maintainability and readability.

10.Exception Handling: The application implements appropriate HTTP codes and robust exception handling for REST APIs. This ensures that errors are handled gracefully,
and meaningful error messages are provided to the users and external applications.

11.Tomcat, Spring Boot, and Hibernate: The application is deployed on Tomcat and utilizes Spring Boot for web service implementation. Hibernate is used for database
connectivity and management.

Overall, the Library Management Web Application with RESTful Web Services offers librarians a user-friendly platform to efficiently manage the library's book inventory.
Its separation of books and authors' data through RESTful web services promotes data integrity, while adherence to Java best practices ensures a robust and maintainable 
codebase. The application serves as an effective tool for seamless library management and supports future scalability for enhanced functionality.

# Library-Management-Web-Application-with-RESTful-Web-Services
The Library Management Web Application is a comprehensive Java web application developed using Spring MVC, JSP, Spring Boot, and Hibernate. 

TECHNOLOGY USED :-
------------------
SPRING MVC, TOMCAT, SPRINGBOOT, JSP, REST APIs, MYSQL(DATABASE).

PROJECT SCREENSHOTS :-
----------------------

LOGIN PAGE:-
<img width="904" alt="LOGIN PAGE LIBRARY MANAGEMENT SYSTEM" src="https://github.com/satyam131/Library-Management-Web-Application-with-RESTful-Web-Services/assets/73646662/8dbd5786-ca5f-4b5d-8bab-a43799fc0afa">


HOMEPAGE:-
<img width="914" alt="home page of library mangement system" src="https://github.com/satyam131/Library-Management-Web-Application-with-RESTful-Web-Services/assets/73646662/5a6f59b2-06f7-454e-bee1-4839536ecdad">


BOOK ADD PAGE:-
<img width="914" alt="add book page library mangement system" src="https://github.com/satyam131/Library-Management-Web-Application-with-RESTful-Web-Services/assets/73646662/c2ef481c-8266-4326-82dd-affec2ab26cc">
