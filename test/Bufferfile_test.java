import java.io.*;
import java.util.HashMap;

public class Bufferfile_test {
    public static void main(String[] args) throws Exception {
        //创建map,建为序号，值为句子
        HashMap<String,String> lineMap = new HashMap<>();
        //创建输入输出流对象
        BufferedReader in = new BufferedReader(new FileReader("F:\\BaiduNetdiskDownload\\MYSQL笔记\\01\\in.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("F:\\BaiduNetdiskDownload\\MYSQL笔记\\01\\out.txt"));

        String line = null;
        while ((line = in.readLine())!=null){
            //解析文本
            String[] split = line.split("\\.");
            //保存到集合
            lineMap.put(split[0],split[1]);

        }
        in.close();

        for (int i =1 ;i <lineMap.size();i++){
            String key = String.valueOf(i);
            String value = lineMap.get(key);
            out.write(key+"."+value);
            out.newLine();
        }

        out.close();

    }
}
