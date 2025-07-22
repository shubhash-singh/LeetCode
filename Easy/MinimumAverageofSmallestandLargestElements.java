class MinimumAverageofSmallestandLargestElements {
    public double minimumAverage(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return (min + max) / 2.0;
    }
}