package RepeatingElement;

public class EfficiRepeatElement {
    public static int RepeatElement(int arr[]){
        boolean visit[] = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(visit[arr[i]])
                return arr[i];
                visit[arr[i]] = true;
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {0, 2, 1, 3, 2, 2};
        System.out.println(RepeatElement(arr));
    }
}
