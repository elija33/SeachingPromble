package SquareRoot;

public class EfficSquareRoot {
    public static int SquareRoot(int arr){
        int start = 1, ans = -1;
        int end = arr; 

        while(start <= end){
            int mid = (start + end) / 2;

            int sqmid = mid * mid;

            if(sqmid == arr)
                return mid;
            else if(sqmid > arr)
                end = mid -1;
            else{
                start = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(SquareRoot(25));
    }
}
