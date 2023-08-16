package com.demo.firstjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCconnection {

	public static void main(String[] args) {

		A a = new A(500 , "rohan " , "ubale" , "sanskrit");

		Connection con = null;

		try {

			// 1-Register the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2-Create Connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school" ,"root" , "root");

			//3-Create Statement
			Statement stmt = con.createStatement();

			//4- ExecuteQuery.
			ResultSet rs = stmt.executeQuery("select * from schooldata");

			int rno;
			String nm;
			String sname;
			String dept;

			// print the resultSet 

			while (rs.next()) {

				rno=rs.getInt("std_rollno");
				nm=rs.getString("std_name").trim();
				sname=rs.getString("std_sirname").trim();
				dept=rs.getString("department");

				System.out.println("*RollNo = "+rno + " *Name = " +nm + "  *SirName = " +sname +" "+ " *Department = "+dept );

			}

		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {


		}

	}
}
