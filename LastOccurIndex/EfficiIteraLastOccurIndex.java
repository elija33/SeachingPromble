package LastOccurIndex;

public class EfficiIteraLastOccurIndex {
    public static int LastOccur(int arr[], int target){
        int start = 0;
        int end = arr.length;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] < target){
                end = mid + 1;
            }
            else if(arr[mid] > target){
                start = mid -1;
            }
            else{
                if(mid == arr.length-1 || arr[mid + 1] != arr[mid])
                    return mid;

                else {
                    end = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5, 10, 10, 10, 10, 20, 20};
        int target = 10;
        System.out.println(LastOccur(arr, target));
    }
}
