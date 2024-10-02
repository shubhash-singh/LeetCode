package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * RankTransformofanArray
 */
public class RankTransformofanArray {

    public static int[] arrayRankTransform(int[] arr) {
        // initilalize a empty array for result
        int[] res = new int[arr.length];

        // creating a unique set
        Set<Integer> unique = new HashSet<>();
        for (int i : arr) {
            unique.add(i);
        }
        List<Integer> uniqueList = new ArrayList<>(unique);
        Collections.sort(uniqueList);
        // creating Hash map to store rank value pair
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int rank = 0; rank < uniqueList.size(); rank++) {
            rankMap.put(uniqueList.get(rank), rank+1);
        }

        // adding ranks to res array
        for(int i = 0;i<arr.length;i++){
            res[i] = rankMap.get(arr[i]);
        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 6, 8, 6, 4};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
}