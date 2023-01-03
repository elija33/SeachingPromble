package FindMissingNumber;

public class MissingNumber {
    public static int Number(int arr[]){
        int sum = ((arr.length + 1) * (arr.length + 2)) / 2;
        for(int i = 0; i < arr.length; i++)
            sum -= arr[i];
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 3, 7, 8};
        System.out.println(Number(arr));
    }
}
