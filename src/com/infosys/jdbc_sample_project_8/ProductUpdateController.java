package com.infosys.jdbc_sample_project_8;

public class ProductUpdateController
{
	public static void main(String[] args) {
       	//step-1 load/register Driver
		Driver driver= new Driver();
		DriverManager.registerDriver(driver);
		
		//step-2 create connection
		String url = "jdbc:mysql://localhost:3306/jdbc-830";
		String user="root";
		String password="Saurav@9599200409";