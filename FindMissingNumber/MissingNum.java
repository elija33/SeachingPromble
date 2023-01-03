package FindMissingNumber;

public class MissingNum {
    public static int Num(int arr[]){
        int total = 1;
        for(int i = 2; i <= (arr.length + 1); i++){
            total += i;
            total -= arr[i - 2];
        }
        return total;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 3, 7, 8};
        System.out.println(Num(arr));
    }
}
