import java.io.*;

public class imgCopy_test {
    public static void main(String[] args) throws IOException {
        //目的地
        FileOutputStream out = new FileOutputStream("F:\\BaiduNetdiskDownload\\MYSQL笔记\\01\\copy2.png");
        //文件源
        FileInputStream in = new FileInputStream("F:\\BaiduNetdiskDownload\\MYSQL笔记\\01\\图片\\2.png");

        //目的地
        BufferedOutputStream bout = new BufferedOutputStream(out);
        //文件源
        BufferedInputStream bin = new BufferedInputStream(in);



        byte[] b =new byte[1024];
        int len;
        while((len = bin.read(b))!=-1){
            bout.write(b,0,len);
           // bout.write(len);
        }
        bout.close();
        bin.close();

    }
}
