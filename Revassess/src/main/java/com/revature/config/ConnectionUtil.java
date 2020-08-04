package com.revature.config;

import static org.hamcrest.CoreMatchers.nullValue;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * 
 * @author Revature
 *
 *         This is a paceholder class to hold the configurations of your db
 *         connection. You should change the url, username, and password. DO NOT
 *         CHANGE THE MODIFIERS OR THE NAMES OF THE VARIABLES. These are used to
 *         test your db schema.
 */
public class ConnectionUtil {
	//for singleton instance
	private static ConnectionUtil cu;
	
	private static Connection conn = null;
	
	// add your jdbc url
	public static final String URL = "jdbc:oracle:thin:@revassess.cks98gmxels6.us-west-1.rds.amazonaws.com:1521:ORCL";
	// add your jdbc username
	public static final String USERNAME = "tester";
	// add your jdbc password
	public static final String PASSWORD = "password";
	// name of the created stored procedure in tier 3
	public static final String TIER_3_PROCEDURE_NAME = "add_user";
	// name of the created sequence in tier 3
	public static final String TIER_3_SEQUENCE_NAME = "tier3_sequence";

	// implement this method to connect to the db and return the connection object
	public Connection connect(){
		
		try {
			if (conn == null) {
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				
				return conn;
			}
			else {
				return conn;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}


	//implement this method with a callable statement that calls the absolute value sql function
	public long callAbsoluteValueFunction(long value){
		return value;
	}
	

	//make the class into a singleton
	private ConnectionUtil(){
		super();
	}

	public static ConnectionUtil getInstance(){
		if(cu == null){
			cu = new ConnectionUtil();
		}
		return cu;
	}
}
