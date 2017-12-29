package util;

import org.json.JSONObject;
import com.baidu.aip.ocr.AipOcr;

public class RecongnizationByAI {
	
	 public static final String APP_ID = "9703818";
	    public static final String API_KEY = "MQlHnjWxXDbsngCsO5NXSe21";
	    public static final String SECRET_KEY = "sGlCRNCOSG8cdCgRXxWEsUMmMRf6rDBt";
	    
	    String imagePath = "";
	    
	    public RecongnizationByAI(String path){
			imagePath = path;
		}
	    public static String Recongnize(String imagePath) {
	    	AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

			client.setConnectionTimeoutInMillis(2000);
			client.setSocketTimeoutInMillis(60000);
			
			JSONObject json_result = client.plateLicense(imagePath);
			String str_result = json_result.get("result").toString();
			
			String [] results = str_result.split("\"");
			return results[3]; 
	    }
}

//Json 返回值
//{
//    "result_num": 1,
//    "result": [
//        {
//            "location": {
//                "left": 117,
//                "top": 131,
//                "width": 172,
//                "height": 170
//            },
//            "face_probability": 1,
//            "rotation_angle": 2,
//            "age": 29.298097610474,	需要age
//            "beauty": 55.128883361816,  需要beauty
//            "expression": 1,
