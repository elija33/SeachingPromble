package firstOccurIndeex;

public class EfficiIteraFirstOccurIndex {
    public static int IteraFirstOccurIndex(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(mid == 0 || arr[mid -1] != arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5, 10, 10, 10, 20};
        int target = 10;
        System.out.println(IteraFirstOccurIndex(arr, target));
    }
}