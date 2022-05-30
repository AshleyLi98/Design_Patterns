import java.io.*;
import java.util.Properties;
import java.util.HashMap;
import java.util.Iterator;

public class FileProperties extends Properties implements FileIO{
	
	public HashMap<String, String>	map;
	
	public FileProperties() {
		map = new HashMap<String, String>();
	}

	@Override
	public void readFromFile(String filename) throws IOException {
		File file = new File(filename);
		FileInputStream iStream = new FileInputStream(file);
		load(iStream);
		list(System.out);
		iStream.close();
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		FileOutputStream oStream = new FileOutputStream(new File(filename));
		
		Iterator<java.util.Map.Entry<String, String>>  iter = map.entrySet().iterator();
		
		while (iter.hasNext()) {
			java.util.Map.Entry<String, String> entry = iter.next();
			setProperty(entry.getKey(), entry.getValue());
		}
		
		store(oStream, null);
		oStream.close();
	}

	@Override
	public void setValue(String key, String value) {
		map.put(key, value);
	}

	@Override
	public String getValue(String key) {
		return map.get(key);
	}

}
