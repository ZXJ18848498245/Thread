import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FSout_test {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("F:\\BaiduNetdiskDownload\\MYSQL笔记\\01\\a.txt");//a.txt目标文件

        out.write(97);
        out.write(98);
        out.write(99);

        out.close();
    }
}
