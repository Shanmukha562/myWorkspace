package service;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class SimpleDbExample {
	
	
	public static void main(String[] args) throws Exception {
		
		 Connection connect = null;
		  Statement statement = null;
		  PreparedStatement preparedStatement = null;
		  ResultSet resultSet = null;
		
		  
		  try {
		      // This will load the MySQL driver, each DB has its own driver
		      Class.forName("com.mysql.jdbc.Driver");
		      // Setup the connection with the DB
		      connect = (Connection) DriverManager
		          .getConnection("jdbc:mysql://localhost/sushil?"
		              + "user=root&password=karkee");

		      // Statements allow to issue SQL queries to the database
		      statement = connect.createStatement();
		      // Result set get the result of the SQL query
		      resultSet = statement
		          .executeQuery("select * from user");
		      
		      while(resultSet.next()){
		    	  System.out.println("username is " + resultSet.getString("username"));
		    	  System.out.println("password is " + resultSet.getString("password"));
		      }

		     
		      
		    } catch (Exception e) {
		      throw e;
		    } finally {
		    }
		
		
	}
}
