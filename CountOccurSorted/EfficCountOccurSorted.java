package CountOccurSorted;

public class EfficCountOccurSorted {
    public static int EfficOccur(int arr[], int target){
        int start = 0; 
        int end = arr.length;
        while(start <= end){
            int mid = (start + end) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                if(mid == 0 || arr[mid - 1] != arr[mid])
                    return mid;

                else    
                    end = mid - 1;
            }
        }
        return -1;
    }

    static int lastOccurIndex(int arr[], int target){
        int start = 0, end = arr.length-1;
        while(start <=  end){

            int mid = (start + end) / 2;

            if(target > arr[mid])
                start = mid + 1;

            else if(target < arr[mid])
                end = mid -1;

            else{
                if(mid == arr.length -1 || arr[mid + 1] != arr[mid])
                    return mid;

                else    
                    start = mid + 1;
            }
        }
        return -1;
    }

    static int countOcc(int arr[], int target){
        int first = EfficOccur(arr, target);

        if(first == -1)
            return 0;
        else{
            return lastOccurIndex(arr, target) - first + 1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 20, 40, 40};
        int target = 20;
        System.out.println(countOcc(arr, target));
    }
}
