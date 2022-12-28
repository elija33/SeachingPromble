package RecursiveBinSearch;

public class BinarySearch {
    public static int Search(int arr[], int start, int end, int target){
        if(start > end)
            return -1;

            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target){
                return Search(arr, mid + 1, end, target);
            }
            else {
                return Search(arr, start, mid - 1, target);
            }
        }
        
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int target = 20;
        System.out.println(Search(arr, 0, arr.length, target));
    }
}
