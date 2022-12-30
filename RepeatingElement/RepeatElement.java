package RepeatingElement;

public class RepeatElement {
    public static int repeat(int arr[]){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                 if(arr[i] == arr[j]){
                    count++;
                    
                }
            }
           
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {0, 2, 1, 3, 2, 2};
        System.out.println(repeat(arr));
    }
}
