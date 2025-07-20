package com.samarth.employee.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.samarth.employee.model.Employee;
import com.samarth.employee.service.EmployeeService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/submitEmployee")
public class RegisterEmployeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//        PrintWriter out = response.getWriter();
//        response.setContentType("text/html");
//        // Text inputs
//        String empId       = request.getParameter("empId");
//        String firstName   = request.getParameter("fname");
//        String lastName    = request.getParameter("lname");
//        String gender      = request.getParameter("gender");
//        String dob         = request.getParameter("dob");
//        String email       = request.getParameter("email");
//        String phone       = request.getParameter("phone");
//        String designation = request.getParameter("designation");
//        String department  = request.getParameter("department");
//        String joiningDate = request.getParameter("joiningDate");
//        String experience  = request.getParameter("experience");
//        String salary      = request.getParameter("salary");
//        String aadhar      = request.getParameter("aadhar");
//        String pan         = request.getParameter("pan");
//        String address     = request.getParameter("address");
//        String city        = request.getParameter("city");
//        String state       = request.getParameter("state");
//        String zip         = request.getParameter("zip");
//        String location    = request.getParameter("location");
//
//        // Multiple checkbox values for skills
//        String[] skills = request.getParameterValues("skills");
//        String skillsStr = (skills != null) ? String.join(",", skills) : "";
//
//        // Output response (replace with DB logic in real app)
//        out.println("<div style='width:500px; text-align:center; border:2px solid grey;  '> ");
//        out.println("<h2> Employee Registered Successfully! </h2>");
//        out.println("<p> Name: " + firstName + " " + lastName + " </p>");
//        out.println("<p> Email: " + email + " </p>");
//        out.println("<p> Skills: " + skillsStr + " </p>");
//        out.println("<p> Preferred Location: " + location + " </p></div>");

		Employee emp = new Employee();

		emp.setEmpId(request.getParameter("empId"));
		emp.setFname(request.getParameter("fname"));
		emp.setLname(request.getParameter("lname"));
		emp.setGender(request.getParameter("gender"));
		emp.setDob(request.getParameter("dob"));
		emp.setEmail(request.getParameter("email"));
		emp.setPhone(request.getParameter("phone"));
		emp.setDesignation(request.getParameter("designation"));
		emp.setDepartment(request.getParameter("department"));
		emp.setJoiningDate(request.getParameter("joiningDate"));
		emp.setExperience(Float.parseFloat(request.getParameter("experience")));
		emp.setSalary(Double.parseDouble(request.getParameter("salary")));
		emp.setAadhar(request.getParameter("aadhar"));
		emp.setPan(request.getParameter("pan"));
		emp.setAddress(request.getParameter("address"));
		emp.setCity(request.getParameter("city"));
		emp.setState(request.getParameter("state"));
		emp.setZip(request.getParameter("zip"));
		emp.setSkills(request.getParameterValues("skills"));
		emp.setLocation(request.getParameter("location"));
		emp.setLinkedin(request.getParameter("linkedin"));
		emp.setGithub(request.getParameter("github"));

		EmployeeService service = new EmployeeService();
		boolean isInserted = service.registerEmployee(emp);

		response.setContentType("text/html");
		if (isInserted) {
			response.getWriter().println("<h2>Employee Registered Successfully!</h2>");
		} else {
			response.getWriter().println("<h2>Error while registering employee.</h2>");
		}
	}
}
