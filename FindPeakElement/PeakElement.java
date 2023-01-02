package FindPeakElement;

public class PeakElement {
    public static int PeakElement(int arr[]){
        if(arr.length == 1)
            return arr[0];
        for(int i = 1; i < arr.length-1; i++){
            if(arr[i] >= arr[i + 1] && arr[i] >= arr[i - 1])
                 return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5, 10, 20, 15, 7};
        System.out.println(PeakElement(arr));
    }
}
