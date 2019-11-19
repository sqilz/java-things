package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsTest {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(2,3,4,5);

        // identity is a default value if stream is empty
        Integer reduce = integers.stream()
                .filter(x -> x > 1)
                .reduce(0, (a,b) -> a+b);

        Integer reduce2 = integers.stream()
                .filter(x -> x%2==0)
                .reduce(0, (a,b) -> a+b);

        System.out.println(reduce);
        System.out.println(reduce2);
        List<String> stringList = new ArrayList<String>();

        stringList.add("One flew over the cuckoo's nest");
        stringList.add("To kill a muckingbird");
        stringList.add("Gone with the wind");

        Stream<String> stream = stringList.stream();

        Optional<String> reduced = stream.reduce((value, combinedValue) -> {
            return combinedValue + " + " + value;
        });

        System.out.println(reduced.get());
    }
}
