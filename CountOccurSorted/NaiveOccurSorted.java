package CountOccurSorted;

public class NaiveOccurSorted {
    public static int Occur(int arr[], int target){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 20, 30, 30};
        int target = 20;
        System.out.println(Occur(arr, target));
    }
}
