package weatherAPI;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;


/**
 * 根据城市名/id查询天气
 * @author silk
 *
 */
public class WeatherReportByCity {
    /**
     * 根据城市名获取
     * @param cityName
     * @return
     */
    public static String excute(String cityName){
        String url=//此处以返回json格式数据示例,所以format=2,以根据城市名称为例,cityName传入中文
                "http://v.juhe.cn/weather/index?cityname="+cityName+"&key=93c846e0c063ec7cbc91f3f8503b5e6e";
        return PureNetUtil.get(url);//通过工具类获取返回数据
    }
    /**
     * 获取返回数据中的一个属性示例,此处以获取今日温度为例
     * "temperature": "8~20摄氏度"     今日温度
     * @param args
     * @return 
     */
    public static String GetTodayTemperatureByCity(String city)//,String wid) 
    {
        String result=excute(city);
        if(result!=null){
            JSONObject obj=JSONObject.fromObject(result);
            /*获取返回状态码*/
            result=obj.getString("resultcode");
            /*如果状态码是200说明返回数据成功*/
           if(result!=null&&result.equals("200")){
                result=obj.getString("result");
                //此时result中数据有多个key,可以对其key进行遍历,得到对个属性
                obj=JSONObject.fromObject(result);
                //今日温度对应的key是today
                result=obj.getString("today");
                obj=JSONObject.fromObject(result);
                //今日温度对应当key是temperature
                result=obj.getString("temperature");
                return result;
            /*if(result!=null&&result.equals("200")){
                /*获取数组数据
                result=obj.getString("result");
                JSONArray arr=JSONArray.fromObject(result);
                for(Object o:arr){//遍历数组
                    obj=JSONObject.fromObject(o.toString());
                    //如果遍历到需要的数据后直接返回结果,根据key(wid)得到value判断是否等于传入参数
                    if(obj.getString("wid").equals(wid)){
                        result=obj.getString("weather");
                        return result;*/
            
            }
        }
        String json =result;
        JSONArray jsonObject = JSONArray.fromObject(json);
        XMLSerializer xmlSerial = new XMLSerializer();
        String xml = xmlSerial.write(jsonObject);
        System.out.println(xml);
        return xml;
    }
    public static void main(String[] args) {
        System.out.println(GetTodayTemperatureByCity("苏州"));
        
    }
}
