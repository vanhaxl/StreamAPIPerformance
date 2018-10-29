import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //setup
        long start, end;
        long x, y;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        //benchmark using Stream
        start = System.currentTimeMillis();
        usingStream(list);
        end = System.currentTimeMillis();
        x = end - start;


        //benchmark using for each
        start = System.currentTimeMillis();
        usingForEach(list);
        end = System.currentTimeMillis();
        y = end - start;

        //print result
        System.out.println("Time when using Stream is: " + x);
        System.out.println("Time when using ForEach is: " + y);

    }

    public static void usingStream(List<Integer> list) {
        list.stream().forEach(e -> System.out.println(e));

    }

    public static void usingForEach(List<Integer> list) {
        for (int x : list) {
            System.out.println(x);
        }
    }

    /*
    My experience is if the data input is small, for loop is faster than Stream, (size < 10,000)
    If the data input is large, Stream is faster than for loop (size > 100,000)

     */
}
