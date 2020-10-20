package jsonExample;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class JsonWriter {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		
		obj.put("name", "Ansuman Parida");
		obj.put("profession","Software");
		obj.put("dept","Engineering");
		obj.put("city", "Hyderabad");

		try {

			FileWriter file = new FileWriter("data.json");
			file.write(obj.toJSONString());
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.print(obj.toJSONString());

	}

}



