import dao.Student;

import java.io.*;
import java.util.ArrayList;

public class Serviable_test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1=new Student("张三","laoz");
        Student s2 = new Student("李四","laol");
        Student s3 = new Student("王五","laow");

        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        //序列化
        //serializ(arrayList);

        ObjectInputStream obi = new ObjectInputStream(new FileInputStream("F:\\BaiduNetdiskDownload\\MYSQL笔记\\01\\student.txt"));

        ArrayList<Student> list = (ArrayList<Student>) obi.readObject();

        for (Student list1:list){
            System.out.println(list1.getName()+"---"+list1.getNickName());
        }

    }

    private static void serializ(ArrayList<Student> arrayList) throws IOException {
        ObjectOutputStream obo = new ObjectOutputStream(new FileOutputStream("F:\\BaiduNetdiskDownload\\MYSQL笔记\\01\\student.txt"));
        obo.writeObject(arrayList);
        obo.close();

    }
}
