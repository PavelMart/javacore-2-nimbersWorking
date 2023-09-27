import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

       List<Integer> positiveEvenList = new ArrayList<>();

       for (int i : list) {
           if (i > 0 && i % 2 == 0) {
               positiveEvenList.add(i);
           }
       }

       positiveEvenList.sort(Comparator.naturalOrder());

        System.out.println(positiveEvenList);

        StreamMain.main();
    }
}