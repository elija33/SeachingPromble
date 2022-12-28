package BinarySearchIterative;

public class NavieBinarySeaIterative {
    public static int search(int number[], int target){
        for(int i = 0; i < number.length; i++){
            if(number[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {10,20,30,40,50,60};
        int target = 20;
        System.out.println(search(number, target));
    }
}