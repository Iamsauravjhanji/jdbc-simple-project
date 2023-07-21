package com.infosys.jdbc_sample_project_8;
import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 

public class Productdisplaycontroller {
public static void main(String[] args) {
	Connection connection=null;
	try {
	//step-1 load/Register Driver
		   
		
		DriverManager.registerDriver(driver);
		//Step-2 Create Connection
		String url="jdbc:mysql://localhost:3306/jdbc-830";
		String user="root";
		String password="Saurav@9599200409";
		connection = DriverManager.getConnection(url,user,password);
		//step-3 Create statement
		Statement statement = connection.createStatement();
		
		//Step-4 execute query
		String displayStudentQuery = "SELECT * From product";
		
		ResultSet resultSet=statement.executeQuery(displayStudentQuery)
				while(resultSet.next()) {
					int id = resultSet.getInt("id");
					String name= resultSet.getString("name");
					String color = resultSet.getString("color");
					double price = resultSet.getDouble("price");
					
					System.out.println("productId ="+id);
					System.out.println("productname = "+name);
					System.out.println("Productcolor = "+color);
					System.out.println("prouctprice = "+price);
				}
	}
	
		catch(SQLException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						//step-5 close connection
						connection.close();
					}
				}
	}
	