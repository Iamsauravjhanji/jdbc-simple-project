package com.infosys.jdbc_sample_project_8;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.SQLException;
		import java.sql.Statement;
		import java.util.*;

		import com.mysql.cj.jdbc.Driver;
		
		public class ProductDeleteController {
			public static void main(String[] args) {
				Scanner scanner=new Scanner(System.in);
				System.out.println("Enter the product id tnextInto delete");
				int id =scanner.nextInt();
				
				Connection connection = null;
				try {
					//step-1 Load/Register Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
					//step-2 Create Connection
					String url = "jdbc:mysql://localhost:3306/jdbc-830";
					String user = "root";
					String pass = "Saurav@9599200409";
					
					connection = DriverManager.getConnection(url, user, pass);
					
					//step-3 Create Statement
						Statement statement = connection.createStatement();
						
					//step-4 Execute Query
						String DeleteQuery = "Delete from product where id="+id;
					int a=statement.executeUpdate());
					System.out.println("a ="+a);
					if(a==1) {
						System.out.println("Given id is not present");
					}
				}
				catch(SQLException e) {
					//TODO Auto-generated catch block 
					e.printStackTrace();
				}finally {
					
						//step-5 Close Connection
					try {
					
						connection.close();
						}
					catch (SQLException e) {
						//TODO auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
}
