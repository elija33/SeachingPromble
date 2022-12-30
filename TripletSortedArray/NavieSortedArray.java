package TripletSortedArray;

public class NavieSortedArray {
    public static boolean SortedArray(int arr[], int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                for(int k = j + 1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,15};
        int target = 20;
        System.out.println(SortedArray(arr, target));
    }
}
