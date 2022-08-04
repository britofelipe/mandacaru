package atividade1.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {

	private static String url = null;
    private static String user = null;
    private static String password = null;
 
    public static Connection getConnection() {
        try {
            if (url == null) {
                Properties prop = new Properties();
                InputStream inputStream = ConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");
                prop.load(inputStream);
                url = prop.getProperty("url");
                user = prop.getProperty("user");
                password = prop.getProperty("password");
            }
			/* Retorno da conexão */
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
			/* Retorno nulo em caso de erro*/
            e.printStackTrace();
            return null;
        }
    }
	
}
