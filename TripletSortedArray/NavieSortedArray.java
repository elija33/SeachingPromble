package TripletSortedArray;

public class NavieSortedArray {
    public static int SortedArray(int arr[], int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                for(int k = j + 1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        return arr[i], arr[j], arr[k];
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
