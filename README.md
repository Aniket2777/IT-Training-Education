**IT Training - Student Management System**
**Project Overview**
This is a web-based Student Management System developed using Spring Boot, Spring MVC, Spring Data JPA, and Hibernate. 
It allows users to register, login, view, update, and delete student records. 
The system includes role-based views for admin and students, with secure authentication and a responsive frontend built with Bootstrap.
The project is designed for Adhyayan IT Training Institute in Pune to manage student details efficiently and provide an easy-to-use interface for administration and learners.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

**Features**
1] User registration and login system
2] Role-based access: Admin and Student views
3] CRUD operations on Student data (Create, Read, Update, Delete)
4] Secure password handling (basic; for production, hashing recommended)
5] Responsive frontend with Bootstrap 5
6] Student details: Roll number, Name, Contact, Marks, Username, Password
7] Navigation bar with Home, About, Contact, Courses, Login, and Register links
8] Course information display on homepage
9] Form validation (basic, can be enhanced)
10] JSP based views for seamless integration with Spring MVC
11] Repository abstraction with Spring Data JPA
12] Service layer to handle business logic

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

**Technologies Used**

Java 17+

Spring Boot 3.x

Spring MVC

Spring Data JPA & Hibernate

MySQL or any relational DB (JPA compatible)

JSP, HTML5, CSS3, Bootstrap 5

Maven for project management

Tomcat (embedded in Spring Boot)

Font Awesome for icons

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Project Structure
src/
 ├─ main/
 │   ├─ java/
 │   │   └─ com.adhyayan/
 │   │       ├─ controller/       # Spring MVC Controllers
 │   │       ├─ model/            # JPA Entity Classes (Student)
 │   │       ├─ repository/       # Spring Data JPA Repositories
 │   │       ├─ servicei/         # Service Interfaces
 │   │       └─ serviceimpl/      # Service Implementations
 │   ├─ resources/
 │   │   └─ templates/            # JSP View Files (home, login, register, edit, etc.)
 └─ test/                         # Unit and integration tests (optional)

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

**Setup & Installation**

1] Clone the repository
git clone https://github.com/Aniket2777/YourRepoName.git
cd YourRepoName

2] Configure database
Setup a MySQL database (or your preferred DB)

Update application.properties with DB credentials:
spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

**Access the app**

Open browser at http://localhost:8080

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
**How to Use**

Register as a new student via Register page.

Login with your credentials.

Admin can login with username: admin and password: 1234 to view and manage all students.

Students can view and update their own details.

Use navigation bar to explore pages.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
**Screenshots**

Home Page:
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<img width="1670" height="893" alt="Screenshot 2025-07-23 122626" src="https://github.com/user-attachments/assets/f12add6d-89b1-4a69-9731-4ca031786b99" />

Register Page:
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<img width="1767" height="914" alt="Screenshot 2025-07-24 165330" src="https://github.com/user-attachments/assets/6c37ce90-9dd1-4f8e-a4c3-acca295fa1c2" />

Login Page :
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<img width="1860" height="892" alt="Screenshot 2025-07-24 165356" src="https://github.com/user-attachments/assets/d5b94e11-2e49-4ce4-a54b-a074e664f696" />

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

**Author**
Aniket Khambe !
GitHub Profile
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
