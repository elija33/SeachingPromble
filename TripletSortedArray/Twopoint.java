package TripletSortedArray;

import java.util.Arrays;

public class Twopoint {
    public static boolean TripletPoint(int arr[], int target){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++){
            int start = i + 1;
            int end = arr.length-1;
            while(start < end){
                if(arr[i] + arr[start] + arr[end] == target){
                    return true;
                }
                // {1, 4, 45, 6, 10, 8};
                else if(arr[i] + arr[start] + arr[end] < target){
                    start++;
                }
                else {
                    end--;
                }
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 8};
        int target = 13;
        System.out.println(TripletPoint(arr, target));
    }
}
