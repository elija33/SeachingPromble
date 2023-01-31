package CountOnesSorted;

public class OnesCount {
    public static int Count(int arr[]){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1)
                count ++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,0,0,0};
        System.out.println(Count(arr));
    }
}
