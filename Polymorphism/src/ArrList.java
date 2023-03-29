import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
        arrayList.add(0, 2);
        arrayList.remove(1);
//        System.out.println(arrayList);
        String[] s = {"anj", "jdsnj", "snx"};
        List<String> l = List.of(s);
//        System.out.println(l);

        ArrayList<String> arr = new ArrayList<>(l);
        System.out.println(arr.toArray());
        List<ArrayList<String>> lis = List.of(arr);
//        lis.add(new ArrayList<String>());

        ArrayList<String> newArr = new ArrayList<>(List.of("Hello", "World"));
        System.out.println(newArr.toArray().getClass().getSimpleName());
        System.out.println(newArr);
        for(var a: lis) {
            a.add("hello");
            System.out.println(a);
        }

        System.out.println(Arrays.asList("Hello", 1).getClass().getSimpleName());
        System.out.println(List.of("world", 2).getClass().getSimpleName());
//        System.out.println(lis);
//        System.out.println(arr);

        String[] arrs = new String[] {"a", "b", "c"};
        var list = Arrays.asList(arrs);
        System.out.println(list );


    }
}
