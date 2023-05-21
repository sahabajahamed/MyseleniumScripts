package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("./data/config.properties");

		// raed the adta from property filen/  u
		Properties prop = new Properties();
		prop.load(fis);
		String username = prop.getProperty("username");
		String  pwd = prop.getProperty("password");
		String ul = prop.getProperty("url");
		System.out.println(username);
		System.out.println(pwd);
		System.out.println(ul);


	}

}
