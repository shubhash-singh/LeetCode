import java.util.Arrays;

/**
 * MostBeautifulItemforEachQuery
 * 
 * https://leetcode.com/problems/most-beautiful-item-for-each-query/
 */
public class MostBeautifulItemforEachQuery {

    public int[] maximumBeauty(int[][] items, int[] queries) {
        // Sort items by their cost (item[0])
        Arrays.sort(items, (a, b) -> a[0] - b[0]);

        // Precompute maximum beauty for each cost in a cumulative manner
        int n = items.length;
        int[] maxBeautyAtCost = new int[n];
        maxBeautyAtCost[0] = items[0][1];
        
        for (int i = 1; i < n; i++) {
            maxBeautyAtCost[i] = Math.max(maxBeautyAtCost[i - 1], items[i][1]);
        }

        int[] result = new int[queries.length];
        
        // For each query, find the max beauty for items within budget
        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];

            // Use binary search to find the highest item price that is <= query
            int idx = binarySearch(items, query);
            result[i] = (idx == -1) ? 0 : maxBeautyAtCost[idx];
        }

        return result;
    }

    private int binarySearch(int[][] items, int target) {
        int left = 0, right = items.length - 1;
        
        // Binary search to find the rightmost index where items[idx][0] <= target
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (items[mid][0] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return right;
    }

}

/*
Input: items = [[1,2],[3,2],[2,4],[5,6],[3,5]], queries = [1,2,3,4,5,6]
Output: [2,4,5,5,6,6]
Explanation:
- For queries[0]=1, [1,2] is the only item which has price <= 1. Hence, the answer for this query is 2.
- For queries[1]=2, the items which can be considered are [1,2] and [2,4]. 
  The maximum beauty among them is 4.
- For queries[2]=3 and queries[3]=4, the items which can be considered are [1,2], [3,2], [2,4], and [3,5].
  The maximum beauty among them is 5.
- For queries[4]=5 and queries[5]=6, all items can be considered.
  Hence, the answer for them is the maximum beauty of all items, i.e., 6.
 */