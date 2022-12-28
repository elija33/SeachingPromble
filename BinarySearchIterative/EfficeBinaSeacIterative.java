package BinarySearchIterative;

public class EfficeBinaSeacIterative {
    public static int EfficeSearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + end / 2;
            if(arr[mid] == target){
                return mid;
            }
            // {10,20,30,40,50,60,70}
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {10,20,30,40,50,60};
        int target = 20;
        System.out.println(EfficeSearch(number, target));
    }
}
