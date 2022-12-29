package CountOccurSorted;

public class EfficCountOccurSorted {
    public static int EfficOccur(int arr[], int target){
        int start = 0; 
        int end = arr.length;
        while(start <= end){
            int mid = (start + end) / 2;
            if(target < arr[mid]){
                end = mid + 1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
