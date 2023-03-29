import java.util.Arrays;
import java.util.Random;

public class Arr2 {
    public static void main(String[] args) {
        int[] a = getRandomArr(10);
         Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.fill(a, 5);
        int[] b = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(b));

        System.out.println(Arrays.binarySearch(b, 5));

        System.out.println(Arrays.equals(a, b));
    }

    private static int[] getRandomArr(int len) {
        int[] a = new int[len];

        Random random = new Random();

        for(int i=0;i<len;i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }
}
