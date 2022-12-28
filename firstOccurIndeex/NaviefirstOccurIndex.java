package firstOccurIndeex;

public class NaviefirstOccurIndex {
    public static int OccurrenceIndex(int arr[], int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 10, 10, 10, 20, 20, 40};
        int target = 20;
        System.out.println(OccurrenceIndex(arr, target));
    }
}
