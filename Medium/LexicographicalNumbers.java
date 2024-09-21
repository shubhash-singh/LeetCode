import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LexicographicalNumbers {

    public List<Integer> lexicalOrder(int n) {
        String[] arr = new String[n];
        for(int i = 1;i<=n;i++){
            arr[i-1] = String.valueOf(i);
        }

        Arrays.sort(arr);

        List<Integer> intList = Arrays.stream(arr)
                                      .map(Integer::parseInt)
                                      .collect(Collectors.toList());

        return intList;
    }
}