package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mysql.jdbc.ResultSet;

public class Dbconnection {
  public WebDriver driver;
  
  //connection object
     static Connection con=null;
	
     //statement object
     private static Statement stmt;
     
     //constant for database url
     
     public static String DB_URL="jdbc:mysql://localhost:3306/selenium";
     
     //constant database username
     public static String DB_USER="narendar";
     
   //constant database password
     public static String DB_PASSWORD="narendar";
     
     
     @BeforeClass
     
     public void setup() throws Exception
     {
    	 String dbclass="com.mysql.jdbc.Driver";
    	 Class.forName(dbclass).newInstance();
    	 
    	 //get connection to db
    	 
    	 Connection con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
    	 
    	 //stament object for send the sql statement to d/b
    	 
    	 stmt=con.createStatement();
     }
    	 
   @Test
   
   public void test() throws SQLException
   {
	   String query="select * from userinfo";
	   
	   ResultSet res=(ResultSet) stmt.executeQuery(query);
	   while(res.next())
	   {
		   System.out.println(res.getString(1));
	   }
   }
     
     
     
}
