package dailywork10;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetWebContent {
    public static String getWebCon(String input_url) {
        //System.out.println("开始读取内容...");
        StringBuffer sb = new StringBuffer();
        try {
            java.net.URL url = new java.net.URL(input_url);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = in.readLine()) != null) {
                sb.append(line);
            }
            in.close();
        } catch (Exception e) { 
            sb.append(e.toString());
            System.err.println(e);

        }
        return sb.toString();
    }
    //添加内容到文件中
    public  void appendMethod(String fileName, String content)
    {
        try {
            //打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String input_url="http://restapi.amap.com/v3/weather/weatherInfo?key=   KEY  &city=110000";
        String fileName = "D:tianqi.txt";       //文本位置及文件名
        GetWebContent one=new GetWebContent();
        String content=getWebCon(input_url)+"\r\n";  //"\r\n"表示换行
        one.appendMethod(fileName,content);
        
        System.out.println("读取完成"); 

    }
}