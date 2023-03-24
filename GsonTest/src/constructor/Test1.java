package constructor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class Test1 {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		JSONArray jsonArr=new JSONArray();
		map.put("CJ", jsonArr);
		map.put("AJ", "NJ");
		JSONObject jsonObj = new JSONObject(map);
		System.out.println(jsonObj.toString());
		System.out.println(jsonObj.increment("HB"));
		System.out.println(Arrays.toString(JSONObject.getNames(jsonObj)));
		jsonObj.append("CJ", "DR");
		jsonObj.append("CJ","HK");
		System.out.println(jsonObj);
		System.out.println(jsonObj.get("CJ"));
	}

}
