package ljh.zijin.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StringUtil {
    private static ObjectMapper mapper=new ObjectMapper();
    public static String getJson(Object obj){
        String json="";
        try{
            json=mapper.writeValueAsString(obj);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return json;
    }
}
