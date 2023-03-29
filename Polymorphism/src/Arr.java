import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,};
        int[] a = new int[3];
        int[] b = new int[] {3,4,5};

        for(int i: b) {
            System.out.print(i+" ");
        }

        System.out.println(Arrays.toString(b));

        System.out.println(a.getClass().getSimpleName());

        if(a instanceof  int[]) {
            System.out.println(a + " is a instance of " + a.getClass());
        }

        Object[] obj = new Object[3];
        obj[0] = "Abs";
        obj[1] = new StringBuilder("Hello");
        obj[2] = new Double(2.0);

        for(Object i: obj) {
            System.out.println(i.getClass().getSimpleName());
        }
    }
}
