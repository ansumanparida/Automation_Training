package jsonExample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {
	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
		JSONParser parser = new JSONParser();
		Reader reader = new FileReader("data.json");

		Object jsonObj = parser.parse(reader);

		JSONObject jsonObject = (JSONObject) jsonObj;

		String name = (String) jsonObject.get("name");
		System.out.println("Name = " + name);

		String dept = (String) jsonObject.get("dept");
		System.out.println("Department = " + dept);

		String design = (String) jsonObject.get("profession");
		System.out.println("Designation = " + design);
		
		String city = (String) jsonObject.get("city");
		System.out.println("City = " + city);
		
		reader.close();
	}
}
