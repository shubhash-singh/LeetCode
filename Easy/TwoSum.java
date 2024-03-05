package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TwoSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        array = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int target = sc.nextInt();
        sc.close();

        for(int i : array) {
           for(int j=0)
        }
    }
}
