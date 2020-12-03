package pages_Facebook2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream stream= new FileInputStream("C:\\Users\\sumer\\eclipse-workspace\\Practice\\config.properties");
		Properties prop=new Properties();
		prop.load(stream);
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Student"));
	

	}

}
