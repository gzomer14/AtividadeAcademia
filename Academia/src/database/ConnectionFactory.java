package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConnection
							(
									final String endereco, 
									final int porta, 
									final String databaseNome, 
									final String usuario, 
									final String senha
							) throws SQLException
	{
		return DriverManager.getConnection
				(
						"jdbc:mysql://"
								+endereco
								+":"
								+porta
								+"/"
								+databaseNome,
								usuario,
								senha
				);
	}
}
