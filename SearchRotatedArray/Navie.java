package SearchRotatedArray;

public class Navie {
    public static int RotatedArray(int arr[], int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int target = 3;
        System.out.println(RotatedArray(arr, target));
    }
}
