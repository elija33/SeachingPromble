package SearchInfiniteSize;

public class EfficiInfiniteSize {
    public static int EfficiInfinites(int arr[], int start, int end, int target){
        if(start > end)
            return -1;
            int mid = (start + end) / 2;
            if(arr[mid] == target)
                return mid;
            
            else if(arr[mid] > target)
                return EfficiInfinites(arr, start, mid - 1, target);
            
            else 
                return EfficiInfinites(arr, mid + 1, end, target);
    }

    static int Search(int arr[], int target){
        if(arr[0] == target)
            return 0;

        int num = 1;

        while(arr[num] < target)
            num = num * 2;

        if(arr[num] == target)
            return num;

        return EfficiInfinites(arr, num/2 + 1, num - 1, target);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 40, 50};
        int target = 40;
        System.out.println(Search(arr, target));
    }
}
