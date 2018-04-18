
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
 
import org.apache.commons.io.IOUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class ParseJson1 {
 
	public static void main(String[] args) {
		//String url = "https://api.apis.guru/v2/specs/weatherbit.io/2.0.0/swagger.json";
		
		try {
			//String genreJson = IOUtils.toString(new URL(url));
			
			BufferedReader infile = new BufferedReader (new FileReader("city.list.json"));
	        JSONParser parser = new JSONParser();

            Object obj = parser.parse(new FileReader("city.list.json"));
            //https://www.tutorialspoint.com/java/java_arraylist_class.htm
            JSONArray jsonList = (JSONArray) obj; //this is an arrayList apparently
            //An arrayList is an advanced array (very similar to LIST in python) 
            
            //System.out.println("Contents of al: " + jsonList);
            
            //JSONArray cities = (JSONArray) obj.get("messages");

            	
            // Going through the arrayList
            for (int i=0;i<jsonList.size();i++) {
            	
            	System.out.println((jsonList.get(i)));
            	
            	
            }
            
            
            
			
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}
}
