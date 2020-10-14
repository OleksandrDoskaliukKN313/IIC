package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseFacade {
	private static Statement statement=null;
	private DatabaseFacade() {
		getStatment();
	}

	public static Statement getStatment()
	{
		if(statement==null)
		{
			try
			{
				Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dictionary","postgres","1234");
				statement = connection.createStatement();
				return statement;
				
			} catch (SQLException e) {
				
				System.out.println("Connection Failure!");
				e.printStackTrace();
				return null;
			}
		}
		else return statement;
		
	}
}
