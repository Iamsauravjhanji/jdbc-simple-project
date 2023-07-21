package com.infosys.jdbc_sample_project_8;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class ProductInsertController {
		public static void main(String[] args) {
			
			Connection connection = null;
			try {
				//step-1 Load/Register Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//step-2 Create Connection
				String url = "jdbc:mysql://localhost:3306/jdbc-830";
				String user = "root";
				String pass = "Saurav@9599200409";
				
				connection = DriverManager.getConnection(url, user, pass);
				
				//step-3 Create Statement
					Statement statement = connection.createStatement();
					
				//step-4 Execute Query
					String insertQuery = "insert into product (id, name, color, price) values (103, 'marker', 'black', 300)";
					statement.execute(insertQuery);
					
					System.out.println("Data ======Inserted");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					
					//step-5 Close Connection
					if(connection != null) {
					connection.close();
					}
					else {
						System.out.println("Idiot First Establish Connection");
					}
				
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		}
	}

