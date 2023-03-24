package JSONArrayTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONArrayTest {

	public static void main(String[] args) {
		List<Object[]> list=new ArrayList<Object[]>();
		list.add(new String[]{"01","Adilabad"});
		list.add(new String[]{"02","Medak"});
		JSONObject mainJsonObj=new JSONObject();
		JSONObject jsonObj=null;
		JSONArray jsonArr=new JSONArray();
		for(Object[] obj:list) {
			jsonObj=new JSONObject();
			jsonObj.put(obj[0].toString(),obj[1].toString());
			jsonArr.put(jsonObj);
		}
		mainJsonObj.put("dist", jsonArr);
		System.out.println(mainJsonObj);
	}

}
