

import java.io.File;
import java.io.IOException;


public class File_test {
    public static void main(String[] args) throws IOException {
        File dir = new File("F:\\BaiduNetdiskDownload\\MYSQL笔记\\01");
        String[] filesname = dir.list();
        for (String name :filesname){
            System.out.println(name);
        }
        File[] files = dir.listFiles();
        for (File file :files){
            System.out.println(file.getCanonicalPath());
        }

    }


}
