import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {

        int sum = Arrays.stream(numbers)
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .reduce(0, Integer::sum);

        return sum;
    }

    public static int[] getSortedOddsArray(int[] numbers) {

        return Arrays.stream(numbers)
                .filter(x -> x % 2 != 0)
                .sorted()
                .toArray();
    }
}
