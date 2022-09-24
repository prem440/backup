package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcImp {

	static Connection cn;
	static Statement st;
	static ResultSet rs;
	static PreparedStatement ps;

	public static void main(String[] args) {

		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root & password=root");
			st = cn.createStatement();
			String qu = "insert into product values(8,'',45680)";
			ps = cn.prepareStatement(qu);
			ps.execute();
			System.out.println("data enter suucesfully");
			String que="delete from product where product_id=4";
			ps=cn.prepareStatement(que);
			ps.execute();

			String q = "select * from product";
			rs = st.executeQuery(q);

			while (rs.next()) {

				System.out.println("|" + rs.getInt(1) + "---" + rs.getString(2) + "---" + rs.getInt(3) + "|");
			}

//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			if (cn != null) {
				try {
					cn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
