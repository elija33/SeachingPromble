package FindPeakElement;

public class EfficiPeakElement {
    public static int PeakEle(int arr[]){
        int start = 0;
        int end = arr.length;
        while(start <= end){
            int mid = (start + end) / 2;
            if((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] >= arr[mid + 1]))
                return mid;
            if(mid > 0 && arr[mid - 1] >= arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        System.out.println(PeakEle(arr));
    }
}
