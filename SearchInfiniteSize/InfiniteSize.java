package SearchInfiniteSize;

public class InfiniteSize {
    public static int Infinite(int arr[], int target){
        int i = 0;
        while(true){
            if(arr[i] == target)
                return i;
            if(arr[i] > target)
                return -1;
            i++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 5};
        int target = 2;
        System.out.println(Infinite(arr, target));
    }
}
