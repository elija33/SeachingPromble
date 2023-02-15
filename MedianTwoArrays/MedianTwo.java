package MedianTwoArrays;

import java.util.Arrays;

public class MedianTwo {
    public static int findMedianTwo(int arr[], int array[]){
        int arr1 = arr.length; 
        int array1 = array.length;
        int arraytotal[] = new int[arr1 + array1];
        Arrays.sort(arraytotal);
        // odd number ==> 2 1 4 2 7

        // Even Number ==> 2 3 4 5 1 6
        for(int i = 0; i < arraytotal.length-1; i++){
            if(arraytotal.length % 2 == 1){
                int start = 0;
                int end = arraytotal.length;
                int midodd = (start + end) / 2;
                return midodd;
            }
            else if(arraytotal.length % 2 == 0){
                int center = arraytotal.length / 2;
                int centernextnumber = (arraytotal.length / 2) - 1;
                int even = (arraytotal[center] + arraytotal[centernextnumber]) / 2;
                return even;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {4,1,5,3, 0};
        int array[] = {1, 2, 3, 4};
        // [0,1,1,2, 3, 3,4,4,5]
        System.out.println(findMedianTwo(arr, array));
    }
}
