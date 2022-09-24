package com.te.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcProperty {
	static Connection cn;
	static Statement st;
	static ResultSet rs;
	public static void main(String[] args) {
	try {
		FileReader fr=new FileReader("C:\\Users\\Admin\\eclipse-workspace\\Springcore\\resources");
		Properties pp =new Properties();
		pp.load(fr);
		cn=DriverManager.getConnection(pp.getProperty("url"),pp.getProperty("user"),pp.getProperty("password"));
		st=cn.createStatement();
		String r="select * from product";
		 rs=st.executeQuery(r);
		 System.out.println("data added successfuly");
		 
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		
	}

}
