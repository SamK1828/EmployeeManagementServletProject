package com.samarth.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.samarth.employee.model.Employee;
import com.samarth.employee.util.DBConnection;

public class EmployeeDAO {
	private static final String INSERT_EMP = "INSERT INTO employee VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	public boolean insertEmployee(Employee emp) {
		boolean status = false;
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(INSERT_EMP);
			ps.setString(1, emp.getEmpId());
			ps.setString(2, emp.getFname());
			ps.setString(3, emp.getLname());
			ps.setString(4, emp.getGender());
			ps.setString(5, emp.getDob());
			ps.setString(6, emp.getEmail());
			ps.setString(7, emp.getPhone());
			ps.setString(8, emp.getDesignation());
			ps.setString(9, emp.getDepartment());
			ps.setString(10, emp.getJoiningDate());
			ps.setFloat(11, emp.getExperience());
			ps.setDouble(12, emp.getSalary());
			ps.setString(13, emp.getAadhar());
			ps.setString(14, emp.getPan());
			ps.setString(15, emp.getAddress());
			ps.setString(16, emp.getCity());
			ps.setString(17, emp.getState());
			ps.setString(18, emp.getZip());
			ps.setString(19, String.join(", ", emp.getSkills()));
			ps.setString(20, emp.getLocation());
			ps.setString(21, emp.getLinkedin());
			ps.setString(22, emp.getGithub());

			status = ps.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}
