package firstOccurIndeex;

public class EfficRecufirstOccurIndex {
    public static int firstOccurIndeex(int arr[], int start, int end, int target){
        if(start > end)
            return -1;
            int mid = (start + end) / 2;
            if(arr[mid] < target){
                return firstOccurIndeex(arr, mid + 1, end, target);
            }
            else if(arr[mid] > target){
                return firstOccurIndeex(arr, start, mid - 1, target);
            }
            else{
                if (arr[mid] != arr[mid - 1] || mid == 0)
                    return mid;
                
                else
                    return firstOccurIndeex(arr, start, mid - 1, target);
            }
        }
    
    public static void main(String[] args) {
        int arr[] = {5, 10, 10, 10, 20};
        int target = 10;
        System.out.println(firstOccurIndeex(arr, 0, arr.length, target));
    }
}
