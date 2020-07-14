import java.io.File;

public class FileDiGi_test {
    public static void main(String[] args) {
        File dir = new File("F:\\BaiduNetdiskDownload\\MYSQL笔记\\01");
        //打印目录
        printDir(dir);

    }
    public static void printDir(File d){
        //获取子文件和目录
        File[] files = d.listFiles();

        for (File file :files){
            if (file.isFile()){
                System.out.println("文件名："+file.getAbsolutePath());
            }else{
                System.out.println("目录："+file.getAbsolutePath());
                printDir(file);
            }
        }

    }
}
