package utilies;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Accessproperties {
	
	static File config=new File("D:\\\\Myspace\\\\DPRSeleniumproject\\\\src\\\\test\\\\resources\\\\properties\\\\Config.properties");
    static Properties properties = new Properties();

    
	public static String GettingValues(String Key) {
		FileInputStream files = null;
		try {
			files = new FileInputStream(config);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
			properties.load(files);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        String value=properties.get(Key).toString();
      
		return value;
		
	}

}
