package Genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyfile {

	public String propertyfiledata(String key) throws IOException {
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream(Autoconstant.PropertyFilePath);
	p.load(fis);
	return p.getProperty(key);
	}
	
}
