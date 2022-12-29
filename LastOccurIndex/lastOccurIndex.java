package LastOccurIndex;

public class lastOccurIndex {
    public static int lastOccur(int arr[], int target){
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5, 10, 10, 10, 10, 20, 20};
        int target = 10;
        System.out.println(lastOccur(arr, target));
    }
}
