package com.demo.firstjdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.StatementEvent;

public class ConnectionB {


	public static void main(String[] args) {

		B b = new B(1 , "name" , "publication");

		Connection con=null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/books" ,"root" , "root"); //2.

			Statement stmt = con.createStatement(); // 3.

			ResultSet rs = stmt.executeQuery("select * from booksdetails");

			int xid;
			String xname;
			String xpublication;

			while(rs.next()) {

				xid=rs.getInt("id");
				xname=rs.getString("author_name");
				xpublication=rs.getString("publication");

				System.out.println("id = " +xid + " " + "author_name = " +xname + " " + " publication = " +xpublication);


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
	}


}
