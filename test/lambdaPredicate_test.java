import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class lambdaPredicate_test {
    public static void main(String[] args) {
   String[] array ={"迪丽热巴,女","古力娜扎,女","马尔扎哈,男","赵丽颖,女"};
   List<String> list = filter(array,s -> "女".equals(s.split(",")[1]),s -> s.split(",")[0].length()==4);
        System.out.println(list);
    }

    private static List<String> filter (String[] array , Predicate<String> one ,Predicate<String> two){
        List<String> list = new ArrayList<String>();
        for (String arr :array){
            if (one.and(two).test(arr)){
                list.add(arr);
            }
        }
        return list;
    }
}
