package setup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	public Connection connection = null;
	
	@BeforeClass
	public void setup() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public void shutdown() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
