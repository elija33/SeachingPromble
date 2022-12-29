package LastOccurIndex;

public class EfficiRecuiLastOccurIndex {
    public static int LastOccurIndex(int arr[], int start, int end, int target, int n){
       if(start > end)
            return -1;
            int mid = (start + end) / 2;

            if(arr[mid] < target){
                return LastOccurIndex(arr, mid + 1, end, target, n);
            }

            else if(target < arr[mid]){
                return LastOccurIndex(arr, start, mid - 1, target, n);
            }

            else{
                if(mid == n - 1 || arr[mid + 1] != arr[mid])
                    return mid;

                else
                    return LastOccurIndex(arr, mid + 1, end, target, n);
            }
    }
    public static void main(String[] args) {
        int arr[] = {5, 10, 10, 10, 10, 20, 20};
        int target = 10;
        int n = 7;
        System.out.println(LastOccurIndex(arr, 0, n -1, target, n));
    }
}
