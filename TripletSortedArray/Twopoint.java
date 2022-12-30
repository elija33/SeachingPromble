package TripletSortedArray;

public class Twopoint {
    public static boolean TripletPoint(int arr[], int target){
        for(int i = 0; i < arr.length-1; i++){
            int start = i + 1;
            int end = arr.length-1;
            while(start < end){
                if(arr[start] + arr[end] + arr[i] == target){
                    return true;
                }
                else if(arr[i] + arr[start] + arr[end] < target){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 45, 6, 10, 8};
        int target = 22;
        System.out.println(TripletPoint(arr, target));
    }
}
