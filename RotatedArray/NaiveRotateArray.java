package RotatedArray;

public class NaiveRotateArray {
    public static int RotatedArray(int arr[], int target){
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {100, 200, 400, 1000, 10, 20};
        int target = 400;
        System.out.println(RotatedArray(arr, target));
    }
}
