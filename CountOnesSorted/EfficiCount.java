package CountOnesSorted;

public class EfficiCount {
    public static int count(int arr[]){
        int start = 0;
        int end = arr.length;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == 0)
                start = mid + 1;
            else{
                if(mid == 0 || arr[mid - 1] == 0)
                    return (arr.length - mid);
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 1, 1};
        System.out.println(count(arr));
    }
}
