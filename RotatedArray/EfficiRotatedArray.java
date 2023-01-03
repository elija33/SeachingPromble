package RotatedArray;

public class EfficiRotatedArray {
    public static int EfficiArray(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target)
                return mid;
            
            if(arr[start] < arr[mid]){
                if(target >= arr[start] && target < arr[mid])
                    end = mid - 1;
                else 
                    start = mid + 1;
            } 
            else {
                    if(target > arr[mid] && target <= arr[end]){
                        start = mid + 1;
                    }
                    else
                        end = mid - 1;
                }
            }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {100, 200, 400, 1000, 10, 20};
        int target = 20;
        System.out.println(EfficiArray(arr, target));
    }
}
