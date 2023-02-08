package RotatedArray;

public class PartTwo {
    public static int searching(int number[], int target){
        int start = 0;
        int end = number.length-1;
        while(start <= end){
            if(number[start] == target){
                return start;
            }
            else if(number[end] == target){
                return end;
            }
            start++;
            end--;
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {3,1};
        int target = 1;
        System.out.println(searching(number, target));
    }
}
