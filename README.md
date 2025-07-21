# 👨‍💼 Employee Management Platform (Servlet-based Java Web App)

This project is a dynamic **Employee Management Platform** built using **Java Servlets, JSP, and JDBC** following a clean **MVC architecture**. It allows HR/admins to register employees through a web form and stores the information securely in a **MySQL database**.

---

## 📌 Project Overview

> Developed as part of my internship at **Kiran Academy x ThunderCube Pvt. Ltd.**, this platform demonstrates the use of **Core Java EE Technologies** without relying on frameworks like Spring. The project is modularized into **Controller**, **Service**, and **DAO** layers to ensure separation of concerns and maintainable code.

---

## ✨ Features

- 🌐 Web-based Employee Registration Form (20+ fields)
- 🧱 MVC Modular Structure using Servlets & JDBC
- 💾 Data stored in **MySQL** database
- ✅ Clean servlet-based form handling (`doPost`)
- 📎 Includes **LinkedIn & GitHub** profile fields
- 📦 Deployable on **Apache Tomcat Server**
- 👨‍💼 Real-world use case of backend Java development

---

## 🛠️ Tech Stack

| Layer        | Technology     |
|--------------|----------------|
| Frontend     | HTML5, CSS3    |
| Backend      | Java Servlets |
| Database     | MySQL          |
| Architecture | MVC (DAO, Service, Controller) |
| Server       | Apache Tomcat  |
| Tools        | VS Code ,Eclipse ,GitHub |

---

## 🗂️ Project Structure

```

EmployeeManagementProject/
├── src/
│   └── com/
│       └── empapp/
│           ├── controller/
│           │   └── EmployeeController.java
│           ├── service/
│           │   └── EmployeeService.java
│           ├── dao/
│           │   └── EmployeeDAO.java
│           └── model/
│               └── Employee.java
├── WebContent/
│   ├── index.html
│   └── success.jsp
├── lib/
│   └── mysql-connector-java.jar
├── README.md
├── .gitignore
└── db/
└── employee\_table.sql

````

---

## 🧾 How to Run

1. **Clone the repository**  
   ```bash
   git clone https://github.com/your-username/EmployeeManagementServletProject.git
   
2. **Import into VS Code or Eclipse**

3. **Configure Apache Tomcat in your IDE**

4. **Add MySQL JDBC driver to `lib/` folder**

5. **Create MySQL database & table**
   Use the following SQL:

   ```sql
   CREATE TABLE employee_info (
     empId VARCHAR(20),
     fname VARCHAR(50),
     lname VARCHAR(50),
     gender VARCHAR(10),
     dob DATE,
     email VARCHAR(100),
     phone VARCHAR(15),
     designation VARCHAR(100),
     department VARCHAR(100),
     joiningDate DATE,
     experience FLOAT,
     salary DOUBLE,
     aadhar VARCHAR(20),
     pan VARCHAR(20),
     address VARCHAR(200),
     city VARCHAR(50),
     state VARCHAR(50),
     zip VARCHAR(10),
     skills VARCHAR(200),
     location VARCHAR(50),
     linkedin VARCHAR(100),
     github VARCHAR(100)
   );
   ```

6. **Run on Apache Tomcat**
   Navigate to: `http://localhost:8080/EmployeeManagementProject/index.html`

7. **Submit the form and verify data is inserted in the database**
---

## 🔗 Useful Links

* [Servlet Documentation](https://docs.oracle.com/javaee/7/api/javax/servlet/package-summary.html)
* [JDBC Guide](https://docs.oracle.com/javase/tutorial/jdbc/)
* [MySQL Reference](https://dev.mysql.com/doc/)

---

## 👨‍🎓 Author

**Samarth Deelip Kalegaonkar**
📍 Intern @ Kiran Academy x ThunderCube Pvt. Ltd.
📧 [kalegaonkarsamarth@gmail.com](mailto:kalegaonkarsamarth@gmail.com)
🔗 [LinkedIn](https://www.linkedin.com/in/samarth-kalegaonkar)
🔗 [GitHub](https://github.com/SamK1828)

---

## ⚖️ License

This project is licensed under the [MIT License](LICENSE).
