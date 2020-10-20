package jsonExample;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUpdate {
	@SuppressWarnings({ "unchecked", "resource" })
	public static void main(String[] args) {        

	    try (Reader reader = new FileReader("data.Json")) {
	        // Read JSON file
	        JSONParser parser = new JSONParser();
	        JSONObject data = (JSONObject) parser.parse(reader);
	        System.out.println("**Json Record Management**");
			System.out.println(": Enter Your Choice :"+"\n"+"Press 1 to Edit Name"+"\n"+"Press 2 to Edit Profession"+"\n"+"Press 3 to Edit Department "+"Press 4 to Edit Cities"+"\n"+"press any other to exit");
			Scanner userInput=new Scanner(System.in);
			int  choice=userInput.nextInt();
			
			switch(choice)
			{
			case 1:
				{
					data.put("name", "Shushant Jain");
					FileWriter file = new FileWriter("data.json");
			        file.write(data.toJSONString());
			        file.flush();
									
				}
				break;
				
			case 2:
				{
					data.put("profession", "Doctor");
					FileWriter file = new FileWriter("data.json");
			        file.write(data.toJSONString());
			        file.flush();
				}
				break;
				
			case 3:
			{
				data.put("dept", "Medicine");
				FileWriter file = new FileWriter("data.json");
		        file.write(data.toJSONString());
		        file.flush();;
			}
			break;
			case 4:
			{
				data.put("city", "Chennai");
				FileWriter file = new FileWriter("data.json");
		        file.write(data.toJSONString());
		        file.flush();;
			}
			
			default :
					System.exit(0);		
			}
			
	       
	    } catch (IOException e) {
	        e.printStackTrace();
	       } catch (ParseException e1) {
	            e1.printStackTrace();
	       }
	   }

}
