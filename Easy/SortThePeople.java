package Easy;

// https://leetcode.com/problems/sort-the-people/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> mapPair = new HashMap<>();

        for(int i=0;i<names.length;i++){
            mapPair.put(heights[i], names[i]);
        }
        String[] res = new String[names.length];
        Arrays.sort(heights);
        int j = 0;
        for(int i=names.length - 1;i>=0;i--){
            res[j++] = mapPair.get(heights[i]);

        }
        return res;
    }
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"}; 
        int[] heights = {180,165,170};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }
}
// ["Mary","Emma","John"]