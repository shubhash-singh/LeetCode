package Easy;

public class PeakElementInMountainArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(arr[mid]>arr[mid+1]){ 
                // if arr[mid] > arr[mid+1] then peak element must be either mid or on left side
                // else it would be right side 
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return end;
    }
}
